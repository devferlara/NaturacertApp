package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P6P12.
 */
public class p6p12 {

    private Long id;
    private Integer lfdt;
    private Integer stmp;
    private Integer lvqt;
    private Integer ccpd;
    private Integer lein;
    private Integer lped;
    private Integer last;
    private Integer lemd;
    private Integer origen;
    private Integer id_formulario;
    private String observaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p6p12() {
    }

    public p6p12(Long id) {
        this.id = id;
    }

    public p6p12(Long id, Integer lfdt, Integer stmp, Integer lvqt, Integer ccpd, Integer lein, Integer lped, Integer last, Integer lemd, Integer origen, Integer id_formulario, String observaciones) {
        this.id = id;
        this.lfdt = lfdt;
        this.stmp = stmp;
        this.lvqt = lvqt;
        this.ccpd = ccpd;
        this.lein = lein;
        this.lped = lped;
        this.last = last;
        this.lemd = lemd;
        this.origen = origen;
        this.id_formulario = id_formulario;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLfdt() {
        return lfdt;
    }

    public void setLfdt(Integer lfdt) {
        this.lfdt = lfdt;
    }

    public Integer getStmp() {
        return stmp;
    }

    public void setStmp(Integer stmp) {
        this.stmp = stmp;
    }

    public Integer getLvqt() {
        return lvqt;
    }

    public void setLvqt(Integer lvqt) {
        this.lvqt = lvqt;
    }

    public Integer getCcpd() {
        return ccpd;
    }

    public void setCcpd(Integer ccpd) {
        this.ccpd = ccpd;
    }

    public Integer getLein() {
        return lein;
    }

    public void setLein(Integer lein) {
        this.lein = lein;
    }

    public Integer getLped() {
        return lped;
    }

    public void setLped(Integer lped) {
        this.lped = lped;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Integer getLemd() {
        return lemd;
    }

    public void setLemd(Integer lemd) {
        this.lemd = lemd;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public Integer getId_formulario() {
        return id_formulario;
    }

    public void setId_formulario(Integer id_formulario) {
        this.id_formulario = id_formulario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
