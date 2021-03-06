package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.g3p1;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table G3P1.
*/
public class g3p1Dao extends AbstractDao<g3p1, Long> {

    public static final String TABLENAME = "G3P1";

    /**
     * Properties of entity g3p1.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Eadg = new Property(1, Integer.class, "eadg", false, "EADG");
        public final static Property Orga = new Property(2, Integer.class, "orga", false, "ORGA");
        public final static Property Rcyc = new Property(3, Integer.class, "rcyc", false, "RCYC");
        public final static Property Ppid = new Property(4, Integer.class, "ppid", false, "PPID");
        public final static Property Rdmr = new Property(5, Integer.class, "rdmr", false, "RDMR");
        public final static Property Ppii = new Property(6, Integer.class, "ppii", false, "PPII");
        public final static Property Ppdy = new Property(7, Integer.class, "ppdy", false, "PPDY");
        public final static Property Origen = new Property(8, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(9, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(10, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public g3p1Dao(DaoConfig config) {
        super(config);
    }
    
    public g3p1Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'G3P1' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'EADG' INTEGER," + // 1: eadg
                "'ORGA' INTEGER," + // 2: orga
                "'RCYC' INTEGER," + // 3: rcyc
                "'PPID' INTEGER," + // 4: ppid
                "'RDMR' INTEGER," + // 5: rdmr
                "'PPII' INTEGER," + // 6: ppii
                "'PPDY' INTEGER," + // 7: ppdy
                "'ORIGEN' INTEGER," + // 8: origen
                "'OBSER' TEXT," + // 9: obser
                "'ID_FORMULARIO' INTEGER);"); // 10: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'G3P1'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, g3p1 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer eadg = entity.getEadg();
        if (eadg != null) {
            stmt.bindLong(2, eadg);
        }
 
        Integer orga = entity.getOrga();
        if (orga != null) {
            stmt.bindLong(3, orga);
        }
 
        Integer rcyc = entity.getRcyc();
        if (rcyc != null) {
            stmt.bindLong(4, rcyc);
        }
 
        Integer ppid = entity.getPpid();
        if (ppid != null) {
            stmt.bindLong(5, ppid);
        }
 
        Integer rdmr = entity.getRdmr();
        if (rdmr != null) {
            stmt.bindLong(6, rdmr);
        }
 
        Integer ppii = entity.getPpii();
        if (ppii != null) {
            stmt.bindLong(7, ppii);
        }
 
        Integer ppdy = entity.getPpdy();
        if (ppdy != null) {
            stmt.bindLong(8, ppdy);
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
    public g3p1 readEntity(Cursor cursor, int offset) {
        g3p1 entity = new g3p1( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // eadg
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // orga
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // rcyc
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // ppid
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // rdmr
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // ppii
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // ppdy
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // origen
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // obser
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, g3p1 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEadg(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setOrga(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setRcyc(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setPpid(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setRdmr(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setPpii(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setPpdy(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setOrigen(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setObser(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setId_formulario(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(g3p1 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(g3p1 entity) {
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
