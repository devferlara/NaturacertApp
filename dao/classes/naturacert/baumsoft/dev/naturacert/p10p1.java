package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P10P1.
 */
public class p10p1 {

    private Long id;
    private Integer ftpd;
    private Integer fcpd;
    private Integer frin;
    private Integer frd;
    private Integer iftd;
    private Integer comp;
    private Integer ecg;
    private Integer amda;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p10p1() {
    }

    public p10p1(Long id) {
        this.id = id;
    }

    public p10p1(Long id, Integer ftpd, Integer fcpd, Integer frin, Integer frd, Integer iftd, Integer comp, Integer ecg, Integer amda, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.ftpd = ftpd;
        this.fcpd = fcpd;
        this.frin = frin;
        this.frd = frd;
        this.iftd = iftd;
        this.comp = comp;
        this.ecg = ecg;
        this.amda = amda;
        this.origen = origen;
        this.obser = obser;
        this.id_formulario = id_formulario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFtpd() {
        return ftpd;
    }

    public void setFtpd(Integer ftpd) {
        this.ftpd = ftpd;
    }

    public Integer getFcpd() {
        return fcpd;
    }

    public void setFcpd(Integer fcpd) {
        this.fcpd = fcpd;
    }

    public Integer getFrin() {
        return frin;
    }

    public void setFrin(Integer frin) {
        this.frin = frin;
    }

    public Integer getFrd() {
        return frd;
    }

    public void setFrd(Integer frd) {
        this.frd = frd;
    }

    public Integer getIftd() {
        return iftd;
    }

    public void setIftd(Integer iftd) {
        this.iftd = iftd;
    }

    public Integer getComp() {
        return comp;
    }

    public void setComp(Integer comp) {
        this.comp = comp;
    }

    public Integer getEcg() {
        return ecg;
    }

    public void setEcg(Integer ecg) {
        this.ecg = ecg;
    }

    public Integer getAmda() {
        return amda;
    }

    public void setAmda(Integer amda) {
        this.amda = amda;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    public Integer getId_formulario() {
        return id_formulario;
    }

    public void setId_formulario(Integer id_formulario) {
        this.id_formulario = id_formulario;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
