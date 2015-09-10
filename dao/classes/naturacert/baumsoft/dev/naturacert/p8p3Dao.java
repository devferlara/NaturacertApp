package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p8p3;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P8P3.
*/
public class p8p3Dao extends AbstractDao<p8p3, Long> {

    public static final String TABLENAME = "P8P3";

    /**
     * Properties of entity p8p3.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Lfdi = new Property(1, Integer.class, "lfdi", false, "LFDI");
        public final static Property Silp = new Property(2, Integer.class, "silp", false, "SILP");
        public final static Property Ccen = new Property(3, Integer.class, "ccen", false, "CCEN");
        public final static Property Ceen = new Property(4, Integer.class, "ceen", false, "CEEN");
        public final static Property Enep = new Property(5, Integer.class, "enep", false, "ENEP");
        public final static Property Lfda = new Property(6, Integer.class, "lfda", false, "LFDA");
        public final static Property Origen = new Property(7, Integer.class, "origen", false, "ORIGEN");
        public final static Property Id_formulario = new Property(8, Integer.class, "id_formulario", false, "ID_FORMULARIO");
        public final static Property Observaciones = new Property(9, String.class, "observaciones", false, "OBSERVACIONES");
    };


    public p8p3Dao(DaoConfig config) {
        super(config);
    }
    
    public p8p3Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P8P3' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'LFDI' INTEGER," + // 1: lfdi
                "'SILP' INTEGER," + // 2: silp
                "'CCEN' INTEGER," + // 3: ccen
                "'CEEN' INTEGER," + // 4: ceen
                "'ENEP' INTEGER," + // 5: enep
                "'LFDA' INTEGER," + // 6: lfda
                "'ORIGEN' INTEGER," + // 7: origen
                "'ID_FORMULARIO' INTEGER," + // 8: id_formulario
                "'OBSERVACIONES' TEXT);"); // 9: observaciones
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P8P3'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p8p3 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer lfdi = entity.getLfdi();
        if (lfdi != null) {
            stmt.bindLong(2, lfdi);
        }
 
        Integer silp = entity.getSilp();
        if (silp != null) {
            stmt.bindLong(3, silp);
        }
 
        Integer ccen = entity.getCcen();
        if (ccen != null) {
            stmt.bindLong(4, ccen);
        }
 
        Integer ceen = entity.getCeen();
        if (ceen != null) {
            stmt.bindLong(5, ceen);
        }
 
        Integer enep = entity.getEnep();
        if (enep != null) {
            stmt.bindLong(6, enep);
        }
 
        Integer lfda = entity.getLfda();
        if (lfda != null) {
            stmt.bindLong(7, lfda);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(8, origen);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(9, id_formulario);
        }
 
        String observaciones = entity.getObservaciones();
        if (observaciones != null) {
            stmt.bindString(10, observaciones);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p8p3 readEntity(Cursor cursor, int offset) {
        p8p3 entity = new p8p3( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // lfdi
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // silp
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // ccen
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // ceen
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // enep
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // lfda
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // origen
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // id_formulario
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // observaciones
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p8p3 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLfdi(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSilp(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setCcen(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setCeen(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setEnep(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setLfda(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setOrigen(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setId_formulario(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setObservaciones(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p8p3 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p8p3 entity) {
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
