package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P6P18.
 */
public class p6p18 {

    private Long id;
    private Integer altd;
    private Integer iatd;
    private Integer lfcc;
    private Integer ltcl;
    private Integer rcsa;
    private Integer pcep;
    private Integer origen;
    private Integer id_formulario;
    private String observaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p6p18() {
    }

    public p6p18(Long id) {
        this.id = id;
    }

    public p6p18(Long id, Integer altd, Integer iatd, Integer lfcc, Integer ltcl, Integer rcsa, Integer pcep, Integer origen, Integer id_formulario, String observaciones) {
        this.id = id;
        this.altd = altd;
        this.iatd = iatd;
        this.lfcc = lfcc;
        this.ltcl = ltcl;
        this.rcsa = rcsa;
        this.pcep = pcep;
        this.origen = origen;
        this.id_formulario = id_formulario;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAltd() {
        return altd;
    }

    public void setAltd(Integer altd) {
        this.altd = altd;
    }

    public Integer getIatd() {
        return iatd;
    }

    public void setIatd(Integer iatd) {
        this.iatd = iatd;
    }

    public Integer getLfcc() {
        return lfcc;
    }

    public void setLfcc(Integer lfcc) {
        this.lfcc = lfcc;
    }

    public Integer getLtcl() {
        return ltcl;
    }

    public void setLtcl(Integer ltcl) {
        this.ltcl = ltcl;
    }

    public Integer getRcsa() {
        return rcsa;
    }

    public void setRcsa(Integer rcsa) {
        this.rcsa = rcsa;
    }

    public Integer getPcep() {
        return pcep;
    }

    public void setPcep(Integer pcep) {
        this.pcep = pcep;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public Integer getId_formulario() {
        return id_formulario;
    }

    public void setId_formulario(Integer id_formulario) {
        this.id_formulario = id_formulario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
