package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table G3P1.
 */
public class g3p1 {

    private Long id;
    private Integer eadg;
    private Integer orga;
    private Integer rcyc;
    private Integer ppid;
    private Integer rdmr;
    private Integer ppii;
    private Integer ppdy;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public g3p1() {
    }

    public g3p1(Long id) {
        this.id = id;
    }

    public g3p1(Long id, Integer eadg, Integer orga, Integer rcyc, Integer ppid, Integer rdmr, Integer ppii, Integer ppdy, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.eadg = eadg;
        this.orga = orga;
        this.rcyc = rcyc;
        this.ppid = ppid;
        this.rdmr = rdmr;
        this.ppii = ppii;
        this.ppdy = ppdy;
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

    public Integer getEadg() {
        return eadg;
    }

    public void setEadg(Integer eadg) {
        this.eadg = eadg;
    }

    public Integer getOrga() {
        return orga;
    }

    public void setOrga(Integer orga) {
        this.orga = orga;
    }

    public Integer getRcyc() {
        return rcyc;
    }

    public void setRcyc(Integer rcyc) {
        this.rcyc = rcyc;
    }

    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public Integer getRdmr() {
        return rdmr;
    }

    public void setRdmr(Integer rdmr) {
        this.rdmr = rdmr;
    }

    public Integer getPpii() {
        return ppii;
    }

    public void setPpii(Integer ppii) {
        this.ppii = ppii;
    }

    public Integer getPpdy() {
        return ppdy;
    }

    public void setPpdy(Integer ppdy) {
        this.ppdy = ppdy;
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
