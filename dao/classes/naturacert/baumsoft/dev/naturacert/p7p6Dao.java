package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p7p6;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P7P6.
*/
public class p7p6Dao extends AbstractDao<p7p6, Long> {

    public static final String TABLENAME = "P7P6";

    /**
     * Properties of entity p7p6.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fdtl = new Property(1, Integer.class, "fdtl", false, "FDTL");
        public final static Property Sdec = new Property(2, Integer.class, "sdec", false, "SDEC");
        public final static Property Clyt = new Property(3, Integer.class, "clyt", false, "CLYT");
        public final static Property Adds = new Property(4, Integer.class, "adds", false, "ADDS");
        public final static Property Ddpb = new Property(5, Integer.class, "ddpb", false, "DDPB");
        public final static Property Escr = new Property(6, Integer.class, "escr", false, "ESCR");
        public final static Property Origen = new Property(7, Integer.class, "origen", false, "ORIGEN");
        public final static Property Id_formulario = new Property(8, Integer.class, "id_formulario", false, "ID_FORMULARIO");
        public final static Property Observaciones = new Property(9, String.class, "observaciones", false, "OBSERVACIONES");
    };


    public p7p6Dao(DaoConfig config) {
        super(config);
    }
    
    public p7p6Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P7P6' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FDTL' INTEGER," + // 1: fdtl
                "'SDEC' INTEGER," + // 2: sdec
                "'CLYT' INTEGER," + // 3: clyt
                "'ADDS' INTEGER," + // 4: adds
                "'DDPB' INTEGER," + // 5: ddpb
                "'ESCR' INTEGER," + // 6: escr
                "'ORIGEN' INTEGER," + // 7: origen
                "'ID_FORMULARIO' INTEGER," + // 8: id_formulario
                "'OBSERVACIONES' TEXT);"); // 9: observaciones
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P7P6'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p7p6 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fdtl = entity.getFdtl();
        if (fdtl != null) {
            stmt.bindLong(2, fdtl);
        }
 
        Integer sdec = entity.getSdec();
        if (sdec != null) {
            stmt.bindLong(3, sdec);
        }
 
        Integer clyt = entity.getClyt();
        if (clyt != null) {
            stmt.bindLong(4, clyt);
        }
 
        Integer adds = entity.getAdds();
        if (adds != null) {
            stmt.bindLong(5, adds);
        }
 
        Integer ddpb = entity.getDdpb();
        if (ddpb != null) {
            stmt.bindLong(6, ddpb);
        }
 
        Integer escr = entity.getEscr();
        if (escr != null) {
            stmt.bindLong(7, escr);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(8, origen);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(9, id_formulario);
        }
 
        String observaciones = entity.getObservaciones();
        if (observaciones != null) {
            stmt.bindString(10, observaciones);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p7p6 readEntity(Cursor cursor, int offset) {
        p7p6 entity = new p7p6( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fdtl
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // sdec
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // clyt
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // adds
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // ddpb
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // escr
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // origen
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // id_formulario
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // observaciones
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p7p6 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFdtl(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSdec(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setClyt(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setAdds(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setDdpb(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setEscr(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setOrigen(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setId_formulario(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setObservaciones(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p7p6 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p7p6 entity) {
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
