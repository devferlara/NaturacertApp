package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P2P2.
 */
public class p2p2 {

    private Long id;
    private Integer fndsn;
    private Integer eav;
    private Integer nede;
    private Integer ndedc;
    private Integer nden;
    private Integer ades;
    private Integer pmit;
    private Integer ipla;
    private Integer origen;
    private Integer id_formulario;
    private String observaciones;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p2p2() {
    }

    public p2p2(Long id) {
        this.id = id;
    }

    public p2p2(Long id, Integer fndsn, Integer eav, Integer nede, Integer ndedc, Integer nden, Integer ades, Integer pmit, Integer ipla, Integer origen, Integer id_formulario, String observaciones) {
        this.id = id;
        this.fndsn = fndsn;
        this.eav = eav;
        this.nede = nede;
        this.ndedc = ndedc;
        this.nden = nden;
        this.ades = ades;
        this.pmit = pmit;
        this.ipla = ipla;
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

    public Integer getFndsn() {
        return fndsn;
    }

    public void setFndsn(Integer fndsn) {
        this.fndsn = fndsn;
    }

    public Integer getEav() {
        return eav;
    }

    public void setEav(Integer eav) {
        this.eav = eav;
    }

    public Integer getNede() {
        return nede;
    }

    public void setNede(Integer nede) {
        this.nede = nede;
    }

    public Integer getNdedc() {
        return ndedc;
    }

    public void setNdedc(Integer ndedc) {
        this.ndedc = ndedc;
    }

    public Integer getNden() {
        return nden;
    }

    public void setNden(Integer nden) {
        this.nden = nden;
    }

    public Integer getAdes() {
        return ades;
    }

    public void setAdes(Integer ades) {
        this.ades = ades;
    }

    public Integer getPmit() {
        return pmit;
    }

    public void setPmit(Integer pmit) {
        this.pmit = pmit;
    }

    public Integer getIpla() {
        return ipla;
    }

    public void setIpla(Integer ipla) {
        this.ipla = ipla;
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
