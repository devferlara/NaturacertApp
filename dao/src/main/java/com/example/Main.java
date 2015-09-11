package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;
import de.greenrobot.daogenerator.ToMany;

public class Main {


    public static void main(String [] args) throws Exception {

        Schema schema = new Schema(1, "naturacert.baumsoft.dev.naturacert");
        schema.enableKeepSectionsByDefault();

        /* creaciones */
        crear1p1(schema);
        crear1p2(schema);
        crear1p3(schema);
        crear1p4(schema);
        crear1p5(schema);
        crear1p6(schema);
        crear1p7(schema);
        crear1p8(schema);
        crear1p9(schema);
        crear1p10(schema);
        crear1p11(schema);

        crear2p1(schema);
        crear2p2(schema);
        crear2p3(schema);
        crear2p4(schema);
        crear2p5(schema);
        crear2p6(schema);
        crear2p7(schema);
        crear2p8(schema);
        crear2p9(schema);

        crear3p1(schema);
        crear3p2(schema);
        crear3p3(schema);
        crear3p4(schema);
        crear3p5(schema);
        crear3p6(schema);

        crear4p1(schema);
        crear4p2(schema);
        crear4p3(schema);
        crear4p4(schema);
        crear4p5(schema);
        crear4p6(schema);
        crear4p7(schema);
        crear4p8(schema);
        crear4p9(schema);

        crear5p1(schema);
        crear5p2(schema);
        crear5p3(schema);
        crear5p4(schema);
        crear5p5(schema);
        crear5p6(schema);
        crear5p7(schema);
        crear5p8(schema);
        crear5p9(schema);
        crear5p10(schema);
        crear5p11(schema);
        crear5p12(schema);
        crear5p13(schema);
        crear5p14(schema);
        crear5p15(schema);
        crear5p16(schema);
        crear5p17(schema);
        crear5p18(schema);
        crear5p19(schema);

        crear6p1(schema);
        crear6p2(schema);
        crear6p3(schema);
        crear6p4(schema);
        crear6p5(schema);
        crear6p6(schema);
        crear6p7(schema);
        crear6p8(schema);
        crear6p9(schema);
        crear6p10(schema);
        crear6p11(schema);
        crear6p12(schema);
        crear6p13(schema);
        crear6p14(schema);
        crear6p15(schema);
        crear6p16(schema);
        crear6p17(schema);
        crear6p18(schema);
        crear6p19(schema);
        crear6p20(schema);

        crear7p1(schema);
        crear7p2(schema);
        crear7p3(schema);
        crear7p4(schema);
        crear7p5(schema);
        crear7p6(schema);

        crear8p1(schema);
        crear8p2(schema);
        crear8p3(schema);
        crear8p4(schema);
        crear8p5(schema);
        crear8p6(schema);
        crear8p7(schema);
        crear8p8(schema);
        crear8p9(schema);

        crear9p1(schema);
        crear9p2(schema);
        crear9p3(schema);
        crear9p4(schema);
        crear9p5(schema);

        crear10p1(schema);
        crear10p2(schema);
        crear10p3(schema);
        crear10p4(schema);
        crear10p5(schema);
        crear10p6(schema);

        crearTablasBase(schema);

        /* creaciones */
        DaoGenerator generator = new DaoGenerator();
        generator.generateAll(schema, args[0]);

    }


    private static void crearTablasBase(Schema schema){

        Entity tokenBD = schema.addEntity("TokensBD");
        tokenBD.addIdProperty();
        tokenBD.addLongProperty("expiresIn");
        tokenBD.addLongProperty("expiresAt");
        tokenBD.addStringProperty("tokenType");
        tokenBD.addStringProperty("refreshToken");
        tokenBD.addStringProperty("accessToken");

        Entity auditor = schema.addEntity("Auditores");
        auditor.addIdProperty();
        auditor.addStringProperty("usuario");
        auditor.addStringProperty("nombre");
        auditor.addStringProperty("apellido");
        auditor.addStringProperty("foto");
        auditor.addIntProperty("ref_auditor");

        Property idToken = auditor.addLongProperty("idToken").notNull().getProperty();
        ToMany auditor_token = tokenBD.addToMany(auditor, idToken);
        auditor_token.setName("productos_carrito");
        auditor.addToOne(tokenBD, idToken);

        Entity clientes = schema.addEntity("Clientes");
        clientes.addIdProperty();
        clientes.addStringProperty("nombres");
        clientes.addStringProperty("apellidos");
        clientes.addStringProperty("dirección");
        clientes.addStringProperty("telefono");
        clientes.addStringProperty("documento");
        clientes.addStringProperty("email");
        clientes.addIntProperty("referencia");

        Entity fincas = schema.addEntity("Fincas");
        fincas.addIdProperty();
        fincas.addIntProperty("ref_finca");
        fincas.addStringProperty("nombre");
        fincas.addIntProperty("tipo_finca"); //1 individual - 2 grupal
        fincas.addIntProperty("id_formulario");
        fincas.addLongProperty("departamento");
        fincas.addStringProperty("codigo");
        fincas.addStringProperty("hora");
        fincas.addStringProperty("fecha");
        fincas.addStringProperty("imagen");
        fincas.addStringProperty("municipio");
        fincas.addStringProperty("vereda");
        fincas.addDoubleProperty("latitud");
        fincas.addDoubleProperty("longitud");
        fincas.addIntProperty("altitud");
        fincas.addStringProperty("grupo");
        fincas.addLongProperty("tipo_auditoria");
        fincas.addLongProperty("tipo_auditor");
        fincas.addStringProperty("propietario");
        fincas.addIntProperty("area_finca");
        fincas.addIntProperty("area_conservacion");
        fincas.addIntProperty("area_infraestructura");
        fincas.addStringProperty("periodo_cosecha");
        fincas.addStringProperty("produccion_regional");
        fincas.addIntProperty("fr_cafe");
        fincas.addStringProperty("almendra_sana");
        fincas.addStringProperty("problemas_sanitarios");
        fincas.addStringProperty("documentos_anexos");
        fincas.addStringProperty("proveedores_visitados");
        fincas.addStringProperty("observaciones");


        Property idCliente = fincas.addLongProperty("idCliente").notNull().getProperty();
        ToMany cliente_finca = clientes.addToMany(fincas, idCliente);
        cliente_finca.setName("Clientes");
        fincas.addToOne(clientes, idCliente);

        Property idAuditor = fincas.addLongProperty("idAuditor").notNull().getProperty();
        ToMany auditor_finca = auditor.addToMany(fincas, idAuditor);
        auditor_finca.setName("Auditores");
        fincas.addToOne(auditor, idAuditor);

    }

    private static void crear1p1(Schema schema){
        Entity p = schema.addEntity("p1p1");
        p.addIdProperty();
        p.addIntProperty("sgsate");
        p.addIntProperty("sgsa");
        p.addIntProperty("politicas");
        p.addIntProperty("programas");
        p.addIntProperty("procedimientos");
        p.addIntProperty("sociales");
        p.addIntProperty("laborales");
        p.addIntProperty("ambientales");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p2(Schema schema){
        Entity p = schema.addEntity("p1p2");
        p.addIdProperty();
        p.addIntProperty("eapcn");
        p.addIntProperty("pgsa");
        p.addIntProperty("eap");
        p.addIntProperty("alp");
        p.addIntProperty("oym");
        p.addIntProperty("res");
        p.addIntProperty("reg");
        p.addIntProperty("map");
        p.addIntProperty("laip");
        p.addIntProperty("pol");
        p.addIntProperty("proc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p3(Schema schema){
        Entity p = schema.addEntity("p1p3");
        p.addIdProperty();
        p.addIntProperty("dfdc");
        p.addIntProperty("cyasp");
        p.addIntProperty("adc");
        p.addIntProperty("aer");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p4(Schema schema){
        Entity p = schema.addEntity("p1p4");
        p.addIdProperty();
        p.addIntProperty("sgsdt");
        p.addIntProperty("oyrd");
        p.addStringProperty("donde");
        p.addIntProperty("pgsd");
        p.addIntProperty("edd");
        p.addStringProperty("cuales");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p5(Schema schema) {
        Entity p = schema.addEntity("p1p5");
        p.addIdProperty();
        p.addIntProperty("cdpm");
        p.addIntProperty("dfdr");
        p.addStringProperty("dgsca");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p6(Schema schema) {
        Entity p = schema.addEntity("p1p6");
        p.addIdProperty();
        p.addIntProperty("epino");
        p.addIntProperty("erlv");
        p.addIntProperty("erac");
        p.addIntProperty("eipi");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p7(Schema schema) {
        Entity p = schema.addEntity("p1p7");
        p.addIdProperty();
        p.addIntProperty("cppr");
        p.addIntProperty("rdr");
        p.addIntProperty("iap");
        p.addIntProperty("pmc");
        p.addIntProperty("seg");
        p.addIntProperty("med");
        p.addIntProperty("ana");
        p.addIntProperty("trab");
        p.addIntProperty("grup");
        p.addIntProperty("oper");
        p.addIntProperty("aco");
        p.addIntProperty("mdea");
        p.addIntProperty("mdam");
        p.addIntProperty("apam");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p8(Schema schema) {
        Entity p = schema.addEntity("p1p8");
        p.addIdProperty();
        p.addIntProperty("psfc");
        p.addIntProperty("mep");
        p.addIntProperty("vcp");
        p.addIntProperty("fvc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p9(Schema schema) {
        Entity p = schema.addEntity("p1p9");
        p.addIdProperty();
        p.addIntProperty("pcsg");
        p.addIntProperty("pdc");
        p.addIntProperty("pde");
        p.addIntProperty("rda");
        p.addIntProperty("rdt");
        p.addIntProperty("rdi");
        p.addIntProperty("actr");
        p.addIntProperty("norm");
        p.addIntProperty("pdt");
        p.addIntProperty("tdl");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p10(Schema schema) {
        Entity p = schema.addEntity("p1p10");
        p.addIdProperty();
        p.addIntProperty("spem");
        p.addIntProperty("sef");
        p.addIntProperty("set") ;
        p.addIntProperty("poi");
        p.addIntProperty("rtra");
        p.addIntProperty("pad");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear1p11(Schema schema) {
        Entity p = schema.addEntity("p1p11");
        p.addIdProperty();
        p.addIntProperty("dfep");
        p.addIntProperty("pdp");
        p.addIntProperty("tran");
        p.addIntProperty("udom");
        p.addIntProperty("pedn");
        p.addIntProperty("rce");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }


    /* Principio 2 */

    private static void crear2p1(Schema schema) {
        Entity p = schema.addEntity("p2p1");
        p.addIdProperty();
        p.addIntProperty("eco_pro_rec");
        p.addIntProperty("eco_nat");
        p.addIntProperty("prog_con");
        p.addIntProperty("iden_eco");
        p.addIntProperty("pro_eco");
        p.addIntProperty("rec_eco");
        p.addIntProperty("prog_inc_eco");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p2(Schema schema) {
        Entity p = schema.addEntity("p2p2");
        p.addIdProperty();
        p.addIntProperty("fndsn");
        p.addIntProperty("eav");
        p.addIntProperty("nede");
        p.addIntProperty("ndedc");
        p.addIntProperty("nden");
        p.addIntProperty("ades");
        p.addIntProperty("pmit");
        p.addIntProperty("ipla");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p3(Schema schema) {
        Entity p = schema.addEntity("p2p3");
        p.addIdProperty();
        p.addIntProperty("apnuc");
        p.addIntProperty("pnz");
        p.addIntProperty("rvs");
        p.addIntProperty("azm");
        p.addIntProperty("spn");
        p.addIntProperty("rfp");
        p.addIntProperty("pnr");
        p.addIntProperty("dmi");
        p.addIntProperty("dcs");
        p.addIntProperty("arec");
        p.addIntProperty("rnsc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p4(Schema schema) {
        Entity p = schema.addEntity("p2p4");
        p.addIdProperty();
        p.addIntProperty("nsep");
        p.addIntProperty("ntpm");
        p.addIntProperty("cpms");
        p.addIntProperty("cpdl");
        p.addIntProperty("npep");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p5(Schema schema) {
        Entity p = schema.addEntity("p2p5");
        p.addIdProperty();
        p.addIntProperty("nent");
        p.addIntProperty("dcpos");
        p.addIntProperty("dsp");
        p.addIntProperty("osv");
        p.addIntProperty("sepyn");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p6(Schema schema) {
        Entity p = schema.addEntity("p2p6");
        p.addIdProperty();
        p.addIntProperty("nea");
        p.addIntProperty("aea");
        p.addIntProperty("erosion");
        p.addIntProperty("deriva");
        p.addIntProperty("escagro");
        p.addIntProperty("pcn");
        p.addStringProperty("decyc");
        p.addIntProperty("ucv");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p7(Schema schema) {
        Entity p = schema.addEntity("p2p7");
        p.addIdProperty();
        p.addIntProperty("nhah");
        p.addIntProperty("buvn");
        p.addIntProperty("cah");
        p.addIntProperty("apc");
        p.addIntProperty("rdpyh");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p8(Schema schema) {
        Entity p = schema.addEntity("p2p8");
        p.addIdProperty();
        p.addIntProperty("ncaf");
        p.addStringProperty("denp");
        p.addStringProperty("dea");
        p.addStringProperty("neh");
        p.addStringProperty("adre");
        p.addIntProperty("admh");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear2p9(Schema schema) {
        Entity p = schema.addEntity("p2p9");
        p.addIdProperty();
        p.addIntProperty("flipc");
        p.addIntProperty("cpmr");
        p.addIntProperty("encd");
        p.addIntProperty("adp");
        p.addIntProperty("sbv");
        p.addIntProperty("adc");
        p.addIntProperty("pex");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    /* Principio 2 */

    /* Principio 3 */

    private static void crear3p1(Schema schema) {
        Entity p = schema.addEntity("p3p1");
        p.addIdProperty();
        p.addIntProperty("cmivs");
        p.addIntProperty("ivs");
        p.addIntProperty("idh");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear3p2(Schema schema) {
        Entity p = schema.addEntity("p3p2");
        p.addIdProperty();
        p.addIntProperty("niea");
        p.addIntProperty("ieap");
        p.addIntProperty("rhvs");
        p.addIntProperty("phf");
        p.addIntProperty("pep");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear3p3(Schema schema) {
        Entity p = schema.addEntity("p3p3");
        p.addIdProperty();
        p.addIntProperty("pceta");
        p.addIntProperty("egc");
        p.addIntProperty("phgc");
        p.addIntProperty("ncfc");
        p.addIntProperty("crsc");
        p.addIntProperty("prea");
        p.addIntProperty("pgec");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear3p4(Schema schema) {
        Entity p = schema.addEntity("p3p4");
        p.addIdProperty();
        p.addIntProperty("nmac");
        p.addIntProperty("cprt");
        p.addIntProperty("cifc");
        p.addIntProperty("neac");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear3p5(Schema schema) {
        Entity p = schema.addEntity("p3p5");
        p.addIdProperty();
        p.addIntProperty("nezc");
        p.addIntProperty("capr");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear3p6(Schema schema) {
        Entity p = schema.addEntity("p3p6");
        p.addIdProperty();
        p.addIntProperty("nish");
        p.addIntProperty("cpl");
        p.addIntProperty("cap");
        p.addIntProperty("nvsf");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    /* Principio 3 */

    /* Principio 4 */
    private static void crear4p1(Schema schema) {
        Entity p = schema.addEntity("p4p1");
        p.addIdProperty();
        p.addIntProperty("fepca");
        p.addIntProperty("pca");
        p.addIntProperty("ifs");
        p.addIntProperty("neda");
        p.addIntProperty("map");
        p.addIntProperty("rca");
        p.addIntProperty("fcra");
        p.addIntProperty("frmr");
        p.addIntProperty("rcaf");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p2(Schema schema) {
        Entity p = schema.addEntity("p4p2");
        p.addIdProperty();
        p.addIntProperty("neas");
        p.addIntProperty("fapa");
        p.addIntProperty("fcva");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p3(Schema schema) {
        Entity p = schema.addEntity("p4p3");
        p.addIdProperty();
        p.addIntProperty("fntr");
        p.addIntProperty("mpma");
        p.addIntProperty("dnpsa");
        p.addIntProperty("dcau");
        p.addIntProperty("sred");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p4(Schema schema) {
        Entity p = schema.addEntity("p4p4");
        p.addIdProperty();
        p.addIntProperty("fcsts");
        p.addIntProperty("dsta");
        p.addIntProperty("stds");
        p.addIntProperty("pevs");
        p.addIntProperty("sota");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p5(Schema schema) {
        Entity p = schema.addEntity("p4p5");
        p.addIdProperty();
        p.addIntProperty("nsasa");
        p.addIntProperty("avcp");
        p.addIntProperty("nsarc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p6(Schema schema) {
        Entity p = schema.addEntity("p4p6");
        p.addIdProperty();
        p.addIntProperty("nvara");
        p.addIntProperty("laba");
        p.addIntProperty("proma");
        p.addIntProperty("procr");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p7(Schema schema) {
        Entity p = schema.addEntity("p4p7");
        p.addIdProperty();
        p.addIntProperty("fnpd");
        p.addIntProperty("nsda");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p8(Schema schema) {
        Entity p = schema.addEntity("p4p8");
        p.addIdProperty();
        p.addIntProperty("fruts");
        p.addIntProperty("uts");
        p.addIntProperty("tusa");
        p.addIntProperty("dava");
        p.addIntProperty("dprp");
        p.addIntProperty("rale");
        p.addIntProperty("tarq");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear4p9(Schema schema) {
        Entity p = schema.addEntity("p4p9");
        p.addIdProperty();
        p.addIntProperty("fcpr");
        p.addIntProperty("pmas");
        p.addIntProperty("frec");
        p.addIntProperty("anar");
        p.addIntProperty("pmue");
        p.addIntProperty("amdc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    /* Principio 4 */

    /* Principio 5 */

    private static void crear5p1(Schema schema) {
        Entity p = schema.addEntity("p5p1");
        p.addIdProperty();
        p.addIntProperty("armhf");
        p.addIntProperty("polso");
        p.addIntProperty("apad");
        p.addIntProperty("psdcf");
        p.addIntProperty("div");
        p.addIntProperty("cpf");
        p.addIntProperty("dpe");
        p.addIntProperty("comu");
        p.addIntProperty("rdtya");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p2(Schema schema) {
        Entity p = schema.addEntity("p5p2");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("omcr");
        p.addIntProperty("omoc");
        p.addIntProperty("omoa");
        p.addIntProperty("niprc");
        p.addIntProperty("ndplc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p3(Schema schema) {
        Entity p = schema.addEntity("p5p3");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("seot");
        p.addIntProperty("cmod");
        p.addIntProperty("crn");
        p.addIntProperty("ndpe");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p4(Schema schema) {
        Entity p = schema.addEntity("p5p4");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("pdp");
        p.addIntProperty("oesd");
        p.addIntProperty("gpct");
        p.addIntProperty("papd");
        p.addStringProperty("nep");
        p.addIntProperty("plan");
        p.addIntProperty("ntcp");
        p.addIntProperty("dpsa");
        p.addIntProperty("smeg");
        p.addIntProperty("hret");
        p.addIntProperty("reqp");
        p.addIntProperty("fpag");
        p.addIntProperty("dlyo");
        p.addIntProperty("pbhm");
        p.addIntProperty("pbhe");
        p.addIntProperty("pagt");
        p.addIntProperty("pagn");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p5(Schema schema) {
        Entity p = schema.addEntity("p5p5");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("salj");
        p.addIntProperty("cuot");
        p.addIntProperty("piez");
        p.addIntProperty("prod");
        p.addIntProperty("sios");
        p.addIntProperty("snpc");
        p.addIntProperty("tacn");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p6(Schema schema) {
        Entity p = schema.addEntity("p5p6");
        p.addIdProperty();
        p.addIntProperty("htoc");
        p.addStringProperty("hort");
        p.addStringProperty("dtps");
        p.addStringProperty("tdvp");
        p.addIntProperty("mhne");
        p.addIntProperty("tdsd");
        p.addIntProperty("dbic");
        p.addIntProperty("vac");
        p.addIntProperty("dybc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p7(Schema schema) {
        Entity p = schema.addEntity("p5p7");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("sthe");
        p.addIntProperty("thev");
        p.addIntProperty("cppa");
        p.addIntProperty("scpy");
        p.addStringProperty("mhef");
        p.addStringProperty("hela");
        p.addIntProperty("hepa");
        p.addIntProperty("upeh");
        p.addIntProperty("ccec");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p8(Schema schema) {
        Entity p = schema.addEntity("p5p8");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("nstm");
        p.addIntProperty("nsmt");
        p.addIntProperty("rptm");
        p.addIntProperty("jorn");
        p.addIntProperty("cpdl");
        p.addIntProperty("noya");
        p.addIntProperty("fecn");
        p.addIntProperty("npor");
        p.addIntProperty("lpor");
        p.addIntProperty("tlrf");
        p.addIntProperty("nhat");
        p.addIntProperty("salr");
        p.addIntProperty("aefr");
        p.addStringProperty("hldm");
        p.addStringProperty("hlsm");
        p.addIntProperty("hnie");
        p.addIntProperty("tmnr");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p9(Schema schema) {
        Entity p = schema.addEntity("p5p9");
        p.addIdProperty();
        p.addIntProperty("lcnpm");
        p.addIntProperty("metf");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p10(Schema schema) {
        Entity p = schema.addEntity("p5p10");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("pctf");
        p.addIntProperty("esal");
        p.addIntProperty("ben");
        p.addIntProperty("cdel");
        p.addIntProperty("dtra");
        p.addIntProperty("fotl");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p11(Schema schema) {
        Entity p = schema.addEntity("p5p11");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("ftrt");
        p.addIntProperty("snat");
        p.addIntProperty("mfmt");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear5p12(Schema schema) {
        Entity p = schema.addEntity("p5p12");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("pgd");
        p.addIntProperty("numt");
        p.addIntProperty("tdol");
        p.addIntProperty("fprt");
        p.addIntProperty("ideo");
        p.addIntProperty("rel");
        p.addIntProperty("soc");
        p.addIntProperty("pol");
        p.addIntProperty("cul");
        p.addStringProperty("de");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p13(Schema schema) {
        Entity p = schema.addEntity("p5p13");
        p.addIdProperty();
        p.addIntProperty("armf");
        p.addIntProperty("ncss");
        p.addIntProperty("fitc");
        p.addIntProperty("fpt");
        p.addIntProperty("trcp");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p14(Schema schema) {
        Entity p = schema.addEntity("p5p14");
        p.addIdProperty();
        p.addIntProperty("fnav");
        p.addIntProperty("hig");
        p.addIntProperty("segh");
        p.addIntProperty("sal");
        p.addIntProperty("vfap");
        p.addIntProperty("ttar");
        p.addIntProperty("sbdn");
        p.addIntProperty("idta");
        p.addIntProperty("memc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p15(Schema schema) {
        Entity p = schema.addEntity("p5p15");
        p.addIdProperty();
        p.addIntProperty("tfap");
        p.addIntProperty("acue");
        p.addIntProperty("naci");
        p.addIntProperty("cau");
        p.addStringProperty("otro");
        p.addIntProperty("taap");
        p.addIntProperty("apcs");
        p.addIntProperty("adlt");
        p.addIntProperty("ana");
        p.addStringProperty("dfec");
        p.addIntProperty("depo");
        p.addIntProperty("hagu");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p16(Schema schema) {
        Entity p = schema.addEntity("p5p16");
        p.addIdProperty();
        p.addIntProperty("ttam");
        p.addIntProperty("tamh");
        p.addIntProperty("tame");
        p.addIntProperty("eps");
        p.addIntProperty("sisb");
        p.addIntProperty("otro");
        p.addStringProperty("cual");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p17(Schema schema) {
        Entity p = schema.addEntity("p5p17");
        p.addIdProperty();
        p.addIntProperty("fgeh");
        p.addIntProperty("htevf");
        p.addIntProperty("mgaet");
        p.addIntProperty("eapf");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");

    }
    private static void crear5p18(Schema schema) {
        Entity p = schema.addEntity("p5p18");
        p.addIdProperty();
        p.addIntProperty("fipe");
        p.addIntProperty("eper");
        p.addIntProperty("anlc");
        p.addIntProperty("iftf");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear5p19(Schema schema) {
        Entity p = schema.addEntity("p5p19");
        p.addIdProperty();
        p.addIntProperty("lnpm");
        p.addIntProperty("metc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    /* Principio 5 */

    /* Principio 6 */
    private static void crear6p1(Schema schema) {
        Entity p = schema.addEntity("p6p1");
        p.addIdProperty();
        p.addIntProperty("lfdi");
        p.addIntProperty("eupd");
        p.addIntProperty("epcc");
        p.addIntProperty("pccp");
        p.addIntProperty("nudt");
        p.addIntProperty("pccr");
        p.addIntProperty("ltpe");
        p.addIntProperty("ladr");
        p.addIntProperty("madr");
        p.addIntProperty("sena");
        p.addIntProperty("ucds");
        p.addIntProperty("peps");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p2(Schema schema) {
        Entity p = schema.addEntity("p6p2");
        p.addIdProperty();
        p.addIntProperty("lfup");
        p.addIntProperty("eupc");
        p.addIntProperty("ltcl");
        p.addIntProperty("lthr");
        p.addIntProperty("erdd");
        p.addIntProperty("lfcc");
        p.addIntProperty("ltop");
        p.addIntProperty("lmdu");
        p.addIntProperty("lafr");
        p.addIntProperty("tetr");
        p.addIntProperty("ladu");
        p.addIntProperty("obje");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p3(Schema schema) {
        Entity p = schema.addEntity("p6p3");
        p.addIdProperty();
        p.addIntProperty("nhtq");
        p.addIntProperty("sice");
        p.addIntProperty("cipp");
        p.addIntProperty("eptl");
        p.addStringProperty("fdlu");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p4(Schema schema) {
        Entity p = schema.addEntity("p6p4");
        p.addIdProperty();
        p.addIntProperty("ltqr");
        p.addIntProperty("exme");
        p.addIntProperty("anua");
        p.addStringProperty("fech");
        p.addIntProperty("srad");
        p.addIntProperty("ltta");
        p.addIntProperty("hipe");
        p.addIntProperty("siap");
        p.addIntProperty("sgta");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p5(Schema schema) {
        Entity p = schema.addEntity("p6p5");
        p.addIdProperty().autoincrement();
        p.addIntProperty("epqa");
        p.addIntProperty("epqm");
        p.addIntProperty("lass");
        p.addIntProperty("carb");
        p.addIntProperty("orga");
        p.addIntProperty("sere");
        p.addIntProperty("selr");
        p.addIntProperty("sslr");
        p.addIntProperty("etta");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p6(Schema schema) {
        Entity p = schema.addEntity("p6p6");
        p.addIdProperty();
        p.addIntProperty("tltq");
        p.addIntProperty("spal");
        p.addIntProperty("spfp");
        p.addIntProperty("scal");
        p.addIntProperty("ssed");
        p.addIntProperty("seeu");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p7(Schema schema) {
        Entity p = schema.addEntity("p6p7");
        p.addIdProperty();
        p.addIntProperty("lfdm");
        p.addIntProperty("smen");
        p.addIntProperty("mdcd");
        p.addIntProperty("sale");
        p.addIntProperty("idma");
        p.addIntProperty("scep");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    private static void crear6p8(Schema schema) {
        Entity p = schema.addEntity("p6p8");
        p.addIdProperty();
        p.addIntProperty("ltyl");
        p.addIntProperty("ligr");
        p.addIntProperty("lidp");
        p.addIntProperty("eicc");
        p.addIntProperty("edcc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p9(Schema schema) {
        Entity p = schema.addEntity("p6p9");
        p.addIdProperty();
        p.addIntProperty("lada");
        p.addIntProperty("eddl");
        p.addIntProperty("somi");
        p.addIntProperty("mean");
        p.addIntProperty("kprd");
        p.addIntProperty("tids");
        p.addIntProperty("peqr");
        p.addIntProperty("mdpd");
        p.addIntProperty("lade");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p10(Schema schema) {
        Entity p = schema.addEntity("p6p10");
        p.addIdProperty();
        p.addIntProperty("lfda");
        p.addIntProperty("eada");
        p.addIntProperty("salv");
        p.addIntProperty("suab");
        p.addIntProperty("foqu");
        p.addIntProperty("toxi");
        p.addIntProperty("lans");
        p.addIntProperty("leda");
        p.addIntProperty("srtl");
        p.addIntProperty("smlh");
        p.addIntProperty("shea");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p11(Schema schema) {
        Entity p = schema.addEntity("p6p11");
        p.addIdProperty();
        p.addIntProperty("lfdd");
        p.addIntProperty("ludl");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p12(Schema schema) {
        Entity p = schema.addEntity("p6p12");
        p.addIdProperty();
        p.addIntProperty("lfdt");
        p.addIntProperty("stmp");
        p.addIntProperty("lvqt");
        p.addIntProperty("ccpd");
        p.addIntProperty("lein");
        p.addIntProperty("lped");
        p.addIntProperty("last");
        p.addIntProperty("lemd");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p13(Schema schema) {
        Entity p = schema.addEntity("p6p13");
        p.addIdProperty();
        p.addIntProperty("tltq");
        p.addIntProperty("ltqa");
        p.addIntProperty("lfse");
        p.addIntProperty("lfie");
        p.addIntProperty("eedp");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p14(Schema schema) {
        Entity p = schema.addEntity("p6p14");
        p.addIdProperty();
        p.addIntProperty("lfde");
        p.addStringProperty("hoap");
        p.addIntProperty("semd");
        p.addStringProperty("srrd");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p15(Schema schema) {
        Entity p = schema.addEntity("p6p15");
        p.addIdProperty();
        p.addIntProperty("lfda");
        p.addIntProperty("seaa");
        p.addStringProperty("horp");
        p.addIntProperty("seap");
        p.addIntProperty("silg");
        p.addIntProperty("sccm");
        p.addIntProperty("sccr");
        p.addIntProperty("siuh");
        p.addIntProperty("ltcy");
        p.addIntProperty("ppqn");
        p.addIntProperty("csus");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p16(Schema schema) {
        Entity p = schema.addEntity("p6p16");
        p.addIdProperty();
        p.addIntProperty("elfd");
        p.addIntProperty("dcdr");
        p.addIntProperty("eaes");
        p.addIntProperty("edyv");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p17(Schema schema) {
        Entity p = schema.addEntity("p6p17");
        p.addIdProperty();
        p.addIntProperty("pnms");
        p.addIntProperty("pdms");
        p.addIntProperty("euac");
        p.addIntProperty("nepl");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p18(Schema schema) {
        Entity p = schema.addEntity("p6p18");
        p.addIdProperty();
        p.addIntProperty("altd");
        p.addIntProperty("iatd");
        p.addIntProperty("lfcc");
        p.addIntProperty("ltcl");
        p.addIntProperty("rcsa");
        p.addIntProperty("pcep");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p19(Schema schema) {
        Entity p = schema.addEntity("p6p19");
        p.addIdProperty();
        p.addIntProperty("fdcc");
        p.addIntProperty("ccen");
        p.addIntProperty("spaf");
        p.addIntProperty("eedp");
        p.addIntProperty("ccbd");
        p.addIntProperty("lava");
        p.addIntProperty("duch");
        p.addIntProperty("lvmn");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear6p20(Schema schema) {
        Entity p = schema.addEntity("p6p20");
        p.addIdProperty();
        p.addIntProperty("fdip");
        p.addIntProperty("sipd");
        p.addIntProperty("ecca");
        p.addIntProperty("mono");
        p.addIntProperty("lfbs");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    /* Principio 6 */

    /* Principio 7 */
    private static void crear7p1(Schema schema) {
        Entity p = schema.addEntity("p7p1");
        p.addIdProperty();
        p.addIntProperty("fdrl");
        p.addIntProperty("srao");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear7p2(Schema schema) {
        Entity p = schema.addEntity("p7p2");
        p.addIdProperty();
        p.addIntProperty("ladf");
        p.addIntProperty("expo");
        p.addIntProperty("expr");
        p.addIntProperty("sdlq");
        p.addIntProperty("salp");
        p.addIntProperty("shpa");
        p.addIntProperty("hpaq");
        p.addIntProperty("sipy");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear7p3(Schema schema) {
        Entity p = schema.addEntity("p7p3");
        p.addIdProperty();
        p.addIntProperty("pypp");
        p.addIntProperty("ccpp");
        p.addIntProperty("sccp");
        p.addIntProperty("lfcp");
        p.addIntProperty("lfas");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear7p4(Schema schema) {
        Entity p = schema.addEntity("p7p4");
        p.addIdProperty();
        p.addIntProperty("lfdc");
        p.addIntProperty("lfpe");
        p.addIntProperty("lfcd");
        p.addIntProperty("lfau");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear7p5(Schema schema) {
        Entity p = schema.addEntity("p7p5");
        p.addIdProperty();
        p.addIntProperty("lfdc");
        p.addIntProperty("lfce");
        p.addIntProperty("lfac");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear7p6(Schema schema) {
        Entity p = schema.addEntity("p7p6");
        p.addIdProperty();
        p.addIntProperty("fdtl");
        p.addIntProperty("sdec");
        p.addIntProperty("clyt");
        p.addIntProperty("adds");
        p.addIntProperty("ddpb");
        p.addIntProperty("escr");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    /* Principio 7 */

    /* Principio 8 */
    private static void crear8p1(Schema schema) {
        Entity p = schema.addEntity("p8p1");
        p.addIdProperty();
        p.addIntProperty("lfde");
        p.addIntProperty("lfeu");
        p.addIntProperty("epia");
        p.addIntProperty("pcem");
        p.addIntProperty("pcei");
        p.addIntProperty("reid");
        p.addIntProperty("feas");
        p.addIntProperty("dura");
        p.addIntProperty("exte");
        p.addIntProperty("dano");
        p.addIntProperty("udli");
        p.addIntProperty("cedl");
        p.addIntProperty("tipl");
        p.addIntProperty("coes");
        p.addIntProperty("faam");
        p.addIntProperty("mdce");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p2(Schema schema) {
        Entity p = schema.addEntity("p8p2");
        p.addIdProperty();
        p.addIntProperty("lfdd");
        p.addIntProperty("rcdu");
        p.addIntProperty("lfrr");
        p.addIntProperty("lfre");
        p.addIntProperty("ccui");
        p.addIntProperty("noco");
        p.addIntProperty("noge");
        p.addIntProperty("lafe");
        p.addIntProperty("caco");
        p.addIntProperty("prap");
        p.addIntProperty("tdad");
        p.addIntProperty("feda");
        p.addIntProperty("dosi");
        p.addIntProperty("vtdp");
        p.addIntProperty("ndlp");
        p.addIntProperty("ndqa");
        p.addIntProperty("ndqr");
        p.addIntProperty("ided");
        p.addIntProperty("lfme");
        p.addIntProperty("srya");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p3(Schema schema) {
        Entity p = schema.addEntity("p8p3");
        p.addIdProperty();
        p.addIntProperty("lfdi");
        p.addIntProperty("silp");
        p.addIntProperty("ccen");
        p.addIntProperty("ceen");
        p.addIntProperty("enep");
        p.addIntProperty("lfda");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p4(Schema schema) {
        Entity p = schema.addEntity("p8p4");
        p.addIdProperty();
        p.addIntProperty("nspe");
        p.addIntProperty("lfnu");
        p.addIntProperty("fnus");
        p.addIntProperty("uape");
        p.addIntProperty("uspp");
        p.addIntProperty("dlds");
        p.addIntProperty("uadc");
        p.addIntProperty("sqnp");
        p.addIntProperty("nsbu");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p5(Schema schema) {
        Entity p = schema.addEntity("p8p5");
        p.addIdProperty();
        p.addIntProperty("deup");
        p.addIntProperty("eupp");
        p.addIntProperty("pprl");
        p.addIntProperty("seep");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p6(Schema schema) {
        Entity p = schema.addEntity("p8p6");
        p.addIdProperty();
        p.addIntProperty("dtmp");
        p.addIntProperty("seic");
        p.addIntProperty("nshi");
        p.addIntProperty("sdye");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p7(Schema schema) {
        Entity p = schema.addEntity("p8p7");
        p.addIdProperty();
        p.addIntProperty("fdus");
        p.addIntProperty("fusm");
        p.addIntProperty("fccr");
        p.addIntProperty("iadp");
        p.addIntProperty("nold");
        p.addIntProperty("ndlp");
        p.addIntProperty("dosi");
        p.addIntProperty("dlpq");
        p.addIntProperty("pqal");
        p.addIntProperty("fcda");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p8(Schema schema) {
        Entity p = schema.addEntity("p8p8");
        p.addIdProperty();
        p.addIntProperty("nslp");
        p.addIntProperty("udfp");
        p.addIntProperty("selp");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear8p9(Schema schema) {
        Entity p = schema.addEntity("p8p9");
        p.addIdProperty();
        p.addIntProperty("sspu");
        p.addIntProperty("eeud");
        p.addIntProperty("eudf");
        p.addIntProperty("fsub");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    /* Principio 8 */


    /* Principio 9 */
    private static void crear9p1(Schema schema) {
        Entity p = schema.addEntity("p9p1");
        p.addIdProperty();
        p.addIntProperty("fepce");
        p.addIntProperty("fcpce");
        p.addIntProperty("epes");
        p.addIntProperty("ifas");
        p.addIntProperty("uecv");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear9p2(Schema schema) {
        Entity p = schema.addEntity("p9p2");
        p.addIdProperty();
        p.addIntProperty("fpfs");
        p.addIntProperty("epfs");
        p.addIntProperty("cyps");
        p.addIntProperty("aps");
        p.addIntProperty("apc");
        p.addIntProperty("mues");
        p.addIntProperty("tap");
        p.addIntProperty("tds");
        p.addIntProperty("raa");
        p.addIntProperty("zon");
        p.addIntProperty("dfin");
        p.addStringProperty("dfec");
        p.addIntProperty("casp");
        p.addIntProperty("afoi");
        p.addIntProperty("rect");
        p.addIntProperty("ureo");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear9p3(Schema schema) {
        Entity p = schema.addEntity("p9p3");
        p.addIdProperty();
        p.addIntProperty("fdec");
        p.addIntProperty("fuev");
        p.addIntProperty("fcec");
        p.addIntProperty("acae");
        p.addIntProperty("adec");
        p.addIntProperty("croa");
        p.addIntProperty("mach");
        p.addIntProperty("guad");
        p.addIntProperty("herb");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear9p4(Schema schema) {
        Entity p = schema.addEntity("p9p4");
        p.addIdProperty();
        p.addIntProperty("fpad");
        p.addIntProperty("vegn");
        p.addIntProperty("vegs");
        p.addIntProperty("prad");
        p.addIntProperty("tid");
        p.addIntProperty("mede");
        p.addIntProperty("enc");
        p.addIntProperty("map");
        p.addIntProperty("qprt");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear9p5(Schema schema) {
        Entity p = schema.addEntity("p9p5");
        p.addIdProperty();
        p.addIntProperty("nsna");
        p.addIntProperty("clim");
        p.addIntProperty("top");
        p.addIntProperty("suel");
        p.addIntProperty("ecyu");
        p.addIntProperty("tbn");
        p.addIntProperty("qpna");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    /* Principio 9 */

    /* Principio 10 */
    private static void crear10p1(Schema schema) {
        Entity p = schema.addEntity("p10p1");
        p.addIdProperty();
        p.addIntProperty("ftpd");
        p.addIntProperty("fcpd");
        p.addIntProperty("frin");
        p.addIntProperty("frd");
        p.addIntProperty("iftd");
        p.addIntProperty("comp");
        p.addIntProperty("ecg");
        p.addIntProperty("amda");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear10p2(Schema schema) {
        Entity p = schema.addEntity("p10p2");
        p.addIdProperty();
        p.addIntProperty("npbca");
        p.addIntProperty("nibf");
        p.addIntProperty("nqbf");
        p.addIntProperty("fqib");
        p.addIntProperty("idet");
        p.addIntProperty("plci");
        p.addIntProperty("poper");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear10p3(Schema schema) {
        Entity p = schema.addEntity("p10p3");
        p.addIdProperty();
        p.addIntProperty("dfdr");
        p.addIntProperty("dfrc");
        p.addIntProperty("vivi");
        p.addIntProperty("fuag");
        p.addIntProperty("arec");
        p.addIntProperty("cauc");
        p.addIntProperty("oada");
        p.addIntProperty("comp");
        p.addIntProperty("mdli");
        p.addStringProperty("uldf");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear10p4(Schema schema) {
        Entity p = schema.addEntity("p10p4");
        p.addIdProperty();
        p.addIntProperty("fnedt");
        p.addIntProperty("ebat");
        p.addStringProperty("eda");
        p.addStringProperty("ebea");
        p.addIntProperty("qrdc");
        p.addIntProperty("lsh");
        p.addIntProperty("amb");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear10p5(Schema schema) {
        Entity p = schema.addEntity("p10p5");
        p.addIdProperty();
        p.addIntProperty("flsd");
        p.addIntProperty("fel");
        p.addIntProperty("fip");
        p.addIntProperty("rapa");
        p.addIntProperty("dble");
        p.addIntProperty("rpc");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }

    private static void crear10p6(Schema schema) {
        Entity p = schema.addEntity("p10p6");
        p.addIdProperty();
        p.addIntProperty("fiprg");
        p.addIntProperty("iprg");
        p.addIntProperty("ipcd");
        p.addIntProperty("cobs");
        p.addIntProperty("sia");
        p.addIntProperty("mac");
        p.addIntProperty("maf");
        p.addIntProperty("uee");
        p.addIntProperty("mir");
        p.addIntProperty("utl");
        p.addIntProperty("mpps");
        p.addIntProperty("pirg");
        p.addIntProperty("mpta");
        p.addIntProperty("origen");
        p.addStringProperty("obser");
        p.addIntProperty("id_formulario");
    }
    /* Principio 10 */





}