package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.g3p6;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table G3P6.
*/
public class g3p6Dao extends AbstractDao<g3p6, Long> {

    public static final String TABLENAME = "G3P6";

    /**
     * Properties of entity g3p6.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Esid = new Property(1, Integer.class, "esid", false, "ESID");
        public final static Property Poli = new Property(2, Integer.class, "poli", false, "POLI");
        public final static Property Medi = new Property(3, Integer.class, "medi", false, "MEDI");
        public final static Property Lomi = new Property(4, Integer.class, "lomi", false, "LOMI");
        public final static Property Regi = new Property(5, Integer.class, "regi", false, "REGI");
        public final static Property Lmtd = new Property(6, Integer.class, "lmtd", false, "LMTD");
        public final static Property Origen = new Property(7, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(8, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(9, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public g3p6Dao(DaoConfig config) {
        super(config);
    }
    
    public g3p6Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'G3P6' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'ESID' INTEGER," + // 1: esid
                "'POLI' INTEGER," + // 2: poli
                "'MEDI' INTEGER," + // 3: medi
                "'LOMI' INTEGER," + // 4: lomi
                "'REGI' INTEGER," + // 5: regi
                "'LMTD' INTEGER," + // 6: lmtd
                "'ORIGEN' INTEGER," + // 7: origen
                "'OBSER' TEXT," + // 8: obser
                "'ID_FORMULARIO' INTEGER);"); // 9: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'G3P6'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, g3p6 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer esid = entity.getEsid();
        if (esid != null) {
            stmt.bindLong(2, esid);
        }
 
        Integer poli = entity.getPoli();
        if (poli != null) {
            stmt.bindLong(3, poli);
        }
 
        Integer medi = entity.getMedi();
        if (medi != null) {
            stmt.bindLong(4, medi);
        }
 
        Integer lomi = entity.getLomi();
        if (lomi != null) {
            stmt.bindLong(5, lomi);
        }
 
        Integer regi = entity.getRegi();
        if (regi != null) {
            stmt.bindLong(6, regi);
        }
 
        Integer lmtd = entity.getLmtd();
        if (lmtd != null) {
            stmt.bindLong(7, lmtd);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(8, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(9, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(10, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public g3p6 readEntity(Cursor cursor, int offset) {
        g3p6 entity = new g3p6( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // esid
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // poli
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // medi
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // lomi
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // regi
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // lmtd
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // origen
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // obser
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, g3p6 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEsid(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setPoli(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setMedi(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setLomi(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setRegi(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setLmtd(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setOrigen(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setObser(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setId_formulario(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(g3p6 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(g3p6 entity) {
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
