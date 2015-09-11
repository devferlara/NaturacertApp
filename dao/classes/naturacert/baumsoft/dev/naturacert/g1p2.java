package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table G1P2.
 */
public class g1p2 {

    private Long id;
    private Integer eadg;
    private String fech;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public g1p2() {
    }

    public g1p2(Long id) {
        this.id = id;
    }

    public g1p2(Long id, Integer eadg, String fech, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.eadg = eadg;
        this.fech = fech;
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

    public Integer getEadg() {
        return eadg;
    }

    public void setEadg(Integer eadg) {
        this.eadg = eadg;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
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
