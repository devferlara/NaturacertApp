package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p1p5;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P1P5.
*/
public class p1p5Dao extends AbstractDao<p1p5, Long> {

    public static final String TABLENAME = "P1P5";

    /**
     * Properties of entity p1p5.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Cdpm = new Property(1, Integer.class, "cdpm", false, "CDPM");
        public final static Property Dfdr = new Property(2, Integer.class, "dfdr", false, "DFDR");
        public final static Property Dgsca = new Property(3, String.class, "dgsca", false, "DGSCA");
        public final static Property Origen = new Property(4, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(5, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(6, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p1p5Dao(DaoConfig config) {
        super(config);
    }
    
    public p1p5Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P1P5' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'CDPM' INTEGER," + // 1: cdpm
                "'DFDR' INTEGER," + // 2: dfdr
                "'DGSCA' TEXT," + // 3: dgsca
                "'ORIGEN' INTEGER," + // 4: origen
                "'OBSER' TEXT," + // 5: obser
                "'ID_FORMULARIO' INTEGER);"); // 6: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P1P5'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p1p5 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer cdpm = entity.getCdpm();
        if (cdpm != null) {
            stmt.bindLong(2, cdpm);
        }
 
        Integer dfdr = entity.getDfdr();
        if (dfdr != null) {
            stmt.bindLong(3, dfdr);
        }
 
        String dgsca = entity.getDgsca();
        if (dgsca != null) {
            stmt.bindString(4, dgsca);
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
    public p1p5 readEntity(Cursor cursor, int offset) {
        p1p5 entity = new p1p5( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // cdpm
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // dfdr
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dgsca
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // origen
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // obser
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p1p5 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCdpm(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setDfdr(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setDgsca(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setOrigen(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setObser(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setId_formulario(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p1p5 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p1p5 entity) {
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
