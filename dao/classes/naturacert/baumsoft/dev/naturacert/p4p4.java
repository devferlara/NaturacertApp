package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P4P4.
 */
public class p4p4 {

    private Long id;
    private Integer fcsts;
    private Integer dsta;
    private Integer stds;
    private Integer pevs;
    private Integer sota;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p4p4() {
    }

    public p4p4(Long id) {
        this.id = id;
    }

    public p4p4(Long id, Integer fcsts, Integer dsta, Integer stds, Integer pevs, Integer sota, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.fcsts = fcsts;
        this.dsta = dsta;
        this.stds = stds;
        this.pevs = pevs;
        this.sota = sota;
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

    public Integer getFcsts() {
        return fcsts;
    }

    public void setFcsts(Integer fcsts) {
        this.fcsts = fcsts;
    }

    public Integer getDsta() {
        return dsta;
    }

    public void setDsta(Integer dsta) {
        this.dsta = dsta;
    }

    public Integer getStds() {
        return stds;
    }

    public void setStds(Integer stds) {
        this.stds = stds;
    }

    public Integer getPevs() {
        return pevs;
    }

    public void setPevs(Integer pevs) {
        this.pevs = pevs;
    }

    public Integer getSota() {
        return sota;
    }

    public void setSota(Integer sota) {
        this.sota = sota;
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
