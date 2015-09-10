package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p10p2;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P10P2.
*/
public class p10p2Dao extends AbstractDao<p10p2, Long> {

    public static final String TABLENAME = "P10P2";

    /**
     * Properties of entity p10p2.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Npbca = new Property(1, Integer.class, "npbca", false, "NPBCA");
        public final static Property Nibf = new Property(2, Integer.class, "nibf", false, "NIBF");
        public final static Property Nqbf = new Property(3, Integer.class, "nqbf", false, "NQBF");
        public final static Property Fqib = new Property(4, Integer.class, "fqib", false, "FQIB");
        public final static Property Idet = new Property(5, Integer.class, "idet", false, "IDET");
        public final static Property Plci = new Property(6, Integer.class, "plci", false, "PLCI");
        public final static Property Poper = new Property(7, Integer.class, "poper", false, "POPER");
        public final static Property Origen = new Property(8, Integer.class, "origen", false, "ORIGEN");
        public final static Property Id_formulario = new Property(9, Integer.class, "id_formulario", false, "ID_FORMULARIO");
        public final static Property Observaciones = new Property(10, String.class, "observaciones", false, "OBSERVACIONES");
    };


    public p10p2Dao(DaoConfig config) {
        super(config);
    }
    
    public p10p2Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P10P2' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NPBCA' INTEGER," + // 1: npbca
                "'NIBF' INTEGER," + // 2: nibf
                "'NQBF' INTEGER," + // 3: nqbf
                "'FQIB' INTEGER," + // 4: fqib
                "'IDET' INTEGER," + // 5: idet
                "'PLCI' INTEGER," + // 6: plci
                "'POPER' INTEGER," + // 7: poper
                "'ORIGEN' INTEGER," + // 8: origen
                "'ID_FORMULARIO' INTEGER," + // 9: id_formulario
                "'OBSERVACIONES' TEXT);"); // 10: observaciones
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P10P2'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p10p2 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer npbca = entity.getNpbca();
        if (npbca != null) {
            stmt.bindLong(2, npbca);
        }
 
        Integer nibf = entity.getNibf();
        if (nibf != null) {
            stmt.bindLong(3, nibf);
        }
 
        Integer nqbf = entity.getNqbf();
        if (nqbf != null) {
            stmt.bindLong(4, nqbf);
        }
 
        Integer fqib = entity.getFqib();
        if (fqib != null) {
            stmt.bindLong(5, fqib);
        }
 
        Integer idet = entity.getIdet();
        if (idet != null) {
            stmt.bindLong(6, idet);
        }
 
        Integer plci = entity.getPlci();
        if (plci != null) {
            stmt.bindLong(7, plci);
        }
 
        Integer poper = entity.getPoper();
        if (poper != null) {
            stmt.bindLong(8, poper);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(9, origen);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(10, id_formulario);
        }
 
        String observaciones = entity.getObservaciones();
        if (observaciones != null) {
            stmt.bindString(11, observaciones);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p10p2 readEntity(Cursor cursor, int offset) {
        p10p2 entity = new p10p2( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // npbca
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // nibf
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // nqbf
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // fqib
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // idet
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // plci
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // poper
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // origen
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // id_formulario
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // observaciones
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p10p2 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNpbca(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setNibf(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setNqbf(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setFqib(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setIdet(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setPlci(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setPoper(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setOrigen(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setId_formulario(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setObservaciones(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p10p2 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p10p2 entity) {
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
