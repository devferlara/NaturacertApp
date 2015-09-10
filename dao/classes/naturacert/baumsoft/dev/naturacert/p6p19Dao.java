package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p6p19;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P6P19.
*/
public class p6p19Dao extends AbstractDao<p6p19, Long> {

    public static final String TABLENAME = "P6P19";

    /**
     * Properties of entity p6p19.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fdcc = new Property(1, Integer.class, "fdcc", false, "FDCC");
        public final static Property Ccen = new Property(2, Integer.class, "ccen", false, "CCEN");
        public final static Property Spaf = new Property(3, Integer.class, "spaf", false, "SPAF");
        public final static Property Eedp = new Property(4, Integer.class, "eedp", false, "EEDP");
        public final static Property Ccbd = new Property(5, Integer.class, "ccbd", false, "CCBD");
        public final static Property Lava = new Property(6, Integer.class, "lava", false, "LAVA");
        public final static Property Duch = new Property(7, Integer.class, "duch", false, "DUCH");
        public final static Property Lvmn = new Property(8, Integer.class, "lvmn", false, "LVMN");
        public final static Property Origen = new Property(9, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(10, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(11, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p6p19Dao(DaoConfig config) {
        super(config);
    }
    
    public p6p19Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P6P19' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FDCC' INTEGER," + // 1: fdcc
                "'CCEN' INTEGER," + // 2: ccen
                "'SPAF' INTEGER," + // 3: spaf
                "'EEDP' INTEGER," + // 4: eedp
                "'CCBD' INTEGER," + // 5: ccbd
                "'LAVA' INTEGER," + // 6: lava
                "'DUCH' INTEGER," + // 7: duch
                "'LVMN' INTEGER," + // 8: lvmn
                "'ORIGEN' INTEGER," + // 9: origen
                "'OBSER' TEXT," + // 10: obser
                "'ID_FORMULARIO' INTEGER);"); // 11: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P6P19'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p6p19 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fdcc = entity.getFdcc();
        if (fdcc != null) {
            stmt.bindLong(2, fdcc);
        }
 
        Integer ccen = entity.getCcen();
        if (ccen != null) {
            stmt.bindLong(3, ccen);
        }
 
        Integer spaf = entity.getSpaf();
        if (spaf != null) {
            stmt.bindLong(4, spaf);
        }
 
        Integer eedp = entity.getEedp();
        if (eedp != null) {
            stmt.bindLong(5, eedp);
        }
 
        Integer ccbd = entity.getCcbd();
        if (ccbd != null) {
            stmt.bindLong(6, ccbd);
        }
 
        Integer lava = entity.getLava();
        if (lava != null) {
            stmt.bindLong(7, lava);
        }
 
        Integer duch = entity.getDuch();
        if (duch != null) {
            stmt.bindLong(8, duch);
        }
 
        Integer lvmn = entity.getLvmn();
        if (lvmn != null) {
            stmt.bindLong(9, lvmn);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(10, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(11, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(12, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p6p19 readEntity(Cursor cursor, int offset) {
        p6p19 entity = new p6p19( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fdcc
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // ccen
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // spaf
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // eedp
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // ccbd
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // lava
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // duch
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // lvmn
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // origen
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // obser
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p6p19 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFdcc(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setCcen(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setSpaf(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setEedp(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setCcbd(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setLava(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setDuch(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setLvmn(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setOrigen(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setObser(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setId_formulario(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p6p19 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p6p19 entity) {
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
