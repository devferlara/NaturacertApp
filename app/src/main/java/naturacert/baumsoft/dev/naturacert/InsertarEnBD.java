package naturacert.baumsoft.dev.naturacert;


import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class InsertarEnBD extends Application {

    private String[] columnas;
    private StringBuilder urlEnviar = new StringBuilder("http://naturacert.ddns.net/api/rac_save_new/?type=rac&rac=");
    private StringBuilder urlEnviarGrupo = new StringBuilder("http://naturacert.ddns.net/api/rac_save_new/?type=racg&racg=");
    private Context contexto;

    public static String getUrlContent(String page) {
        StringBuilder results = new StringBuilder();
        HttpURLConnection conn = null;
        InputStreamReader in = null;

        try {
            URL url = new URL(page);

            conn = (HttpURLConnection) url.openConnection();
            in = new InputStreamReader(conn.getInputStream());

            // Load the results into a StringBuilder
            int read;
            char[] buff = new char[1024];

            while ((read = in.read(buff)) != -1) {
                results.append(buff, 0, read);
            }
            return results.toString();

        } catch (MalformedURLException e) {

            return results.toString();
        } catch (IOException e) {

            return results.toString();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }

    }

    public void contexto(Context con) {
        contexto = con;
    }

    public void insertarEnBD(String punto, int[] datos, String[] valores, long idCons, Boolean ind) {

        urlEnviar.append(idCons);
        urlEnviar.append("&item=");

        urlEnviarGrupo.append(idCons);
        urlEnviarGrupo.append("&item=");

        if(ind){
            List<p1p1> tabla = DaoAPP.daoSession.getP1p1Dao().queryBuilder()
                    .where(p1p1Dao.Properties.Id_formulario.eq(idCons))
                    .list();

            p1p1 elemento = tabla.get(0);
            idCons = elemento.getId();
        } else {

            List<g1p1> tabla = DaoAPP.daoSession.getG1p1Dao().queryBuilder()
                    .where(g1p1Dao.Properties.Id_formulario.eq(idCons))
                    .list();

            g1p1 elemento = tabla.get(0);
            idCons = elemento.getId();

        }





        int contadorValores = 0;
        switch (punto) {
            case "1.1":
                urlEnviar.append("rpone_unopuno");
                columnas = DaoAPP.daoSession.getP1p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[m - 1]);
                    }
                }

                p1p1 op1p1 = DaoAPP.daoSession.getP1p1Dao().load(idCons);
                op1p1.setSgsate(datos[0]);
                op1p1.setSgsa(datos[1]);
                op1p1.setPoliticas(datos[2]);
                op1p1.setProgramas(datos[3]);
                op1p1.setProcedimientos(datos[4]);
                op1p1.setSociales(datos[5]);
                op1p1.setLaborales(datos[6]);
                op1p1.setAmbientales(datos[7]);
                op1p1.setOrigen(datos[8]);
                op1p1.setObser(valores[0]);
                DaoAPP.daoSession.getP1p1Dao().update(op1p1);
                new enviar().execute(urlEnviar.toString());
                break;


            case "1.2":
                urlEnviar.append("rpone_unopdos");
                columnas = DaoAPP.daoSession.getP1p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 13) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p1p2 op1p2 = DaoAPP.daoSession.getP1p2Dao().load(idCons);
                op1p2.setEapcn(datos[0]);
                op1p2.setPgsa(datos[1]);
                op1p2.setEap(datos[2]);
                op1p2.setAlp(datos[3]);
                op1p2.setOym(datos[4]);
                op1p2.setRes(datos[5]);
                op1p2.setReg(datos[6]);
                op1p2.setMap(datos[7]);
                op1p2.setLaip(datos[8]);
                op1p2.setPol(datos[9]);
                op1p2.setProc(datos[10]);
                op1p2.setOrigen(datos[11]);
                op1p2.setObser(valores[0]);
                DaoAPP.daoSession.getP1p2Dao().update(op1p2);

                new enviar().execute(urlEnviar.toString());
                break;

            case "1.3":
                urlEnviar.append("rpone_unoptres");
                columnas = DaoAPP.daoSession.getP1p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p3 op1p3 = DaoAPP.daoSession.getP1p3Dao().load(idCons);
                op1p3.setDfdc(datos[0]);
                op1p3.setCyasp(datos[1]);
                op1p3.setAdc(datos[2]);
                op1p3.setAer(datos[3]);
                op1p3.setOrigen(datos[4]);
                op1p3.setObser(valores[0]);
                DaoAPP.daoSession.getP1p3Dao().update(op1p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.4":
                urlEnviar.append("rpone_unopcuatro");
                columnas = DaoAPP.daoSession.getP1p4Dao().getAllColumns();

                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3 || m == 6 || m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }

                }

                p1p4 op1p4 = DaoAPP.daoSession.getP1p4Dao().load(idCons);
                op1p4.setSgsdt(datos[0]);
                op1p4.setOyrd(datos[1]);
                op1p4.setDonde(valores[0]);
                op1p4.setPgsd(datos[2]);
                op1p4.setEdd(datos[3]);
                op1p4.setCuales(valores[1]);
                op1p4.setOrigen(datos[4]);
                op1p4.setObser(valores[2]);
                DaoAPP.daoSession.getP1p4Dao().update(op1p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.5":
                urlEnviar.append("rpone_unopcinco");
                columnas = DaoAPP.daoSession.getP1p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3 || m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p5 op1p5 = DaoAPP.daoSession.getP1p5Dao().load(idCons);
                op1p5.setCdpm(datos[0]);
                op1p5.setDfdr(datos[1]);
                op1p5.setDgsca(valores[0]);
                DaoAPP.daoSession.getP1p5Dao().update(op1p5);
                op1p5.setOrigen(datos[2]);
                op1p5.setObser(valores[1]);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.6":
                urlEnviar.append("rpone_unopseis");
                columnas = DaoAPP.daoSession.getP1p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p6 op1p6 = DaoAPP.daoSession.getP1p6Dao().load(idCons);
                op1p6.setEpino(datos[0]);
                op1p6.setErlv(datos[1]);
                op1p6.setErac(datos[2]);
                op1p6.setEipi(datos[3]);
                op1p6.setOrigen(datos[4]);
                op1p6.setObser(valores[0]);
                DaoAPP.daoSession.getP1p6Dao().update(op1p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.7":
                urlEnviar.append("rpone_unopsiete");
                columnas = DaoAPP.daoSession.getP1p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 16) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p7 op1p7 = DaoAPP.daoSession.getP1p7Dao().load(idCons);
                op1p7.setCppr(datos[0]);
                op1p7.setRdr(datos[1]);
                op1p7.setIap(datos[2]);
                op1p7.setPmc(datos[3]);
                op1p7.setSeg(datos[4]);
                op1p7.setMed(datos[5]);
                op1p7.setAna(datos[6]);
                op1p7.setTrab(datos[7]);
                op1p7.setGrup(datos[8]);
                op1p7.setOper(datos[9]);
                op1p7.setAco(datos[10]);
                op1p7.setMdea(datos[11]);
                op1p7.setMdam(datos[12]);
                op1p7.setApam(datos[13]);
                op1p7.setOrigen(datos[14]);
                op1p7.setObser(valores[0]);
                DaoAPP.daoSession.getP1p7Dao().update(op1p7);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.8":
                urlEnviar.append("rpone_unopocho");
                columnas = DaoAPP.daoSession.getP1p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p8 op1p8 = DaoAPP.daoSession.getP1p8Dao().load(idCons);
                op1p8.setPsfc(datos[0]);
                op1p8.setMep(datos[1]);
                op1p8.setVcp(datos[2]);
                op1p8.setFvc(datos[3]);
                op1p8.setOrigen(datos[4]);
                op1p8.setObser(valores[0]);
                DaoAPP.daoSession.getP1p8Dao().update(op1p8);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.9":
                urlEnviar.append("rpone_unopnueve");
                columnas = DaoAPP.daoSession.getP1p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 12) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p9 op1p9 = DaoAPP.daoSession.getP1p9Dao().load(idCons);
                op1p9.setPcsg(datos[0]);
                op1p9.setPdc(datos[1]);
                op1p9.setPde(datos[2]);
                op1p9.setRda(datos[3]);
                op1p9.setRdt(datos[4]);
                op1p9.setRdi(datos[5]);
                op1p9.setActr(datos[6]);
                op1p9.setNorm(datos[7]);
                op1p9.setPdt(datos[8]);
                op1p9.setTdl(datos[9]);
                op1p9.setOrigen(datos[10]);
                op1p9.setObser(valores[0]);
                DaoAPP.daoSession.getP1p9Dao().update(op1p9);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.10":
                urlEnviar.append("rpone_unopdiez");
                columnas = DaoAPP.daoSession.getP1p10Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p10 op1p10 = DaoAPP.daoSession.getP1p10Dao().load(idCons);
                op1p10.setSpem(datos[0]);
                op1p10.setSef(datos[1]);
                op1p10.setSet(datos[2]);
                op1p10.setPoi(datos[3]);
                op1p10.setRtra(datos[4]);
                op1p10.setPad(datos[5]);
                op1p10.setOrigen(datos[6]);
                op1p10.setObser(valores[0]);
                DaoAPP.daoSession.getP1p10Dao().update(op1p10);
                new enviar().execute(urlEnviar.toString());
                break;

            case "1.11":
                urlEnviar.append("rpone_unoponce");
                columnas = DaoAPP.daoSession.getP1p11Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p1p11 op1p11 = DaoAPP.daoSession.getP1p11Dao().load(idCons);
                op1p11.setDfep(datos[0]);
                op1p11.setPdp(datos[1]);
                op1p11.setTran(datos[2]);
                op1p11.setUdom(datos[3]);
                op1p11.setPedn(datos[4]);
                op1p11.setRce(datos[5]);
                op1p11.setOrigen(datos[6]);
                op1p11.setObser(valores[0]);
                DaoAPP.daoSession.getP1p11Dao().update(op1p11);
                new enviar().execute(urlEnviar.toString());
                break;

            /* punto 2 */

            case "2.1":
                urlEnviar.append("rptwo_dospuno");
                columnas = DaoAPP.daoSession.getP2p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p1 op2p1 = DaoAPP.daoSession.getP2p1Dao().load(idCons);
                op2p1.setEco_pro_rec(datos[0]);
                op2p1.setEco_nat(datos[1]);
                op2p1.setProg_con(datos[2]);
                op2p1.setIden_eco(datos[3]);
                op2p1.setPro_eco(datos[4]);
                op2p1.setRec_eco(datos[5]);
                op2p1.setProg_inc_eco(datos[6]);
                op2p1.setOrigen(datos[7]);
                op2p1.setObser(valores[0]);
                DaoAPP.daoSession.getP2p1Dao().update(op2p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.2":
                urlEnviar.append("rptwo_dospdos");
                columnas = DaoAPP.daoSession.getP2p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p2 op2p2 = DaoAPP.daoSession.getP2p2Dao().load(idCons);
                op2p2.setFndsn(datos[0]);
                op2p2.setEav(datos[1]);
                op2p2.setNede(datos[2]);
                op2p2.setNdedc(datos[3]);
                op2p2.setNden(datos[4]);
                op2p2.setAdes(datos[5]);
                op2p2.setPmit(datos[6]);
                op2p2.setIpla(datos[7]);
                op2p2.setOrigen(datos[8]);
                op2p2.setObser(valores[0]);
                DaoAPP.daoSession.getP2p2Dao().update(op2p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.3":
                urlEnviar.append("rptwo_dosptres");
                columnas = DaoAPP.daoSession.getP2p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 13) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p3 op2p3 = DaoAPP.daoSession.getP2p3Dao().load(idCons);
                op2p3.setApnuc(datos[0]);
                op2p3.setPnz(datos[1]);
                op2p3.setRvs(datos[2]);
                op2p3.setAzm(datos[3]);
                op2p3.setSpn(datos[4]);
                op2p3.setRfp(datos[5]);
                op2p3.setPnr(datos[6]);
                op2p3.setDmi(datos[7]);
                op2p3.setDcs(datos[8]);
                op2p3.setArec(datos[9]);
                op2p3.setRnsc(datos[10]);
                op2p3.setOrigen(datos[11]);
                op2p3.setObser(valores[0]);
                DaoAPP.daoSession.getP2p3Dao().update(op2p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.4":
                urlEnviar.append("rptwo_dospcuatro");
                columnas = DaoAPP.daoSession.getP2p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p4 op2p4 = DaoAPP.daoSession.getP2p4Dao().load(idCons);
                op2p4.setNpep(datos[0]);
                op2p4.setNtpm(datos[1]);
                op2p4.setCpms(datos[2]);
                op2p4.setCpdl(datos[3]);
                op2p4.setNsep(datos[4]);
                op2p4.setOrigen(datos[5]);
                op2p4.setObser(valores[0]);
                DaoAPP.daoSession.getP2p4Dao().update(op2p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.5":
                urlEnviar.append("rptwo_dospcinco");
                columnas = DaoAPP.daoSession.getP2p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p5 op2p5 = DaoAPP.daoSession.getP2p5Dao().load(idCons);
                op2p5.setNent(datos[0]);
                op2p5.setDcpos(datos[1]);
                op2p5.setDsp(datos[2]);
                op2p5.setOsv(datos[3]);
                op2p5.setSepyn(datos[4]);
                op2p5.setOrigen(datos[5]);
                op2p5.setObser(valores[0]);
                DaoAPP.daoSession.getP2p5Dao().update(op2p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.6":
                urlEnviar.append("rptwo_dospseis");
                columnas = DaoAPP.daoSession.getP2p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7 || m == 10) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p6 op2p6 = DaoAPP.daoSession.getP2p6Dao().load(idCons);
                op2p6.setNea(datos[0]);
                op2p6.setAea(datos[1]);
                op2p6.setErosion(datos[2]);
                op2p6.setDeriva(datos[3]);
                op2p6.setEscagro(datos[4]);
                op2p6.setPcn(datos[5]);
                op2p6.setDecyc(valores[0]);
                op2p6.setUcv(datos[6]);
                op2p6.setOrigen(datos[7]);
                op2p6.setObser(valores[1]);
                DaoAPP.daoSession.getP2p6Dao().update(op2p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.7":
                urlEnviar.append("rptwo_dospsiete");
                columnas = DaoAPP.daoSession.getP2p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p2p7 op2p7 = DaoAPP.daoSession.getP2p7Dao().load(idCons);
                op2p7.setNhah(datos[0]);
                op2p7.setBuvn(datos[1]);
                op2p7.setCah(datos[2]);
                op2p7.setApc(datos[3]);
                op2p7.setRdpyh(datos[4]);
                op2p7.setOrigen(datos[5]);
                op2p7.setObser(valores[0]);
                DaoAPP.daoSession.getP2p7Dao().update(op2p7);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.8":
                urlEnviar.append("rptwo_dospocho");
                columnas = DaoAPP.daoSession.getP2p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 2 || m == 3 || m == 4 || m == 5 || m ==8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p8 op2p8 = DaoAPP.daoSession.getP2p8Dao().load(idCons);
                op2p8.setNcaf(datos[0]);
                op2p8.setDenp(valores[0]);
                op2p8.setDea(valores[1]);
                op2p8.setNeh(valores[2]);
                op2p8.setAdre(valores[3]);
                op2p8.setAdmh(datos[1]);
                op2p8.setOrigen(datos[2]);
                op2p8.setObser(valores[4]);
                DaoAPP.daoSession.getP2p8Dao().update(op2p8);
                new enviar().execute(urlEnviar.toString());
                break;

            case "2.9":
                urlEnviar.append("rptwo_dospnueve");
                columnas = DaoAPP.daoSession.getP2p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p2p9 op2p9 = DaoAPP.daoSession.getP2p9Dao().load(idCons);
                op2p9.setFlipc(datos[0]);
                op2p9.setCpmr(datos[1]);
                op2p9.setEncd(datos[2]);
                op2p9.setAdp(datos[3]);
                op2p9.setSbv(datos[4]);
                op2p9.setAdc(datos[5]);
                op2p9.setPex(datos[6]);
                op2p9.setOrigen(datos[7]);
                op2p9.setObser(valores[0]);

                DaoAPP.daoSession.getP2p9Dao().update(op2p9);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio  3 */

            case "3.1":
                urlEnviar.append("rpthree_trespuno");
                columnas = DaoAPP.daoSession.getP3p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p3p1 op3p1 = DaoAPP.daoSession.getP3p1Dao().load(idCons);
                op3p1.setCmivs(datos[0]);
                op3p1.setIvs(datos[1]);
                op3p1.setIdh(datos[2]);
                op3p1.setOrigen(datos[3]);
                op3p1.setObser(valores[0]);
                DaoAPP.daoSession.getP3p1Dao().update(op3p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "3.2":
                urlEnviar.append("rpthree_trespdos");
                columnas = DaoAPP.daoSession.getP3p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p3p2 op3p2 = DaoAPP.daoSession.getP3p2Dao().load(idCons);
                op3p2.setNiea(datos[0]);
                op3p2.setIeap(datos[1]);
                op3p2.setRhvs(datos[2]);
                op3p2.setPhf(datos[3]);
                op3p2.setPep(datos[4]);
                op3p2.setOrigen(datos[5]);
                op3p2.setObser(valores[0]);
                DaoAPP.daoSession.getP3p2Dao().update(op3p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "3.3":
                urlEnviar.append("rpthree_tresptres");
                columnas = DaoAPP.daoSession.getP3p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p3p3 op3p3 = DaoAPP.daoSession.getP3p3Dao().load(idCons);
                op3p3.setPceta(datos[0]);
                op3p3.setEgc(datos[1]);
                op3p3.setPhgc(datos[2]);
                op3p3.setNcfc(datos[3]);
                op3p3.setCrsc(datos[4]);
                op3p3.setPrea(datos[5]);
                op3p3.setPgec(datos[6]);
                op3p3.setOrigen(datos[7]);
                op3p3.setObser(valores[0]);
                DaoAPP.daoSession.getP3p3Dao().update(op3p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "3.4":
                urlEnviar.append("rpthree_trespcuatro");
                columnas = DaoAPP.daoSession.getP3p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p3p4 op3p4 = DaoAPP.daoSession.getP3p4Dao().load(idCons);
                op3p4.setNmac(datos[0]);
                op3p4.setCprt(datos[1]);
                op3p4.setCifc(datos[2]);
                op3p4.setNeac(datos[3]);
                op3p4.setOrigen(datos[4]);
                op3p4.setObser(valores[0]);
                DaoAPP.daoSession.getP3p4Dao().update(op3p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "3.5":
                urlEnviar.append("rpthree_trespcinco");
                columnas = DaoAPP.daoSession.getP3p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p3p5 op3p5 = DaoAPP.daoSession.getP3p5Dao().load(idCons);
                op3p5.setNezc(datos[0]);
                op3p5.setCapr(datos[1]);
                op3p5.setOrigen(datos[2]);
                op3p5.setObser(valores[0]);
                DaoAPP.daoSession.getP3p5Dao().update(op3p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "3.6":
                urlEnviar.append("rpthree_trespseis");
                columnas = DaoAPP.daoSession.getP3p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p3p6 op3p6 = DaoAPP.daoSession.getP3p6Dao().load(idCons);
                op3p6.setNish(datos[0]);
                op3p6.setCpl(datos[1]);
                op3p6.setCap(datos[2]);
                op3p6.setNvsf(datos[3]);
                op3p6.setOrigen(datos[4]);
                op3p6.setObser(valores[0]);
                DaoAPP.daoSession.getP3p6Dao().update(op3p6);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio 4 */

            case "4.1":
                urlEnviar.append("rpfour_cuatropuno");
                columnas = DaoAPP.daoSession.getP4p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p1 op4p1 = DaoAPP.daoSession.getP4p1Dao().load(idCons);
                op4p1.setFepca(datos[0]);
                op4p1.setPca(datos[1]);
                op4p1.setIfs(datos[2]);
                op4p1.setNeda(datos[3]);
                op4p1.setMap(datos[4]);
                op4p1.setRca(datos[5]);
                op4p1.setFcra(datos[6]);
                op4p1.setFrmr(datos[7]);
                op4p1.setRcaf(datos[8]);
                op4p1.setOrigen(datos[9]);
                op4p1.setObser(valores[0]);
                DaoAPP.daoSession.getP4p1Dao().update(op4p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.2":
                urlEnviar.append("rpfour_cuatropdos");
                columnas = DaoAPP.daoSession.getP4p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p2 op4p2 = DaoAPP.daoSession.getP4p2Dao().load(idCons);
                op4p2.setNeas(datos[0]);
                op4p2.setFapa(datos[1]);
                op4p2.setFcva(datos[2]);
                op4p2.setOrigen(datos[3]);
                op4p2.setObser(valores[0]);
                DaoAPP.daoSession.getP4p2Dao().update(op4p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.3":
                urlEnviar.append("rpfour_cuatroptres");
                columnas = DaoAPP.daoSession.getP4p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p3 op4p3 = DaoAPP.daoSession.getP4p3Dao().load(idCons);
                op4p3.setFntr(datos[0]);
                op4p3.setMpma(datos[1]);
                op4p3.setDnpsa(datos[2]);
                op4p3.setDcau(datos[3]);
                op4p3.setSred(datos[4]);
                op4p3.setOrigen(datos[5]);
                op4p3.setObser(valores[0]);
                DaoAPP.daoSession.getP4p3Dao().update(op4p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.4":
                urlEnviar.append("rpfour_cuatropcuatro");
                columnas = DaoAPP.daoSession.getP4p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p4 op4p4 = DaoAPP.daoSession.getP4p4Dao().load(idCons);
                op4p4.setFcsts(datos[0]);
                op4p4.setDsta(datos[1]);
                op4p4.setStds(datos[2]);
                op4p4.setPevs(datos[3]);
                op4p4.setSota(datos[4]);
                op4p4.setOrigen(datos[5]);
                op4p4.setObser(valores[0]);
                DaoAPP.daoSession.getP4p4Dao().update(op4p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.5":
                urlEnviar.append("rpfour_cuatropcinco");
                columnas = DaoAPP.daoSession.getP4p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p5 op4p5 = DaoAPP.daoSession.getP4p5Dao().load(idCons);
                op4p5.setNsasa(datos[0]);
                op4p5.setAvcp(datos[1]);
                op4p5.setNsarc(datos[2]);
                op4p5.setOrigen(datos[3]);
                op4p5.setObser(valores[0]);
                DaoAPP.daoSession.getP4p5Dao().update(op4p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.6":
                urlEnviar.append("rpfour_cuatropseis");
                columnas = DaoAPP.daoSession.getP4p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p6 op4p6 = DaoAPP.daoSession.getP4p6Dao().load(idCons);
                op4p6.setNvara(datos[0]);
                op4p6.setLaba(datos[1]);
                op4p6.setProma(datos[2]);
                op4p6.setProcr(datos[3]);
                op4p6.setOrigen(datos[4]);
                op4p6.setObser(valores[0]);
                DaoAPP.daoSession.getP4p6Dao().update(op4p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.7":
                urlEnviar.append("rpfour_cuatropsiete");
                columnas = DaoAPP.daoSession.getP4p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p7 op4p7 = DaoAPP.daoSession.getP4p7Dao().load(idCons);
                op4p7.setFnpd(datos[0]);
                op4p7.setNsda(datos[1]);
                op4p7.setOrigen(datos[2]);
                op4p7.setObser(valores[0]);
                DaoAPP.daoSession.getP4p7Dao().update(op4p7);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.8":
                urlEnviar.append("rpfour_cuatropocho");
                columnas = DaoAPP.daoSession.getP4p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p8 op4p8 = DaoAPP.daoSession.getP4p8Dao().load(idCons);
                op4p8.setFruts(datos[0]);
                op4p8.setUts(datos[1]);
                op4p8.setTusa(datos[2]);
                op4p8.setDava(datos[3]);
                op4p8.setDprp(datos[4]);
                op4p8.setRale(datos[5]);
                op4p8.setTarq(datos[6]);
                op4p8.setOrigen(datos[7]);
                op4p8.setObser(valores[0]);
                DaoAPP.daoSession.getP4p8Dao().update(op4p8);
                new enviar().execute(urlEnviar.toString());
                break;

            case "4.9":
                urlEnviar.append("rpfour_cuatropnueve");
                columnas = DaoAPP.daoSession.getP4p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p4p9 op4p9 = DaoAPP.daoSession.getP4p9Dao().load(idCons);
                op4p9.setFcpr(datos[0]);
                op4p9.setPmas(datos[1]);
                op4p9.setFrec(datos[2]);
                op4p9.setAnar(datos[3]);
                op4p9.setPmue(datos[4]);
                op4p9.setAmdc(datos[5]);
                op4p9.setOrigen(datos[6]);
                op4p9.setObser(valores[0]);
                DaoAPP.daoSession.getP4p9Dao().update(op4p9);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.1":
                urlEnviar.append("rpfive_cincopuno");
                columnas = DaoAPP.daoSession.getP5p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }

                p5p1 op5p1 = DaoAPP.daoSession.getP5p1Dao().load(idCons);
                op5p1.setArmhf(datos[0]);
                op5p1.setPolso(datos[1]);
                op5p1.setApad(datos[2]);
                op5p1.setPsdcf(datos[3]);
                op5p1.setDiv(datos[4]);
                op5p1.setCpf(datos[5]);
                op5p1.setDpe(datos[6]);
                op5p1.setComu(datos[7]);
                op5p1.setRdtya(datos[8]);
                op5p1.setOrigen(datos[9]);
                op5p1.setObser(valores[0]);
                DaoAPP.daoSession.getP5p1Dao().update(op5p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.2":
                urlEnviar.append("rpfive_cincopdos");
                columnas = DaoAPP.daoSession.getP5p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p2 op5p2 = DaoAPP.daoSession.getP5p2Dao().load(idCons);
                op5p2.setArmf(datos[0]);
                op5p2.setOmcr(datos[1]);
                op5p2.setOmoc(datos[2]);
                op5p2.setOmoa(datos[3]);
                op5p2.setNiprc(datos[4]);
                op5p2.setNdplc(datos[5]);
                op5p2.setOrigen(datos[6]);
                op5p2.setObser(valores[0]);
                DaoAPP.daoSession.getP5p2Dao().update(op5p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.3":
                urlEnviar.append("rpfive_cincoptres");
                columnas = DaoAPP.daoSession.getP5p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p3 op5p3 = DaoAPP.daoSession.getP5p3Dao().load(idCons);
                op5p3.setArmf(datos[0]);
                op5p3.setSeot(datos[1]);
                op5p3.setCmod(datos[2]);
                op5p3.setCrn(datos[3]);
                op5p3.setNdpe(datos[4]);
                op5p3.setOrigen(datos[5]);
                op5p3.setObser(valores[0]);
                DaoAPP.daoSession.getP5p3Dao().update(op5p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.4":
                urlEnviar.append("rpfive_cincopcuatro");
                columnas = DaoAPP.daoSession.getP5p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6 || m==20) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p4 op5p4 = DaoAPP.daoSession.getP5p4Dao().load(idCons);
                op5p4.setArmf(datos[0]);
                op5p4.setPdp(datos[1]);
                op5p4.setOesd(datos[2]);
                op5p4.setGpct(datos[3]);
                op5p4.setPapd(datos[4]);
                op5p4.setNep(valores[0]);
                op5p4.setPlan(datos[6]);
                op5p4.setNtcp(datos[7]);
                op5p4.setDpsa(datos[8]);
                op5p4.setSmeg(datos[9]);
                op5p4.setHret(datos[10]);
                op5p4.setReqp(datos[11]);
                op5p4.setFpag(datos[12]);
                op5p4.setDlyo(datos[13]);
                op5p4.setPbhm(datos[14]);
                op5p4.setPbhe(datos[15]);
                op5p4.setPagt(datos[16]);
                op5p4.setPagn(datos[17]);
                op5p4.setOrigen(datos[18]);
                op5p4.setObser(valores[1]);
                DaoAPP.daoSession.getP5p4Dao().update(op5p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.5":
                urlEnviar.append("rpfive_cincopcinco");
                columnas = DaoAPP.daoSession.getP5p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if ( m == 2 || m == 3 || m == 4 || m == 5 || m == 10 ) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p5 op5p5 = DaoAPP.daoSession.getP5p5Dao().load(idCons);
                op5p5.setArmf(datos[0]);
                op5p5.setSalj(valores[0]);
                op5p5.setCuot(valores[1]);
                op5p5.setPiez(valores[2]);
                op5p5.setProd(valores[3]);
                op5p5.setSios(datos[1]);
                op5p5.setSnpc(datos[2]);
                op5p5.setTacn(datos[3]);
                op5p5.setOrigen(datos[4]);
                op5p5.setObser(valores[4]);
                DaoAPP.daoSession.getP5p5Dao().update(op5p5);
                new enviar().execute(urlEnviar.toString());
                Log.d("DAvid", urlEnviar.toString());
                break;

            case "5.6":
                urlEnviar.append("rpfive_cincopseis");
                columnas = DaoAPP.daoSession.getP5p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 2 || m == 3 || m == 4 || m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p6 op5p6 = DaoAPP.daoSession.getP5p6Dao().load(idCons);
                op5p6.setHtoc(datos[0]);
                op5p6.setHort(valores[0]);
                op5p6.setDtps(valores[1]);
                op5p6.setTdvp(valores[2]);
                op5p6.setMhne(datos[1]);
                op5p6.setTdsd(datos[2]);
                op5p6.setDbic(datos[3]);
                op5p6.setVac(datos[4]);
                op5p6.setDybc(datos[5]);
                op5p6.setOrigen(datos[6]);
                op5p6.setObser(valores[3]);
                DaoAPP.daoSession.getP5p6Dao().update(op5p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.7":
                urlEnviar.append("rpfive_cincopsiete");
                columnas = DaoAPP.daoSession.getP5p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6 || m == 7 || m == 12) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p7 op5p7 = DaoAPP.daoSession.getP5p7Dao().load(idCons);
                op5p7.setArmf(datos[0]);
                op5p7.setSthe(datos[1]);
                op5p7.setThev(datos[2]);
                op5p7.setCppa(datos[3]);
                op5p7.setScpy(datos[4]);
                op5p7.setMhef(valores[0]);
                op5p7.setHela(valores[1]);
                op5p7.setHepa(datos[7]);
                op5p7.setUpeh(datos[8]);
                op5p7.setCcec(datos[9]);
                op5p7.setOrigen(datos[10]);
                op5p7.setObser(valores[2]);
                DaoAPP.daoSession.getP5p7Dao().update(op5p7);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.8":
                urlEnviar.append("rpfive_cincopocho");
                columnas = DaoAPP.daoSession.getP5p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 15 || m == 16 || m == 20) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p8 op5p8 = DaoAPP.daoSession.getP5p8Dao().load(idCons);
                op5p8.setArmf(datos[0]);
                op5p8.setNstm(datos[1]);
                op5p8.setNsmt(datos[2]);
                op5p8.setRptm(datos[3]);
                op5p8.setJorn(datos[4]);
                op5p8.setCpdl(datos[5]);
                op5p8.setNoya(datos[6]);
                op5p8.setFecn(datos[7]);
                op5p8.setNpor(datos[8]);
                op5p8.setLpor(datos[9]);
                op5p8.setTlrf(datos[10]);
                op5p8.setNhat(datos[11]);
                op5p8.setSalr(datos[12]);
                op5p8.setAefr(datos[13]);
                op5p8.setHldm(valores[0]);
                op5p8.setHlsm(valores[1]);
                op5p8.setHnie(datos[16]);
                op5p8.setTmnr(datos[17]);
                op5p8.setOrigen(datos[18]);
                op5p8.setObser(valores[2]);
                DaoAPP.daoSession.getP5p8Dao().update(op5p8);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.9":
                urlEnviar.append("rpfive_cincopnueve");
                columnas = DaoAPP.daoSession.getP5p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p9 op5p9 = DaoAPP.daoSession.getP5p9Dao().load(idCons);
                op5p9.setLcnpm(datos[0]);
                op5p9.setMetf(datos[1]);
                op5p9.setOrigen(datos[2]);
                op5p9.setObser(valores[0]);
                DaoAPP.daoSession.getP5p9Dao().update(op5p9);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.10":
                urlEnviar.append("rpfive_cincopdiez");
                columnas = DaoAPP.daoSession.getP5p10Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p10 op5p10 = DaoAPP.daoSession.getP5p10Dao().load(idCons);
                op5p10.setArmf(datos[0]);
                op5p10.setPctf(datos[1]);
                op5p10.setEsal(datos[2]);
                op5p10.setBen(datos[3]);
                op5p10.setCdel(datos[4]);
                op5p10.setDtra(datos[5]);
                op5p10.setFotl(datos[6]);
                op5p10.setOrigen(datos[7]);
                op5p10.setObser(valores[0]);
                DaoAPP.daoSession.getP5p10Dao().update(op5p10);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.11":
                urlEnviar.append("rpfive_cincoponce");
                columnas = DaoAPP.daoSession.getP5p11Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p11 op5p11 = DaoAPP.daoSession.getP5p11Dao().load(idCons);
                op5p11.setArmf(datos[0]);
                op5p11.setFtrt(datos[1]);
                op5p11.setSnat(datos[2]);
                op5p11.setMfmt(datos[3]);
                op5p11.setOrigen(datos[4]);
                op5p11.setObser(valores[0]);
                DaoAPP.daoSession.getP5p11Dao().update(op5p11);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.12":
                urlEnviar.append("rpfive_cincopdoce");
                columnas = DaoAPP.daoSession.getP5p12Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11 || m == 13) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p12 op5p12 = DaoAPP.daoSession.getP5p12Dao().load(idCons);
                op5p12.setArmf(datos[0]);
                op5p12.setPgd(datos[1]);
                op5p12.setNumt(datos[2]);
                op5p12.setTdol(datos[3]);
                op5p12.setFprt(datos[4]);
                op5p12.setIdeo(datos[5]);
                op5p12.setRel(datos[6]);
                op5p12.setSoc(datos[7]);
                op5p12.setPol(datos[8]);
                op5p12.setCul(datos[9]);
                op5p12.setDe(valores[0]);
                op5p12.setOrigen(datos[10]);
                op5p12.setObser(valores[1]);
                DaoAPP.daoSession.getP5p12Dao().update(op5p12);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.13":
                urlEnviar.append("rpfive_cincoptrece");
                columnas = DaoAPP.daoSession.getP5p13Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p13 op5p13 = DaoAPP.daoSession.getP5p13Dao().load(idCons);
                op5p13.setArmf(datos[0]);
                op5p13.setNcss(datos[1]);
                op5p13.setFitc(datos[2]);
                op5p13.setFpt(datos[3]);
                op5p13.setTrcp(datos[4]);
                op5p13.setOrigen(datos[5]);
                op5p13.setObser(valores[0]);
                DaoAPP.daoSession.getP5p13Dao().update(op5p13);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.14":
                urlEnviar.append("rpfive_cincopcatorce");
                columnas = DaoAPP.daoSession.getP5p14Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p14 op5p14 = DaoAPP.daoSession.getP5p14Dao().load(idCons);
                op5p14.setFnav(datos[0]);
                op5p14.setHig(datos[1]);
                op5p14.setSegh(datos[2]);
                op5p14.setSal(datos[3]);
                op5p14.setVfap(datos[4]);
                op5p14.setTtar(datos[5]);
                op5p14.setSbdn(datos[6]);
                op5p14.setIdta(datos[7]);
                op5p14.setMemc(datos[8]);
                op5p14.setOrigen(datos[9]);
                op5p14.setObser(valores[0]);
                DaoAPP.daoSession.getP5p14Dao().update(op5p14);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.15":
                urlEnviar.append("rpfive_cincopquince");
                columnas = DaoAPP.daoSession.getP5p15Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5 || m == 10 || m == 14) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p15 op5p15 = DaoAPP.daoSession.getP5p15Dao().load(idCons);
                op5p15.setTfap(datos[0]);
                op5p15.setAcue(datos[1]);
                op5p15.setNaci(datos[2]);
                op5p15.setCau(datos[3]);
                op5p15.setOtro(valores[0]);
                op5p15.setTaap(datos[5]);
                op5p15.setApcs(datos[6]);
                op5p15.setAdlt(datos[7]);
                op5p15.setAna(datos[8]);
                op5p15.setDfec(valores[1]);
                op5p15.setDepo(datos[10]);
                op5p15.setHagu(datos[11]);
                op5p15.setOrigen(datos[12]);
                op5p15.setObser(valores[2]);
                DaoAPP.daoSession.getP5p15Dao().update(op5p15);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.16":
                urlEnviar.append("rpfive_cincopdiezyseis");
                columnas = DaoAPP.daoSession.getP5p16Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7 || m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p16 op5p16 = DaoAPP.daoSession.getP5p16Dao().load(idCons);
                op5p16.setTtam(datos[0]);
                op5p16.setTamh(datos[1]);
                op5p16.setTame(datos[2]);
                op5p16.setEps(datos[3]);
                op5p16.setSisb(datos[4]);
                op5p16.setOtro(datos[5]);
                op5p16.setCual(valores[0]);
                op5p16.setOrigen(datos[6]);
                op5p16.setObser(valores[1]);
                DaoAPP.daoSession.getP5p16Dao().update(op5p16);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.17":
                urlEnviar.append("rpfive_cincopdiezysiete");
                columnas = DaoAPP.daoSession.getP5p17Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p17 op5p17 = DaoAPP.daoSession.getP5p17Dao().load(idCons);
                op5p17.setFgeh(datos[0]);
                op5p17.setHtevf(datos[1]);
                op5p17.setMgaet(datos[2]);
                op5p17.setEapf(datos[3]);
                op5p17.setOrigen(datos[4]);
                op5p17.setObser(valores[0]);
                DaoAPP.daoSession.getP5p17Dao().update(op5p17);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.18":
                urlEnviar.append("rpfive_cincopdiezyocho");
                columnas = DaoAPP.daoSession.getP5p18Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p18 op5p18 = DaoAPP.daoSession.getP5p18Dao().load(idCons);
                op5p18.setFipe(datos[0]);
                op5p18.setEper(datos[1]);
                op5p18.setAnlc(datos[2]);
                op5p18.setIftf(datos[3]);
                op5p18.setOrigen(datos[4]);
                op5p18.setObser(valores[0]);
                DaoAPP.daoSession.getP5p18Dao().update(op5p18);
                new enviar().execute(urlEnviar.toString());
                break;

            case "5.19":
                urlEnviar.append("rpfive_cincopdiezynueve");
                columnas = DaoAPP.daoSession.getP5p19Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p5p19 op5p19 = DaoAPP.daoSession.getP5p19Dao().load(idCons);
                op5p19.setLnpm(datos[0]);
                op5p19.setMetc(datos[1]);
                op5p19.setOrigen(datos[2]);
                op5p19.setObser(valores[0]);
                DaoAPP.daoSession.getP5p19Dao().update(op5p19);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio 6 */

            case "6.1":
                urlEnviar.append("rpsix_seispuno");
                columnas = DaoAPP.daoSession.getP6p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 14) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p1 op6p1 = DaoAPP.daoSession.getP6p1Dao().load(idCons);
                op6p1.setLfdi(datos[0]);
                op6p1.setEupd(datos[1]);
                op6p1.setEpcc(datos[2]);
                op6p1.setPccp(datos[3]);
                op6p1.setNudt(datos[4]);
                op6p1.setPccr(datos[5]);
                op6p1.setLtpe(datos[6]);
                op6p1.setLadr(datos[7]);
                op6p1.setMadr(datos[8]);
                op6p1.setSena(datos[9]);
                op6p1.setUcds(datos[10]);
                op6p1.setPeps(datos[11]);
                op6p1.setOrigen(datos[12]);
                op6p1.setObser(valores[0]);
                DaoAPP.daoSession.getP6p1Dao().update(op6p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.2":
                urlEnviar.append("rpsix_seispdos");
                columnas = DaoAPP.daoSession.getP6p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 14) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p2 op6p2 = DaoAPP.daoSession.getP6p2Dao().load(idCons);
                op6p2.setLfup(datos[0]);
                op6p2.setEupc(datos[1]);
                op6p2.setLtcl(datos[2]);
                op6p2.setLthr(datos[3]);
                op6p2.setErdd(datos[4]);
                op6p2.setLfcc(datos[5]);
                op6p2.setLtop(datos[6]);
                op6p2.setLmdu(datos[7]);
                op6p2.setLafr(datos[8]);
                op6p2.setTetr(datos[9]);
                op6p2.setLadu(datos[10]);
                op6p2.setObje(datos[11]);
                op6p2.setOrigen(datos[12]);
                op6p2.setObser(valores[0]);
                DaoAPP.daoSession.getP6p2Dao().update(op6p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.3":
                urlEnviar.append("rpsix_seisptres");
                columnas = DaoAPP.daoSession.getP6p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5 || m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p3 op6p3 = DaoAPP.daoSession.getP6p3Dao().load(idCons);
                op6p3.setNhtq(datos[0]);
                op6p3.setSice(datos[1]);
                op6p3.setCipp(datos[2]);
                op6p3.setEptl(datos[3]);
                op6p3.setFdlu(valores[0]);
                op6p3.setOrigen(datos[4]);
                op6p3.setObser(valores[1]);
                DaoAPP.daoSession.getP6p3Dao().update(op6p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.4":
                urlEnviar.append("rpsix_seispcuatro");
                columnas = DaoAPP.daoSession.getP6p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4 || m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p4 op6p4 = DaoAPP.daoSession.getP6p4Dao().load(idCons);
                op6p4.setLtqr(datos[0]);
                op6p4.setExme(datos[1]);
                op6p4.setAnua(datos[2]);
                op6p4.setFech(valores[0]);
                op6p4.setSrad(datos[3]);
                op6p4.setLtta(datos[4]);
                op6p4.setHipe(datos[5]);
                op6p4.setSiap(datos[6]);
                op6p4.setSgta(datos[7]);
                op6p4.setOrigen(datos[8]);
                op6p4.setObser(valores[1]);
                DaoAPP.daoSession.getP6p4Dao().update(op6p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.5":
                urlEnviar.append("rpsix_seispcinco");
                columnas = DaoAPP.daoSession.getP6p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p5 op6p5 = DaoAPP.daoSession.getP6p5Dao().load(idCons);
                op6p5.setEpqm(datos[0]);
                op6p5.setEpqm(datos[1]);
                op6p5.setLass(datos[2]);
                op6p5.setCarb(datos[3]);
                op6p5.setOrga(datos[4]);
                op6p5.setSere(datos[5]);
                op6p5.setSelr(datos[6]);
                op6p5.setSslr(datos[7]);
                op6p5.setEtta(datos[8]);
                op6p5.setOrigen(datos[9]);
                op6p5.setObser(valores[0]);
                DaoAPP.daoSession.getP6p5Dao().update(op6p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.6":
                urlEnviar.append("rpsix_seispseis");
                columnas = DaoAPP.daoSession.getP6p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p6 op6p6 = DaoAPP.daoSession.getP6p6Dao().load(idCons);
                op6p6.setTltq(datos[0]);
                op6p6.setSpal(datos[1]);
                op6p6.setSpfp(datos[2]);
                op6p6.setScal(datos[3]);
                op6p6.setSsed(datos[4]);
                op6p6.setSeeu(datos[5]);
                op6p6.setOrigen(datos[6]);
                op6p6.setObser(valores[0]);
                DaoAPP.daoSession.getP6p6Dao().update(op6p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.7":
                urlEnviar.append("rpsix_seispsiete");
                columnas = DaoAPP.daoSession.getP6p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p7 op6p7 = DaoAPP.daoSession.getP6p7Dao().load(idCons);
                op6p7.setLfdm(datos[0]);
                op6p7.setSmen(datos[1]);
                op6p7.setMdcd(datos[2]);
                op6p7.setSale(datos[3]);
                op6p7.setIdma(datos[4]);
                op6p7.setScep(datos[5]);
                op6p7.setOrigen(datos[6]);
                op6p7.setObser(valores[0]);
                DaoAPP.daoSession.getP6p7Dao().update(op6p7);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.8":
                urlEnviar.append("rpsix_seispocho");
                columnas = DaoAPP.daoSession.getP6p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p8 op6p8 = DaoAPP.daoSession.getP6p8Dao().load(idCons);
                op6p8.setLtyl(datos[0]);
                op6p8.setLigr(datos[1]);
                op6p8.setLidp(datos[2]);
                op6p8.setEicc(datos[3]);
                op6p8.setEdcc(datos[4]);
                op6p8.setOrigen(datos[5]);
                op6p8.setObser(valores[0]);
                DaoAPP.daoSession.getP6p8Dao().update(op6p8);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.9":
                urlEnviar.append("rpsix_seispnueve");
                columnas = DaoAPP.daoSession.getP6p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p9 op6p9 = DaoAPP.daoSession.getP6p9Dao().load(idCons);
                op6p9.setLada(datos[0]);
                op6p9.setEddl(datos[1]);
                op6p9.setSomi(datos[2]);
                op6p9.setMean(datos[3]);
                op6p9.setKprd(datos[4]);
                op6p9.setTids(datos[5]);
                op6p9.setPeqr(datos[6]);
                op6p9.setMdpd(datos[7]);
                op6p9.setLade(datos[8]);
                op6p9.setOrigen(datos[9]);
                op6p9.setObser(valores[0]);
                DaoAPP.daoSession.getP6p9Dao().update(op6p9);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.10":
                urlEnviar.append("rpsix_seispdiez");
                columnas = DaoAPP.daoSession.getP6p10Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 13) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p10 op6p10 = DaoAPP.daoSession.getP6p10Dao().load(idCons);
                op6p10.setLfda(datos[0]);
                op6p10.setEada(datos[1]);
                op6p10.setSalv(datos[2]);
                op6p10.setSuab(datos[3]);
                op6p10.setFoqu(datos[4]);
                op6p10.setToxi(datos[5]);
                op6p10.setLans(datos[6]);
                op6p10.setLeda(datos[7]);
                op6p10.setSrtl(datos[8]);
                op6p10.setSmlh(datos[9]);
                op6p10.setShea(datos[10]);
                op6p10.setOrigen(datos[11]);
                op6p10.setObser(valores[0]);
                DaoAPP.daoSession.getP6p10Dao().update(op6p10);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.11":
                urlEnviar.append("rpsix_seisponce");
                columnas = DaoAPP.daoSession.getP6p11Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p11 op6p11 = DaoAPP.daoSession.getP6p11Dao().load(idCons);
                op6p11.setLfdd(datos[0]);
                op6p11.setLudl(datos[1]);
                op6p11.setOrigen(datos[2]);
                op6p11.setObser(valores[0]);
                DaoAPP.daoSession.getP6p11Dao().update(op6p11);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.12":
                urlEnviar.append("rpsix_seispdoce");
                columnas = DaoAPP.daoSession.getP6p12Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p12 op6p12 = DaoAPP.daoSession.getP6p12Dao().load(idCons);
                op6p12.setLfdt(datos[0]);
                op6p12.setStmp(datos[1]);
                op6p12.setLvqt(datos[2]);
                op6p12.setCcpd(datos[3]);
                op6p12.setLein(datos[4]);
                op6p12.setLped(datos[5]);
                op6p12.setLast(datos[6]);
                op6p12.setLemd(datos[7]);
                op6p12.setOrigen(datos[8]);
                op6p12.setObser(valores[0]);
                DaoAPP.daoSession.getP6p12Dao().update(op6p12);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.13":
                urlEnviar.append("rpsix_seisptrece");
                columnas = DaoAPP.daoSession.getP6p13Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p13 op6p13 = DaoAPP.daoSession.getP6p13Dao().load(idCons);
                op6p13.setTltq(datos[0]);
                op6p13.setLtqa(datos[1]);
                op6p13.setLfse(datos[2]);
                op6p13.setLfie(datos[3]);
                op6p13.setEedp(datos[4]);
                op6p13.setOrigen(datos[5]);
                op6p13.setObser(valores[0]);
                DaoAPP.daoSession.getP6p13Dao().update(op6p13);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.14":
                urlEnviar.append("rpsix_seispcatorce");
                columnas = DaoAPP.daoSession.getP6p14Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 2 || m == 4 || m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p14 op6p14 = DaoAPP.daoSession.getP6p14Dao().load(idCons);
                op6p14.setLfde(datos[0]);
                op6p14.setHoap(valores[0]);
                op6p14.setSemd(datos[1]);
                op6p14.setSrrd(valores[1]);
                op6p14.setOrigen(datos[2]);
                op6p14.setObser(valores[2]);
                DaoAPP.daoSession.getP6p14Dao().update(op6p14);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.15":
                urlEnviar.append("rpsix_seispquince");
                columnas = DaoAPP.daoSession.getP6p15Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3 || m == 13) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p15 op6p15 = DaoAPP.daoSession.getP6p15Dao().load(idCons);
                op6p15.setLfda(datos[0]);
                op6p15.setSeaa(datos[1]);
                op6p15.setHorp(valores[0]);
                op6p15.setSeap(datos[2]);
                op6p15.setSilg(datos[3]);
                op6p15.setSccm(datos[4]);
                op6p15.setSccr(datos[5]);
                op6p15.setSiuh(datos[6]);
                op6p15.setLtcy(datos[7]);
                op6p15.setPpqn(datos[8]);
                op6p15.setCsus(datos[9]);
                op6p15.setOrigen(datos[10]);
                op6p15.setObser(valores[1]);
                DaoAPP.daoSession.getP6p15Dao().update(op6p15);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.16":
                urlEnviar.append("rpsix_seispdieciseis");
                columnas = DaoAPP.daoSession.getP6p16Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p16 op6p16 = DaoAPP.daoSession.getP6p16Dao().load(idCons);
                op6p16.setElfd(datos[0]);
                op6p16.setDcdr(datos[1]);
                op6p16.setEaes(datos[2]);
                op6p16.setEdyv(datos[3]);
                op6p16.setOrigen(datos[4]);
                op6p16.setObser(valores[0]);
                DaoAPP.daoSession.getP6p16Dao().update(op6p16);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.17":
                urlEnviar.append("rpsix_seispdiecisiete");
                columnas = DaoAPP.daoSession.getP6p17Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p17 op6p17 = DaoAPP.daoSession.getP6p17Dao().load(idCons);
                op6p17.setPnms(datos[0]);
                op6p17.setPdms(datos[1]);
                op6p17.setEuac(datos[2]);
                op6p17.setNepl(datos[3]);
                op6p17.setOrigen(datos[4]);
                op6p17.setObser(valores[0]);
                DaoAPP.daoSession.getP6p17Dao().update(op6p17);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.18":
                urlEnviar.append("rpsix_seispdieciocho");
                columnas = DaoAPP.daoSession.getP6p18Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p18 op6p18 = DaoAPP.daoSession.getP6p18Dao().load(idCons);
                op6p18.setAltd(datos[0]);
                op6p18.setIatd(datos[1]);
                op6p18.setLfcc(datos[2]);
                op6p18.setLtcl(datos[3]);
                op6p18.setRcsa(datos[4]);
                op6p18.setPcep(datos[5]);
                op6p18.setOrigen(datos[6]);
                op6p18.setObser(valores[0]);
                DaoAPP.daoSession.getP6p18Dao().update(op6p18);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.19":
                urlEnviar.append("rpsix_seispdiecinueve");
                columnas = DaoAPP.daoSession.getP6p19Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p19 op6p19 = DaoAPP.daoSession.getP6p19Dao().load(idCons);
                op6p19.setFdcc(datos[0]);
                op6p19.setCcen(datos[1]);
                op6p19.setSpaf(datos[2]);
                op6p19.setEedp(datos[3]);
                op6p19.setCcbd(datos[4]);
                op6p19.setLava(datos[5]);
                op6p19.setDuch(datos[6]);
                op6p19.setLvmn(datos[7]);
                op6p19.setOrigen(datos[8]);
                op6p19.setObser(valores[0]);
                DaoAPP.daoSession.getP6p19Dao().update(op6p19);
                new enviar().execute(urlEnviar.toString());
                break;

            case "6.20":
                urlEnviar.append("rpsix_seispveinte");
                columnas = DaoAPP.daoSession.getP6p20Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p6p20 op6p20 = DaoAPP.daoSession.getP6p20Dao().load(idCons);
                op6p20.setFdip(datos[0]);
                op6p20.setSipd(datos[1]);
                op6p20.setEcca(datos[2]);
                op6p20.setMono(datos[3]);
                op6p20.setLfbs(datos[4]);
                op6p20.setOrigen(datos[5]);
                op6p20.setObser(valores[0]);
                DaoAPP.daoSession.getP6p20Dao().update(op6p20);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio 7 */
            case "7.1":
                urlEnviar.append("rpseven_sietepuno");
                columnas = DaoAPP.daoSession.getP7p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 4) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p7p1 op7p1 = DaoAPP.daoSession.getP7p1Dao().load(idCons);
                op7p1.setFdrl(datos[0]);
                op7p1.setSrao(datos[1]);
                op7p1.setOrigen(datos[2]);
                op7p1.setObser(valores[0]);
                DaoAPP.daoSession.getP7p1Dao().update(op7p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "7.2":
                urlEnviar.append("rpseven_sietepdos");
                columnas = DaoAPP.daoSession.getP7p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p7p2 op7p2 = DaoAPP.daoSession.getP7p2Dao().load(idCons);
                op7p2.setLadf(datos[0]);
                op7p2.setExpo(datos[1]);
                op7p2.setExpr(datos[2]);
                op7p2.setSdlq(datos[3]);
                op7p2.setSalp(datos[4]);
                op7p2.setShpa(datos[5]);
                op7p2.setSipy(datos[6]);
                op7p2.setOrigen(datos[7]);
                op7p2.setObser(valores[0]);
                DaoAPP.daoSession.getP7p2Dao().update(op7p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "7.3":
                urlEnviar.append("rpseven_sieteptres");
                columnas = DaoAPP.daoSession.getP7p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p7p3 op7p3 = DaoAPP.daoSession.getP7p3Dao().load(idCons);
                op7p3.setPypp(datos[0]);
                op7p3.setCcpp(datos[1]);
                op7p3.setSccp(datos[2]);
                op7p3.setLfcp(datos[3]);
                op7p3.setLfas(datos[4]);
                op7p3.setOrigen(datos[5]);
                op7p3.setObser(valores[0]);
                DaoAPP.daoSession.getP7p3Dao().update(op7p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "7.4":
                urlEnviar.append("rpseven_sietepcuatro");
                columnas = DaoAPP.daoSession.getP7p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p7p4 op7p4 = DaoAPP.daoSession.getP7p4Dao().load(idCons);
                op7p4.setLfdc(datos[0]);
                op7p4.setLfpe(datos[1]);
                op7p4.setLfcd(datos[2]);
                op7p4.setLfau(datos[3]);
                op7p4.setOrigen(datos[4]);
                op7p4.setObser(valores[0]);
                DaoAPP.daoSession.getP7p4Dao().update(op7p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "7.5":
                urlEnviar.append("rpseven_sietepcinco");
                columnas = DaoAPP.daoSession.getP7p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p7p5 op7p5 = DaoAPP.daoSession.getP7p5Dao().load(idCons);
                op7p5.setLfdc(datos[0]);
                op7p5.setLfce(datos[1]);
                op7p5.setLfac(datos[2]);
                op7p5.setOrigen(datos[3]);
                op7p5.setObser(valores[0]);
                DaoAPP.daoSession.getP7p5Dao().update(op7p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "7.6":
                urlEnviar.append("rpseven_sietepseis");
                columnas = DaoAPP.daoSession.getP7p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p7p6 op7p6 = DaoAPP.daoSession.getP7p6Dao().load(idCons);
                op7p6.setFdtl(datos[0]);
                op7p6.setSdec(datos[1]);
                op7p6.setClyt(datos[2]);
                op7p6.setAdds(datos[3]);
                op7p6.setDdpb(datos[4]);
                op7p6.setEscr(datos[5]);
                op7p6.setOrigen(datos[6]);
                op7p6.setObser(valores[0]);
                DaoAPP.daoSession.getP7p6Dao().update(op7p6);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio 8 */

            case "8.1":
                urlEnviar.append("rpeight_ochopuno");
                columnas = DaoAPP.daoSession.getP8p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 18) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p1 op8p1 = DaoAPP.daoSession.getP8p1Dao().load(idCons);
                op8p1.setLfde(datos[0]);
                op8p1.setLfeu(datos[1]);
                op8p1.setEpia(datos[2]);
                op8p1.setPcem(datos[3]);
                op8p1.setPcei(datos[4]);
                op8p1.setReid(datos[5]);
                op8p1.setFeas(datos[6]);
                op8p1.setDura(datos[7]);
                op8p1.setExte(datos[8]);
                op8p1.setDano(datos[9]);
                op8p1.setUdli(datos[10]);
                op8p1.setCedl(datos[11]);
                op8p1.setTipl(datos[12]);
                op8p1.setCoes(datos[13]);
                op8p1.setFaam(datos[14]);
                op8p1.setMdce(datos[15]);
                op8p1.setOrigen(datos[16]);
                op8p1.setObser(valores[0]);
                DaoAPP.daoSession.getP8p1Dao().update(op8p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.2":
                urlEnviar.append("rpeight_ochopdos");
                columnas = DaoAPP.daoSession.getP8p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 22) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p2 op8p2 = DaoAPP.daoSession.getP8p2Dao().load(idCons);
                op8p2.setLfdd(datos[0]);
                op8p2.setRcdu(datos[1]);
                op8p2.setLfrr(datos[2]);
                op8p2.setLfre(datos[3]);
                op8p2.setCcui(datos[4]);
                op8p2.setNoco(datos[5]);
                op8p2.setNoge(datos[6]);
                op8p2.setLafe(datos[7]);
                op8p2.setCaco(datos[8]);
                op8p2.setPrap(datos[9]);
                op8p2.setTdad(datos[10]);
                op8p2.setFeda(datos[11]);
                op8p2.setDosi(datos[12]);
                op8p2.setVtdp(datos[13]);
                op8p2.setNdlp(datos[14]);
                op8p2.setNdqa(datos[15]);
                op8p2.setNdqr(datos[16]);
                op8p2.setIded(datos[17]);
                op8p2.setLfme(datos[18]);
                op8p2.setSrya(datos[19]);
                op8p2.setOrigen(datos[20]);
                op8p2.setObser(valores[0]);
                DaoAPP.daoSession.getP8p2Dao().update(op8p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.3":
                urlEnviar.append("rpeight_ochoptres");
                columnas = DaoAPP.daoSession.getP8p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p3 op8p3 = DaoAPP.daoSession.getP8p3Dao().load(idCons);
                op8p3.setLfdi(datos[0]);
                op8p3.setSilp(datos[1]);
                op8p3.setCcen(datos[2]);
                op8p3.setCeen(datos[3]);
                op8p3.setEnep(datos[4]);
                op8p3.setLfda(datos[5]);
                op8p3.setOrigen(datos[6]);
                op8p3.setObser(valores[0]);
                DaoAPP.daoSession.getP8p3Dao().update(op8p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.4":
                urlEnviar.append("rpeight_ochopcuatro");
                columnas = DaoAPP.daoSession.getP8p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p4 op8p4 = DaoAPP.daoSession.getP8p4Dao().load(idCons);
                op8p4.setNspe(datos[0]);
                op8p4.setLfnu(datos[1]);
                op8p4.setFnus(datos[2]);
                op8p4.setUape(datos[3]);
                op8p4.setUspp(datos[4]);
                op8p4.setDlds(datos[5]);
                op8p4.setUadc(datos[6]);
                op8p4.setSqnp(datos[7]);
                op8p4.setNsbu(datos[8]);
                op8p4.setOrigen(datos[9]);
                op8p4.setObser(valores[0]);
                DaoAPP.daoSession.getP8p4Dao().update(op8p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.5":
                urlEnviar.append("rpeight_ochopcinco");
                columnas = DaoAPP.daoSession.getP8p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p5 op8p5 = DaoAPP.daoSession.getP8p5Dao().load(idCons);
                op8p5.setDeup(datos[0]);
                op8p5.setEupp(datos[1]);
                op8p5.setPprl(datos[2]);
                op8p5.setSeep(datos[3]);
                op8p5.setOrigen(datos[4]);
                op8p5.setObser(valores[0]);
                DaoAPP.daoSession.getP8p5Dao().update(op8p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.6":
                urlEnviar.append("rpeight_ochopseis");
                columnas = DaoAPP.daoSession.getP8p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p6 op8p6 = DaoAPP.daoSession.getP8p6Dao().load(idCons);
                op8p6.setDtmp(datos[0]);
                op8p6.setSeic(datos[1]);
                op8p6.setNshi(datos[2]);
                op8p6.setSdye(datos[3]);
                op8p6.setOrigen(datos[4]);
                op8p6.setObser(valores[0]);
                DaoAPP.daoSession.getP8p6Dao().update(op8p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.7":
                urlEnviar.append("rpeight_ochopsiete");
                columnas = DaoAPP.daoSession.getP8p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 12) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p7 op8p7 = DaoAPP.daoSession.getP8p7Dao().load(idCons);
                op8p7.setFdus(datos[0]);
                op8p7.setFusm(datos[1]);
                op8p7.setFccr(datos[2]);
                op8p7.setIadp(datos[3]);
                op8p7.setNold(datos[4]);
                op8p7.setNdlp(datos[5]);
                op8p7.setDosi(datos[6]);
                op8p7.setDlpq(datos[7]);
                op8p7.setPqal(datos[8]);
                op8p7.setFcda(datos[9]);
                op8p7.setOrigen(datos[10]);
                op8p7.setObser(valores[0]);
                DaoAPP.daoSession.getP8p7Dao().update(op8p7);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.8":
                urlEnviar.append("rpeight_ochopocho");
                columnas = DaoAPP.daoSession.getP8p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p8 op8p8 = DaoAPP.daoSession.getP8p8Dao().load(idCons);
                op8p8.setNslp(datos[0]);
                op8p8.setUdfp(datos[1]);
                op8p8.setSelp(datos[2]);
                op8p8.setOrigen(datos[3]);
                op8p8.setObser(valores[0]);
                DaoAPP.daoSession.getP8p8Dao().update(op8p8);
                new enviar().execute(urlEnviar.toString());
                break;

            case "8.9":
                urlEnviar.append("rpeight_ochopnueve");
                columnas = DaoAPP.daoSession.getP8p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 6) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p8p9 op8p9 = DaoAPP.daoSession.getP8p9Dao().load(idCons);
                op8p9.setSspu(datos[0]);
                op8p9.setEeud(datos[1]);
                op8p9.setEudf(datos[2]);
                op8p9.setFsub(datos[3]);
                op8p9.setOrigen(datos[4]);
                op8p9.setObser(valores[0]);
                DaoAPP.daoSession.getP8p9Dao().update(op8p9);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio 9 */

            case "9.1":
                urlEnviar.append("rpnine_nuevepuno");
                columnas = DaoAPP.daoSession.getP9p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p9p1 op9p1 = DaoAPP.daoSession.getP9p1Dao().load(idCons);
                op9p1.setFepce(datos[0]);
                op9p1.setFcpce(datos[1]);
                op9p1.setEpes(datos[2]);
                op9p1.setIfas(datos[3]);
                op9p1.setUecv(datos[4]);
                op9p1.setOrigen(datos[5]);
                op9p1.setObser(valores[0]);
                DaoAPP.daoSession.getP9p1Dao().update(op9p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "9.2":
                urlEnviar.append("rpnine_nuevepdos");
                columnas = DaoAPP.daoSession.getP9p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 12 || m == 18) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p9p2 op9p2 = DaoAPP.daoSession.getP9p2Dao().load(idCons);
                op9p2.setFpfs(datos[0]);
                op9p2.setEpfs(datos[1]);
                op9p2.setCyps(datos[2]);
                op9p2.setAps(datos[3]);
                op9p2.setApc(datos[4]);
                op9p2.setMues(datos[5]);
                op9p2.setTap(datos[6]);
                op9p2.setTds(datos[7]);
                op9p2.setRaa(datos[8]);
                op9p2.setZon(datos[9]);
                op9p2.setDfin(datos[10]);
                op9p2.setDfec(valores[0]);
                op9p2.setCasp(datos[11]);
                op9p2.setAfoi(datos[12]);
                op9p2.setRect(datos[13]);
                op9p2.setUreo(datos[14]);
                op9p2.setOrigen(datos[15]);
                op9p2.setObser(valores[1]);
                DaoAPP.daoSession.getP9p2Dao().update(op9p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "9.3":
                urlEnviar.append("rpnine_nueveptres");
                columnas = DaoAPP.daoSession.getP9p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p9p3 op9p3 = DaoAPP.daoSession.getP9p3Dao().load(idCons);
                op9p3.setFdec(datos[0]);
                op9p3.setFuev(datos[1]);
                op9p3.setFcec(datos[2]);
                op9p3.setAcae(datos[3]);
                op9p3.setAdec(datos[4]);
                op9p3.setCroa(datos[5]);
                op9p3.setMach(datos[6]);
                op9p3.setGuad(datos[7]);
                op9p3.setHerb(datos[8]);
                op9p3.setOrigen(datos[9]);
                op9p3.setObser(valores[0]);
                DaoAPP.daoSession.getP9p3Dao().update(op9p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "9.4":
                urlEnviar.append("rpnine_nuevepcuatro");
                columnas = DaoAPP.daoSession.getP9p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 11) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p9p4 op9p4 = DaoAPP.daoSession.getP9p4Dao().load(idCons);
                op9p4.setFpad(datos[0]);
                op9p4.setVegn(datos[1]);
                op9p4.setVegs(datos[2]);
                op9p4.setPrad(datos[3]);
                op9p4.setTid(datos[4]);
                op9p4.setMede(datos[5]);
                op9p4.setEnc(datos[6]);
                op9p4.setMap(datos[7]);
                op9p4.setQprt(datos[8]);
                op9p4.setOrigen(datos[9]);
                op9p4.setObser(valores[0]);
                DaoAPP.daoSession.getP9p4Dao().update(op9p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "9.5":
                urlEnviar.append("rpnine_nuevepcinco");
                columnas = DaoAPP.daoSession.getP9p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p9p5 op9p5 = DaoAPP.daoSession.getP9p5Dao().load(idCons);
                op9p5.setNsna(datos[0]);
                op9p5.setClim(datos[1]);
                op9p5.setTop(datos[2]);
                op9p5.setSuel(datos[3]);
                op9p5.setEcyu(datos[4]);
                op9p5.setTbn(datos[5]);
                op9p5.setQpna(datos[6]);
                op9p5.setOrigen(datos[7]);
                op9p5.setObser(valores[0]);
                DaoAPP.daoSession.getP9p5Dao().update(op9p5);
                new enviar().execute(urlEnviar.toString());
                break;

            /* principio 10 */

            case "10.1":
                urlEnviar.append("rpten_diezpuno");
                columnas = DaoAPP.daoSession.getP10p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p10p1 op10p1 = DaoAPP.daoSession.getP10p1Dao().load(idCons);
                op10p1.setFtpd(datos[0]);
                op10p1.setFcpd(datos[1]);
                op10p1.setFrin(datos[2]);
                op10p1.setFrd(datos[3]);
                op10p1.setIftd(datos[4]);
                op10p1.setComp(datos[5]);
                op10p1.setEcg(datos[6]);
                op10p1.setAmda(datos[7]);
                op10p1.setOrigen(datos[8]);
                op10p1.setObser(valores[0]);
                DaoAPP.daoSession.getP10p1Dao().update(op10p1);
                new enviar().execute(urlEnviar.toString());
                break;

            case "10.2":
                urlEnviar.append("rpten_diezpdos");
                columnas = DaoAPP.daoSession.getP10p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p10p2 op10p2 = DaoAPP.daoSession.getP10p2Dao().load(idCons);
                op10p2.setNpbca(datos[0]);
                op10p2.setNibf(datos[1]);
                op10p2.setNqbf(datos[2]);
                op10p2.setFqib(datos[3]);
                op10p2.setIdet(datos[4]);
                op10p2.setPlci(datos[5]);
                op10p2.setPoper(datos[6]);
                op10p2.setOrigen(datos[7]);
                op10p2.setObser(valores[0]);
                DaoAPP.daoSession.getP10p2Dao().update(op10p2);
                new enviar().execute(urlEnviar.toString());
                break;

            case "10.3":
                urlEnviar.append("rpten_diezptres");
                columnas = DaoAPP.daoSession.getP10p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10 || m == 12) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p10p3 op10p3 = DaoAPP.daoSession.getP10p3Dao().load(idCons);
                op10p3.setDfdr(datos[0]);
                op10p3.setDfrc(datos[1]);
                op10p3.setVivi(datos[2]);
                op10p3.setFuag(datos[3]);
                op10p3.setArec(datos[4]);
                op10p3.setCauc(datos[5]);
                op10p3.setOada(datos[6]);
                op10p3.setComp(datos[7]);
                op10p3.setMdli(datos[8]);
                op10p3.setUldf(valores[0]);
                op10p3.setOrigen(datos[9]);
                op10p3.setObser(valores[1]);
                DaoAPP.daoSession.getP10p3Dao().update(op10p3);
                new enviar().execute(urlEnviar.toString());
                break;

            case "10.4":
                urlEnviar.append("rpten_diezpcuatro");
                columnas = DaoAPP.daoSession.getP10p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3 || m == 4 || m == 9) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p10p4 op10p4 = DaoAPP.daoSession.getP10p4Dao().load(idCons);
                op10p4.setFnedt(datos[0]);
                op10p4.setEbat(datos[1]);
                op10p4.setEda(valores[0]);
                op10p4.setEbea(valores[1]);
                op10p4.setQrdc(datos[2]);
                op10p4.setLsh(datos[3]);
                op10p4.setAmb(datos[4]);
                op10p4.setOrigen(datos[5]);
                op10p4.setObser(valores[2]);
                DaoAPP.daoSession.getP10p4Dao().update(op10p4);
                new enviar().execute(urlEnviar.toString());
                break;

            case "10.5":
                urlEnviar.append("rpten_diezpcinco");
                columnas = DaoAPP.daoSession.getP10p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p10p5 op10p5 = DaoAPP.daoSession.getP10p5Dao().load(idCons);

                op10p5.setFlsd(datos[0]);
                op10p5.setFel(datos[1]);
                op10p5.setFip(datos[2]);
                op10p5.setRapa(datos[3]);
                op10p5.setDble(datos[4]);
                op10p5.setRpc(datos[5]);
                op10p5.setOrigen(datos[6]);
                op10p5.setObser(valores[0]);
                DaoAPP.daoSession.getP10p5Dao().update(op10p5);
                new enviar().execute(urlEnviar.toString());
                break;

            case "10.6":
                urlEnviar.append("rpten_diezpseis");
                columnas = DaoAPP.daoSession.getP10p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 15) {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviar.append("&");
                        urlEnviar.append(columnas[m].toLowerCase());
                        urlEnviar.append("=");
                        urlEnviar.append(datos[(m - 1) - contadorValores]);
                    }
                }
                p10p6 op10p6 = DaoAPP.daoSession.getP10p6Dao().load(idCons);
                op10p6.setFiprg(datos[0]);
                op10p6.setIprg(datos[1]);
                op10p6.setIpcd(datos[2]);
                op10p6.setCobs(datos[3]);
                op10p6.setSia(datos[4]);
                op10p6.setMir(datos[5]);
                op10p6.setMac(datos[6]);
                op10p6.setMaf(datos[7]);
                op10p6.setUee(datos[8]);
                op10p6.setUtl(datos[9]);
                op10p6.setMpps(datos[10]);
                op10p6.setPirg(datos[11]);
                op10p6.setMpta(datos[12]);
                op10p6.setOrigen(datos[13]);
                op10p6.setObser(valores[0]);
                DaoAPP.daoSession.getP10p6Dao().update(op10p6);
                new enviar().execute(urlEnviar.toString());
                break;

            case "RG1.1":
                urlEnviarGrupo.append("rgpone_unopuno");
                columnas = DaoAPP.daoSession.getG1p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }

                g1p1 og1p1 = DaoAPP.daoSession.getG1p1Dao().load(idCons);
                og1p1.setEadg(datos[0]);
                og1p1.setProg(datos[1]);
                og1p1.setRegi(datos[2]);
                og1p1.setOrigen(datos[3]);
                og1p1.setObser(valores[0]);
                DaoAPP.daoSession.getG1p1Dao().update(og1p1);
                Log.d("URL", urlEnviarGrupo.toString());
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG1.2":
                urlEnviarGrupo.append("rgpone_unopdos");
                columnas = DaoAPP.daoSession.getG1p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 2 || m == 4) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g1p2 g1p2 = DaoAPP.daoSession.getG1p2Dao().load(idCons);
                g1p2.setEadg(datos[0]);
                g1p2.setFech(valores[0]);
                g1p2.setOrigen(datos[1]);
                g1p2.setObser(valores[1]);
                DaoAPP.daoSession.getG1p2Dao().update(g1p2);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG1.3":
                urlEnviarGrupo.append("rgpone_unoptres");
                columnas = DaoAPP.daoSession.getG1p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g1p3 g1p3 = DaoAPP.daoSession.getG1p3Dao().load(idCons);
                g1p3.setEadg(datos[0]);
                g1p3.setCali(datos[1]);
                g1p3.setResu(datos[2]);
                g1p3.setFech(datos[3]);
                g1p3.setNomb(datos[4]);
                g1p3.setNoca(datos[5]);
                g1p3.setUbic(datos[6]);
                g1p3.setFirm(datos[7]);
                g1p3.setOrigen(datos[8]);
                g1p3.setObser(valores[0]);
                DaoAPP.daoSession.getG1p3Dao().update(g1p3);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG1.4":
                urlEnviarGrupo.append("rgpone_unopcuatro");
                columnas = DaoAPP.daoSession.getG1p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g1p4 g1p4 = DaoAPP.daoSession.getG1p4Dao().load(idCons);
                g1p4.setLcds(datos[0]);
                g1p4.setOrigen(datos[1]);
                g1p4.setObser(valores[0]);
                DaoAPP.daoSession.getG1p4Dao().update(g1p4);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG2.1":
                urlEnviarGrupo.append("rgptwo_dospuno");
                columnas = DaoAPP.daoSession.getG2p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 10) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g2p1 g2p1 = DaoAPP.daoSession.getG2p1Dao().load(idCons);
                g2p1.setEadg(datos[0]);
                g2p1.setInsp(datos[1]);
                g2p1.setAudi(datos[2]);
                g2p1.setMiem(datos[3]);
                g2p1.setProd(datos[4]);
                g2p1.setCade(datos[5]);
                g2p1.setCost(datos[6]);
                g2p1.setDese(datos[7]);
                g2p1.setOrigen(datos[8]);
                g2p1.setObser(valores[0]);
                DaoAPP.daoSession.getG2p1Dao().update(g2p1);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG2.2":
                urlEnviarGrupo.append("rgptwo_dospdos");
                columnas = DaoAPP.daoSession.getG2p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g2p2 g2p2 = DaoAPP.daoSession.getG2p2Dao().load(idCons);
                g2p2.setEadg(datos[0]);
                g2p2.setOrigen(datos[1]);
                g2p2.setObser(valores[0]);
                DaoAPP.daoSession.getG2p2Dao().update(g2p2);
                new enviar().execute(urlEnviarGrupo.toString());
                break;


            case "RG2.3":
                urlEnviarGrupo.append("rgptwo_dosptres");
                columnas = DaoAPP.daoSession.getG2p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 5) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g2p3 g2p3 = DaoAPP.daoSession.getG2p3Dao().load(idCons);
                g2p3.setEgdt(datos[0]);
                g2p3.setProc(datos[1]);
                g2p3.setLmdg(datos[2]);
                g2p3.setOrigen(datos[3]);
                g2p3.setObser(valores[0]);
                DaoAPP.daoSession.getG2p3Dao().update(g2p3);
                new enviar().execute(urlEnviarGrupo.toString());
                break;


            case "RG3.1":
                urlEnviarGrupo.append("rgpthree_trespuno");
                columnas = DaoAPP.daoSession.getG3p1Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 9) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p1 g3p1 = DaoAPP.daoSession.getG3p1Dao().load(idCons);
                g3p1.setEadg(datos[0]);
                g3p1.setOrga(datos[1]);
                g3p1.setRcyc(datos[2]);
                g3p1.setPpid(datos[3]);
                g3p1.setRdmr(datos[4]);
                g3p1.setPpii(datos[5]);
                g3p1.setPpdy(datos[6]);
                g3p1.setOrigen(datos[7]);
                g3p1.setObser(valores[0]);
                DaoAPP.daoSession.getG3p1Dao().update(g3p1);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.2":
                urlEnviarGrupo.append("rgpthree_trespdos");
                columnas = DaoAPP.daoSession.getG3p2Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 7) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p2 g3p2 = DaoAPP.daoSession.getG3p2Dao().load(idCons);
                g3p2.setCmdg(datos[0]);
                g3p2.setAcfi(datos[1]);
                g3p2.setLcdl(datos[2]);
                g3p2.setLmsi(datos[3]);
                g3p2.setLmsc(datos[4]);
                g3p2.setOrigen(datos[5]);
                g3p2.setObser(valores[0]);
                DaoAPP.daoSession.getG3p2Dao().update(g3p2);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.3":
                urlEnviarGrupo.append("rgpthree_tresptres");
                columnas = DaoAPP.daoSession.getG3p3Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p3 g3p3 = DaoAPP.daoSession.getG3p3Dao().load(idCons);
                g3p3.setEpyl(datos[0]);
                g3p3.setOrigen(datos[1]);
                g3p3.setObser(valores[0]);
                DaoAPP.daoSession.getG3p3Dao().update(g3p3);
                new enviar().execute(urlEnviarGrupo.toString());
                break;


            case "RG3.4":
                urlEnviarGrupo.append("rgpthree_trespcuatro");
                columnas = DaoAPP.daoSession.getG3p4Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p4 g3p4 = DaoAPP.daoSession.getG3p4Dao().load(idCons);
                g3p4.setEsid(datos[0]);
                g3p4.setOrigen(datos[1]);
                g3p4.setObser(valores[0]);
                DaoAPP.daoSession.getG3p4Dao().update(g3p4);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.5":
                urlEnviarGrupo.append("rgpthree_trespcinco");
                columnas = DaoAPP.daoSession.getG3p5Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3 || m == 7) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p5 g3p5 = DaoAPP.daoSession.getG3p5Dao().load(idCons);
                g3p5.setEadg(datos[0]);
                g3p5.setSein(datos[1]);
                g3p5.setFech(valores[0]);
                g3p5.setHain(datos[2]);
                g3p5.setLanu(datos[3]);
                g3p5.setOrigen(datos[4]);
                g3p5.setObser(valores[1]);
                DaoAPP.daoSession.getG3p5Dao().update(g3p5);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.6":
                urlEnviarGrupo.append("rgpthree_trespseis");
                columnas = DaoAPP.daoSession.getG3p6Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 8) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p6 g3p6 = DaoAPP.daoSession.getG3p6Dao().load(idCons);
                g3p6.setEsid(datos[0]);
                g3p6.setPoli(datos[1]);
                g3p6.setMedi(datos[2]);
                g3p6.setLomi(datos[3]);
                g3p6.setRegi(datos[4]);
                g3p6.setLmtd(datos[5]);
                g3p6.setOrigen(datos[6]);
                g3p6.setObser(valores[0]);
                DaoAPP.daoSession.getG3p6Dao().update(g3p6);
                Log.d("Cadena", urlEnviarGrupo.toString());
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.7":
                urlEnviarGrupo.append("rgpthree_trespsiete");
                columnas = DaoAPP.daoSession.getG3p7Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 3) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p7 g3p7 = DaoAPP.daoSession.getG3p7Dao().load(idCons);
                g3p7.setEcdl(datos[0]);
                g3p7.setOrigen(datos[1]);
                g3p7.setObser(valores[0]);
                DaoAPP.daoSession.getG3p7Dao().update(g3p7);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.8":
                urlEnviarGrupo.append("rgpthree_trespocho");
                columnas = DaoAPP.daoSession.getG3p8Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 2 || m == 4) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p8 g3p8 = DaoAPP.daoSession.getG3p8Dao().load(idCons);
                g3p8.setLdda(datos[0]);
                g3p8.setNive(valores[0]);
                g3p8.setOrigen(datos[1]);
                g3p8.setObser(valores[1]);
                DaoAPP.daoSession.getG3p8Dao().update(g3p8);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

            case "RG3.9":
                urlEnviarGrupo.append("rgpthree_trespnueve");
                columnas = DaoAPP.daoSession.getG3p9Dao().getAllColumns();
                for (int m = 1; m < columnas.length - 1; m++) {
                    if (m == 16) {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(valores[contadorValores]);
                        contadorValores++;
                    } else {
                        urlEnviarGrupo.append("&");
                        urlEnviarGrupo.append(columnas[m].toLowerCase());
                        urlEnviarGrupo.append("=");
                        urlEnviarGrupo.append(datos[(m - 1) - contadorValores]);
                    }
                }
                g3p9 g3p9 = DaoAPP.daoSession.getG3p9Dao().load(idCons);
                g3p9.setEadg(datos[0]);
                g3p9.setNomb(datos[1]);
                g3p9.setFein(datos[2]);
                g3p9.setIdas(datos[3]);
                g3p9.setEsdc(datos[4]);
                g3p9.setUbic(datos[5]);
                g3p9.setArto(datos[6]);
                g3p9.setArtp(datos[7]);
                g3p9.setVadp(datos[8]);
                g3p9.setMapa(datos[9]);
                g3p9.setMrob(datos[10]);
                g3p9.setVdpc(datos[11]);
                g3p9.setAeei(datos[12]);
                g3p9.setRdnc(datos[13]);
                g3p9.setOrigen(datos[14]);
                g3p9.setObser(valores[0]);
                DaoAPP.daoSession.getG3p9Dao().update(g3p9);
                new enviar().execute(urlEnviarGrupo.toString());
                break;

        }

    }

    private class enviar extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            return getUrlContent(params[0].replace(" ", "%20"));
        }

        @Override
        protected void onPostExecute(String res) {
            try {
                JSONObject diego = new JSONObject(res.toString());
                Log.d("Error", diego.toString());
                if(diego.getString("status").equals("OK")){
                    Toast.makeText(contexto, "Guardado", Toast.LENGTH_SHORT).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }


}
