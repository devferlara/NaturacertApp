package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p1p10;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P1P10.
*/
public class p1p10Dao extends AbstractDao<p1p10, Long> {

    public static final String TABLENAME = "P1P10";

    /**
     * Properties of entity p1p10.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Spem = new Property(1, Integer.class, "spem", false, "SPEM");
        public final static Property Sef = new Property(2, Integer.class, "sef", false, "SEF");
        public final static Property Set = new Property(3, Integer.class, "set", false, "SET");
        public final static Property Poi = new Property(4, Integer.class, "poi", false, "POI");
        public final static Property Rtra = new Property(5, Integer.class, "rtra", false, "RTRA");
        public final static Property Pad = new Property(6, Integer.class, "pad", false, "PAD");
        public final static Property Origen = new Property(7, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(8, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(9, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p1p10Dao(DaoConfig config) {
        super(config);
    }
    
    public p1p10Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P1P10' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'SPEM' INTEGER," + // 1: spem
                "'SEF' INTEGER," + // 2: sef
                "'SET' INTEGER," + // 3: set
                "'POI' INTEGER," + // 4: poi
                "'RTRA' INTEGER," + // 5: rtra
                "'PAD' INTEGER," + // 6: pad
                "'ORIGEN' INTEGER," + // 7: origen
                "'OBSER' TEXT," + // 8: obser
                "'ID_FORMULARIO' INTEGER);"); // 9: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P1P10'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p1p10 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer spem = entity.getSpem();
        if (spem != null) {
            stmt.bindLong(2, spem);
        }
 
        Integer sef = entity.getSef();
        if (sef != null) {
            stmt.bindLong(3, sef);
        }
 
        Integer set = entity.getSet();
        if (set != null) {
            stmt.bindLong(4, set);
        }
 
        Integer poi = entity.getPoi();
        if (poi != null) {
            stmt.bindLong(5, poi);
        }
 
        Integer rtra = entity.getRtra();
        if (rtra != null) {
            stmt.bindLong(6, rtra);
        }
 
        Integer pad = entity.getPad();
        if (pad != null) {
            stmt.bindLong(7, pad);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(8, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(9, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(10, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p1p10 readEntity(Cursor cursor, int offset) {
        p1p10 entity = new p1p10( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // spem
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // sef
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // set
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // poi
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // rtra
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // pad
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // origen
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // obser
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p1p10 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSpem(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSef(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setSet(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPoi(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setRtra(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setPad(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setOrigen(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setObser(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setId_formulario(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p1p10 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p1p10 entity) {
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
