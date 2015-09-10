package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P4P6.
 */
public class p4p6 {

    private Long id;
    private Integer nvara;
    private Integer laba;
    private Integer proma;
    private Integer procr;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p4p6() {
    }

    public p4p6(Long id) {
        this.id = id;
    }

    public p4p6(Long id, Integer nvara, Integer laba, Integer proma, Integer procr, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.nvara = nvara;
        this.laba = laba;
        this.proma = proma;
        this.procr = procr;
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

    public Integer getNvara() {
        return nvara;
    }

    public void setNvara(Integer nvara) {
        this.nvara = nvara;
    }

    public Integer getLaba() {
        return laba;
    }

    public void setLaba(Integer laba) {
        this.laba = laba;
    }

    public Integer getProma() {
        return proma;
    }

    public void setProma(Integer proma) {
        this.proma = proma;
    }

    public Integer getProcr() {
        return procr;
    }

    public void setProcr(Integer procr) {
        this.procr = procr;
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
