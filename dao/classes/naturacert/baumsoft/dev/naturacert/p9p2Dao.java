package naturacert.baumsoft.dev.naturacert;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p9p2;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table P9P2.
*/
public class p9p2Dao extends AbstractDao<p9p2, Long> {

    public static final String TABLENAME = "P9P2";

    /**
     * Properties of entity p9p2.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fpfs = new Property(1, Integer.class, "fpfs", false, "FPFS");
        public final static Property Epfs = new Property(2, Integer.class, "epfs", false, "EPFS");
        public final static Property Cyps = new Property(3, Integer.class, "cyps", false, "CYPS");
        public final static Property Aps = new Property(4, Integer.class, "aps", false, "APS");
        public final static Property Apc = new Property(5, Integer.class, "apc", false, "APC");
        public final static Property Mues = new Property(6, Integer.class, "mues", false, "MUES");
        public final static Property Tap = new Property(7, Integer.class, "tap", false, "TAP");
        public final static Property Tds = new Property(8, Integer.class, "tds", false, "TDS");
        public final static Property Raa = new Property(9, Integer.class, "raa", false, "RAA");
        public final static Property Zon = new Property(10, Integer.class, "zon", false, "ZON");
        public final static Property Dfin = new Property(11, Integer.class, "dfin", false, "DFIN");
        public final static Property Dfec = new Property(12, String.class, "dfec", false, "DFEC");
        public final static Property Casp = new Property(13, Integer.class, "casp", false, "CASP");
        public final static Property Afoi = new Property(14, Integer.class, "afoi", false, "AFOI");
        public final static Property Rect = new Property(15, Integer.class, "rect", false, "RECT");
        public final static Property Ureo = new Property(16, Integer.class, "ureo", false, "UREO");
        public final static Property Origen = new Property(17, Integer.class, "origen", false, "ORIGEN");
        public final static Property Id_formulario = new Property(18, Integer.class, "id_formulario", false, "ID_FORMULARIO");
        public final static Property Observaciones = new Property(19, String.class, "observaciones", false, "OBSERVACIONES");
    };


    public p9p2Dao(DaoConfig config) {
        super(config);
    }
    
    public p9p2Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'P9P2' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'FPFS' INTEGER," + // 1: fpfs
                "'EPFS' INTEGER," + // 2: epfs
                "'CYPS' INTEGER," + // 3: cyps
                "'APS' INTEGER," + // 4: aps
                "'APC' INTEGER," + // 5: apc
                "'MUES' INTEGER," + // 6: mues
                "'TAP' INTEGER," + // 7: tap
                "'TDS' INTEGER," + // 8: tds
                "'RAA' INTEGER," + // 9: raa
                "'ZON' INTEGER," + // 10: zon
                "'DFIN' INTEGER," + // 11: dfin
                "'DFEC' TEXT," + // 12: dfec
                "'CASP' INTEGER," + // 13: casp
                "'AFOI' INTEGER," + // 14: afoi
                "'RECT' INTEGER," + // 15: rect
                "'UREO' INTEGER," + // 16: ureo
                "'ORIGEN' INTEGER," + // 17: origen
                "'ID_FORMULARIO' INTEGER," + // 18: id_formulario
                "'OBSERVACIONES' TEXT);"); // 19: observaciones
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'P9P2'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, p9p2 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer fpfs = entity.getFpfs();
        if (fpfs != null) {
            stmt.bindLong(2, fpfs);
        }
 
        Integer epfs = entity.getEpfs();
        if (epfs != null) {
            stmt.bindLong(3, epfs);
        }
 
        Integer cyps = entity.getCyps();
        if (cyps != null) {
            stmt.bindLong(4, cyps);
        }
 
        Integer aps = entity.getAps();
        if (aps != null) {
            stmt.bindLong(5, aps);
        }
 
        Integer apc = entity.getApc();
        if (apc != null) {
            stmt.bindLong(6, apc);
        }
 
        Integer mues = entity.getMues();
        if (mues != null) {
            stmt.bindLong(7, mues);
        }
 
        Integer tap = entity.getTap();
        if (tap != null) {
            stmt.bindLong(8, tap);
        }
 
        Integer tds = entity.getTds();
        if (tds != null) {
            stmt.bindLong(9, tds);
        }
 
        Integer raa = entity.getRaa();
        if (raa != null) {
            stmt.bindLong(10, raa);
        }
 
        Integer zon = entity.getZon();
        if (zon != null) {
            stmt.bindLong(11, zon);
        }
 
        Integer dfin = entity.getDfin();
        if (dfin != null) {
            stmt.bindLong(12, dfin);
        }
 
        String dfec = entity.getDfec();
        if (dfec != null) {
            stmt.bindString(13, dfec);
        }
 
        Integer casp = entity.getCasp();
        if (casp != null) {
            stmt.bindLong(14, casp);
        }
 
        Integer afoi = entity.getAfoi();
        if (afoi != null) {
            stmt.bindLong(15, afoi);
        }
 
        Integer rect = entity.getRect();
        if (rect != null) {
            stmt.bindLong(16, rect);
        }
 
        Integer ureo = entity.getUreo();
        if (ureo != null) {
            stmt.bindLong(17, ureo);
        }
 
        Integer origen = entity.getOrigen();
        if (origen != null) {
            stmt.bindLong(18, origen);
        }
 
        Integer id_formulario = entity.getId_formulario();
        if (id_formulario != null) {
            stmt.bindLong(19, id_formulario);
        }
 
        String observaciones = entity.getObservaciones();
        if (observaciones != null) {
            stmt.bindString(20, observaciones);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public p9p2 readEntity(Cursor cursor, int offset) {
        p9p2 entity = new p9p2( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // fpfs
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // epfs
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // cyps
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // aps
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // apc
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // mues
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // tap
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // tds
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // raa
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // zon
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // dfin
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // dfec
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // casp
            cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14), // afoi
            cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15), // rect
            cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16), // ureo
            cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17), // origen
            cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18), // id_formulario
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19) // observaciones
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, p9p2 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFpfs(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setEpfs(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setCyps(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setAps(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setApc(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setMues(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setTap(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setTds(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setRaa(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setZon(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setDfin(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setDfec(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setCasp(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setAfoi(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
        entity.setRect(cursor.isNull(offset + 15) ? null : cursor.getInt(offset + 15));
        entity.setUreo(cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16));
        entity.setOrigen(cursor.isNull(offset + 17) ? null : cursor.getInt(offset + 17));
        entity.setId_formulario(cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18));
        entity.setObservaciones(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(p9p2 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(p9p2 entity) {
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
