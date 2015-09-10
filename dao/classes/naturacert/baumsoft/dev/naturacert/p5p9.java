package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P5P9.
 */
public class p5p9 {

    private Long id;
    private Integer lcnpm;
    private Integer metf;
    private Integer origen;
    private Integer id_formulario;
    private String observaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p5p9() {
    }

    public p5p9(Long id) {
        this.id = id;
    }

    public p5p9(Long id, Integer lcnpm, Integer metf, Integer origen, Integer id_formulario, String observaciones) {
        this.id = id;
        this.lcnpm = lcnpm;
        this.metf = metf;
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

    public Integer getLcnpm() {
        return lcnpm;
    }

    public void setLcnpm(Integer lcnpm) {
        this.lcnpm = lcnpm;
    }

    public Integer getMetf() {
        return metf;
    }

    public void setMetf(Integer metf) {
        this.metf = metf;
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
