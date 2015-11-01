package naturacert.baumsoft.dev.naturacert.extras;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import naturacert.baumsoft.dev.naturacert.Auditores;
import naturacert.baumsoft.dev.naturacert.Clientes;
import naturacert.baumsoft.dev.naturacert.DaoAPP;
import naturacert.baumsoft.dev.naturacert.Fincas;
import naturacert.baumsoft.dev.naturacert.TokensBD;
import naturacert.baumsoft.dev.naturacert.poblarBD;

/**
 * Created by imac on 9/6/15.
 */
public class katana extends Application {

    /**
     * Check user
     * Permite revisar la base de datos en busca
     * de usuarios registrados
     *
     * @parametro contexto
     * @retorna verdadero o falso segun hayan usuarios en BD
     */
    public boolean checkUser() {
        List<Auditores> auditores = DaoAPP.daoSession.getAuditoresDao().loadAll();
        if (auditores.size() == 0)
            return false;
        else
            return true;
    }

    public int getUserId() {
        List<Auditores> auditores = DaoAPP.daoSession.getAuditoresDao().loadAll();
        return auditores.get(0).getRef_auditor();
    }


    /**
     * Get Token
     * Permite obtener el token guardado en base de datos
     */
    public TokensBD getToken() {
        List<TokensBD> token = DaoAPP.daoSession.getTokensBDDao().loadAll();
        return token.get(0);
    }

    /**
     * clearUserBD
     * Este metodo borra de la base de datos
     * las tablas relacionadas con el usuario
     */
    public void clearUserBD() {
        DaoAPP.daoSession.getTokensBDDao().deleteAll();
        DaoAPP.daoSession.getAuditoresDao().deleteAll();
        DaoAPP.daoSession.getFincasDao().deleteAll();
        DaoAPP.daoSession.getClientesDao().deleteAll();
    }


    public boolean checkClientes() {
        List<Clientes> clientes = DaoAPP.daoSession.getClientesDao().loadAll();
        if (clientes.size() == 0)
            return false;
        else
            return true;
    }

    public List<Clientes> getClientes() {
        List<Clientes> clientes = DaoAPP.daoSession.getClientesDao().loadAll();
        return clientes;
    }


    public String[] informacionAuditor() {
        String[] cadena = new String[3];

        List<Auditores> auditores_lista = DaoAPP.daoSession.getAuditoresDao().loadAll();
        Auditores auditor = auditores_lista.get(0);
        cadena[0] = auditor.getNombre();
        cadena[1] = auditor.getApellido();
        cadena[2] = auditor.getFoto();

        return cadena;
    }



    public long crearFincaEnInicio(JSONObject json) throws JSONException {
        long cliente = 0;

        if (json.getString("status").equals("OK")) {

            JSONArray types = json.getJSONArray("type");
            JSONObject rtaType = types.getJSONObject(0);

            JSONArray resultado = json.getJSONArray("result");
            JSONObject datos = new JSONObject(resultado.getString(0));

            JSONObject fields = datos.getJSONObject("fields");

            Fincas finca = new Fincas();
            finca.setNombre(fields.getString("nombre"));
            Log.d("Vamos a crear", finca.getNombre());
            Log.d("Esta es", rtaType.getString("type"));
            finca.setCodigo(fields.getString("ref_finca"));
            finca.setFecha(fields.getString("fecha"));
            finca.setImagen(fields.getString("foto"));
            finca.setDepartamento(fields.getLong("dpto"));
            finca.setMunicipio(fields.getString("municipio"));
            finca.setVereda(fields.getString("vereda"));
            finca.setLongitud(Double.valueOf(json.getString("lng")));
            finca.setLatitud(Double.valueOf(json.getString("lat")));
            finca.setAltitud(fields.getInt("altitud"));
            finca.setPropietario(fields.getString("propietario"));

            finca.setTipo_auditoria(fields.getLong("tipo_auditoria"));
            finca.setTipo_auditor(fields.getLong("tipo_auditor"));
            finca.setArea_finca(fields.getInt("area_finca"));
            finca.setArea_conservacion(fields.getInt("area_conser"));
            finca.setArea_infraestructura(fields.getInt("area_infra"));
            finca.setPeriodo_cosecha(fields.getString("per_cosecha"));

            /*
            finca.setProduccion_regional(fields.getString("prod_reg"));
            finca.setFr_cafe(fields.getInt("fr_cafe"));
            finca.setAlmendra_sana(fields.getString("alm_sana"));
            finca.setProblemas_sanitarios(fields.getString("prob_cult"));
            finca.setDocumentos_anexos(fields.getString("doc_anex"));
            finca.setTrabajadores_permanentes(fields.getInt("ntrabper"));
            finca.setTrabajadores_temporales(fields.getInt("ntrabtem"));
            finca.setProveedores_visitados(fields.getString("proveedo"));
            */

            finca.setObservaciones(fields.getString("observ"));
            finca.setIdCliente(fields.getInt("cliente"));
            finca.setIdAuditor(fields.getInt("auditor"));
            finca.setRef_finca(datos.getInt("pk"));



            if(rtaType.getString("type").equals("rac")){
                finca.setTipo_finca(1);
                finca.setId_formulario(rtaType.getInt("rac"));
                finca.setGrupo("");
                DaoAPP.daoSession.getFincasDao().insert(finca);
                poblarBD poblar = new poblarBD();
                poblar.poblar(rtaType.getInt("rac"));
            }

            if(rtaType.getString("type").equals("racg")){
                finca.setTipo_finca(2);
                finca.setGrupo(rtaType.getString("grupo"));
                finca.setId_formulario(rtaType.getInt("racg"));
                poblarBD poblar = new poblarBD();
                poblar.poblar(rtaType.getInt("racg"), true);
                DaoAPP.daoSession.getFincasDao().insert(finca);
            }

            cliente = Long.parseLong(fields.getString("cliente"));

        }

        return cliente;

    }


    public void subirDatosEnBatch(Context contexto){
        //DaoAPP.daoSession.getP10p1Dao().
    }



}
