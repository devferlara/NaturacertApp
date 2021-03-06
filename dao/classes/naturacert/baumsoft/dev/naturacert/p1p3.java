package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P1P3.
 */
public class p1p3 {

    private Long id;
    private Integer dfdc;
    private Integer cyasp;
    private Integer adc;
    private Integer aer;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p1p3() {
    }

    public p1p3(Long id) {
        this.id = id;
    }

    public p1p3(Long id, Integer dfdc, Integer cyasp, Integer adc, Integer aer, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.dfdc = dfdc;
        this.cyasp = cyasp;
        this.adc = adc;
        this.aer = aer;
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

    public Integer getDfdc() {
        return dfdc;
    }

    public void setDfdc(Integer dfdc) {
        this.dfdc = dfdc;
    }

    public Integer getCyasp() {
        return cyasp;
    }

    public void setCyasp(Integer cyasp) {
        this.cyasp = cyasp;
    }

    public Integer getAdc() {
        return adc;
    }

    public void setAdc(Integer adc) {
        this.adc = adc;
    }

    public Integer getAer() {
        return aer;
    }

    public void setAer(Integer aer) {
        this.aer = aer;
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
