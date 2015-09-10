package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P3P5.
 */
public class p3p5 {

    private Long id;
    private Integer nezc;
    private Integer capr;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p3p5() {
    }

    public p3p5(Long id) {
        this.id = id;
    }

    public p3p5(Long id, Integer nezc, Integer capr, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.nezc = nezc;
        this.capr = capr;
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

    public Integer getNezc() {
        return nezc;
    }

    public void setNezc(Integer nezc) {
        this.nezc = nezc;
    }

    public Integer getCapr() {
        return capr;
    }

    public void setCapr(Integer capr) {
        this.capr = capr;
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
