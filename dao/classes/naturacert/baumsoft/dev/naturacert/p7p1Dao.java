package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p7p1;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P7P1.
*/
public class p7p1Dao extends AbstractDao<p7p1, Long> {

    public static final String TABLENAME = "P7P1";

    /**
     * Properties of entity p7p1.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fdrl = new Property(1, Integer.class, "fdrl", false, "FDRL");
        public final static Property Srao = new Property(2, Integer.class, "srao", false, "SRAO");
        public final static Property Origen = new Property(3, Integer.class, "origen", false, "ORIGEN");
        public final static Property Id_formulario = new Property(4, Integer.class, "id_formulario", false, "ID_FORMULARIO");
        public final static Property Observaciones = new Property(5, String.class, "observaciones", false, "OBSERVACIONES");
    };


    public p7p1Dao(DaoConfig config) {
        super(config);
    }
    
    public p7p1Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P7P1' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FDRL' INTEGER," + // 1: fdrl
                "'SRAO' INTEGER," + // 2: srao
                "'ORIGEN' INTEGER," + // 3: origen
                "'ID_FORMULARIO' INTEGER," + // 4: id_formulario
                "'OBSERVACIONES' TEXT);"); // 5: observaciones
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P7P1'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p7p1 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fdrl = entity.getFdrl();
        if (fdrl != null) {
            stmt.bindLong(2, fdrl);
        }
 
        Integer srao = entity.getSrao();
        if (srao != null) {
            stmt.bindLong(3, srao);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(4, origen);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(5, id_formulario);
        }
 
        String observaciones = entity.getObservaciones();
        if (observaciones != null) {
            stmt.bindString(6, observaciones);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p7p1 readEntity(Cursor cursor, int offset) {
        p7p1 entity = new p7p1( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fdrl
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // srao
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // origen
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // id_formulario
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // observaciones
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p7p1 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFdrl(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSrao(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setOrigen(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setId_formulario(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setObservaciones(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p7p1 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p7p1 entity) {
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
