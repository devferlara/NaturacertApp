package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P5P19.
 */
public class p5p19 {

    private Long id;
    private Integer lnpm;
    private Integer metc;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p5p19() {
    }

    public p5p19(Long id) {
        this.id = id;
    }

    public p5p19(Long id, Integer lnpm, Integer metc, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.lnpm = lnpm;
        this.metc = metc;
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

    public Integer getLnpm() {
        return lnpm;
    }

    public void setLnpm(Integer lnpm) {
        this.lnpm = lnpm;
    }

    public Integer getMetc() {
        return metc;
    }

    public void setMetc(Integer metc) {
        this.metc = metc;
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
