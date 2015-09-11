package naturacert.baumsoft.dev.naturacert;

/**
 * Created by imac on 8/2/15.
 */
public class poblarBD {

    public static void poblar(int referencia) {

        p1p1 op1p1 = new p1p1();
        op1p1.setSgsate(9);
        op1p1.setSgsa(9);
        op1p1.setPoliticas(9);
        op1p1.setProgramas(9);
        op1p1.setProcedimientos(9);
        op1p1.setSociales(9);
        op1p1.setLaborales(9);
        op1p1.setAmbientales(9);
        op1p1.setOrigen(9);
        op1p1.setId_formulario(referencia);
        op1p1.setObser("9");
        DaoAPP.daoSession.getP1p1Dao().insert(op1p1);

        p1p2 op1p2 = new p1p2();
        op1p2.setEapcn(9);
        op1p2.setPgsa(9);
        op1p2.setEap(9);
        op1p2.setAlp(9);
        op1p2.setOym(9);
        op1p2.setRes(9);
        op1p2.setReg(9);
        op1p2.setMap(9);
        op1p2.setLaip(9);
        op1p2.setPol(9);
        op1p2.setProc(9);
        op1p2.setOrigen(9);
        op1p2.setId_formulario(referencia);
        op1p2.setObser("9");
        DaoAPP.daoSession.getP1p2Dao().insert(op1p2);

        p1p3 op1p3 = new p1p3();
        op1p3.setDfdc(9);
        op1p3.setCyasp(9);
        op1p3.setAdc(9);
        op1p3.setAer(9);
        op1p3.setOrigen(9);
        op1p3.setId_formulario(referencia);
        op1p3.setObser("9");
        DaoAPP.daoSession.getP1p3Dao().insert(op1p3);

        p1p4 op1p4 = new p1p4();
        op1p4.setSgsdt(9);
        op1p4.setOyrd(9);
        op1p4.setDonde("9");
        op1p4.setPgsd(9);
        op1p4.setEdd(9);
        op1p4.setCuales("9");
        op1p4.setOrigen(9);
        op1p4.setId_formulario(referencia);
        op1p4.setObser("9");
        DaoAPP.daoSession.getP1p4Dao().insert(op1p4);

        p1p5 op1p5 = new p1p5();
        op1p5.setCdpm(9);
        op1p5.setDfdr(9);
        op1p5.setDgsca("9");
        op1p5.setOrigen(9);
        op1p5.setId_formulario(referencia);
        op1p5.setObser("9");
        DaoAPP.daoSession.getP1p5Dao().insert(op1p5);

        p1p6 op1p6 = new p1p6();
        op1p6.setEpino(9);
        op1p6.setErlv(9);
        op1p6.setErac(9);
        op1p6.setEipi(9);
        op1p6.setOrigen(9);
        op1p6.setId_formulario(referencia);
        op1p6.setObser("9");
        DaoAPP.daoSession.getP1p6Dao().insert(op1p6);

        p1p7 op1p7 = new p1p7();
        op1p7.setCppr(9);
        op1p7.setRdr(9);
        op1p7.setIap(9);
        op1p7.setPmc(9);
        op1p7.setSeg(9);
        op1p7.setMed(9);
        op1p7.setAna(9);
        op1p7.setTrab(9);
        op1p7.setGrup(9);
        op1p7.setOper(9);
        op1p7.setAco(9);
        op1p7.setMdea(9);
        op1p7.setMdam(9);
        op1p7.setApam(9);
        op1p7.setOrigen(9);
        op1p7.setId_formulario(referencia);
        op1p7.setObser("9");
        DaoAPP.daoSession.getP1p7Dao().insert(op1p7);

        p1p8 op1p8 = new p1p8();
        op1p8.setPsfc(9);
        op1p8.setMep(9);
        op1p8.setVcp(9);
        op1p8.setFvc(9);
        op1p8.setOrigen(9);
        op1p8.setId_formulario(referencia);
        op1p8.setObser("9");
        DaoAPP.daoSession.getP1p8Dao().insert(op1p8);

        p1p9 op1p9 = new p1p9();
        op1p9.setPcsg(9);
        op1p9.setPdc(9);
        op1p9.setPde(9);
        op1p9.setRda(9);
        op1p9.setRdt(9);
        op1p9.setRdi(9);
        op1p9.setActr(9);
        op1p9.setNorm(9);
        op1p9.setPdt(9);
        op1p9.setTdl(9);
        op1p9.setOrigen(9);
        op1p9.setId_formulario(referencia);
        op1p9.setObser("9");
        DaoAPP.daoSession.getP1p9Dao().insert(op1p9);

        p1p10 op1p10 = new p1p10();
        op1p10.setSpem(9);
        op1p10.setSef(9);
        op1p10.setSet(9);
        op1p10.setPoi(9);
        op1p10.setRtra(9);
        op1p10.setPad(9);
        op1p10.setOrigen(9);
        op1p10.setId_formulario(referencia);
        op1p10.setObser("9");
        DaoAPP.daoSession.getP1p10Dao().insert(op1p10);

        p1p11 op1p11 = new p1p11();
        op1p11.setDfep(9);
        op1p11.setPdp(9);
        op1p11.setTran(9);
        op1p11.setUdom(9);
        op1p11.setPedn(9);
        op1p11.setRce(9);
        op1p11.setOrigen(9);
        op1p11.setId_formulario(referencia);
        op1p11.setObser("9");
        DaoAPP.daoSession.getP1p11Dao().insert(op1p11);


        p2p1 op2p1 = new p2p1();
        op2p1.setEco_pro_rec(9);
        op2p1.setEco_nat(9);
        op2p1.setProg_con(9);
        op2p1.setIden_eco(9);
        op2p1.setPro_eco(9);
        op2p1.setRec_eco(9);
        op2p1.setProg_inc_eco(9);
        op2p1.setOrigen(9);
        op2p1.setId_formulario(referencia);
        op2p1.setObser("9");
        DaoAPP.daoSession.getP2p1Dao().insert(op2p1);

        p2p2 op2p2 = new p2p2();
        op2p2.setFndsn(9);
        op2p2.setEav(9);
        op2p2.setNede(9);
        op2p2.setNdedc(9);
        op2p2.setNden(9);
        op2p2.setAdes(9);
        op2p2.setPmit(9);
        op2p2.setIpla(9);
        op2p2.setOrigen(9);
        op2p2.setId_formulario(referencia);
        op2p2.setObser("9");
        DaoAPP.daoSession.getP2p2Dao().insert(op2p2);

        p2p3 op2p3 = new p2p3();
        op2p3.setApnuc(9);
        op2p3.setPnz(9);
        op2p3.setRvs(9);
        op2p3.setAzm(9);
        op2p3.setSpn(9);
        op2p3.setRfp(9);
        op2p3.setPnr(9);
        op2p3.setDmi(9);
        op2p3.setDcs(9);
        op2p3.setArec(9);
        op2p3.setRnsc(9);
        op2p3.setOrigen(9);
        op2p3.setId_formulario(referencia);
        op2p3.setObser("9");
        DaoAPP.daoSession.getP2p3Dao().insert(op2p3);

        p2p4 op2p4 = new p2p4();
        op2p4.setNpep(9);
        op2p4.setNtpm(9);
        op2p4.setCpms(9);
        op2p4.setCpdl(9);
        op2p4.setNsep(9);
        op2p4.setOrigen(9);
        op2p4.setId_formulario(referencia);
        op2p4.setObser("9");
        DaoAPP.daoSession.getP2p4Dao().insert(op2p4);

        p2p5 op2p5 = new p2p5();
        op2p5.setNent(9);
        op2p5.setDcpos(9);
        op2p5.setDsp(9);
        op2p5.setOsv(9);
        op2p5.setSepyn(9);
        op2p5.setOrigen(9);
        op2p5.setId_formulario(referencia);
        op2p5.setObser("9");
        DaoAPP.daoSession.getP2p5Dao().insert(op2p5);


        p2p6 op2p6 = new p2p6();
        op2p6.setNea(9);
        op2p6.setAea(9);
        op2p6.setErosion(9);
        op2p6.setDeriva(9);
        op2p6.setEscagro(9);
        op2p6.setPcn(9);
        op2p6.setDecyc("9");
        op2p6.setUcv(9);
        op2p6.setOrigen(9);
        op2p6.setId_formulario(referencia);
        op2p6.setObser("9");
        DaoAPP.daoSession.getP2p6Dao().insert(op2p6);

        p2p7 op2p7 = new p2p7();
        op2p7.setNhah(9);
        op2p7.setBuvn(9);
        op2p7.setCah(9);
        op2p7.setApc(9);
        op2p7.setRdpyh(9);
        op2p7.setOrigen(9);
        op2p7.setId_formulario(referencia);
        op2p7.setObser("9");
        DaoAPP.daoSession.getP2p7Dao().insert(op2p7);

        p2p8 op2p8 = new p2p8();
        op2p8.setNcaf(9);
        op2p8.setDenp("9");
        op2p8.setDea("9");
        op2p8.setNeh("9");
        op2p8.setAdre("9");
        op2p8.setAdmh(9);
        op2p8.setOrigen(9);
        op2p8.setId_formulario(referencia);
        op2p8.setObser("9");
        DaoAPP.daoSession.getP2p8Dao().insert(op2p8);

        p2p9 op2p9 = new p2p9();
        op2p9.setFlipc(9);
        op2p9.setCpmr(9);
        op2p9.setEncd(9);
        op2p9.setAdp(9);
        op2p9.setSbv(9);
        op2p9.setAdc(9);
        op2p9.setPex(9);
        op2p9.setOrigen(9);
        op2p9.setId_formulario(referencia);
        op2p9.setObser("9");
        DaoAPP.daoSession.getP2p9Dao().insert(op2p9);

            /* principio  3 */

        p3p1 op3p1 = new p3p1();
        op3p1.setCmivs(9);
        op3p1.setIvs(9);
        op3p1.setIdh(9);
        op3p1.setOrigen(9);
        op3p1.setId_formulario(referencia);
        op3p1.setObser("9");
        DaoAPP.daoSession.getP3p1Dao().insert(op3p1);


        p3p2 op3p2 = new p3p2();
        op3p2.setNiea(9);
        op3p2.setIeap(9);
        op3p2.setRhvs(9);
        op3p2.setPhf(9);
        op3p2.setPep(9);
        op3p2.setOrigen(9);
        op3p2.setId_formulario(referencia);
        op3p2.setObser("9");
        DaoAPP.daoSession.getP3p2Dao().insert(op3p2);


        p3p3 op3p3 = new p3p3();
        op3p3.setPceta(9);
        op3p3.setEgc(9);
        op3p3.setPhgc(9);
        op3p3.setNcfc(9);
        op3p3.setCrsc(9);
        op3p3.setPrea(9);
        op3p3.setPgec(9);
        op3p3.setOrigen(9);
        op3p3.setId_formulario(referencia);
        op3p3.setObser("9");
        DaoAPP.daoSession.getP3p3Dao().insert(op3p3);

        p3p4 op3p4 = new p3p4();
        op3p4.setNmac(9);
        op3p4.setCprt(9);
        op3p4.setCifc(9);
        op3p4.setNeac(9);
        op3p4.setOrigen(9);
        op3p4.setId_formulario(referencia);
        op3p4.setObser("9");
        DaoAPP.daoSession.getP3p4Dao().insert(op3p4);

        p3p5 op3p5 = new p3p5();
        op3p5.setNezc(9);
        op3p5.setCapr(9);
        op3p5.setOrigen(9);
        op3p5.setId_formulario(referencia);
        op3p5.setObser("9");
        DaoAPP.daoSession.getP3p5Dao().insert(op3p5);

        p3p6 op3p6 = new p3p6();
        op3p6.setNish(9);
        op3p6.setCpl(9);
        op3p6.setCap(9);
        op3p6.setNvsf(9);
        op3p6.setOrigen(9);
        op3p6.setId_formulario(referencia);
        op3p6.setObser("9");
        DaoAPP.daoSession.getP3p6Dao().insert(op3p6);

            /* principio 4 */

        p4p1 op4p1 = new p4p1();
        op4p1.setFepca(9);
        op4p1.setPca(9);
        op4p1.setIfs(9);
        op4p1.setNeda(9);
        op4p1.setMap(9);
        op4p1.setRca(9);
        op4p1.setFcra(9);
        op4p1.setFrmr(9);
        op4p1.setRcaf(9);
        op4p1.setOrigen(9);
        op4p1.setId_formulario(referencia);
        op4p1.setObser("9");
        DaoAPP.daoSession.getP4p1Dao().insert(op4p1);

        p4p2 op4p2 = new p4p2();
        op4p2.setNeas(9);
        op4p2.setFapa(9);
        op4p2.setFcva(9);
        op4p2.setOrigen(9);
        op4p2.setId_formulario(referencia);
        op4p2.setObser("9");
        DaoAPP.daoSession.getP4p2Dao().insert(op4p2);

        p4p3 op4p3 = new p4p3();
        op4p3.setFntr(9);
        op4p3.setMpma(9);
        op4p3.setDnpsa(9);
        op4p3.setDcau(9);
        op4p3.setSred(9);
        op4p3.setOrigen(9);
        op4p3.setId_formulario(referencia);
        op4p3.setObser("9");
        DaoAPP.daoSession.getP4p3Dao().insert(op4p3);

        p4p4 op4p4 = new p4p4();
        op4p4.setFcsts(9);
        op4p4.setDsta(9);
        op4p4.setStds(9);
        op4p4.setPevs(9);
        op4p4.setSota(9);
        op4p4.setOrigen(9);
        op4p4.setId_formulario(referencia);
        op4p4.setObser("9");
        DaoAPP.daoSession.getP4p4Dao().insert(op4p4);

        p4p5 op4p5 = new p4p5();
        op4p5.setNsasa(9);
        op4p5.setAvcp(9);
        op4p5.setNsarc(9);
        op4p5.setOrigen(9);
        op4p5.setId_formulario(referencia);
        op4p5.setObser("9");
        DaoAPP.daoSession.getP4p5Dao().insert(op4p5);

        p4p6 op4p6 = new p4p6();
        op4p6.setNvara(9);
        op4p6.setLaba(9);
        op4p6.setProma(9);
        op4p6.setProcr(9);
        op4p6.setOrigen(9);
        op4p6.setId_formulario(referencia);
        op4p6.setObser("9");
        DaoAPP.daoSession.getP4p6Dao().insert(op4p6);

        p4p7 op4p7 = new p4p7();
        op4p7.setFnpd(9);
        op4p7.setNsda(9);
        op4p7.setOrigen(9);
        op4p7.setId_formulario(referencia);
        op4p7.setObser("9");
        DaoAPP.daoSession.getP4p7Dao().insert(op4p7);

        p4p8 op4p8 = new p4p8();
        op4p8.setFruts(9);
        op4p8.setUts(9);
        op4p8.setTusa(9);
        op4p8.setDava(9);
        op4p8.setDprp(9);
        op4p8.setRale(9);
        op4p8.setTarq(9);
        op4p8.setOrigen(9);
        op4p8.setId_formulario(referencia);
        op4p8.setObser("9");
        DaoAPP.daoSession.getP4p8Dao().insert(op4p8);

        p4p9 op4p9 = new p4p9();
        op4p9.setFcpr(9);
        op4p9.setPmas(9);
        op4p9.setFrec(9);
        op4p9.setAnar(9);
        op4p9.setPmue(9);
        op4p9.setAmdc(9);
        op4p9.setOrigen(9);
        op4p9.setId_formulario(referencia);
        op4p9.setObser("9");
        DaoAPP.daoSession.getP4p9Dao().insert(op4p9);

        // punto 5
        p5p1 op5p1 = new p5p1();
        op5p1.setArmhf(9);
        op5p1.setPolso(9);
        op5p1.setApad(9);
        op5p1.setPsdcf(9);
        op5p1.setDiv(9);
        op5p1.setCpf(9);
        op5p1.setDpe(9);
        op5p1.setComu(9);
        op5p1.setRdtya(9);
        op5p1.setOrigen(9);
        op5p1.setId_formulario(referencia);
        op5p1.setObser("9");
        DaoAPP.daoSession.getP5p1Dao().insert(op5p1);

        p5p2 op5p2 = new p5p2();
        op5p2.setArmf(9);
        op5p2.setOmcr(9);
        op5p2.setOmoc(9);
        op5p2.setOmoa(9);
        op5p2.setNiprc(9);
        op5p2.setNdplc(9);
        op5p2.setOrigen(9);
        op5p2.setId_formulario(referencia);
        op5p2.setObser("9");

        DaoAPP.daoSession.getP5p2Dao().insert(op5p2);

        p5p3 op5p3 = new p5p3();
        op5p3.setArmf(9);
        op5p3.setSeot(9);
        op5p3.setCmod(9);
        op5p3.setCrn(9);
        op5p3.setNdpe(9);
        op5p3.setOrigen(9);
        op5p3.setId_formulario(referencia);
        op5p3.setObser("9");

        DaoAPP.daoSession.getP5p3Dao().insert(op5p3);

        p5p4 op5p4 = new p5p4();
        op5p4.setArmf(9);
        op5p4.setPdp(9);
        op5p4.setOesd(9);
        op5p4.setGpct(9);
        op5p4.setPapd(9);
        op5p4.setNep("9");
        op5p4.setPlan(9);
        op5p4.setNtcp(9);
        op5p4.setDpsa(9);
        op5p4.setSmeg(9);
        op5p4.setHret(9);
        op5p4.setReqp(9);
        op5p4.setFpag(9);
        op5p4.setDlyo(9);
        op5p4.setPbhm(9);
        op5p4.setPbhe(9);
        op5p4.setPagt(9);
        op5p4.setPagn(9);
        op5p4.setOrigen(9);
        op5p4.setId_formulario(referencia);
        op5p4.setObser("9");
        DaoAPP.daoSession.getP5p4Dao().insert(op5p4);

        p5p5 op5p5 = new p5p5();
        op5p5.setArmf(9);
        op5p5.setSalj(9);
        op5p5.setCuot(9);
        op5p5.setPiez(9);
        op5p5.setProd(9);
        op5p5.setSios(9);
        op5p5.setSnpc(9);
        op5p5.setTacn(9);
        op5p5.setOrigen(9);
        op5p5.setId_formulario(referencia);
        op5p5.setObser("9");
        DaoAPP.daoSession.getP5p5Dao().insert(op5p5);

        p5p6 op5p6 = new p5p6();
        op5p6.setHtoc(9);
        op5p6.setHort("9");
        op5p6.setDtps("9");
        op5p6.setTdvp("9");
        op5p6.setMhne(9);
        op5p6.setTdsd(9);
        op5p6.setDbic(9);
        op5p6.setVac(9);
        op5p6.setDybc(9);
        op5p6.setOrigen(9);
        op5p6.setId_formulario(referencia);
        op5p6.setObser("9");
        DaoAPP.daoSession.getP5p6Dao().insert(op5p6);

        p5p7 op5p7 = new p5p7();
        op5p7.setArmf(9);
        op5p7.setSthe(9);
        op5p7.setThev(9);
        op5p7.setCppa(9);
        op5p7.setScpy(9);
        op5p7.setMhef("9");
        op5p7.setHela("9");
        op5p7.setHepa(9);
        op5p7.setUpeh(9);
        op5p7.setCcec(9);
        op5p7.setOrigen(9);
        op5p7.setId_formulario(referencia);
        op5p7.setObser("9");
        DaoAPP.daoSession.getP5p7Dao().insert(op5p7);

        p5p8 op5p8 = new p5p8();
        op5p8.setArmf(9);
        op5p8.setNstm(9);
        op5p8.setNsmt(9);
        op5p8.setRptm(9);
        op5p8.setJorn(9);
        op5p8.setCpdl(9);
        op5p8.setNoya(9);
        op5p8.setFecn(9);
        op5p8.setNpor(9);
        op5p8.setLpor(9);
        op5p8.setTlrf(9);
        op5p8.setNhat(9);
        op5p8.setSalr(9);
        op5p8.setAefr(9);
        op5p8.setHldm("9");
        op5p8.setHlsm("9");
        op5p8.setHnie(9);
        op5p8.setTmnr(9);
        op5p8.setOrigen(9);
        op5p8.setId_formulario(referencia);
        op5p8.setObser("9");
        DaoAPP.daoSession.getP5p8Dao().insert(op5p8);

        p5p9 op5p9 = new p5p9();
        op5p9.setLcnpm(9);
        op5p9.setMetf(9);
        op5p9.setOrigen(9);
        op5p9.setId_formulario(referencia);
        op5p9.setObser("9");
        DaoAPP.daoSession.getP5p9Dao().insert(op5p9);

        p5p10 op5p10 = new p5p10();
        op5p10.setArmf(9);
        op5p10.setPctf(9);
        op5p10.setEsal(9);
        op5p10.setBen(9);
        op5p10.setCdel(9);
        op5p10.setDtra(9);
        op5p10.setFotl(9);
        op5p10.setOrigen(9);
        op5p10.setId_formulario(referencia);
        op5p10.setObser("9");
        DaoAPP.daoSession.getP5p10Dao().insert(op5p10);

        p5p11 op5p11 = new p5p11();
        op5p11.setArmf(9);
        op5p11.setFtrt(9);
        op5p11.setSnat(9);
        op5p11.setMfmt(9);
        op5p11.setOrigen(9);
        op5p11.setId_formulario(referencia);
        op5p11.setObser("9");
        DaoAPP.daoSession.getP5p11Dao().insert(op5p11);

        p5p12 op5p12 = new p5p12();
        op5p12.setArmf(9);
        op5p12.setPgd(9);
        op5p12.setNumt(9);
        op5p12.setTdol(9);
        op5p12.setFprt(9);
        op5p12.setIdeo(9);
        op5p12.setRel(9);
        op5p12.setSoc(9);
        op5p12.setPol(9);
        op5p12.setCul(9);
        op5p12.setDe("9");
        op5p12.setOrigen(9);
        op5p12.setId_formulario(referencia);
        op5p12.setObser("9");
        DaoAPP.daoSession.getP5p12Dao().insert(op5p12);

        p5p13 op5p13 = new p5p13();
        op5p13.setArmf(9);
        op5p13.setNcss(9);
        op5p13.setFitc(9);
        op5p13.setFpt(9);
        op5p13.setTrcp(9);
        op5p13.setOrigen(9);
        op5p13.setId_formulario(referencia);
        op5p13.setObser("9");
        DaoAPP.daoSession.getP5p13Dao().insert(op5p13);

        p5p14 op5p14 = new p5p14();
        op5p14.setFnav(9);
        op5p14.setHig(9);
        op5p14.setSegh(9);
        op5p14.setSal(9);
        op5p14.setVfap(9);
        op5p14.setTtar(9);
        op5p14.setSbdn(9);
        op5p14.setIdta(9);
        op5p14.setMemc(9);
        op5p14.setOrigen(9);
        op5p14.setId_formulario(referencia);
        op5p14.setObser("9");
        DaoAPP.daoSession.getP5p14Dao().insert(op5p14);

        p5p15 op5p15 = new p5p15();
        op5p15.setTfap(9);
        op5p15.setAcue(9);
        op5p15.setNaci(9);
        op5p15.setCau(9);
        op5p15.setOtro("9");
        op5p15.setTaap(9);
        op5p15.setApcs(9);
        op5p15.setAdlt(9);
        op5p15.setAna(9);
        op5p15.setDfec("9");
        op5p15.setDepo(9);
        op5p15.setHagu(9);
        op5p15.setOrigen(9);
        op5p15.setId_formulario(referencia);
        op5p15.setObser("9");
        DaoAPP.daoSession.getP5p15Dao().insert(op5p15);

        p5p16 op5p16 = new p5p16();
        op5p16.setTtam(9);
        op5p16.setTamh(9);
        op5p16.setTame(9);
        op5p16.setEps(9);
        op5p16.setSisb(9);
        op5p16.setOtro(9);
        op5p16.setCual("9");
        op5p16.setOrigen(9);
        op5p16.setId_formulario(referencia);
        op5p16.setObser("9");
        DaoAPP.daoSession.getP5p16Dao().insert(op5p16);

        p5p17 op5p17 = new p5p17();
        op5p17.setFgeh(9);
        op5p17.setHtevf(9);
        op5p17.setMgaet(9);
        op5p17.setEapf(9);
        op5p17.setOrigen(9);
        op5p17.setId_formulario(referencia);
        op5p17.setObser("9");
        DaoAPP.daoSession.getP5p17Dao().insert(op5p17);

        p5p18 op5p18 = new p5p18();
        op5p18.setFipe(9);
        op5p18.setEper(9);
        op5p18.setAnlc(9);
        op5p18.setIftf(9);
        op5p18.setOrigen(9);
        op5p18.setId_formulario(referencia);
        op5p18.setObser("9");
        DaoAPP.daoSession.getP5p18Dao().insert(op5p18);

        p5p19 op5p19 = new p5p19();
        op5p19.setLnpm(9);
        op5p19.setMetc(9);
        op5p19.setOrigen(9);
        op5p19.setId_formulario(referencia);
        op5p19.setObser("9");
        DaoAPP.daoSession.getP5p19Dao().insert(op5p19);

            /* principio 6 */


        p6p1 op6p1 = new p6p1();
        op6p1.setLfdi(9);
        op6p1.setEupd(9);
        op6p1.setEpcc(9);
        op6p1.setPccp(9);
        op6p1.setNudt(9);
        op6p1.setPccr(9);
        op6p1.setLtpe(9);
        op6p1.setLadr(9);
        op6p1.setMadr(9);
        op6p1.setSena(9);
        op6p1.setUcds(9);
        op6p1.setPeps(9);
        op6p1.setOrigen(9);
        op6p1.setId_formulario(referencia);
        op6p1.setObser("9");
        DaoAPP.daoSession.getP6p1Dao().insert(op6p1);

        p6p2 op6p2 = new p6p2();
        op6p2.setLfup(9);
        op6p2.setEupc(9);
        op6p2.setLtcl(9);
        op6p2.setLthr(9);
        op6p2.setErdd(9);
        op6p2.setLfcc(9);
        op6p2.setLtop(9);
        op6p2.setLmdu(9);
        op6p2.setLafr(9);
        op6p2.setTetr(9);
        op6p2.setLadu(9);
        op6p2.setObje(9);
        op6p2.setOrigen(9);
        op6p2.setId_formulario(referencia);
        op6p2.setObser("9");
        DaoAPP.daoSession.getP6p2Dao().insert(op6p2);

        p6p3 op6p3 = new p6p3();
        op6p3.setNhtq(9);
        op6p3.setSice(9);
        op6p3.setCipp(9);
        op6p3.setEptl(9);
        op6p3.setFdlu("9");
        op6p3.setOrigen(9);
        op6p3.setId_formulario(referencia);
        op6p3.setObser("9");
        DaoAPP.daoSession.getP6p3Dao().insert(op6p3);

        p6p4 op6p4 = new p6p4();
        op6p4.setLtqr(9);
        op6p4.setExme(9);
        op6p4.setAnua(9);
        op6p4.setFech("9");
        op6p4.setSrad(9);
        op6p4.setLtta(9);
        op6p4.setHipe("9");
        op6p4.setSiap(9);
        op6p4.setSgta(9);
        op6p4.setOrigen(9);
        op6p4.setId_formulario(referencia);
        op6p4.setObser("9");
        DaoAPP.daoSession.getP6p4Dao().insert(op6p4);

        p6p5 op6p5 = new p6p5();
        op6p5.setEpqa(9);
        op6p5.setEpqm(9);
        op6p5.setLass(9);
        op6p5.setCarb(9);
        op6p5.setOrga(9);
        op6p5.setSere(9);
        op6p5.setSelr(9);
        op6p5.setSslr(9);
        op6p5.setEtta(9);
        op6p5.setOrigen(9);
        op6p5.setId_formulario(referencia);
        op6p5.setObser("9");
        DaoAPP.daoSession.getP6p5Dao().insertInTx(op6p5);

        p6p6 op6p6 = new p6p6();
        op6p6.setTltq(9);
        op6p6.setSpal(9);
        op6p6.setSpfp(9);
        op6p6.setScal(9);
        op6p6.setSsed(9);
        op6p6.setSeeu(9);
        op6p6.setOrigen(9);
        op6p6.setId_formulario(referencia);
        op6p6.setObser("9");
        DaoAPP.daoSession.getP6p6Dao().insert(op6p6);

        p6p7 op6p7 = new p6p7();
        op6p7.setLfdm(9);
        op6p7.setSmen(9);
        op6p7.setMdcd(9);
        op6p7.setSale(9);
        op6p7.setIdma(9);
        op6p7.setScep(9);
        op6p7.setOrigen(9);
        op6p7.setId_formulario(referencia);
        op6p7.setObser("9");
        DaoAPP.daoSession.getP6p7Dao().insert(op6p7);

        p6p8 op6p8 = new p6p8();
        op6p8.setLtyl(9);
        op6p8.setLigr(9);
        op6p8.setLidp(9);
        op6p8.setEicc(9);
        op6p8.setEdcc(9);
        op6p8.setOrigen(9);
        op6p8.setId_formulario(referencia);
        op6p8.setObser("9");
        DaoAPP.daoSession.getP6p8Dao().insert(op6p8);

        p6p9 op6p9 = new p6p9();
        op6p9.setLada(9);
        op6p9.setEddl(9);
        op6p9.setSomi(9);
        op6p9.setMean(9);
        op6p9.setKprd(9);
        op6p9.setTids(9);
        op6p9.setPeqr(9);
        op6p9.setMdpd(9);
        op6p9.setLade(9);
        op6p9.setOrigen(9);
        op6p9.setId_formulario(referencia);
        op6p9.setObser("9");
        DaoAPP.daoSession.getP6p9Dao().insert(op6p9);

        p6p10 op6p10 = new p6p10();
        op6p10.setLfda(9);
        op6p10.setEada(9);
        op6p10.setSalv(9);
        op6p10.setSuab(9);
        op6p10.setFoqu(9);
        op6p10.setToxi(9);
        op6p10.setLans(9);
        op6p10.setLeda(9);
        op6p10.setSrtl(9);
        op6p10.setSmlh(9);
        op6p10.setShea(9);
        op6p10.setOrigen(9);
        op6p10.setId_formulario(referencia);
        op6p10.setObser("9");
        DaoAPP.daoSession.getP6p10Dao().insert(op6p10);

        p6p11 op6p11 = new p6p11();
        op6p11.setLfdd(9);
        op6p11.setLudl(9);
        op6p11.setOrigen(9);
        op6p11.setId_formulario(referencia);
        op6p11.setObser("9");
        DaoAPP.daoSession.getP6p11Dao().insert(op6p11);

        p6p12 op6p12 = new p6p12();
        op6p12.setLfdt(9);
        op6p12.setStmp(9);
        op6p12.setLvqt(9);
        op6p12.setCcpd(9);
        op6p12.setLein(9);
        op6p12.setLped(9);
        op6p12.setLast(9);
        op6p12.setLemd(9);
        op6p12.setOrigen(9);
        op6p12.setId_formulario(referencia);
        op6p12.setObser("9");
        DaoAPP.daoSession.getP6p12Dao().insert(op6p12);

        p6p13 op6p13 = new p6p13();
        op6p13.setTltq(9);
        op6p13.setLtqa(9);
        op6p13.setLfse(9);
        op6p13.setLfie(9);
        op6p13.setEedp(9);
        op6p13.setOrigen(9);
        op6p13.setId_formulario(referencia);
        op6p13.setObser("9");
        DaoAPP.daoSession.getP6p13Dao().insert(op6p13);

        p6p14 op6p14 = new p6p14();
        op6p14.setLfde(9);
        op6p14.setHoap("9");
        op6p14.setSemd(9);
        op6p14.setSrrd("9");
        op6p14.setOrigen(9);
        op6p14.setId_formulario(referencia);
        op6p14.setObser("9");
        DaoAPP.daoSession.getP6p14Dao().insert(op6p14);

        p6p15 op6p15 = new p6p15();
        op6p15.setLfda(9);
        op6p15.setSeaa(9);
        op6p15.setHorp("9");
        op6p15.setSeap(9);
        op6p15.setSilg(9);
        op6p15.setSccm(9);
        op6p15.setSccr(9);
        op6p15.setSiuh(9);
        op6p15.setLtcy(9);
        op6p15.setPpqn(9);
        op6p15.setCsus(9);
        op6p15.setOrigen(9);
        op6p15.setId_formulario(referencia);
        op6p15.setObser("9");
        DaoAPP.daoSession.getP6p15Dao().insert(op6p15);

        p6p16 op6p16 = new p6p16();
        op6p16.setElfd(9);
        op6p16.setDcdr(9);
        op6p16.setEaes(9);
        op6p16.setEdyv(9);
        op6p16.setOrigen(9);
        op6p16.setId_formulario(referencia);
        op6p16.setObser("9");
        DaoAPP.daoSession.getP6p16Dao().insert(op6p16);

        p6p17 op6p17 = new p6p17();
        op6p17.setPnms(9);
        op6p17.setPdms(9);
        op6p17.setEuac(9);
        op6p17.setNepl(9);
        op6p17.setOrigen(9);
        op6p17.setId_formulario(referencia);
        op6p17.setObser("9");
        DaoAPP.daoSession.getP6p17Dao().insert(op6p17);

        p6p18 op6p18 = new p6p18();
        op6p18.setAltd(9);
        op6p18.setIatd(9);
        op6p18.setLfcc(9);
        op6p18.setLtcl(9);
        op6p18.setRcsa(9);
        op6p18.setPcep(9);
        op6p18.setOrigen(9);
        op6p18.setId_formulario(referencia);
        op6p18.setObser("9");
        DaoAPP.daoSession.getP6p18Dao().insert(op6p18);

        p6p19 op6p19 = new p6p19();
        op6p19.setFdcc(9);
        op6p19.setCcen(9);
        op6p19.setSpaf(9);
        op6p19.setEedp(9);
        op6p19.setCcbd(9);
        op6p19.setLava(9);
        op6p19.setDuch(9);
        op6p19.setLvmn(9);
        op6p19.setOrigen(9);
        op6p19.setId_formulario(referencia);
        op6p19.setObser("9");
        DaoAPP.daoSession.getP6p19Dao().insert(op6p19);

        p6p20 op6p20 = new p6p20();
        op6p20.setFdip(9);
        op6p20.setSipd(9);
        op6p20.setEcca(9);
        op6p20.setMono(9);
        op6p20.setLfbs(9);
        op6p20.setOrigen(9);
        op6p20.setId_formulario(referencia);
        op6p20.setObser("9");
        DaoAPP.daoSession.getP6p20Dao().insert(op6p20);

            /* principio 7 */

        p7p1 op7p1 = new p7p1();
        op7p1.setFdrl(9);
        op7p1.setSrao(9);
        op7p1.setOrigen(9);
        op7p1.setId_formulario(referencia);
        op7p1.setObser("9");
        DaoAPP.daoSession.getP7p1Dao().insert(op7p1);


        p7p2 op7p2 = new p7p2();
        op7p2.setLadf(9);
        op7p2.setExpo(9);
        op7p2.setExpr(9);
        op7p2.setSdlq(9);
        op7p2.setSalp(9);
        op7p2.setShpa(9);
        op7p2.setHpaq(9);
        op7p2.setSipy(9);
        op7p2.setOrigen(9);
        op7p2.setId_formulario(referencia);
        op7p2.setObser("9");
        DaoAPP.daoSession.getP7p2Dao().insert(op7p2);

        p7p3 op7p3 = new p7p3();
        op7p3.setPypp(9);
        op7p3.setCcpp(9);
        op7p3.setSccp(9);
        op7p3.setLfcp(9);
        op7p3.setLfas(9);
        op7p3.setOrigen(9);
        op7p3.setId_formulario(referencia);
        op7p3.setObser("9");
        DaoAPP.daoSession.getP7p3Dao().insert(op7p3);

        p7p4 op7p4 = new p7p4();
        op7p4.setLfdc(9);
        op7p4.setLfpe(9);
        op7p4.setLfcd(9);
        op7p4.setLfau(9);
        op7p4.setOrigen(9);
        op7p4.setId_formulario(referencia);
        op7p4.setObser("9");
        DaoAPP.daoSession.getP7p4Dao().insert(op7p4);

        p7p5 op7p5 = new p7p5();
        op7p5.setLfdc(9);
        op7p5.setLfce(9);
        op7p5.setLfac(9);
        op7p5.setOrigen(9);
        op7p5.setId_formulario(referencia);
        op7p5.setObser("9");
        DaoAPP.daoSession.getP7p5Dao().insert(op7p5);

        p7p6 op7p6 = new p7p6();
        op7p6.setFdtl(9);
        op7p6.setSdec(9);
        op7p6.setClyt(9);
        op7p6.setAdds(9);
        op7p6.setDdpb(9);
        op7p6.setEscr(9);
        op7p6.setOrigen(9);
        op7p6.setId_formulario(referencia);
        op7p6.setObser("9");
        DaoAPP.daoSession.getP7p6Dao().insert(op7p6);

            /* principio 8 */

        p8p1 op8p1 = new p8p1();
        op8p1.setLfde(9);
        op8p1.setLfeu(9);
        op8p1.setEpia(9);
        op8p1.setPcem(9);
        op8p1.setPcei(9);
        op8p1.setReid(9);
        op8p1.setFeas(9);
        op8p1.setDura(9);
        op8p1.setExte(9);
        op8p1.setDano(9);
        op8p1.setUdli(9);
        op8p1.setCedl(9);
        op8p1.setTipl(9);
        op8p1.setCoes(9);
        op8p1.setFaam(9);
        op8p1.setMdce(9);
        op8p1.setOrigen(9);
        op8p1.setId_formulario(referencia);
        op8p1.setObser("9");
        DaoAPP.daoSession.getP8p1Dao().insert(op8p1);

        p8p2 op8p2 = new p8p2();
        op8p2.setLfdd(9);
        op8p2.setRcdu(9);
        op8p2.setLfrr(9);
        op8p2.setLfre(9);
        op8p2.setCcui(9);
        op8p2.setNoco(9);
        op8p2.setNoge(9);
        op8p2.setLafe(9);
        op8p2.setCaco(9);
        op8p2.setPrap(9);
        op8p2.setTdad(9);
        op8p2.setFeda(9);
        op8p2.setDosi(9);
        op8p2.setVtdp(9);
        op8p2.setNdlp(9);
        op8p2.setNdqa(9);
        op8p2.setNdqr(9);
        op8p2.setIded(9);
        op8p2.setLfme(9);
        op8p2.setSrya(9);
        op8p2.setOrigen(9);
        op8p2.setId_formulario(referencia);
        op8p2.setObser("9");
        DaoAPP.daoSession.getP8p2Dao().insert(op8p2);

        p8p3 op8p3 = new p8p3();
        op8p3.setLfdi(9);
        op8p3.setSilp(9);
        op8p3.setCcen(9);
        op8p3.setCeen(9);
        op8p3.setEnep(9);
        op8p3.setLfda(9);
        op8p3.setOrigen(9);
        op8p3.setId_formulario(referencia);
        op8p3.setObser("9");
        DaoAPP.daoSession.getP8p3Dao().insert(op8p3);

        p8p4 op8p4 = new p8p4();
        op8p4.setNspe(9);
        op8p4.setLfnu(9);
        op8p4.setFnus(9);
        op8p4.setUape(9);
        op8p4.setUspp(9);
        op8p4.setDlds(9);
        op8p4.setUadc(9);
        op8p4.setSqnp(9);
        op8p4.setNsbu(9);
        op8p4.setOrigen(9);
        op8p4.setId_formulario(referencia);
        op8p4.setObser("9");
        DaoAPP.daoSession.getP8p4Dao().insert(op8p4);

        p8p5 op8p5 = new p8p5();
        op8p5.setDeup(9);
        op8p5.setEupp(9);
        op8p5.setPprl(9);
        op8p5.setSeep(9);
        op8p5.setOrigen(9);
        op8p5.setId_formulario(referencia);
        op8p5.setObser("9");
        DaoAPP.daoSession.getP8p5Dao().insert(op8p5);

        p8p6 op8p6 = new p8p6();
        op8p6.setDtmp(9);
        op8p6.setSeic(9);
        op8p6.setNshi(9);
        op8p6.setSdye(9);
        op8p6.setOrigen(9);
        op8p6.setId_formulario(referencia);
        op8p6.setObser("9");
        DaoAPP.daoSession.getP8p6Dao().insert(op8p6);

        p8p7 op8p7 = new p8p7();
        op8p7.setFdus(9);
        op8p7.setFusm(9);
        op8p7.setFccr(9);
        op8p7.setIadp(9);
        op8p7.setNold(9);
        op8p7.setNdlp(9);
        op8p7.setDosi(9);
        op8p7.setDlpq(9);
        op8p7.setPqal(9);
        op8p7.setFcda(9);
        op8p7.setOrigen(9);
        op8p7.setId_formulario(referencia);
        op8p7.setObser("9");
        DaoAPP.daoSession.getP8p7Dao().insert(op8p7);

        p8p8 op8p8 = new p8p8();
        op8p8.setNslp(9);
        op8p8.setUdfp(9);
        op8p8.setSelp(9);
        op8p8.setOrigen(9);
        op8p8.setId_formulario(referencia);
        op8p8.setObser("9");
        DaoAPP.daoSession.getP8p8Dao().insert(op8p8);

        p8p9 op8p9 = new p8p9();
        op8p9.setSspu(9);
        op8p9.setEeud(9);
        op8p9.setEudf(9);
        op8p9.setFsub(9);
        op8p9.setOrigen(9);
        op8p9.setId_formulario(referencia);
        op8p9.setObser("9");
        DaoAPP.daoSession.getP8p9Dao().insert(op8p9);

            /* principio 9 */

        p9p1 op9p1 = new p9p1();
        op9p1.setFepce(9);
        op9p1.setFcpce(9);
        op9p1.setEpes(9);
        op9p1.setIfas(9);
        op9p1.setUecv(9);
        op9p1.setOrigen(9);
        op9p1.setId_formulario(referencia);
        op9p1.setObser("9");
        DaoAPP.daoSession.getP9p1Dao().insert(op9p1);


        p9p2 op9p2 = new p9p2();
        op9p2.setFpfs(9);
        op9p2.setEpfs(9);
        op9p2.setCyps(9);
        op9p2.setAps(9);
        op9p2.setApc(9);
        op9p2.setMues(9);
        op9p2.setTap(9);
        op9p2.setTds(9);
        op9p2.setRaa(9);
        op9p2.setZon(9);
        op9p2.setDfin(9);
        op9p2.setDfec("9");
        op9p2.setCasp(9);
        op9p2.setAfoi(9);
        op9p2.setRect(9);
        op9p2.setUreo(9);
        op9p2.setOrigen(9);
        op9p2.setId_formulario(referencia);
        op9p2.setObser("9");
        DaoAPP.daoSession.getP9p2Dao().insert(op9p2);

        p9p3 op9p3 = new p9p3();
        op9p3.setFdec(9);
        op9p3.setFuev(9);
        op9p3.setFcec(9);
        op9p3.setAcae(9);
        op9p3.setAdec(9);
        op9p3.setCroa(9);
        op9p3.setMach(9);
        op9p3.setGuad(9);
        op9p3.setHerb(9);
        op9p3.setOrigen(9);
        op9p3.setId_formulario(referencia);
        op9p3.setObser("9");
        DaoAPP.daoSession.getP9p3Dao().insert(op9p3);

        p9p4 op9p4 = new p9p4();
        op9p4.setFpad(9);
        op9p4.setVegn(9);
        op9p4.setVegs(9);
        op9p4.setPrad(9);
        op9p4.setTid(9);
        op9p4.setMede(9);
        op9p4.setEnc(9);
        op9p4.setMap(9);
        op9p4.setQprt(9);
        op9p4.setOrigen(9);
        op9p4.setId_formulario(referencia);
        op9p4.setObser("9");
        DaoAPP.daoSession.getP9p4Dao().insert(op9p4);

        p9p5 op9p5 = new p9p5();
        op9p5.setNsna(9);
        op9p5.setClim(9);
        op9p5.setTop(9);
        op9p5.setSuel(9);
        op9p5.setEcyu(9);
        op9p5.setTbn(9);
        op9p5.setQpna(9);
        op9p5.setOrigen(9);
        op9p5.setId_formulario(referencia);
        op9p5.setObser("9");
        DaoAPP.daoSession.getP9p5Dao().insert(op9p5);


            /* principio 10 */

        p10p1 op10p1 = new p10p1();
        op10p1.setFtpd(9);
        op10p1.setFcpd(9);
        op10p1.setFrin(9);
        op10p1.setFrd(9);
        op10p1.setIftd(9);
        op10p1.setComp(9);
        op10p1.setEcg(9);
        op10p1.setAmda(9);
        op10p1.setOrigen(9);
        op10p1.setId_formulario(referencia);
        op10p1.setObser("9");
        DaoAPP.daoSession.getP10p1Dao().insert(op10p1);

        p10p2 op10p2 = new p10p2();
        op10p2.setNpbca(9);
        op10p2.setNibf(9);
        op10p2.setNqbf(9);
        op10p2.setFqib(9);
        op10p2.setIdet(9);
        op10p2.setPlci(9);
        op10p2.setPoper(9);
        op10p2.setOrigen(9);
        op10p2.setId_formulario(referencia);
        op10p2.setObser("9");
        DaoAPP.daoSession.getP10p2Dao().insert(op10p2);

        p10p3 op10p3 = new p10p3();
        op10p3.setDfdr(9);
        op10p3.setDfrc(9);
        op10p3.setVivi(9);
        op10p3.setFuag(9);
        op10p3.setArec(9);
        op10p3.setCauc(9);
        op10p3.setOada(9);
        op10p3.setComp(9);
        op10p3.setMdli(9);
        op10p3.setUldf("9");
        op10p3.setOrigen(9);
        op10p3.setId_formulario(referencia);
        op10p3.setObser("9");
        DaoAPP.daoSession.getP10p3Dao().insert(op10p3);

        p10p4 op10p4 = new p10p4();
        op10p4.setFnedt(9);
        op10p4.setEbat(9);
        op10p4.setEda("9");
        op10p4.setEbea("9");
        op10p4.setQrdc(9);
        op10p4.setLsh(9);
        op10p4.setAmb(9);
        op10p4.setOrigen(9);
        op10p4.setId_formulario(referencia);
        op10p4.setObser("9");
        DaoAPP.daoSession.getP10p4Dao().insert(op10p4);

        p10p5 op10p5 = new p10p5();
        op10p5.setFlsd(9);
        op10p5.setFel(9);
        op10p5.setFip(9);
        op10p5.setRapa(9);
        op10p5.setDble(9);
        op10p5.setRpc(9);
        op10p5.setOrigen(9);
        op10p5.setId_formulario(referencia);
        op10p5.setObser("9");
        DaoAPP.daoSession.getP10p5Dao().insert(op10p5);


        p10p6 op10p6 = new p10p6();
        op10p6.setFiprg(9);
        op10p6.setIprg(9);
        op10p6.setIpcd(9);
        op10p6.setCobs(9);
        op10p6.setSia(9);
        op10p6.setMac(9);
        op10p6.setMaf(9);
        op10p6.setUee(9);
        op10p6.setMir(9);
        op10p6.setUtl(9);
        op10p6.setMpps(9);
        op10p6.setPirg(9);
        op10p6.setMpta(9);
        op10p6.setOrigen(9);
        op10p6.setId_formulario(referencia);
        op10p6.setObser("9");
        DaoAPP.daoSession.getP10p6Dao().insert(op10p6);

    }

    public static void poblar(int referencia, Boolean grupal) {

        g1p1 og1p1 = new g1p1();
        og1p1.setEadg(9);
        og1p1.setEprog(9);
        og1p1.setRegi(9);
        og1p1.setOrigen(9);
        og1p1.setId_formulario(referencia);
        og1p1.setObser("9");
        DaoAPP.daoSession.getG1p1Dao().insert(og1p1);

        g1p2 og1p2 = new g1p2();
        og1p2.setEadg(9);
        og1p2.setFech("9");
        og1p2.setOrigen(9);
        og1p2.setId_formulario(referencia);
        og1p2.setObser("9");
        DaoAPP.daoSession.getG1p1Dao().insert(og1p1);



    }
}
