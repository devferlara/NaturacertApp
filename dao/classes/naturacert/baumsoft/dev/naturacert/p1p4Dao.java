package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p1p4;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P1P4.
*/
public class p1p4Dao extends AbstractDao<p1p4, Long> {

    public static final String TABLENAME = "P1P4";

    /**
     * Properties of entity p1p4.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Sgsdt = new Property(1, Integer.class, "sgsdt", false, "SGSDT");
        public final static Property Oyrd = new Property(2, Integer.class, "oyrd", false, "OYRD");
        public final static Property Donde = new Property(3, String.class, "donde", false, "DONDE");
        public final static Property Pgsd = new Property(4, Integer.class, "pgsd", false, "PGSD");
        public final static Property Edd = new Property(5, Integer.class, "edd", false, "EDD");
        public final static Property Cuales = new Property(6, String.class, "cuales", false, "CUALES");
        public final static Property Origen = new Property(7, Integer.class, "origen", false, "ORIGEN");
        public final static Property Obser = new Property(8, String.class, "obser", false, "OBSER");
        public final static Property Id_formulario = new Property(9, Integer.class, "id_formulario", false, "ID_FORMULARIO");
    };


    public p1p4Dao(DaoConfig config) {
        super(config);
    }
    
    public p1p4Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P1P4' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'SGSDT' INTEGER," + // 1: sgsdt
                "'OYRD' INTEGER," + // 2: oyrd
                "'DONDE' TEXT," + // 3: donde
                "'PGSD' INTEGER," + // 4: pgsd
                "'EDD' INTEGER," + // 5: edd
                "'CUALES' TEXT," + // 6: cuales
                "'ORIGEN' INTEGER," + // 7: origen
                "'OBSER' TEXT," + // 8: obser
                "'ID_FORMULARIO' INTEGER);"); // 9: id_formulario
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P1P4'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p1p4 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer sgsdt = entity.getSgsdt();
        if (sgsdt != null) {
            stmt.bindLong(2, sgsdt);
        }
 
        Integer oyrd = entity.getOyrd();
        if (oyrd != null) {
            stmt.bindLong(3, oyrd);
        }
 
        String donde = entity.getDonde();
        if (donde != null) {
            stmt.bindString(4, donde);
        }
 
        Integer pgsd = entity.getPgsd();
        if (pgsd != null) {
            stmt.bindLong(5, pgsd);
        }
 
        Integer edd = entity.getEdd();
        if (edd != null) {
            stmt.bindLong(6, edd);
        }
 
        String cuales = entity.getCuales();
        if (cuales != null) {
            stmt.bindString(7, cuales);
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
    public p1p4 readEntity(Cursor cursor, int offset) {
        p1p4 entity = new p1p4( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // sgsdt
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // oyrd
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // donde
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // pgsd
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // edd
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cuales
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // origen
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // obser
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9) // id_formulario
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p1p4 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSgsdt(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setOyrd(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setDonde(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPgsd(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setEdd(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setCuales(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setOrigen(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setObser(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setId_formulario(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p1p4 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p1p4 entity) {
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
