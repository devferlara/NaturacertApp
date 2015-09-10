package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P8P8.
 */
public class p8p8 {

    private Long id;
    private Integer nslp;
    private Integer udfp;
    private Integer selp;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p8p8() {
    }

    public p8p8(Long id) {
        this.id = id;
    }

    public p8p8(Long id, Integer nslp, Integer udfp, Integer selp, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.nslp = nslp;
        this.udfp = udfp;
        this.selp = selp;
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

    public Integer getNslp() {
        return nslp;
    }

    public void setNslp(Integer nslp) {
        this.nslp = nslp;
    }

    public Integer getUdfp() {
        return udfp;
    }

    public void setUdfp(Integer udfp) {
        this.udfp = udfp;
    }

    public Integer getSelp() {
        return selp;
    }

    public void setSelp(Integer selp) {
        this.selp = selp;
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
