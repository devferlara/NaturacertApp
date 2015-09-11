package naturacert.baumsoft.dev.naturacert;

import naturacert.baumsoft.dev.naturacert.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table FINCAS.
 */
public class Fincas {

    private Long id;
    private Integer ref_finca;
    private String nombre;
    private Integer tipo_finca;
    private Integer id_formulario;
    private Long departamento;
    private String codigo;
    private String hora;
    private String fecha;
    private String imagen;
    private String municipio;
    private String vereda;
    private Double latitud;
    private Double longitud;
    private Integer altitud;
    private String grupo;
    private Long tipo_auditoria;
    private Long tipo_auditor;
    private String propietario;
    private Integer area_finca;
    private Integer area_conservacion;
    private Integer area_infraestructura;
    private String periodo_cosecha;
    private String produccion_regional;
    private Integer fr_cafe;
    private String almendra_sana;
    private String problemas_sanitarios;
    private String documentos_anexos;
    private String proveedores_visitados;
    private Integer trabajadores_permanentes;
    private Integer trabajadores_temporales;
    private String observaciones;
    private long idCliente;
    private long idAuditor;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient FincasDao myDao;

    private Clientes clientes;
    private Long clientes__resolvedKey;

    private Auditores auditores;
    private Long auditores__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Fincas() {
    }

    public Fincas(Long id) {
        this.id = id;
    }

    public Fincas(Long id, Integer ref_finca, String nombre, Integer tipo_finca, Integer id_formulario, Long departamento, String codigo, String hora, String fecha, String imagen, String municipio, String vereda, Double latitud, Double longitud, Integer altitud, String grupo, Long tipo_auditoria, Long tipo_auditor, String propietario, Integer area_finca, Integer area_conservacion, Integer area_infraestructura, String periodo_cosecha, String produccion_regional, Integer fr_cafe, String almendra_sana, String problemas_sanitarios, String documentos_anexos, String proveedores_visitados, Integer trabajadores_permanentes, Integer trabajadores_temporales, String observaciones, long idCliente, long idAuditor) {
        this.id = id;
        this.ref_finca = ref_finca;
        this.nombre = nombre;
        this.tipo_finca = tipo_finca;
        this.id_formulario = id_formulario;
        this.departamento = departamento;
        this.codigo = codigo;
        this.hora = hora;
        this.fecha = fecha;
        this.imagen = imagen;
        this.municipio = municipio;
        this.vereda = vereda;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
        this.grupo = grupo;
        this.tipo_auditoria = tipo_auditoria;
        this.tipo_auditor = tipo_auditor;
        this.propietario = propietario;
        this.area_finca = area_finca;
        this.area_conservacion = area_conservacion;
        this.area_infraestructura = area_infraestructura;
        this.periodo_cosecha = periodo_cosecha;
        this.produccion_regional = produccion_regional;
        this.fr_cafe = fr_cafe;
        this.almendra_sana = almendra_sana;
        this.problemas_sanitarios = problemas_sanitarios;
        this.documentos_anexos = documentos_anexos;
        this.proveedores_visitados = proveedores_visitados;
        this.trabajadores_permanentes = trabajadores_permanentes;
        this.trabajadores_temporales = trabajadores_temporales;
        this.observaciones = observaciones;
        this.idCliente = idCliente;
        this.idAuditor = idAuditor;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFincasDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRef_finca() {
        return ref_finca;
    }

    public void setRef_finca(Integer ref_finca) {
        this.ref_finca = ref_finca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTipo_finca() {
        return tipo_finca;
    }

    public void setTipo_finca(Integer tipo_finca) {
        this.tipo_finca = tipo_finca;
    }

    public Integer getId_formulario() {
        return id_formulario;
    }

    public void setId_formulario(Integer id_formulario) {
        this.id_formulario = id_formulario;
    }

    public Long getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Long departamento) {
        this.departamento = departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getVereda() {
        return vereda;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Integer getAltitud() {
        return altitud;
    }

    public void setAltitud(Integer altitud) {
        this.altitud = altitud;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Long getTipo_auditoria() {
        return tipo_auditoria;
    }

    public void setTipo_auditoria(Long tipo_auditoria) {
        this.tipo_auditoria = tipo_auditoria;
    }

    public Long getTipo_auditor() {
        return tipo_auditor;
    }

    public void setTipo_auditor(Long tipo_auditor) {
        this.tipo_auditor = tipo_auditor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Integer getArea_finca() {
        return area_finca;
    }

    public void setArea_finca(Integer area_finca) {
        this.area_finca = area_finca;
    }

    public Integer getArea_conservacion() {
        return area_conservacion;
    }

    public void setArea_conservacion(Integer area_conservacion) {
        this.area_conservacion = area_conservacion;
    }

    public Integer getArea_infraestructura() {
        return area_infraestructura;
    }

    public void setArea_infraestructura(Integer area_infraestructura) {
        this.area_infraestructura = area_infraestructura;
    }

    public String getPeriodo_cosecha() {
        return periodo_cosecha;
    }

    public void setPeriodo_cosecha(String periodo_cosecha) {
        this.periodo_cosecha = periodo_cosecha;
    }

    public String getProduccion_regional() {
        return produccion_regional;
    }

    public void setProduccion_regional(String produccion_regional) {
        this.produccion_regional = produccion_regional;
    }

    public Integer getFr_cafe() {
        return fr_cafe;
    }

    public void setFr_cafe(Integer fr_cafe) {
        this.fr_cafe = fr_cafe;
    }

    public String getAlmendra_sana() {
        return almendra_sana;
    }

    public void setAlmendra_sana(String almendra_sana) {
        this.almendra_sana = almendra_sana;
    }

    public String getProblemas_sanitarios() {
        return problemas_sanitarios;
    }

    public void setProblemas_sanitarios(String problemas_sanitarios) {
        this.problemas_sanitarios = problemas_sanitarios;
    }

    public String getDocumentos_anexos() {
        return documentos_anexos;
    }

    public void setDocumentos_anexos(String documentos_anexos) {
        this.documentos_anexos = documentos_anexos;
    }

    public String getProveedores_visitados() {
        return proveedores_visitados;
    }

    public void setProveedores_visitados(String proveedores_visitados) {
        this.proveedores_visitados = proveedores_visitados;
    }

    public Integer getTrabajadores_permanentes() {
        return trabajadores_permanentes;
    }

    public void setTrabajadores_permanentes(Integer trabajadores_permanentes) {
        this.trabajadores_permanentes = trabajadores_permanentes;
    }

    public Integer getTrabajadores_temporales() {
        return trabajadores_temporales;
    }

    public void setTrabajadores_temporales(Integer trabajadores_temporales) {
        this.trabajadores_temporales = trabajadores_temporales;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdAuditor() {
        return idAuditor;
    }

    public void setIdAuditor(long idAuditor) {
        this.idAuditor = idAuditor;
    }

    /** To-one relationship, resolved on first access. */
    public Clientes getClientes() {
        long __key = this.idCliente;
        if (clientes__resolvedKey == null || !clientes__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ClientesDao targetDao = daoSession.getClientesDao();
            Clientes clientesNew = targetDao.load(__key);
            synchronized (this) {
                clientes = clientesNew;
            	clientes__resolvedKey = __key;
            }
        }
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        if (clientes == null) {
            throw new DaoException("To-one property 'idCliente' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.clientes = clientes;
            idCliente = clientes.getId();
            clientes__resolvedKey = idCliente;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Auditores getAuditores() {
        long __key = this.idAuditor;
        if (auditores__resolvedKey == null || !auditores__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AuditoresDao targetDao = daoSession.getAuditoresDao();
            Auditores auditoresNew = targetDao.load(__key);
            synchronized (this) {
                auditores = auditoresNew;
            	auditores__resolvedKey = __key;
            }
        }
        return auditores;
    }

    public void setAuditores(Auditores auditores) {
        if (auditores == null) {
            throw new DaoException("To-one property 'idAuditor' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.auditores = auditores;
            idAuditor = auditores.getId();
            auditores__resolvedKey = idAuditor;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
