package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P2P5.
 */
public class p2p5 {

    private Long id;
    private Integer nent;
    private Integer dcpos;
    private Integer dsp;
    private Integer osv;
    private Integer sepyn;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p2p5() {
    }

    public p2p5(Long id) {
        this.id = id;
    }

    public p2p5(Long id, Integer nent, Integer dcpos, Integer dsp, Integer osv, Integer sepyn, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.nent = nent;
        this.dcpos = dcpos;
        this.dsp = dsp;
        this.osv = osv;
        this.sepyn = sepyn;
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

    public Integer getNent() {
        return nent;
    }

    public void setNent(Integer nent) {
        this.nent = nent;
    }

    public Integer getDcpos() {
        return dcpos;
    }

    public void setDcpos(Integer dcpos) {
        this.dcpos = dcpos;
    }

    public Integer getDsp() {
        return dsp;
    }

    public void setDsp(Integer dsp) {
        this.dsp = dsp;
    }

    public Integer getOsv() {
        return osv;
    }

    public void setOsv(Integer osv) {
        this.osv = osv;
    }

    public Integer getSepyn() {
        return sepyn;
    }

    public void setSepyn(Integer sepyn) {
        this.sepyn = sepyn;
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
