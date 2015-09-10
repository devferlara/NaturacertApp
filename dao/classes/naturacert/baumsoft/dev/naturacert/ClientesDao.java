package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.Clientes;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CLIENTES.
*/
public class ClientesDao extends AbstractDao<Clientes, Long> {

    public static final String TABLENAME = "CLIENTES";

    /**
     * Properties of entity Clientes.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nombres = new Property(1, String.class, "nombres", false, "NOMBRES");
        public final static Property Apellidos = new Property(2, String.class, "apellidos", false, "APELLIDOS");
        public final static Property Dirección = new Property(3, String.class, "dirección", false, "DIRECCIÓN");
        public final static Property Telefono = new Property(4, String.class, "telefono", false, "TELEFONO");
        public final static Property Documento = new Property(5, String.class, "documento", false, "DOCUMENTO");
        public final static Property Email = new Property(6, String.class, "email", false, "EMAIL");
        public final static Property Referencia = new Property(7, Integer.class, "referencia", false, "REFERENCIA");
    };

    private DaoSession daoSession;


    public ClientesDao(DaoConfig config) {
        super(config);
    }
    
    public ClientesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CLIENTES' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NOMBRES' TEXT," + // 1: nombres
                "'APELLIDOS' TEXT," + // 2: apellidos
                "'DIRECCIÓN' TEXT," + // 3: dirección
                "'TELEFONO' TEXT," + // 4: telefono
                "'DOCUMENTO' TEXT," + // 5: documento
                "'EMAIL' TEXT," + // 6: email
                "'REFERENCIA' INTEGER);"); // 7: referencia
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CLIENTES'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Clientes entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String nombres = entity.getNombres();
        if (nombres != null) {
            stmt.bindString(2, nombres);
        }
 
        String apellidos = entity.getApellidos();
        if (apellidos != null) {
            stmt.bindString(3, apellidos);
        }
 
        String dirección = entity.getDirección();
        if (dirección != null) {
            stmt.bindString(4, dirección);
        }
 
        String telefono = entity.getTelefono();
        if (telefono != null) {
            stmt.bindString(5, telefono);
        }
 
        String documento = entity.getDocumento();
        if (documento != null) {
            stmt.bindString(6, documento);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(7, email);
        }
 
        Integer referencia = entity.getReferencia();
        if (referencia != null) {
            stmt.bindLong(8, referencia);
        }
    }

    @Override
    protected void attachEntity(Clientes entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Clientes readEntity(Cursor cursor, int offset) {
        Clientes entity = new Clientes( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // nombres
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // apellidos
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dirección
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // telefono
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // documento
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // email
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7) // referencia
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Clientes entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNombres(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setApellidos(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDirección(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTelefono(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDocumento(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEmail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setReferencia(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Clientes entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Clientes entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
