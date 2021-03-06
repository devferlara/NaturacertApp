package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p8p7;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P8P7.
*/
public class p8p7Dao extends AbstractDao<p8p7, Long> {

    public static final String TABLENAME = "P8P7";

    /**
     * Properties of entity p8p7.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fdus = new Property(1, Integer.class, "fdus", false, "FDUS");
        public final static Property Fusm = new Property(2, Integer.class, "fusm", false, "FUSM");
        public final static Property Fccr = new Property(3, Integer.class, "fccr", false, "FCCR");
        public final static Property Iadp = new Property(4, Integer.class, "iadp", false, "IADP");
        public final static Property Nold = new Property(5, Integer.class, "nold", false, "NOLD");
        public final static Property Ndlp = new Property(6, Integer.class, "ndlp", false, "NDLP");
        public final static Property Dosi = new Property(7, Integer.class, "dosi", false, "DOSI");
        public final static Property Dlpq = new Property(8, Integer.class, "dlpq", false, "DLPQ");
        public final static Property Pqal = new Property(9, Integer.class, "pqal", false, "PQAL");
        public final static Property Fcda = new Property(10, Integer.class, "fcda", false, "FCDA");
        public final static Property Origen = new Property(11, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(12, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(13, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p8p7Dao(DaoConfig config) {
        super(config);
    }
    
    public p8p7Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P8P7' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FDUS' INTEGER," + // 1: fdus
                "'FUSM' INTEGER," + // 2: fusm
                "'FCCR' INTEGER," + // 3: fccr
                "'IADP' INTEGER," + // 4: iadp
                "'NOLD' INTEGER," + // 5: nold
                "'NDLP' INTEGER," + // 6: ndlp
                "'DOSI' INTEGER," + // 7: dosi
                "'DLPQ' INTEGER," + // 8: dlpq
                "'PQAL' INTEGER," + // 9: pqal
                "'FCDA' INTEGER," + // 10: fcda
                "'ORIGEN' INTEGER," + // 11: origen
                "'OBSER' TEXT," + // 12: obser
                "'ID_FORMULARIO' INTEGER);"); // 13: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P8P7'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p8p7 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fdus = entity.getFdus();
        if (fdus != null) {
            stmt.bindLong(2, fdus);
        }
 
        Integer fusm = entity.getFusm();
        if (fusm != null) {
            stmt.bindLong(3, fusm);
        }
 
        Integer fccr = entity.getFccr();
        if (fccr != null) {
            stmt.bindLong(4, fccr);
        }
 
        Integer iadp = entity.getIadp();
        if (iadp != null) {
            stmt.bindLong(5, iadp);
        }
 
        Integer nold = entity.getNold();
        if (nold != null) {
            stmt.bindLong(6, nold);
        }
 
        Integer ndlp = entity.getNdlp();
        if (ndlp != null) {
            stmt.bindLong(7, ndlp);
        }
 
        Integer dosi = entity.getDosi();
        if (dosi != null) {
            stmt.bindLong(8, dosi);
        }
 
        Integer dlpq = entity.getDlpq();
        if (dlpq != null) {
            stmt.bindLong(9, dlpq);
        }
 
        Integer pqal = entity.getPqal();
        if (pqal != null) {
            stmt.bindLong(10, pqal);
        }
 
        Integer fcda = entity.getFcda();
        if (fcda != null) {
            stmt.bindLong(11, fcda);
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
    public p8p7 readEntity(Cursor cursor, int offset) {
        p8p7 entity = new p8p7( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fdus
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // fusm
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // fccr
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // iadp
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // nold
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // ndlp
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // dosi
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // dlpq
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // pqal
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // fcda
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // origen
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // obser
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p8p7 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFdus(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setFusm(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setFccr(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setIadp(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setNold(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setNdlp(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setDosi(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setDlpq(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setPqal(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setFcda(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setOrigen(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setObser(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setId_formulario(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p8p7 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p8p7 entity) {
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
