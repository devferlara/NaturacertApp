package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P3P2.
 */
public class p3p2 {

    private Long id;
    private Integer niea;
    private Integer ieap;
    private Integer rhvs;
    private Integer phf;
    private Integer pep;
    private Integer origen;
    private Integer id_formulario;
    private String observaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p3p2() {
    }

    public p3p2(Long id) {
        this.id = id;
    }

    public p3p2(Long id, Integer niea, Integer ieap, Integer rhvs, Integer phf, Integer pep, Integer origen, Integer id_formulario, String observaciones) {
        this.id = id;
        this.niea = niea;
        this.ieap = ieap;
        this.rhvs = rhvs;
        this.phf = phf;
        this.pep = pep;
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

    public Integer getNiea() {
        return niea;
    }

    public void setNiea(Integer niea) {
        this.niea = niea;
    }

    public Integer getIeap() {
        return ieap;
    }

    public void setIeap(Integer ieap) {
        this.ieap = ieap;
    }

    public Integer getRhvs() {
        return rhvs;
    }

    public void setRhvs(Integer rhvs) {
        this.rhvs = rhvs;
    }

    public Integer getPhf() {
        return phf;
    }

    public void setPhf(Integer phf) {
        this.phf = phf;
    }

    public Integer getPep() {
        return pep;
    }

    public void setPep(Integer pep) {
        this.pep = pep;
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
