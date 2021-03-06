package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p4p7;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P4P7.
*/
public class p4p7Dao extends AbstractDao<p4p7, Long> {

    public static final String TABLENAME = "P4P7";

    /**
     * Properties of entity p4p7.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fnpd = new Property(1, Integer.class, "fnpd", false, "FNPD");
        public final static Property Nsda = new Property(2, Integer.class, "nsda", false, "NSDA");
        public final static Property Origen = new Property(3, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(4, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(5, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p4p7Dao(DaoConfig config) {
        super(config);
    }
    
    public p4p7Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P4P7' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FNPD' INTEGER," + // 1: fnpd
                "'NSDA' INTEGER," + // 2: nsda
                "'ORIGEN' INTEGER," + // 3: origen
                "'OBSER' TEXT," + // 4: obser
                "'ID_FORMULARIO' INTEGER);"); // 5: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P4P7'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p4p7 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fnpd = entity.getFnpd();
        if (fnpd != null) {
            stmt.bindLong(2, fnpd);
        }
 
        Integer nsda = entity.getNsda();
        if (nsda != null) {
            stmt.bindLong(3, nsda);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(4, origen);
        }
 
        String obser = entity.getObser();
        if (obser != null) {
            stmt.bindString(5, obser);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(6, id_formulario);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p4p7 readEntity(Cursor cursor, int offset) {
        p4p7 entity = new p4p7( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fnpd
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // nsda
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // origen
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // obser
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p4p7 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFnpd(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setNsda(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setOrigen(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setObser(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setId_formulario(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p4p7 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p4p7 entity) {
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
