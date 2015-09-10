package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P7P5.
 */
public class p7p5 {

    private Long id;
    private Integer lfdc;
    private Integer lfce;
    private Integer lfac;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p7p5() {
    }

    public p7p5(Long id) {
        this.id = id;
    }

    public p7p5(Long id, Integer lfdc, Integer lfce, Integer lfac, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.lfdc = lfdc;
        this.lfce = lfce;
        this.lfac = lfac;
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

    public Integer getLfdc() {
        return lfdc;
    }

    public void setLfdc(Integer lfdc) {
        this.lfdc = lfdc;
    }

    public Integer getLfce() {
        return lfce;
    }

    public void setLfce(Integer lfce) {
        this.lfce = lfce;
    }

    public Integer getLfac() {
        return lfac;
    }

    public void setLfac(Integer lfac) {
        this.lfac = lfac;
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
