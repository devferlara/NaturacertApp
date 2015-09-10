package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P3P6.
 */
public class p3p6 {

    private Long id;
    private Integer nish;
    private Integer cpl;
    private Integer cap;
    private Integer nvsf;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p3p6() {
    }

    public p3p6(Long id) {
        this.id = id;
    }

    public p3p6(Long id, Integer nish, Integer cpl, Integer cap, Integer nvsf, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.nish = nish;
        this.cpl = cpl;
        this.cap = cap;
        this.nvsf = nvsf;
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

    public Integer getNish() {
        return nish;
    }

    public void setNish(Integer nish) {
        this.nish = nish;
    }

    public Integer getCpl() {
        return cpl;
    }

    public void setCpl(Integer cpl) {
        this.cpl = cpl;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public Integer getNvsf() {
        return nvsf;
    }

    public void setNvsf(Integer nvsf) {
        this.nvsf = nvsf;
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
