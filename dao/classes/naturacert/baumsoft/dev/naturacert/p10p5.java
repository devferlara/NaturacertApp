package naturacert.baumsoft.dev.naturacert;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table P10P5.
 */
public class p10p5 {

    private Long id;
    private Integer flsd;
    private Integer fel;
    private Integer fip;
    private Integer rapa;
    private Integer dble;
    private Integer rpc;
    private Integer origen;
    private String obser;
    private Integer id_formulario;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public p10p5() {
    }

    public p10p5(Long id) {
        this.id = id;
    }

    public p10p5(Long id, Integer flsd, Integer fel, Integer fip, Integer rapa, Integer dble, Integer rpc, Integer origen, String obser, Integer id_formulario) {
        this.id = id;
        this.flsd = flsd;
        this.fel = fel;
        this.fip = fip;
        this.rapa = rapa;
        this.dble = dble;
        this.rpc = rpc;
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

    public Integer getFlsd() {
        return flsd;
    }

    public void setFlsd(Integer flsd) {
        this.flsd = flsd;
    }

    public Integer getFel() {
        return fel;
    }

    public void setFel(Integer fel) {
        this.fel = fel;
    }

    public Integer getFip() {
        return fip;
    }

    public void setFip(Integer fip) {
        this.fip = fip;
    }

    public Integer getRapa() {
        return rapa;
    }

    public void setRapa(Integer rapa) {
        this.rapa = rapa;
    }

    public Integer getDble() {
        return dble;
    }

    public void setDble(Integer dble) {
        this.dble = dble;
    }

    public Integer getRpc() {
        return rpc;
    }

    public void setRpc(Integer rpc) {
        this.rpc = rpc;
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
