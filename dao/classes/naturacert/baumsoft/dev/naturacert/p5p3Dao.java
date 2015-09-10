package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p5p3;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P5P3.
*/
public class p5p3Dao extends AbstractDao<p5p3, Long> {

    public static final String TABLENAME = "P5P3";

    /**
     * Properties of entity p5p3.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Armf = new Property(1, Integer.class, "armf", false, "ARMF");
        public final static Property Seot = new Property(2, Integer.class, "seot", false, "SEOT");
        public final static Property Cmod = new Property(3, Integer.class, "cmod", false, "CMOD");
        public final static Property Crn = new Property(4, Integer.class, "crn", false, "CRN");
        public final static Property Ndpe = new Property(5, Integer.class, "ndpe", false, "NDPE");
        public final static Property Origen = new Property(6, Integer.class, "origen", false, "ORIGEN");
        public final static Property Id_formulario = new Property(7, Integer.class, "id_formulario", false, "ID_FORMULARIO");
        public final static Property Observaciones = new Property(8, String.class, "observaciones", false, "OBSERVACIONES");
    };


    public p5p3Dao(DaoConfig config) {
        super(config);
    }
    
    public p5p3Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P5P3' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'ARMF' INTEGER," + // 1: armf
                "'SEOT' INTEGER," + // 2: seot
                "'CMOD' INTEGER," + // 3: cmod
                "'CRN' INTEGER," + // 4: crn
                "'NDPE' INTEGER," + // 5: ndpe
                "'ORIGEN' INTEGER," + // 6: origen
                "'ID_FORMULARIO' INTEGER," + // 7: id_formulario
                "'OBSERVACIONES' TEXT);"); // 8: observaciones
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P5P3'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p5p3 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer armf = entity.getArmf();
        if (armf != null) {
            stmt.bindLong(2, armf);
        }
 
        Integer seot = entity.getSeot();
        if (seot != null) {
            stmt.bindLong(3, seot);
        }
 
        Integer cmod = entity.getCmod();
        if (cmod != null) {
            stmt.bindLong(4, cmod);
        }
 
        Integer crn = entity.getCrn();
        if (crn != null) {
            stmt.bindLong(5, crn);
        }
 
        Integer ndpe = entity.getNdpe();
        if (ndpe != null) {
            stmt.bindLong(6, ndpe);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(7, origen);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(8, id_formulario);
        }
 
        String observaciones = entity.getObservaciones();
        if (observaciones != null) {
            stmt.bindString(9, observaciones);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p5p3 readEntity(Cursor cursor, int offset) {
        p5p3 entity = new p5p3( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // armf
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // seot
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // cmod
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // crn
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // ndpe
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // origen
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // id_formulario
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // observaciones
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p5p3 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setArmf(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSeot(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setCmod(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setCrn(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setNdpe(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setOrigen(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setId_formulario(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setObservaciones(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p5p3 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p5p3 entity) {
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
