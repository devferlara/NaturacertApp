package naturacert.baumsoft.dev.naturacert.extras;

import android.app.Application;

import java.util.List;

import naturacert.baumsoft.dev.naturacert.Auditores;
import naturacert.baumsoft.dev.naturacert.Clientes;
import naturacert.baumsoft.dev.naturacert.DaoAPP;
import naturacert.baumsoft.dev.naturacert.TokensBD;

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


    public String[] informacionAuditor(){
        String[] cadena = new String[3];

        List<Auditores> auditores_lista = DaoAPP.daoSession.getAuditoresDao().loadAll();
        Auditores auditor = auditores_lista.get(0);
        cadena[0] = auditor.getNombre();
        cadena[1] = auditor.getApellido();
        cadena[2] = auditor.getFoto();

        return cadena;
    }


}
