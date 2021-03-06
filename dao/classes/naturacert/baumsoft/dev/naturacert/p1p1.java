package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P1P1.
 */
public class p1p1 {

    private Long id;
    private Integer sgsate;
    private Integer sgsa;
    private Integer politicas;
    private Integer programas;
    private Integer procedimientos;
    private Integer sociales;
    private Integer laborales;
    private Integer ambientales;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p1p1() {
    }

    public p1p1(Long id) {
        this.id = id;
    }

    public p1p1(Long id, Integer sgsate, Integer sgsa, Integer politicas, Integer programas, Integer procedimientos, Integer sociales, Integer laborales, Integer ambientales, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.sgsate = sgsate;
        this.sgsa = sgsa;
        this.politicas = politicas;
        this.programas = programas;
        this.procedimientos = procedimientos;
        this.sociales = sociales;
        this.laborales = laborales;
        this.ambientales = ambientales;
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

    public Integer getSgsate() {
        return sgsate;
    }

    public void setSgsate(Integer sgsate) {
        this.sgsate = sgsate;
    }

    public Integer getSgsa() {
        return sgsa;
    }

    public void setSgsa(Integer sgsa) {
        this.sgsa = sgsa;
    }

    public Integer getPoliticas() {
        return politicas;
    }

    public void setPoliticas(Integer politicas) {
        this.politicas = politicas;
    }

    public Integer getProgramas() {
        return programas;
    }

    public void setProgramas(Integer programas) {
        this.programas = programas;
    }

    public Integer getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(Integer procedimientos) {
        this.procedimientos = procedimientos;
    }

    public Integer getSociales() {
        return sociales;
    }

    public void setSociales(Integer sociales) {
        this.sociales = sociales;
    }

    public Integer getLaborales() {
        return laborales;
    }

    public void setLaborales(Integer laborales) {
        this.laborales = laborales;
    }

    public Integer getAmbientales() {
        return ambientales;
    }

    public void setAmbientales(Integer ambientales) {
        this.ambientales = ambientales;
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
