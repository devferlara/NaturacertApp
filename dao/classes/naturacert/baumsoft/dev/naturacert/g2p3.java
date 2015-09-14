package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table G2P3.
 */
public class g2p3 {

    private Long id;
    private Integer egdt;
    private Integer proc;
    private Integer lmdg;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public g2p3() {
    }

    public g2p3(Long id) {
        this.id = id;
    }

    public g2p3(Long id, Integer egdt, Integer proc, Integer lmdg, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.egdt = egdt;
        this.proc = proc;
        this.lmdg = lmdg;
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

    public Integer getEgdt() {
        return egdt;
    }

    public void setEgdt(Integer egdt) {
        this.egdt = egdt;
    }

    public Integer getProc() {
        return proc;
    }

    public void setProc(Integer proc) {
        this.proc = proc;
    }

    public Integer getLmdg() {
        return lmdg;
    }

    public void setLmdg(Integer lmdg) {
        this.lmdg = lmdg;
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
