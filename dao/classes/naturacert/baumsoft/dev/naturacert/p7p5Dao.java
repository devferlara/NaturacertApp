package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p7p5;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P7P5.
*/
public class p7p5Dao extends AbstractDao<p7p5, Long> {

    public static final String TABLENAME = "P7P5";

    /**
     * Properties of entity p7p5.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Lfdc = new Property(1, Integer.class, "lfdc", false, "LFDC");
        public final static Property Lfce = new Property(2, Integer.class, "lfce", false, "LFCE");
        public final static Property Lfac = new Property(3, Integer.class, "lfac", false, "LFAC");
        public final static Property Origen = new Property(4, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(5, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(6, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p7p5Dao(DaoConfig config) {
        super(config);
    }
    
    public p7p5Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P7P5' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'LFDC' INTEGER," + // 1: lfdc
                "'LFCE' INTEGER," + // 2: lfce
                "'LFAC' INTEGER," + // 3: lfac
                "'ORIGEN' INTEGER," + // 4: origen
                "'OBSER' TEXT," + // 5: obser
                "'ID_FORMULARIO' INTEGER);"); // 6: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P7P5'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p7p5 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer lfdc = entity.getLfdc();
        if (lfdc != null) {
            stmt.bindLong(2, lfdc);
        }
 
        Integer lfce = entity.getLfce();
        if (lfce != null) {
            stmt.bindLong(3, lfce);
        }
 
        Integer lfac = entity.getLfac();
        if (lfac != null) {
            stmt.bindLong(4, lfac);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(5, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(6, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(7, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p7p5 readEntity(Cursor cursor, int offset) {
        p7p5 entity = new p7p5( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // lfdc
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // lfce
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // lfac
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // origen
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // obser
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p7p5 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLfdc(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setLfce(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setLfac(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setOrigen(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setObser(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setId_formulario(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p7p5 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p7p5 entity) {
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
