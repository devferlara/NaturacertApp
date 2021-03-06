package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p10p1;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P10P1.
*/
public class p10p1Dao extends AbstractDao<p10p1, Long> {

    public static final String TABLENAME = "P10P1";

    /**
     * Properties of entity p10p1.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ftpd = new Property(1, Integer.class, "ftpd", false, "FTPD");
        public final static Property Fcpd = new Property(2, Integer.class, "fcpd", false, "FCPD");
        public final static Property Frin = new Property(3, Integer.class, "frin", false, "FRIN");
        public final static Property Frd = new Property(4, Integer.class, "frd", false, "FRD");
        public final static Property Iftd = new Property(5, Integer.class, "iftd", false, "IFTD");
        public final static Property Comp = new Property(6, Integer.class, "comp", false, "COMP");
        public final static Property Ecg = new Property(7, Integer.class, "ecg", false, "ECG");
        public final static Property Amda = new Property(8, Integer.class, "amda", false, "AMDA");
        public final static Property Origen = new Property(9, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(10, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(11, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p10p1Dao(DaoConfig config) {
        super(config);
    }
    
    public p10p1Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P10P1' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FTPD' INTEGER," + // 1: ftpd
                "'FCPD' INTEGER," + // 2: fcpd
                "'FRIN' INTEGER," + // 3: frin
                "'FRD' INTEGER," + // 4: frd
                "'IFTD' INTEGER," + // 5: iftd
                "'COMP' INTEGER," + // 6: comp
                "'ECG' INTEGER," + // 7: ecg
                "'AMDA' INTEGER," + // 8: amda
                "'ORIGEN' INTEGER," + // 9: origen
                "'OBSER' TEXT," + // 10: obser
                "'ID_FORMULARIO' INTEGER);"); // 11: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P10P1'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p10p1 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer ftpd = entity.getFtpd();
        if (ftpd != null) {
            stmt.bindLong(2, ftpd);
        }
 
        Integer fcpd = entity.getFcpd();
        if (fcpd != null) {
            stmt.bindLong(3, fcpd);
        }
 
        Integer frin = entity.getFrin();
        if (frin != null) {
            stmt.bindLong(4, frin);
        }
 
        Integer frd = entity.getFrd();
        if (frd != null) {
            stmt.bindLong(5, frd);
        }
 
        Integer iftd = entity.getIftd();
        if (iftd != null) {
            stmt.bindLong(6, iftd);
        }
 
        Integer comp = entity.getComp();
        if (comp != null) {
            stmt.bindLong(7, comp);
        }
 
        Integer ecg = entity.getEcg();
        if (ecg != null) {
            stmt.bindLong(8, ecg);
        }
 
        Integer amda = entity.getAmda();
        if (amda != null) {
            stmt.bindLong(9, amda);
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
    public p10p1 readEntity(Cursor cursor, int offset) {
        p10p1 entity = new p10p1( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ftpd
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // fcpd
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // frin
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // frd
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // iftd
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // comp
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // ecg
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // amda
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // origen
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // obser
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p10p1 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFtpd(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setFcpd(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setFrin(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setFrd(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setIftd(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setComp(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setEcg(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setAmda(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setOrigen(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setObser(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setId_formulario(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p10p1 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p10p1 entity) {
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
