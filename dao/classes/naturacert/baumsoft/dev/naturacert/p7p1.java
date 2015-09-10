package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P7P1.
 */
public class p7p1 {

    private Long id;
    private Integer fdrl;
    private Integer srao;
    private Integer origen;
    private Integer id_formulario;
    private String observaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p7p1() {
    }

    public p7p1(Long id) {
        this.id = id;
    }

    public p7p1(Long id, Integer fdrl, Integer srao, Integer origen, Integer id_formulario, String observaciones) {
        this.id = id;
        this.fdrl = fdrl;
        this.srao = srao;
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

    public Integer getFdrl() {
        return fdrl;
    }

    public void setFdrl(Integer fdrl) {
        this.fdrl = fdrl;
    }

    public Integer getSrao() {
        return srao;
    }

    public void setSrao(Integer srao) {
        this.srao = srao;
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
