package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p4p4;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P4P4.
*/
public class p4p4Dao extends AbstractDao<p4p4, Long> {

    public static final String TABLENAME = "P4P4";

    /**
     * Properties of entity p4p4.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fcsts = new Property(1, Integer.class, "fcsts", false, "FCSTS");
        public final static Property Dsta = new Property(2, Integer.class, "dsta", false, "DSTA");
        public final static Property Stds = new Property(3, Integer.class, "stds", false, "STDS");
        public final static Property Pevs = new Property(4, Integer.class, "pevs", false, "PEVS");
        public final static Property Sota = new Property(5, Integer.class, "sota", false, "SOTA");
        public final static Property Origen = new Property(6, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(7, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(8, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p4p4Dao(DaoConfig config) {
        super(config);
    }
    
    public p4p4Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P4P4' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FCSTS' INTEGER," + // 1: fcsts
                "'DSTA' INTEGER," + // 2: dsta
                "'STDS' INTEGER," + // 3: stds
                "'PEVS' INTEGER," + // 4: pevs
                "'SOTA' INTEGER," + // 5: sota
                "'ORIGEN' INTEGER," + // 6: origen
                "'OBSER' TEXT," + // 7: obser
                "'ID_FORMULARIO' INTEGER);"); // 8: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P4P4'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p4p4 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fcsts = entity.getFcsts();
        if (fcsts != null) {
            stmt.bindLong(2, fcsts);
        }
 
        Integer dsta = entity.getDsta();
        if (dsta != null) {
            stmt.bindLong(3, dsta);
        }
 
        Integer stds = entity.getStds();
        if (stds != null) {
            stmt.bindLong(4, stds);
        }
 
        Integer pevs = entity.getPevs();
        if (pevs != null) {
            stmt.bindLong(5, pevs);
        }
 
        Integer sota = entity.getSota();
        if (sota != null) {
            stmt.bindLong(6, sota);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(7, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(8, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(9, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p4p4 readEntity(Cursor cursor, int offset) {
        p4p4 entity = new p4p4( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fcsts
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // dsta
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // stds
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // pevs
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // sota
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // origen
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // obser
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p4p4 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFcsts(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setDsta(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setStds(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPevs(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setSota(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setOrigen(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setObser(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setId_formulario(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p4p4 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p4p4 entity) {
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
