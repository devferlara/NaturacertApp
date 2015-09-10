package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p3p5;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P3P5.
*/
public class p3p5Dao extends AbstractDao<p3p5, Long> {

    public static final String TABLENAME = "P3P5";

    /**
     * Properties of entity p3p5.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Nezc = new Property(1, Integer.class, "nezc", false, "NEZC");
        public final static Property Capr = new Property(2, Integer.class, "capr", false, "CAPR");
        public final static Property Origen = new Property(3, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(4, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(5, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p3p5Dao(DaoConfig config) {
        super(config);
    }
    
    public p3p5Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P3P5' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NEZC' INTEGER," + // 1: nezc
                "'CAPR' INTEGER," + // 2: capr
                "'ORIGEN' INTEGER," + // 3: origen
                "'OBSER' TEXT," + // 4: obser
                "'ID_FORMULARIO' INTEGER);"); // 5: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P3P5'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p3p5 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer nezc = entity.getNezc();
        if (nezc != null) {
            stmt.bindLong(2, nezc);
        }
 
        Integer capr = entity.getCapr();
        if (capr != null) {
            stmt.bindLong(3, capr);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(4, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(5, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(6, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p3p5 readEntity(Cursor cursor, int offset) {
        p3p5 entity = new p3p5( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // nezc
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // capr
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // origen
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // obser
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p3p5 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNezc(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setCapr(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setOrigen(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setObser(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setId_formulario(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p3p5 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p3p5 entity) {
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
