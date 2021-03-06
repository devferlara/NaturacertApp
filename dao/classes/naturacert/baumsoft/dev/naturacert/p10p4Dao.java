package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p10p4;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P10P4.
*/
public class p10p4Dao extends AbstractDao<p10p4, Long> {

    public static final String TABLENAME = "P10P4";

    /**
     * Properties of entity p10p4.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fnedt = new Property(1, Integer.class, "fnedt", false, "FNEDT");
        public final static Property Ebat = new Property(2, Integer.class, "ebat", false, "EBAT");
        public final static Property Eda = new Property(3, String.class, "eda", false, "EDA");
        public final static Property Ebea = new Property(4, String.class, "ebea", false, "EBEA");
        public final static Property Qrdc = new Property(5, Integer.class, "qrdc", false, "QRDC");
        public final static Property Lsh = new Property(6, Integer.class, "lsh", false, "LSH");
        public final static Property Amb = new Property(7, Integer.class, "amb", false, "AMB");
        public final static Property Origen = new Property(8, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(9, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(10, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p10p4Dao(DaoConfig config) {
        super(config);
    }
    
    public p10p4Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P10P4' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FNEDT' INTEGER," + // 1: fnedt
                "'EBAT' INTEGER," + // 2: ebat
                "'EDA' TEXT," + // 3: eda
                "'EBEA' TEXT," + // 4: ebea
                "'QRDC' INTEGER," + // 5: qrdc
                "'LSH' INTEGER," + // 6: lsh
                "'AMB' INTEGER," + // 7: amb
                "'ORIGEN' INTEGER," + // 8: origen
                "'OBSER' TEXT," + // 9: obser
                "'ID_FORMULARIO' INTEGER);"); // 10: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P10P4'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p10p4 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fnedt = entity.getFnedt();
        if (fnedt != null) {
            stmt.bindLong(2, fnedt);
        }
 
        Integer ebat = entity.getEbat();
        if (ebat != null) {
            stmt.bindLong(3, ebat);
        }
 
        String eda = entity.getEda();
        if (eda != null) {
            stmt.bindString(4, eda);
        }
 
        String ebea = entity.getEbea();
        if (ebea != null) {
            stmt.bindString(5, ebea);
        }
 
        Integer qrdc = entity.getQrdc();
        if (qrdc != null) {
            stmt.bindLong(6, qrdc);
        }
 
        Integer lsh = entity.getLsh();
        if (lsh != null) {
            stmt.bindLong(7, lsh);
        }
 
        Integer amb = entity.getAmb();
        if (amb != null) {
            stmt.bindLong(8, amb);
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
    public p10p4 readEntity(Cursor cursor, int offset) {
        p10p4 entity = new p10p4( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fnedt
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // ebat
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // eda
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ebea
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // qrdc
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // lsh
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // amb
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // origen
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // obser
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p10p4 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFnedt(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setEbat(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setEda(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setEbea(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setQrdc(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setLsh(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setAmb(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setOrigen(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setObser(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setId_formulario(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p10p4 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p10p4 entity) {
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
