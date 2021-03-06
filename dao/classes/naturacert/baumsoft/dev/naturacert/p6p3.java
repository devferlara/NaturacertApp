package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P6P3.
 */
public class p6p3 {

    private Long id;
    private Integer nhtq;
    private Integer sice;
    private Integer cipp;
    private Integer eptl;
    private String fdlu;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p6p3() {
    }

    public p6p3(Long id) {
        this.id = id;
    }

    public p6p3(Long id, Integer nhtq, Integer sice, Integer cipp, Integer eptl, String fdlu, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.nhtq = nhtq;
        this.sice = sice;
        this.cipp = cipp;
        this.eptl = eptl;
        this.fdlu = fdlu;
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

    public Integer getNhtq() {
        return nhtq;
    }

    public void setNhtq(Integer nhtq) {
        this.nhtq = nhtq;
    }

    public Integer getSice() {
        return sice;
    }

    public void setSice(Integer sice) {
        this.sice = sice;
    }

    public Integer getCipp() {
        return cipp;
    }

    public void setCipp(Integer cipp) {
        this.cipp = cipp;
    }

    public Integer getEptl() {
        return eptl;
    }

    public void setEptl(Integer eptl) {
        this.eptl = eptl;
    }

    public String getFdlu() {
        return fdlu;
    }

    public void setFdlu(String fdlu) {
        this.fdlu = fdlu;
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
