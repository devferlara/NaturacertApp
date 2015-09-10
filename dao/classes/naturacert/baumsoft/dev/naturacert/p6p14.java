package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P6P14.
 */
public class p6p14 {

    private Long id;
    private Integer lfde;
    private String hoap;
    private Integer semd;
    private String srrd;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p6p14() {
    }

    public p6p14(Long id) {
        this.id = id;
    }

    public p6p14(Long id, Integer lfde, String hoap, Integer semd, String srrd, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.lfde = lfde;
        this.hoap = hoap;
        this.semd = semd;
        this.srrd = srrd;
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

    public Integer getLfde() {
        return lfde;
    }

    public void setLfde(Integer lfde) {
        this.lfde = lfde;
    }

    public String getHoap() {
        return hoap;
    }

    public void setHoap(String hoap) {
        this.hoap = hoap;
    }

    public Integer getSemd() {
        return semd;
    }

    public void setSemd(Integer semd) {
        this.semd = semd;
    }

    public String getSrrd() {
        return srrd;
    }

    public void setSrrd(String srrd) {
        this.srrd = srrd;
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
