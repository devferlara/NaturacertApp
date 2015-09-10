package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p2p8;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P2P8.
*/
public class p2p8Dao extends AbstractDao<p2p8, Long> {

    public static final String TABLENAME = "P2P8";

    /**
     * Properties of entity p2p8.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ncaf = new Property(1, Integer.class, "ncaf", false, "NCAF");
        public final static Property Denp = new Property(2, String.class, "denp", false, "DENP");
        public final static Property Dea = new Property(3, String.class, "dea", false, "DEA");
        public final static Property Neh = new Property(4, String.class, "neh", false, "NEH");
        public final static Property Adre = new Property(5, String.class, "adre", false, "ADRE");
        public final static Property Admh = new Property(6, Integer.class, "admh", false, "ADMH");
        public final static Property Origen = new Property(7, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(8, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(9, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p2p8Dao(DaoConfig config) {
        super(config);
    }
    
    public p2p8Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P2P8' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NCAF' INTEGER," + // 1: ncaf
                "'DENP' TEXT," + // 2: denp
                "'DEA' TEXT," + // 3: dea
                "'NEH' TEXT," + // 4: neh
                "'ADRE' TEXT," + // 5: adre
                "'ADMH' INTEGER," + // 6: admh
                "'ORIGEN' INTEGER," + // 7: origen
                "'OBSER' TEXT," + // 8: obser
                "'ID_FORMULARIO' INTEGER);"); // 9: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P2P8'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p2p8 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer ncaf = entity.getNcaf();
        if (ncaf != null) {
            stmt.bindLong(2, ncaf);
        }
 
        String denp = entity.getDenp();
        if (denp != null) {
            stmt.bindString(3, denp);
        }
 
        String dea = entity.getDea();
        if (dea != null) {
            stmt.bindString(4, dea);
        }
 
        String neh = entity.getNeh();
        if (neh != null) {
            stmt.bindString(5, neh);
        }
 
        String adre = entity.getAdre();
        if (adre != null) {
            stmt.bindString(6, adre);
        }
 
        Integer admh = entity.getAdmh();
        if (admh != null) {
            stmt.bindLong(7, admh);
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
    public p2p8 readEntity(Cursor cursor, int offset) {
        p2p8 entity = new p2p8( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // ncaf
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // denp
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // dea
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // neh
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // adre
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // admh
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // origen
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // obser
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p2p8 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNcaf(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setDenp(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDea(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNeh(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAdre(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAdmh(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setOrigen(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setObser(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setId_formulario(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p2p8 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p2p8 entity) {
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
