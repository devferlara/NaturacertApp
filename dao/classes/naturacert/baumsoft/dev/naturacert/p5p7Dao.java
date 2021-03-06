package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p5p7;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P5P7.
*/
public class p5p7Dao extends AbstractDao<p5p7, Long> {

    public static final String TABLENAME = "P5P7";

    /**
     * Properties of entity p5p7.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Armf = new Property(1, Integer.class, "armf", false, "ARMF");
        public final static Property Sthe = new Property(2, Integer.class, "sthe", false, "STHE");
        public final static Property Thev = new Property(3, Integer.class, "thev", false, "THEV");
        public final static Property Cppa = new Property(4, Integer.class, "cppa", false, "CPPA");
        public final static Property Scpy = new Property(5, Integer.class, "scpy", false, "SCPY");
        public final static Property Mhef = new Property(6, String.class, "mhef", false, "MHEF");
        public final static Property Hela = new Property(7, String.class, "hela", false, "HELA");
        public final static Property Hepa = new Property(8, Integer.class, "hepa", false, "HEPA");
        public final static Property Upeh = new Property(9, Integer.class, "upeh", false, "UPEH");
        public final static Property Ccec = new Property(10, Integer.class, "ccec", false, "CCEC");
        public final static Property Origen = new Property(11, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(12, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(13, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p5p7Dao(DaoConfig config) {
        super(config);
    }
    
    public p5p7Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P5P7' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'ARMF' INTEGER," + // 1: armf
                "'STHE' INTEGER," + // 2: sthe
                "'THEV' INTEGER," + // 3: thev
                "'CPPA' INTEGER," + // 4: cppa
                "'SCPY' INTEGER," + // 5: scpy
                "'MHEF' TEXT," + // 6: mhef
                "'HELA' TEXT," + // 7: hela
                "'HEPA' INTEGER," + // 8: hepa
                "'UPEH' INTEGER," + // 9: upeh
                "'CCEC' INTEGER," + // 10: ccec
                "'ORIGEN' INTEGER," + // 11: origen
                "'OBSER' TEXT," + // 12: obser
                "'ID_FORMULARIO' INTEGER);"); // 13: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P5P7'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p5p7 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer armf = entity.getArmf();
        if (armf != null) {
            stmt.bindLong(2, armf);
        }
 
        Integer sthe = entity.getSthe();
        if (sthe != null) {
            stmt.bindLong(3, sthe);
        }
 
        Integer thev = entity.getThev();
        if (thev != null) {
            stmt.bindLong(4, thev);
        }
 
        Integer cppa = entity.getCppa();
        if (cppa != null) {
            stmt.bindLong(5, cppa);
        }
 
        Integer scpy = entity.getScpy();
        if (scpy != null) {
            stmt.bindLong(6, scpy);
        }
 
        String mhef = entity.getMhef();
        if (mhef != null) {
            stmt.bindString(7, mhef);
        }
 
        String hela = entity.getHela();
        if (hela != null) {
            stmt.bindString(8, hela);
        }
 
        Integer hepa = entity.getHepa();
        if (hepa != null) {
            stmt.bindLong(9, hepa);
        }
 
        Integer upeh = entity.getUpeh();
        if (upeh != null) {
            stmt.bindLong(10, upeh);
        }
 
        Integer ccec = entity.getCcec();
        if (ccec != null) {
            stmt.bindLong(11, ccec);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(12, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(13, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(14, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p5p7 readEntity(Cursor cursor, int offset) {
        p5p7 entity = new p5p7( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // armf
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // sthe
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // thev
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // cppa
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // scpy
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mhef
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // hela
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // hepa
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // upeh
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // ccec
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // origen
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // obser
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p5p7 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setArmf(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSthe(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setThev(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setCppa(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setScpy(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setMhef(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setHela(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setHepa(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setUpeh(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setCcec(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setOrigen(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setObser(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setId_formulario(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p5p7 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p5p7 entity) {
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
