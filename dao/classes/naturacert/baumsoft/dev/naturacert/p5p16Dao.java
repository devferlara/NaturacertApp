package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p5p16;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P5P16.
*/
public class p5p16Dao extends AbstractDao<p5p16, Long> {

    public static final String TABLENAME = "P5P16";

    /**
     * Properties of entity p5p16.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ttam = new Property(1, Integer.class, "ttam", false, "TTAM");
        public final static Property Tamh = new Property(2, Integer.class, "tamh", false, "TAMH");
        public final static Property Tame = new Property(3, Integer.class, "tame", false, "TAME");
        public final static Property Eps = new Property(4, Integer.class, "eps", false, "EPS");
        public final static Property Sisb = new Property(5, Integer.class, "sisb", false, "SISB");
        public final static Property Otro = new Property(6, Integer.class, "otro", false, "OTRO");
        public final static Property Cual = new Property(7, String.class, "cual", false, "CUAL");
        public final static Property Origen = new Property(8, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(9, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(10, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p5p16Dao(DaoConfig config) {
        super(config);
    }
    
    public p5p16Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P5P16' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'TTAM' INTEGER," + // 1: ttam
                "'TAMH' INTEGER," + // 2: tamh
                "'TAME' INTEGER," + // 3: tame
                "'EPS' INTEGER," + // 4: eps
                "'SISB' INTEGER," + // 5: sisb
                "'OTRO' INTEGER," + // 6: otro
                "'CUAL' TEXT," + // 7: cual
                "'ORIGEN' INTEGER," + // 8: origen
                "'OBSER' TEXT," + // 9: obser
                "'ID_FORMULARIO' INTEGER);"); // 10: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P5P16'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p5p16 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer ttam = entity.getTtam();
        if (ttam != null) {
            stmt.bindLong(2, ttam);
        }
 
        Integer tamh = entity.getTamh();
        if (tamh != null) {
            stmt.bindLong(3, tamh);
        }
 
        Integer tame = entity.getTame();
        if (tame != null) {
            stmt.bindLong(4, tame);
        }
 
        Integer eps = entity.getEps();
        if (eps != null) {
            stmt.bindLong(5, eps);
        }
 
        Integer sisb = entity.getSisb();
        if (sisb != null) {
            stmt.bindLong(6, sisb);
        }
 
        Integer otro = entity.getOtro();
        if (otro != null) {
            stmt.bindLong(7, otro);
        }
 
        String cual = entity.getCual();
        if (cual != null) {
            stmt.bindString(8, cual);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(9, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(10, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(11, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p5p16 readEntity(Cursor cursor, int offset) {
        p5p16 entity = new p5p16( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ttam
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // tamh
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // tame
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // eps
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // sisb
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // otro
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // cual
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // origen
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // obser
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p5p16 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTtam(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTamh(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setTame(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setEps(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setSisb(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setOtro(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setCual(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setOrigen(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setObser(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setId_formulario(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p5p16 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p5p16 entity) {
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
