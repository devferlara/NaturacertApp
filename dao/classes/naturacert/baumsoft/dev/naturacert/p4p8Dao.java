package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p4p8;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P4P8.
*/
public class p4p8Dao extends AbstractDao<p4p8, Long> {

    public static final String TABLENAME = "P4P8";

    /**
     * Properties of entity p4p8.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fruts = new Property(1, Integer.class, "fruts", false, "FRUTS");
        public final static Property Uts = new Property(2, Integer.class, "uts", false, "UTS");
        public final static Property Tusa = new Property(3, Integer.class, "tusa", false, "TUSA");
        public final static Property Dava = new Property(4, Integer.class, "dava", false, "DAVA");
        public final static Property Dprp = new Property(5, Integer.class, "dprp", false, "DPRP");
        public final static Property Rale = new Property(6, Integer.class, "rale", false, "RALE");
        public final static Property Tarq = new Property(7, Integer.class, "tarq", false, "TARQ");
        public final static Property Origen = new Property(8, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(9, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(10, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p4p8Dao(DaoConfig config) {
        super(config);
    }
    
    public p4p8Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P4P8' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FRUTS' INTEGER," + // 1: fruts
                "'UTS' INTEGER," + // 2: uts
                "'TUSA' INTEGER," + // 3: tusa
                "'DAVA' INTEGER," + // 4: dava
                "'DPRP' INTEGER," + // 5: dprp
                "'RALE' INTEGER," + // 6: rale
                "'TARQ' INTEGER," + // 7: tarq
                "'ORIGEN' INTEGER," + // 8: origen
                "'OBSER' TEXT," + // 9: obser
                "'ID_FORMULARIO' INTEGER);"); // 10: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P4P8'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p4p8 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fruts = entity.getFruts();
        if (fruts != null) {
            stmt.bindLong(2, fruts);
        }
 
        Integer uts = entity.getUts();
        if (uts != null) {
            stmt.bindLong(3, uts);
        }
 
        Integer tusa = entity.getTusa();
        if (tusa != null) {
            stmt.bindLong(4, tusa);
        }
 
        Integer dava = entity.getDava();
        if (dava != null) {
            stmt.bindLong(5, dava);
        }
 
        Integer dprp = entity.getDprp();
        if (dprp != null) {
            stmt.bindLong(6, dprp);
        }
 
        Integer rale = entity.getRale();
        if (rale != null) {
            stmt.bindLong(7, rale);
        }
 
        Integer tarq = entity.getTarq();
        if (tarq != null) {
            stmt.bindLong(8, tarq);
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
    public p4p8 readEntity(Cursor cursor, int offset) {
        p4p8 entity = new p4p8( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fruts
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // uts
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // tusa
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // dava
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // dprp
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // rale
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // tarq
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // origen
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // obser
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p4p8 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFruts(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setUts(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setTusa(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setDava(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setDprp(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setRale(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setTarq(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setOrigen(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setObser(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setId_formulario(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p4p8 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p4p8 entity) {
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
