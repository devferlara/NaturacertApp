package naturacert.baumsoft.dev.naturacert;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import naturacert.baumsoft.dev.naturacert.p1p1;
import naturacert.baumsoft.dev.naturacert.p1p2;
import naturacert.baumsoft.dev.naturacert.p1p3;
import naturacert.baumsoft.dev.naturacert.p1p4;
import naturacert.baumsoft.dev.naturacert.p1p5;
import naturacert.baumsoft.dev.naturacert.p1p6;
import naturacert.baumsoft.dev.naturacert.p1p7;
import naturacert.baumsoft.dev.naturacert.p1p8;
import naturacert.baumsoft.dev.naturacert.p1p9;
import naturacert.baumsoft.dev.naturacert.p1p10;
import naturacert.baumsoft.dev.naturacert.p1p11;
import naturacert.baumsoft.dev.naturacert.p2p1;
import naturacert.baumsoft.dev.naturacert.p2p2;
import naturacert.baumsoft.dev.naturacert.p2p3;
import naturacert.baumsoft.dev.naturacert.p2p4;
import naturacert.baumsoft.dev.naturacert.p2p5;
import naturacert.baumsoft.dev.naturacert.p2p6;
import naturacert.baumsoft.dev.naturacert.p2p7;
import naturacert.baumsoft.dev.naturacert.p2p8;
import naturacert.baumsoft.dev.naturacert.p2p9;
import naturacert.baumsoft.dev.naturacert.p3p1;
import naturacert.baumsoft.dev.naturacert.p3p2;
import naturacert.baumsoft.dev.naturacert.p3p3;
import naturacert.baumsoft.dev.naturacert.p3p4;
import naturacert.baumsoft.dev.naturacert.p3p5;
import naturacert.baumsoft.dev.naturacert.p3p6;
import naturacert.baumsoft.dev.naturacert.p4p1;
import naturacert.baumsoft.dev.naturacert.p4p2;
import naturacert.baumsoft.dev.naturacert.p4p3;
import naturacert.baumsoft.dev.naturacert.p4p4;
import naturacert.baumsoft.dev.naturacert.p4p5;
import naturacert.baumsoft.dev.naturacert.p4p6;
import naturacert.baumsoft.dev.naturacert.p4p7;
import naturacert.baumsoft.dev.naturacert.p4p8;
import naturacert.baumsoft.dev.naturacert.p4p9;
import naturacert.baumsoft.dev.naturacert.p5p1;
import naturacert.baumsoft.dev.naturacert.p5p2;
import naturacert.baumsoft.dev.naturacert.p5p3;
import naturacert.baumsoft.dev.naturacert.p5p4;
import naturacert.baumsoft.dev.naturacert.p5p5;
import naturacert.baumsoft.dev.naturacert.p5p6;
import naturacert.baumsoft.dev.naturacert.p5p7;
import naturacert.baumsoft.dev.naturacert.p5p8;
import naturacert.baumsoft.dev.naturacert.p5p9;
import naturacert.baumsoft.dev.naturacert.p5p10;
import naturacert.baumsoft.dev.naturacert.p5p11;
import naturacert.baumsoft.dev.naturacert.p5p12;
import naturacert.baumsoft.dev.naturacert.p5p13;
import naturacert.baumsoft.dev.naturacert.p5p14;
import naturacert.baumsoft.dev.naturacert.p5p15;
import naturacert.baumsoft.dev.naturacert.p5p16;
import naturacert.baumsoft.dev.naturacert.p5p17;
import naturacert.baumsoft.dev.naturacert.p5p18;
import naturacert.baumsoft.dev.naturacert.p5p19;
import naturacert.baumsoft.dev.naturacert.p6p1;
import naturacert.baumsoft.dev.naturacert.p6p2;
import naturacert.baumsoft.dev.naturacert.p6p3;
import naturacert.baumsoft.dev.naturacert.p6p4;
import naturacert.baumsoft.dev.naturacert.p6p5;
import naturacert.baumsoft.dev.naturacert.p6p6;
import naturacert.baumsoft.dev.naturacert.p6p7;
import naturacert.baumsoft.dev.naturacert.p6p8;
import naturacert.baumsoft.dev.naturacert.p6p9;
import naturacert.baumsoft.dev.naturacert.p6p10;
import naturacert.baumsoft.dev.naturacert.p6p11;
import naturacert.baumsoft.dev.naturacert.p6p12;
import naturacert.baumsoft.dev.naturacert.p6p13;
import naturacert.baumsoft.dev.naturacert.p6p14;
import naturacert.baumsoft.dev.naturacert.p6p15;
import naturacert.baumsoft.dev.naturacert.p6p16;
import naturacert.baumsoft.dev.naturacert.p6p17;
import naturacert.baumsoft.dev.naturacert.p6p18;
import naturacert.baumsoft.dev.naturacert.p6p19;
import naturacert.baumsoft.dev.naturacert.p6p20;
import naturacert.baumsoft.dev.naturacert.p7p1;
import naturacert.baumsoft.dev.naturacert.p7p2;
import naturacert.baumsoft.dev.naturacert.p7p3;
import naturacert.baumsoft.dev.naturacert.p7p4;
import naturacert.baumsoft.dev.naturacert.p7p5;
import naturacert.baumsoft.dev.naturacert.p7p6;
import naturacert.baumsoft.dev.naturacert.p8p1;
import naturacert.baumsoft.dev.naturacert.p8p2;
import naturacert.baumsoft.dev.naturacert.p8p3;
import naturacert.baumsoft.dev.naturacert.p8p4;
import naturacert.baumsoft.dev.naturacert.p8p5;
import naturacert.baumsoft.dev.naturacert.p8p6;
import naturacert.baumsoft.dev.naturacert.p8p7;
import naturacert.baumsoft.dev.naturacert.p8p8;
import naturacert.baumsoft.dev.naturacert.p8p9;
import naturacert.baumsoft.dev.naturacert.p9p1;
import naturacert.baumsoft.dev.naturacert.p9p2;
import naturacert.baumsoft.dev.naturacert.p9p3;
import naturacert.baumsoft.dev.naturacert.p9p4;
import naturacert.baumsoft.dev.naturacert.p9p5;
import naturacert.baumsoft.dev.naturacert.p10p1;
import naturacert.baumsoft.dev.naturacert.p10p2;
import naturacert.baumsoft.dev.naturacert.p10p3;
import naturacert.baumsoft.dev.naturacert.p10p4;
import naturacert.baumsoft.dev.naturacert.p10p5;
import naturacert.baumsoft.dev.naturacert.p10p6;
import naturacert.baumsoft.dev.naturacert.g1p1;
import naturacert.baumsoft.dev.naturacert.g1p2;
import naturacert.baumsoft.dev.naturacert.g1p3;
import naturacert.baumsoft.dev.naturacert.g1p4;
import naturacert.baumsoft.dev.naturacert.g2p1;
import naturacert.baumsoft.dev.naturacert.g2p2;
import naturacert.baumsoft.dev.naturacert.g2p3;
import naturacert.baumsoft.dev.naturacert.g3p1;
import naturacert.baumsoft.dev.naturacert.g3p2;
import naturacert.baumsoft.dev.naturacert.g3p3;
import naturacert.baumsoft.dev.naturacert.g3p4;
import naturacert.baumsoft.dev.naturacert.g3p5;
import naturacert.baumsoft.dev.naturacert.g3p6;
import naturacert.baumsoft.dev.naturacert.g3p7;
import naturacert.baumsoft.dev.naturacert.g3p8;
import naturacert.baumsoft.dev.naturacert.g3p9;
import naturacert.baumsoft.dev.naturacert.TokensBD;
import naturacert.baumsoft.dev.naturacert.Auditores;
import naturacert.baumsoft.dev.naturacert.Clientes;
import naturacert.baumsoft.dev.naturacert.Fincas;

import naturacert.baumsoft.dev.naturacert.p1p1Dao;
import naturacert.baumsoft.dev.naturacert.p1p2Dao;
import naturacert.baumsoft.dev.naturacert.p1p3Dao;
import naturacert.baumsoft.dev.naturacert.p1p4Dao;
import naturacert.baumsoft.dev.naturacert.p1p5Dao;
import naturacert.baumsoft.dev.naturacert.p1p6Dao;
import naturacert.baumsoft.dev.naturacert.p1p7Dao;
import naturacert.baumsoft.dev.naturacert.p1p8Dao;
import naturacert.baumsoft.dev.naturacert.p1p9Dao;
import naturacert.baumsoft.dev.naturacert.p1p10Dao;
import naturacert.baumsoft.dev.naturacert.p1p11Dao;
import naturacert.baumsoft.dev.naturacert.p2p1Dao;
import naturacert.baumsoft.dev.naturacert.p2p2Dao;
import naturacert.baumsoft.dev.naturacert.p2p3Dao;
import naturacert.baumsoft.dev.naturacert.p2p4Dao;
import naturacert.baumsoft.dev.naturacert.p2p5Dao;
import naturacert.baumsoft.dev.naturacert.p2p6Dao;
import naturacert.baumsoft.dev.naturacert.p2p7Dao;
import naturacert.baumsoft.dev.naturacert.p2p8Dao;
import naturacert.baumsoft.dev.naturacert.p2p9Dao;
import naturacert.baumsoft.dev.naturacert.p3p1Dao;
import naturacert.baumsoft.dev.naturacert.p3p2Dao;
import naturacert.baumsoft.dev.naturacert.p3p3Dao;
import naturacert.baumsoft.dev.naturacert.p3p4Dao;
import naturacert.baumsoft.dev.naturacert.p3p5Dao;
import naturacert.baumsoft.dev.naturacert.p3p6Dao;
import naturacert.baumsoft.dev.naturacert.p4p1Dao;
import naturacert.baumsoft.dev.naturacert.p4p2Dao;
import naturacert.baumsoft.dev.naturacert.p4p3Dao;
import naturacert.baumsoft.dev.naturacert.p4p4Dao;
import naturacert.baumsoft.dev.naturacert.p4p5Dao;
import naturacert.baumsoft.dev.naturacert.p4p6Dao;
import naturacert.baumsoft.dev.naturacert.p4p7Dao;
import naturacert.baumsoft.dev.naturacert.p4p8Dao;
import naturacert.baumsoft.dev.naturacert.p4p9Dao;
import naturacert.baumsoft.dev.naturacert.p5p1Dao;
import naturacert.baumsoft.dev.naturacert.p5p2Dao;
import naturacert.baumsoft.dev.naturacert.p5p3Dao;
import naturacert.baumsoft.dev.naturacert.p5p4Dao;
import naturacert.baumsoft.dev.naturacert.p5p5Dao;
import naturacert.baumsoft.dev.naturacert.p5p6Dao;
import naturacert.baumsoft.dev.naturacert.p5p7Dao;
import naturacert.baumsoft.dev.naturacert.p5p8Dao;
import naturacert.baumsoft.dev.naturacert.p5p9Dao;
import naturacert.baumsoft.dev.naturacert.p5p10Dao;
import naturacert.baumsoft.dev.naturacert.p5p11Dao;
import naturacert.baumsoft.dev.naturacert.p5p12Dao;
import naturacert.baumsoft.dev.naturacert.p5p13Dao;
import naturacert.baumsoft.dev.naturacert.p5p14Dao;
import naturacert.baumsoft.dev.naturacert.p5p15Dao;
import naturacert.baumsoft.dev.naturacert.p5p16Dao;
import naturacert.baumsoft.dev.naturacert.p5p17Dao;
import naturacert.baumsoft.dev.naturacert.p5p18Dao;
import naturacert.baumsoft.dev.naturacert.p5p19Dao;
import naturacert.baumsoft.dev.naturacert.p6p1Dao;
import naturacert.baumsoft.dev.naturacert.p6p2Dao;
import naturacert.baumsoft.dev.naturacert.p6p3Dao;
import naturacert.baumsoft.dev.naturacert.p6p4Dao;
import naturacert.baumsoft.dev.naturacert.p6p5Dao;
import naturacert.baumsoft.dev.naturacert.p6p6Dao;
import naturacert.baumsoft.dev.naturacert.p6p7Dao;
import naturacert.baumsoft.dev.naturacert.p6p8Dao;
import naturacert.baumsoft.dev.naturacert.p6p9Dao;
import naturacert.baumsoft.dev.naturacert.p6p10Dao;
import naturacert.baumsoft.dev.naturacert.p6p11Dao;
import naturacert.baumsoft.dev.naturacert.p6p12Dao;
import naturacert.baumsoft.dev.naturacert.p6p13Dao;
import naturacert.baumsoft.dev.naturacert.p6p14Dao;
import naturacert.baumsoft.dev.naturacert.p6p15Dao;
import naturacert.baumsoft.dev.naturacert.p6p16Dao;
import naturacert.baumsoft.dev.naturacert.p6p17Dao;
import naturacert.baumsoft.dev.naturacert.p6p18Dao;
import naturacert.baumsoft.dev.naturacert.p6p19Dao;
import naturacert.baumsoft.dev.naturacert.p6p20Dao;
import naturacert.baumsoft.dev.naturacert.p7p1Dao;
import naturacert.baumsoft.dev.naturacert.p7p2Dao;
import naturacert.baumsoft.dev.naturacert.p7p3Dao;
import naturacert.baumsoft.dev.naturacert.p7p4Dao;
import naturacert.baumsoft.dev.naturacert.p7p5Dao;
import naturacert.baumsoft.dev.naturacert.p7p6Dao;
import naturacert.baumsoft.dev.naturacert.p8p1Dao;
import naturacert.baumsoft.dev.naturacert.p8p2Dao;
import naturacert.baumsoft.dev.naturacert.p8p3Dao;
import naturacert.baumsoft.dev.naturacert.p8p4Dao;
import naturacert.baumsoft.dev.naturacert.p8p5Dao;
import naturacert.baumsoft.dev.naturacert.p8p6Dao;
import naturacert.baumsoft.dev.naturacert.p8p7Dao;
import naturacert.baumsoft.dev.naturacert.p8p8Dao;
import naturacert.baumsoft.dev.naturacert.p8p9Dao;
import naturacert.baumsoft.dev.naturacert.p9p1Dao;
import naturacert.baumsoft.dev.naturacert.p9p2Dao;
import naturacert.baumsoft.dev.naturacert.p9p3Dao;
import naturacert.baumsoft.dev.naturacert.p9p4Dao;
import naturacert.baumsoft.dev.naturacert.p9p5Dao;
import naturacert.baumsoft.dev.naturacert.p10p1Dao;
import naturacert.baumsoft.dev.naturacert.p10p2Dao;
import naturacert.baumsoft.dev.naturacert.p10p3Dao;
import naturacert.baumsoft.dev.naturacert.p10p4Dao;
import naturacert.baumsoft.dev.naturacert.p10p5Dao;
import naturacert.baumsoft.dev.naturacert.p10p6Dao;
import naturacert.baumsoft.dev.naturacert.g1p1Dao;
import naturacert.baumsoft.dev.naturacert.g1p2Dao;
import naturacert.baumsoft.dev.naturacert.g1p3Dao;
import naturacert.baumsoft.dev.naturacert.g1p4Dao;
import naturacert.baumsoft.dev.naturacert.g2p1Dao;
import naturacert.baumsoft.dev.naturacert.g2p2Dao;
import naturacert.baumsoft.dev.naturacert.g2p3Dao;
import naturacert.baumsoft.dev.naturacert.g3p1Dao;
import naturacert.baumsoft.dev.naturacert.g3p2Dao;
import naturacert.baumsoft.dev.naturacert.g3p3Dao;
import naturacert.baumsoft.dev.naturacert.g3p4Dao;
import naturacert.baumsoft.dev.naturacert.g3p5Dao;
import naturacert.baumsoft.dev.naturacert.g3p6Dao;
import naturacert.baumsoft.dev.naturacert.g3p7Dao;
import naturacert.baumsoft.dev.naturacert.g3p8Dao;
import naturacert.baumsoft.dev.naturacert.g3p9Dao;
import naturacert.baumsoft.dev.naturacert.TokensBDDao;
import naturacert.baumsoft.dev.naturacert.AuditoresDao;
import naturacert.baumsoft.dev.naturacert.ClientesDao;
import naturacert.baumsoft.dev.naturacert.FincasDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig p1p1DaoConfig;
    private final DaoConfig p1p2DaoConfig;
    private final DaoConfig p1p3DaoConfig;
    private final DaoConfig p1p4DaoConfig;
    private final DaoConfig p1p5DaoConfig;
    private final DaoConfig p1p6DaoConfig;
    private final DaoConfig p1p7DaoConfig;
    private final DaoConfig p1p8DaoConfig;
    private final DaoConfig p1p9DaoConfig;
    private final DaoConfig p1p10DaoConfig;
    private final DaoConfig p1p11DaoConfig;
    private final DaoConfig p2p1DaoConfig;
    private final DaoConfig p2p2DaoConfig;
    private final DaoConfig p2p3DaoConfig;
    private final DaoConfig p2p4DaoConfig;
    private final DaoConfig p2p5DaoConfig;
    private final DaoConfig p2p6DaoConfig;
    private final DaoConfig p2p7DaoConfig;
    private final DaoConfig p2p8DaoConfig;
    private final DaoConfig p2p9DaoConfig;
    private final DaoConfig p3p1DaoConfig;
    private final DaoConfig p3p2DaoConfig;
    private final DaoConfig p3p3DaoConfig;
    private final DaoConfig p3p4DaoConfig;
    private final DaoConfig p3p5DaoConfig;
    private final DaoConfig p3p6DaoConfig;
    private final DaoConfig p4p1DaoConfig;
    private final DaoConfig p4p2DaoConfig;
    private final DaoConfig p4p3DaoConfig;
    private final DaoConfig p4p4DaoConfig;
    private final DaoConfig p4p5DaoConfig;
    private final DaoConfig p4p6DaoConfig;
    private final DaoConfig p4p7DaoConfig;
    private final DaoConfig p4p8DaoConfig;
    private final DaoConfig p4p9DaoConfig;
    private final DaoConfig p5p1DaoConfig;
    private final DaoConfig p5p2DaoConfig;
    private final DaoConfig p5p3DaoConfig;
    private final DaoConfig p5p4DaoConfig;
    private final DaoConfig p5p5DaoConfig;
    private final DaoConfig p5p6DaoConfig;
    private final DaoConfig p5p7DaoConfig;
    private final DaoConfig p5p8DaoConfig;
    private final DaoConfig p5p9DaoConfig;
    private final DaoConfig p5p10DaoConfig;
    private final DaoConfig p5p11DaoConfig;
    private final DaoConfig p5p12DaoConfig;
    private final DaoConfig p5p13DaoConfig;
    private final DaoConfig p5p14DaoConfig;
    private final DaoConfig p5p15DaoConfig;
    private final DaoConfig p5p16DaoConfig;
    private final DaoConfig p5p17DaoConfig;
    private final DaoConfig p5p18DaoConfig;
    private final DaoConfig p5p19DaoConfig;
    private final DaoConfig p6p1DaoConfig;
    private final DaoConfig p6p2DaoConfig;
    private final DaoConfig p6p3DaoConfig;
    private final DaoConfig p6p4DaoConfig;
    private final DaoConfig p6p5DaoConfig;
    private final DaoConfig p6p6DaoConfig;
    private final DaoConfig p6p7DaoConfig;
    private final DaoConfig p6p8DaoConfig;
    private final DaoConfig p6p9DaoConfig;
    private final DaoConfig p6p10DaoConfig;
    private final DaoConfig p6p11DaoConfig;
    private final DaoConfig p6p12DaoConfig;
    private final DaoConfig p6p13DaoConfig;
    private final DaoConfig p6p14DaoConfig;
    private final DaoConfig p6p15DaoConfig;
    private final DaoConfig p6p16DaoConfig;
    private final DaoConfig p6p17DaoConfig;
    private final DaoConfig p6p18DaoConfig;
    private final DaoConfig p6p19DaoConfig;
    private final DaoConfig p6p20DaoConfig;
    private final DaoConfig p7p1DaoConfig;
    private final DaoConfig p7p2DaoConfig;
    private final DaoConfig p7p3DaoConfig;
    private final DaoConfig p7p4DaoConfig;
    private final DaoConfig p7p5DaoConfig;
    private final DaoConfig p7p6DaoConfig;
    private final DaoConfig p8p1DaoConfig;
    private final DaoConfig p8p2DaoConfig;
    private final DaoConfig p8p3DaoConfig;
    private final DaoConfig p8p4DaoConfig;
    private final DaoConfig p8p5DaoConfig;
    private final DaoConfig p8p6DaoConfig;
    private final DaoConfig p8p7DaoConfig;
    private final DaoConfig p8p8DaoConfig;
    private final DaoConfig p8p9DaoConfig;
    private final DaoConfig p9p1DaoConfig;
    private final DaoConfig p9p2DaoConfig;
    private final DaoConfig p9p3DaoConfig;
    private final DaoConfig p9p4DaoConfig;
    private final DaoConfig p9p5DaoConfig;
    private final DaoConfig p10p1DaoConfig;
    private final DaoConfig p10p2DaoConfig;
    private final DaoConfig p10p3DaoConfig;
    private final DaoConfig p10p4DaoConfig;
    private final DaoConfig p10p5DaoConfig;
    private final DaoConfig p10p6DaoConfig;
    private final DaoConfig g1p1DaoConfig;
    private final DaoConfig g1p2DaoConfig;
    private final DaoConfig g1p3DaoConfig;
    private final DaoConfig g1p4DaoConfig;
    private final DaoConfig g2p1DaoConfig;
    private final DaoConfig g2p2DaoConfig;
    private final DaoConfig g2p3DaoConfig;
    private final DaoConfig g3p1DaoConfig;
    private final DaoConfig g3p2DaoConfig;
    private final DaoConfig g3p3DaoConfig;
    private final DaoConfig g3p4DaoConfig;
    private final DaoConfig g3p5DaoConfig;
    private final DaoConfig g3p6DaoConfig;
    private final DaoConfig g3p7DaoConfig;
    private final DaoConfig g3p8DaoConfig;
    private final DaoConfig g3p9DaoConfig;
    private final DaoConfig tokensBDDaoConfig;
    private final DaoConfig auditoresDaoConfig;
    private final DaoConfig clientesDaoConfig;
    private final DaoConfig fincasDaoConfig;

    private final p1p1Dao p1p1Dao;
    private final p1p2Dao p1p2Dao;
    private final p1p3Dao p1p3Dao;
    private final p1p4Dao p1p4Dao;
    private final p1p5Dao p1p5Dao;
    private final p1p6Dao p1p6Dao;
    private final p1p7Dao p1p7Dao;
    private final p1p8Dao p1p8Dao;
    private final p1p9Dao p1p9Dao;
    private final p1p10Dao p1p10Dao;
    private final p1p11Dao p1p11Dao;
    private final p2p1Dao p2p1Dao;
    private final p2p2Dao p2p2Dao;
    private final p2p3Dao p2p3Dao;
    private final p2p4Dao p2p4Dao;
    private final p2p5Dao p2p5Dao;
    private final p2p6Dao p2p6Dao;
    private final p2p7Dao p2p7Dao;
    private final p2p8Dao p2p8Dao;
    private final p2p9Dao p2p9Dao;
    private final p3p1Dao p3p1Dao;
    private final p3p2Dao p3p2Dao;
    private final p3p3Dao p3p3Dao;
    private final p3p4Dao p3p4Dao;
    private final p3p5Dao p3p5Dao;
    private final p3p6Dao p3p6Dao;
    private final p4p1Dao p4p1Dao;
    private final p4p2Dao p4p2Dao;
    private final p4p3Dao p4p3Dao;
    private final p4p4Dao p4p4Dao;
    private final p4p5Dao p4p5Dao;
    private final p4p6Dao p4p6Dao;
    private final p4p7Dao p4p7Dao;
    private final p4p8Dao p4p8Dao;
    private final p4p9Dao p4p9Dao;
    private final p5p1Dao p5p1Dao;
    private final p5p2Dao p5p2Dao;
    private final p5p3Dao p5p3Dao;
    private final p5p4Dao p5p4Dao;
    private final p5p5Dao p5p5Dao;
    private final p5p6Dao p5p6Dao;
    private final p5p7Dao p5p7Dao;
    private final p5p8Dao p5p8Dao;
    private final p5p9Dao p5p9Dao;
    private final p5p10Dao p5p10Dao;
    private final p5p11Dao p5p11Dao;
    private final p5p12Dao p5p12Dao;
    private final p5p13Dao p5p13Dao;
    private final p5p14Dao p5p14Dao;
    private final p5p15Dao p5p15Dao;
    private final p5p16Dao p5p16Dao;
    private final p5p17Dao p5p17Dao;
    private final p5p18Dao p5p18Dao;
    private final p5p19Dao p5p19Dao;
    private final p6p1Dao p6p1Dao;
    private final p6p2Dao p6p2Dao;
    private final p6p3Dao p6p3Dao;
    private final p6p4Dao p6p4Dao;
    private final p6p5Dao p6p5Dao;
    private final p6p6Dao p6p6Dao;
    private final p6p7Dao p6p7Dao;
    private final p6p8Dao p6p8Dao;
    private final p6p9Dao p6p9Dao;
    private final p6p10Dao p6p10Dao;
    private final p6p11Dao p6p11Dao;
    private final p6p12Dao p6p12Dao;
    private final p6p13Dao p6p13Dao;
    private final p6p14Dao p6p14Dao;
    private final p6p15Dao p6p15Dao;
    private final p6p16Dao p6p16Dao;
    private final p6p17Dao p6p17Dao;
    private final p6p18Dao p6p18Dao;
    private final p6p19Dao p6p19Dao;
    private final p6p20Dao p6p20Dao;
    private final p7p1Dao p7p1Dao;
    private final p7p2Dao p7p2Dao;
    private final p7p3Dao p7p3Dao;
    private final p7p4Dao p7p4Dao;
    private final p7p5Dao p7p5Dao;
    private final p7p6Dao p7p6Dao;
    private final p8p1Dao p8p1Dao;
    private final p8p2Dao p8p2Dao;
    private final p8p3Dao p8p3Dao;
    private final p8p4Dao p8p4Dao;
    private final p8p5Dao p8p5Dao;
    private final p8p6Dao p8p6Dao;
    private final p8p7Dao p8p7Dao;
    private final p8p8Dao p8p8Dao;
    private final p8p9Dao p8p9Dao;
    private final p9p1Dao p9p1Dao;
    private final p9p2Dao p9p2Dao;
    private final p9p3Dao p9p3Dao;
    private final p9p4Dao p9p4Dao;
    private final p9p5Dao p9p5Dao;
    private final p10p1Dao p10p1Dao;
    private final p10p2Dao p10p2Dao;
    private final p10p3Dao p10p3Dao;
    private final p10p4Dao p10p4Dao;
    private final p10p5Dao p10p5Dao;
    private final p10p6Dao p10p6Dao;
    private final g1p1Dao g1p1Dao;
    private final g1p2Dao g1p2Dao;
    private final g1p3Dao g1p3Dao;
    private final g1p4Dao g1p4Dao;
    private final g2p1Dao g2p1Dao;
    private final g2p2Dao g2p2Dao;
    private final g2p3Dao g2p3Dao;
    private final g3p1Dao g3p1Dao;
    private final g3p2Dao g3p2Dao;
    private final g3p3Dao g3p3Dao;
    private final g3p4Dao g3p4Dao;
    private final g3p5Dao g3p5Dao;
    private final g3p6Dao g3p6Dao;
    private final g3p7Dao g3p7Dao;
    private final g3p8Dao g3p8Dao;
    private final g3p9Dao g3p9Dao;
    private final TokensBDDao tokensBDDao;
    private final AuditoresDao auditoresDao;
    private final ClientesDao clientesDao;
    private final FincasDao fincasDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        p1p1DaoConfig = daoConfigMap.get(p1p1Dao.class).clone();
        p1p1DaoConfig.initIdentityScope(type);

        p1p2DaoConfig = daoConfigMap.get(p1p2Dao.class).clone();
        p1p2DaoConfig.initIdentityScope(type);

        p1p3DaoConfig = daoConfigMap.get(p1p3Dao.class).clone();
        p1p3DaoConfig.initIdentityScope(type);

        p1p4DaoConfig = daoConfigMap.get(p1p4Dao.class).clone();
        p1p4DaoConfig.initIdentityScope(type);

        p1p5DaoConfig = daoConfigMap.get(p1p5Dao.class).clone();
        p1p5DaoConfig.initIdentityScope(type);

        p1p6DaoConfig = daoConfigMap.get(p1p6Dao.class).clone();
        p1p6DaoConfig.initIdentityScope(type);

        p1p7DaoConfig = daoConfigMap.get(p1p7Dao.class).clone();
        p1p7DaoConfig.initIdentityScope(type);

        p1p8DaoConfig = daoConfigMap.get(p1p8Dao.class).clone();
        p1p8DaoConfig.initIdentityScope(type);

        p1p9DaoConfig = daoConfigMap.get(p1p9Dao.class).clone();
        p1p9DaoConfig.initIdentityScope(type);

        p1p10DaoConfig = daoConfigMap.get(p1p10Dao.class).clone();
        p1p10DaoConfig.initIdentityScope(type);

        p1p11DaoConfig = daoConfigMap.get(p1p11Dao.class).clone();
        p1p11DaoConfig.initIdentityScope(type);

        p2p1DaoConfig = daoConfigMap.get(p2p1Dao.class).clone();
        p2p1DaoConfig.initIdentityScope(type);

        p2p2DaoConfig = daoConfigMap.get(p2p2Dao.class).clone();
        p2p2DaoConfig.initIdentityScope(type);

        p2p3DaoConfig = daoConfigMap.get(p2p3Dao.class).clone();
        p2p3DaoConfig.initIdentityScope(type);

        p2p4DaoConfig = daoConfigMap.get(p2p4Dao.class).clone();
        p2p4DaoConfig.initIdentityScope(type);

        p2p5DaoConfig = daoConfigMap.get(p2p5Dao.class).clone();
        p2p5DaoConfig.initIdentityScope(type);

        p2p6DaoConfig = daoConfigMap.get(p2p6Dao.class).clone();
        p2p6DaoConfig.initIdentityScope(type);

        p2p7DaoConfig = daoConfigMap.get(p2p7Dao.class).clone();
        p2p7DaoConfig.initIdentityScope(type);

        p2p8DaoConfig = daoConfigMap.get(p2p8Dao.class).clone();
        p2p8DaoConfig.initIdentityScope(type);

        p2p9DaoConfig = daoConfigMap.get(p2p9Dao.class).clone();
        p2p9DaoConfig.initIdentityScope(type);

        p3p1DaoConfig = daoConfigMap.get(p3p1Dao.class).clone();
        p3p1DaoConfig.initIdentityScope(type);

        p3p2DaoConfig = daoConfigMap.get(p3p2Dao.class).clone();
        p3p2DaoConfig.initIdentityScope(type);

        p3p3DaoConfig = daoConfigMap.get(p3p3Dao.class).clone();
        p3p3DaoConfig.initIdentityScope(type);

        p3p4DaoConfig = daoConfigMap.get(p3p4Dao.class).clone();
        p3p4DaoConfig.initIdentityScope(type);

        p3p5DaoConfig = daoConfigMap.get(p3p5Dao.class).clone();
        p3p5DaoConfig.initIdentityScope(type);

        p3p6DaoConfig = daoConfigMap.get(p3p6Dao.class).clone();
        p3p6DaoConfig.initIdentityScope(type);

        p4p1DaoConfig = daoConfigMap.get(p4p1Dao.class).clone();
        p4p1DaoConfig.initIdentityScope(type);

        p4p2DaoConfig = daoConfigMap.get(p4p2Dao.class).clone();
        p4p2DaoConfig.initIdentityScope(type);

        p4p3DaoConfig = daoConfigMap.get(p4p3Dao.class).clone();
        p4p3DaoConfig.initIdentityScope(type);

        p4p4DaoConfig = daoConfigMap.get(p4p4Dao.class).clone();
        p4p4DaoConfig.initIdentityScope(type);

        p4p5DaoConfig = daoConfigMap.get(p4p5Dao.class).clone();
        p4p5DaoConfig.initIdentityScope(type);

        p4p6DaoConfig = daoConfigMap.get(p4p6Dao.class).clone();
        p4p6DaoConfig.initIdentityScope(type);

        p4p7DaoConfig = daoConfigMap.get(p4p7Dao.class).clone();
        p4p7DaoConfig.initIdentityScope(type);

        p4p8DaoConfig = daoConfigMap.get(p4p8Dao.class).clone();
        p4p8DaoConfig.initIdentityScope(type);

        p4p9DaoConfig = daoConfigMap.get(p4p9Dao.class).clone();
        p4p9DaoConfig.initIdentityScope(type);

        p5p1DaoConfig = daoConfigMap.get(p5p1Dao.class).clone();
        p5p1DaoConfig.initIdentityScope(type);

        p5p2DaoConfig = daoConfigMap.get(p5p2Dao.class).clone();
        p5p2DaoConfig.initIdentityScope(type);

        p5p3DaoConfig = daoConfigMap.get(p5p3Dao.class).clone();
        p5p3DaoConfig.initIdentityScope(type);

        p5p4DaoConfig = daoConfigMap.get(p5p4Dao.class).clone();
        p5p4DaoConfig.initIdentityScope(type);

        p5p5DaoConfig = daoConfigMap.get(p5p5Dao.class).clone();
        p5p5DaoConfig.initIdentityScope(type);

        p5p6DaoConfig = daoConfigMap.get(p5p6Dao.class).clone();
        p5p6DaoConfig.initIdentityScope(type);

        p5p7DaoConfig = daoConfigMap.get(p5p7Dao.class).clone();
        p5p7DaoConfig.initIdentityScope(type);

        p5p8DaoConfig = daoConfigMap.get(p5p8Dao.class).clone();
        p5p8DaoConfig.initIdentityScope(type);

        p5p9DaoConfig = daoConfigMap.get(p5p9Dao.class).clone();
        p5p9DaoConfig.initIdentityScope(type);

        p5p10DaoConfig = daoConfigMap.get(p5p10Dao.class).clone();
        p5p10DaoConfig.initIdentityScope(type);

        p5p11DaoConfig = daoConfigMap.get(p5p11Dao.class).clone();
        p5p11DaoConfig.initIdentityScope(type);

        p5p12DaoConfig = daoConfigMap.get(p5p12Dao.class).clone();
        p5p12DaoConfig.initIdentityScope(type);

        p5p13DaoConfig = daoConfigMap.get(p5p13Dao.class).clone();
        p5p13DaoConfig.initIdentityScope(type);

        p5p14DaoConfig = daoConfigMap.get(p5p14Dao.class).clone();
        p5p14DaoConfig.initIdentityScope(type);

        p5p15DaoConfig = daoConfigMap.get(p5p15Dao.class).clone();
        p5p15DaoConfig.initIdentityScope(type);

        p5p16DaoConfig = daoConfigMap.get(p5p16Dao.class).clone();
        p5p16DaoConfig.initIdentityScope(type);

        p5p17DaoConfig = daoConfigMap.get(p5p17Dao.class).clone();
        p5p17DaoConfig.initIdentityScope(type);

        p5p18DaoConfig = daoConfigMap.get(p5p18Dao.class).clone();
        p5p18DaoConfig.initIdentityScope(type);

        p5p19DaoConfig = daoConfigMap.get(p5p19Dao.class).clone();
        p5p19DaoConfig.initIdentityScope(type);

        p6p1DaoConfig = daoConfigMap.get(p6p1Dao.class).clone();
        p6p1DaoConfig.initIdentityScope(type);

        p6p2DaoConfig = daoConfigMap.get(p6p2Dao.class).clone();
        p6p2DaoConfig.initIdentityScope(type);

        p6p3DaoConfig = daoConfigMap.get(p6p3Dao.class).clone();
        p6p3DaoConfig.initIdentityScope(type);

        p6p4DaoConfig = daoConfigMap.get(p6p4Dao.class).clone();
        p6p4DaoConfig.initIdentityScope(type);

        p6p5DaoConfig = daoConfigMap.get(p6p5Dao.class).clone();
        p6p5DaoConfig.initIdentityScope(type);

        p6p6DaoConfig = daoConfigMap.get(p6p6Dao.class).clone();
        p6p6DaoConfig.initIdentityScope(type);

        p6p7DaoConfig = daoConfigMap.get(p6p7Dao.class).clone();
        p6p7DaoConfig.initIdentityScope(type);

        p6p8DaoConfig = daoConfigMap.get(p6p8Dao.class).clone();
        p6p8DaoConfig.initIdentityScope(type);

        p6p9DaoConfig = daoConfigMap.get(p6p9Dao.class).clone();
        p6p9DaoConfig.initIdentityScope(type);

        p6p10DaoConfig = daoConfigMap.get(p6p10Dao.class).clone();
        p6p10DaoConfig.initIdentityScope(type);

        p6p11DaoConfig = daoConfigMap.get(p6p11Dao.class).clone();
        p6p11DaoConfig.initIdentityScope(type);

        p6p12DaoConfig = daoConfigMap.get(p6p12Dao.class).clone();
        p6p12DaoConfig.initIdentityScope(type);

        p6p13DaoConfig = daoConfigMap.get(p6p13Dao.class).clone();
        p6p13DaoConfig.initIdentityScope(type);

        p6p14DaoConfig = daoConfigMap.get(p6p14Dao.class).clone();
        p6p14DaoConfig.initIdentityScope(type);

        p6p15DaoConfig = daoConfigMap.get(p6p15Dao.class).clone();
        p6p15DaoConfig.initIdentityScope(type);

        p6p16DaoConfig = daoConfigMap.get(p6p16Dao.class).clone();
        p6p16DaoConfig.initIdentityScope(type);

        p6p17DaoConfig = daoConfigMap.get(p6p17Dao.class).clone();
        p6p17DaoConfig.initIdentityScope(type);

        p6p18DaoConfig = daoConfigMap.get(p6p18Dao.class).clone();
        p6p18DaoConfig.initIdentityScope(type);

        p6p19DaoConfig = daoConfigMap.get(p6p19Dao.class).clone();
        p6p19DaoConfig.initIdentityScope(type);

        p6p20DaoConfig = daoConfigMap.get(p6p20Dao.class).clone();
        p6p20DaoConfig.initIdentityScope(type);

        p7p1DaoConfig = daoConfigMap.get(p7p1Dao.class).clone();
        p7p1DaoConfig.initIdentityScope(type);

        p7p2DaoConfig = daoConfigMap.get(p7p2Dao.class).clone();
        p7p2DaoConfig.initIdentityScope(type);

        p7p3DaoConfig = daoConfigMap.get(p7p3Dao.class).clone();
        p7p3DaoConfig.initIdentityScope(type);

        p7p4DaoConfig = daoConfigMap.get(p7p4Dao.class).clone();
        p7p4DaoConfig.initIdentityScope(type);

        p7p5DaoConfig = daoConfigMap.get(p7p5Dao.class).clone();
        p7p5DaoConfig.initIdentityScope(type);

        p7p6DaoConfig = daoConfigMap.get(p7p6Dao.class).clone();
        p7p6DaoConfig.initIdentityScope(type);

        p8p1DaoConfig = daoConfigMap.get(p8p1Dao.class).clone();
        p8p1DaoConfig.initIdentityScope(type);

        p8p2DaoConfig = daoConfigMap.get(p8p2Dao.class).clone();
        p8p2DaoConfig.initIdentityScope(type);

        p8p3DaoConfig = daoConfigMap.get(p8p3Dao.class).clone();
        p8p3DaoConfig.initIdentityScope(type);

        p8p4DaoConfig = daoConfigMap.get(p8p4Dao.class).clone();
        p8p4DaoConfig.initIdentityScope(type);

        p8p5DaoConfig = daoConfigMap.get(p8p5Dao.class).clone();
        p8p5DaoConfig.initIdentityScope(type);

        p8p6DaoConfig = daoConfigMap.get(p8p6Dao.class).clone();
        p8p6DaoConfig.initIdentityScope(type);

        p8p7DaoConfig = daoConfigMap.get(p8p7Dao.class).clone();
        p8p7DaoConfig.initIdentityScope(type);

        p8p8DaoConfig = daoConfigMap.get(p8p8Dao.class).clone();
        p8p8DaoConfig.initIdentityScope(type);

        p8p9DaoConfig = daoConfigMap.get(p8p9Dao.class).clone();
        p8p9DaoConfig.initIdentityScope(type);

        p9p1DaoConfig = daoConfigMap.get(p9p1Dao.class).clone();
        p9p1DaoConfig.initIdentityScope(type);

        p9p2DaoConfig = daoConfigMap.get(p9p2Dao.class).clone();
        p9p2DaoConfig.initIdentityScope(type);

        p9p3DaoConfig = daoConfigMap.get(p9p3Dao.class).clone();
        p9p3DaoConfig.initIdentityScope(type);

        p9p4DaoConfig = daoConfigMap.get(p9p4Dao.class).clone();
        p9p4DaoConfig.initIdentityScope(type);

        p9p5DaoConfig = daoConfigMap.get(p9p5Dao.class).clone();
        p9p5DaoConfig.initIdentityScope(type);

        p10p1DaoConfig = daoConfigMap.get(p10p1Dao.class).clone();
        p10p1DaoConfig.initIdentityScope(type);

        p10p2DaoConfig = daoConfigMap.get(p10p2Dao.class).clone();
        p10p2DaoConfig.initIdentityScope(type);

        p10p3DaoConfig = daoConfigMap.get(p10p3Dao.class).clone();
        p10p3DaoConfig.initIdentityScope(type);

        p10p4DaoConfig = daoConfigMap.get(p10p4Dao.class).clone();
        p10p4DaoConfig.initIdentityScope(type);

        p10p5DaoConfig = daoConfigMap.get(p10p5Dao.class).clone();
        p10p5DaoConfig.initIdentityScope(type);

        p10p6DaoConfig = daoConfigMap.get(p10p6Dao.class).clone();
        p10p6DaoConfig.initIdentityScope(type);

        g1p1DaoConfig = daoConfigMap.get(g1p1Dao.class).clone();
        g1p1DaoConfig.initIdentityScope(type);

        g1p2DaoConfig = daoConfigMap.get(g1p2Dao.class).clone();
        g1p2DaoConfig.initIdentityScope(type);

        g1p3DaoConfig = daoConfigMap.get(g1p3Dao.class).clone();
        g1p3DaoConfig.initIdentityScope(type);

        g1p4DaoConfig = daoConfigMap.get(g1p4Dao.class).clone();
        g1p4DaoConfig.initIdentityScope(type);

        g2p1DaoConfig = daoConfigMap.get(g2p1Dao.class).clone();
        g2p1DaoConfig.initIdentityScope(type);

        g2p2DaoConfig = daoConfigMap.get(g2p2Dao.class).clone();
        g2p2DaoConfig.initIdentityScope(type);

        g2p3DaoConfig = daoConfigMap.get(g2p3Dao.class).clone();
        g2p3DaoConfig.initIdentityScope(type);

        g3p1DaoConfig = daoConfigMap.get(g3p1Dao.class).clone();
        g3p1DaoConfig.initIdentityScope(type);

        g3p2DaoConfig = daoConfigMap.get(g3p2Dao.class).clone();
        g3p2DaoConfig.initIdentityScope(type);

        g3p3DaoConfig = daoConfigMap.get(g3p3Dao.class).clone();
        g3p3DaoConfig.initIdentityScope(type);

        g3p4DaoConfig = daoConfigMap.get(g3p4Dao.class).clone();
        g3p4DaoConfig.initIdentityScope(type);

        g3p5DaoConfig = daoConfigMap.get(g3p5Dao.class).clone();
        g3p5DaoConfig.initIdentityScope(type);

        g3p6DaoConfig = daoConfigMap.get(g3p6Dao.class).clone();
        g3p6DaoConfig.initIdentityScope(type);

        g3p7DaoConfig = daoConfigMap.get(g3p7Dao.class).clone();
        g3p7DaoConfig.initIdentityScope(type);

        g3p8DaoConfig = daoConfigMap.get(g3p8Dao.class).clone();
        g3p8DaoConfig.initIdentityScope(type);

        g3p9DaoConfig = daoConfigMap.get(g3p9Dao.class).clone();
        g3p9DaoConfig.initIdentityScope(type);

        tokensBDDaoConfig = daoConfigMap.get(TokensBDDao.class).clone();
        tokensBDDaoConfig.initIdentityScope(type);

        auditoresDaoConfig = daoConfigMap.get(AuditoresDao.class).clone();
        auditoresDaoConfig.initIdentityScope(type);

        clientesDaoConfig = daoConfigMap.get(ClientesDao.class).clone();
        clientesDaoConfig.initIdentityScope(type);

        fincasDaoConfig = daoConfigMap.get(FincasDao.class).clone();
        fincasDaoConfig.initIdentityScope(type);

        p1p1Dao = new p1p1Dao(p1p1DaoConfig, this);
        p1p2Dao = new p1p2Dao(p1p2DaoConfig, this);
        p1p3Dao = new p1p3Dao(p1p3DaoConfig, this);
        p1p4Dao = new p1p4Dao(p1p4DaoConfig, this);
        p1p5Dao = new p1p5Dao(p1p5DaoConfig, this);
        p1p6Dao = new p1p6Dao(p1p6DaoConfig, this);
        p1p7Dao = new p1p7Dao(p1p7DaoConfig, this);
        p1p8Dao = new p1p8Dao(p1p8DaoConfig, this);
        p1p9Dao = new p1p9Dao(p1p9DaoConfig, this);
        p1p10Dao = new p1p10Dao(p1p10DaoConfig, this);
        p1p11Dao = new p1p11Dao(p1p11DaoConfig, this);
        p2p1Dao = new p2p1Dao(p2p1DaoConfig, this);
        p2p2Dao = new p2p2Dao(p2p2DaoConfig, this);
        p2p3Dao = new p2p3Dao(p2p3DaoConfig, this);
        p2p4Dao = new p2p4Dao(p2p4DaoConfig, this);
        p2p5Dao = new p2p5Dao(p2p5DaoConfig, this);
        p2p6Dao = new p2p6Dao(p2p6DaoConfig, this);
        p2p7Dao = new p2p7Dao(p2p7DaoConfig, this);
        p2p8Dao = new p2p8Dao(p2p8DaoConfig, this);
        p2p9Dao = new p2p9Dao(p2p9DaoConfig, this);
        p3p1Dao = new p3p1Dao(p3p1DaoConfig, this);
        p3p2Dao = new p3p2Dao(p3p2DaoConfig, this);
        p3p3Dao = new p3p3Dao(p3p3DaoConfig, this);
        p3p4Dao = new p3p4Dao(p3p4DaoConfig, this);
        p3p5Dao = new p3p5Dao(p3p5DaoConfig, this);
        p3p6Dao = new p3p6Dao(p3p6DaoConfig, this);
        p4p1Dao = new p4p1Dao(p4p1DaoConfig, this);
        p4p2Dao = new p4p2Dao(p4p2DaoConfig, this);
        p4p3Dao = new p4p3Dao(p4p3DaoConfig, this);
        p4p4Dao = new p4p4Dao(p4p4DaoConfig, this);
        p4p5Dao = new p4p5Dao(p4p5DaoConfig, this);
        p4p6Dao = new p4p6Dao(p4p6DaoConfig, this);
        p4p7Dao = new p4p7Dao(p4p7DaoConfig, this);
        p4p8Dao = new p4p8Dao(p4p8DaoConfig, this);
        p4p9Dao = new p4p9Dao(p4p9DaoConfig, this);
        p5p1Dao = new p5p1Dao(p5p1DaoConfig, this);
        p5p2Dao = new p5p2Dao(p5p2DaoConfig, this);
        p5p3Dao = new p5p3Dao(p5p3DaoConfig, this);
        p5p4Dao = new p5p4Dao(p5p4DaoConfig, this);
        p5p5Dao = new p5p5Dao(p5p5DaoConfig, this);
        p5p6Dao = new p5p6Dao(p5p6DaoConfig, this);
        p5p7Dao = new p5p7Dao(p5p7DaoConfig, this);
        p5p8Dao = new p5p8Dao(p5p8DaoConfig, this);
        p5p9Dao = new p5p9Dao(p5p9DaoConfig, this);
        p5p10Dao = new p5p10Dao(p5p10DaoConfig, this);
        p5p11Dao = new p5p11Dao(p5p11DaoConfig, this);
        p5p12Dao = new p5p12Dao(p5p12DaoConfig, this);
        p5p13Dao = new p5p13Dao(p5p13DaoConfig, this);
        p5p14Dao = new p5p14Dao(p5p14DaoConfig, this);
        p5p15Dao = new p5p15Dao(p5p15DaoConfig, this);
        p5p16Dao = new p5p16Dao(p5p16DaoConfig, this);
        p5p17Dao = new p5p17Dao(p5p17DaoConfig, this);
        p5p18Dao = new p5p18Dao(p5p18DaoConfig, this);
        p5p19Dao = new p5p19Dao(p5p19DaoConfig, this);
        p6p1Dao = new p6p1Dao(p6p1DaoConfig, this);
        p6p2Dao = new p6p2Dao(p6p2DaoConfig, this);
        p6p3Dao = new p6p3Dao(p6p3DaoConfig, this);
        p6p4Dao = new p6p4Dao(p6p4DaoConfig, this);
        p6p5Dao = new p6p5Dao(p6p5DaoConfig, this);
        p6p6Dao = new p6p6Dao(p6p6DaoConfig, this);
        p6p7Dao = new p6p7Dao(p6p7DaoConfig, this);
        p6p8Dao = new p6p8Dao(p6p8DaoConfig, this);
        p6p9Dao = new p6p9Dao(p6p9DaoConfig, this);
        p6p10Dao = new p6p10Dao(p6p10DaoConfig, this);
        p6p11Dao = new p6p11Dao(p6p11DaoConfig, this);
        p6p12Dao = new p6p12Dao(p6p12DaoConfig, this);
        p6p13Dao = new p6p13Dao(p6p13DaoConfig, this);
        p6p14Dao = new p6p14Dao(p6p14DaoConfig, this);
        p6p15Dao = new p6p15Dao(p6p15DaoConfig, this);
        p6p16Dao = new p6p16Dao(p6p16DaoConfig, this);
        p6p17Dao = new p6p17Dao(p6p17DaoConfig, this);
        p6p18Dao = new p6p18Dao(p6p18DaoConfig, this);
        p6p19Dao = new p6p19Dao(p6p19DaoConfig, this);
        p6p20Dao = new p6p20Dao(p6p20DaoConfig, this);
        p7p1Dao = new p7p1Dao(p7p1DaoConfig, this);
        p7p2Dao = new p7p2Dao(p7p2DaoConfig, this);
        p7p3Dao = new p7p3Dao(p7p3DaoConfig, this);
        p7p4Dao = new p7p4Dao(p7p4DaoConfig, this);
        p7p5Dao = new p7p5Dao(p7p5DaoConfig, this);
        p7p6Dao = new p7p6Dao(p7p6DaoConfig, this);
        p8p1Dao = new p8p1Dao(p8p1DaoConfig, this);
        p8p2Dao = new p8p2Dao(p8p2DaoConfig, this);
        p8p3Dao = new p8p3Dao(p8p3DaoConfig, this);
        p8p4Dao = new p8p4Dao(p8p4DaoConfig, this);
        p8p5Dao = new p8p5Dao(p8p5DaoConfig, this);
        p8p6Dao = new p8p6Dao(p8p6DaoConfig, this);
        p8p7Dao = new p8p7Dao(p8p7DaoConfig, this);
        p8p8Dao = new p8p8Dao(p8p8DaoConfig, this);
        p8p9Dao = new p8p9Dao(p8p9DaoConfig, this);
        p9p1Dao = new p9p1Dao(p9p1DaoConfig, this);
        p9p2Dao = new p9p2Dao(p9p2DaoConfig, this);
        p9p3Dao = new p9p3Dao(p9p3DaoConfig, this);
        p9p4Dao = new p9p4Dao(p9p4DaoConfig, this);
        p9p5Dao = new p9p5Dao(p9p5DaoConfig, this);
        p10p1Dao = new p10p1Dao(p10p1DaoConfig, this);
        p10p2Dao = new p10p2Dao(p10p2DaoConfig, this);
        p10p3Dao = new p10p3Dao(p10p3DaoConfig, this);
        p10p4Dao = new p10p4Dao(p10p4DaoConfig, this);
        p10p5Dao = new p10p5Dao(p10p5DaoConfig, this);
        p10p6Dao = new p10p6Dao(p10p6DaoConfig, this);
        g1p1Dao = new g1p1Dao(g1p1DaoConfig, this);
        g1p2Dao = new g1p2Dao(g1p2DaoConfig, this);
        g1p3Dao = new g1p3Dao(g1p3DaoConfig, this);
        g1p4Dao = new g1p4Dao(g1p4DaoConfig, this);
        g2p1Dao = new g2p1Dao(g2p1DaoConfig, this);
        g2p2Dao = new g2p2Dao(g2p2DaoConfig, this);
        g2p3Dao = new g2p3Dao(g2p3DaoConfig, this);
        g3p1Dao = new g3p1Dao(g3p1DaoConfig, this);
        g3p2Dao = new g3p2Dao(g3p2DaoConfig, this);
        g3p3Dao = new g3p3Dao(g3p3DaoConfig, this);
        g3p4Dao = new g3p4Dao(g3p4DaoConfig, this);
        g3p5Dao = new g3p5Dao(g3p5DaoConfig, this);
        g3p6Dao = new g3p6Dao(g3p6DaoConfig, this);
        g3p7Dao = new g3p7Dao(g3p7DaoConfig, this);
        g3p8Dao = new g3p8Dao(g3p8DaoConfig, this);
        g3p9Dao = new g3p9Dao(g3p9DaoConfig, this);
        tokensBDDao = new TokensBDDao(tokensBDDaoConfig, this);
        auditoresDao = new AuditoresDao(auditoresDaoConfig, this);
        clientesDao = new ClientesDao(clientesDaoConfig, this);
        fincasDao = new FincasDao(fincasDaoConfig, this);

        registerDao(p1p1.class, p1p1Dao);
        registerDao(p1p2.class, p1p2Dao);
        registerDao(p1p3.class, p1p3Dao);
        registerDao(p1p4.class, p1p4Dao);
        registerDao(p1p5.class, p1p5Dao);
        registerDao(p1p6.class, p1p6Dao);
        registerDao(p1p7.class, p1p7Dao);
        registerDao(p1p8.class, p1p8Dao);
        registerDao(p1p9.class, p1p9Dao);
        registerDao(p1p10.class, p1p10Dao);
        registerDao(p1p11.class, p1p11Dao);
        registerDao(p2p1.class, p2p1Dao);
        registerDao(p2p2.class, p2p2Dao);
        registerDao(p2p3.class, p2p3Dao);
        registerDao(p2p4.class, p2p4Dao);
        registerDao(p2p5.class, p2p5Dao);
        registerDao(p2p6.class, p2p6Dao);
        registerDao(p2p7.class, p2p7Dao);
        registerDao(p2p8.class, p2p8Dao);
        registerDao(p2p9.class, p2p9Dao);
        registerDao(p3p1.class, p3p1Dao);
        registerDao(p3p2.class, p3p2Dao);
        registerDao(p3p3.class, p3p3Dao);
        registerDao(p3p4.class, p3p4Dao);
        registerDao(p3p5.class, p3p5Dao);
        registerDao(p3p6.class, p3p6Dao);
        registerDao(p4p1.class, p4p1Dao);
        registerDao(p4p2.class, p4p2Dao);
        registerDao(p4p3.class, p4p3Dao);
        registerDao(p4p4.class, p4p4Dao);
        registerDao(p4p5.class, p4p5Dao);
        registerDao(p4p6.class, p4p6Dao);
        registerDao(p4p7.class, p4p7Dao);
        registerDao(p4p8.class, p4p8Dao);
        registerDao(p4p9.class, p4p9Dao);
        registerDao(p5p1.class, p5p1Dao);
        registerDao(p5p2.class, p5p2Dao);
        registerDao(p5p3.class, p5p3Dao);
        registerDao(p5p4.class, p5p4Dao);
        registerDao(p5p5.class, p5p5Dao);
        registerDao(p5p6.class, p5p6Dao);
        registerDao(p5p7.class, p5p7Dao);
        registerDao(p5p8.class, p5p8Dao);
        registerDao(p5p9.class, p5p9Dao);
        registerDao(p5p10.class, p5p10Dao);
        registerDao(p5p11.class, p5p11Dao);
        registerDao(p5p12.class, p5p12Dao);
        registerDao(p5p13.class, p5p13Dao);
        registerDao(p5p14.class, p5p14Dao);
        registerDao(p5p15.class, p5p15Dao);
        registerDao(p5p16.class, p5p16Dao);
        registerDao(p5p17.class, p5p17Dao);
        registerDao(p5p18.class, p5p18Dao);
        registerDao(p5p19.class, p5p19Dao);
        registerDao(p6p1.class, p6p1Dao);
        registerDao(p6p2.class, p6p2Dao);
        registerDao(p6p3.class, p6p3Dao);
        registerDao(p6p4.class, p6p4Dao);
        registerDao(p6p5.class, p6p5Dao);
        registerDao(p6p6.class, p6p6Dao);
        registerDao(p6p7.class, p6p7Dao);
        registerDao(p6p8.class, p6p8Dao);
        registerDao(p6p9.class, p6p9Dao);
        registerDao(p6p10.class, p6p10Dao);
        registerDao(p6p11.class, p6p11Dao);
        registerDao(p6p12.class, p6p12Dao);
        registerDao(p6p13.class, p6p13Dao);
        registerDao(p6p14.class, p6p14Dao);
        registerDao(p6p15.class, p6p15Dao);
        registerDao(p6p16.class, p6p16Dao);
        registerDao(p6p17.class, p6p17Dao);
        registerDao(p6p18.class, p6p18Dao);
        registerDao(p6p19.class, p6p19Dao);
        registerDao(p6p20.class, p6p20Dao);
        registerDao(p7p1.class, p7p1Dao);
        registerDao(p7p2.class, p7p2Dao);
        registerDao(p7p3.class, p7p3Dao);
        registerDao(p7p4.class, p7p4Dao);
        registerDao(p7p5.class, p7p5Dao);
        registerDao(p7p6.class, p7p6Dao);
        registerDao(p8p1.class, p8p1Dao);
        registerDao(p8p2.class, p8p2Dao);
        registerDao(p8p3.class, p8p3Dao);
        registerDao(p8p4.class, p8p4Dao);
        registerDao(p8p5.class, p8p5Dao);
        registerDao(p8p6.class, p8p6Dao);
        registerDao(p8p7.class, p8p7Dao);
        registerDao(p8p8.class, p8p8Dao);
        registerDao(p8p9.class, p8p9Dao);
        registerDao(p9p1.class, p9p1Dao);
        registerDao(p9p2.class, p9p2Dao);
        registerDao(p9p3.class, p9p3Dao);
        registerDao(p9p4.class, p9p4Dao);
        registerDao(p9p5.class, p9p5Dao);
        registerDao(p10p1.class, p10p1Dao);
        registerDao(p10p2.class, p10p2Dao);
        registerDao(p10p3.class, p10p3Dao);
        registerDao(p10p4.class, p10p4Dao);
        registerDao(p10p5.class, p10p5Dao);
        registerDao(p10p6.class, p10p6Dao);
        registerDao(g1p1.class, g1p1Dao);
        registerDao(g1p2.class, g1p2Dao);
        registerDao(g1p3.class, g1p3Dao);
        registerDao(g1p4.class, g1p4Dao);
        registerDao(g2p1.class, g2p1Dao);
        registerDao(g2p2.class, g2p2Dao);
        registerDao(g2p3.class, g2p3Dao);
        registerDao(g3p1.class, g3p1Dao);
        registerDao(g3p2.class, g3p2Dao);
        registerDao(g3p3.class, g3p3Dao);
        registerDao(g3p4.class, g3p4Dao);
        registerDao(g3p5.class, g3p5Dao);
        registerDao(g3p6.class, g3p6Dao);
        registerDao(g3p7.class, g3p7Dao);
        registerDao(g3p8.class, g3p8Dao);
        registerDao(g3p9.class, g3p9Dao);
        registerDao(TokensBD.class, tokensBDDao);
        registerDao(Auditores.class, auditoresDao);
        registerDao(Clientes.class, clientesDao);
        registerDao(Fincas.class, fincasDao);
    }
    
    public void clear() {
        p1p1DaoConfig.getIdentityScope().clear();
        p1p2DaoConfig.getIdentityScope().clear();
        p1p3DaoConfig.getIdentityScope().clear();
        p1p4DaoConfig.getIdentityScope().clear();
        p1p5DaoConfig.getIdentityScope().clear();
        p1p6DaoConfig.getIdentityScope().clear();
        p1p7DaoConfig.getIdentityScope().clear();
        p1p8DaoConfig.getIdentityScope().clear();
        p1p9DaoConfig.getIdentityScope().clear();
        p1p10DaoConfig.getIdentityScope().clear();
        p1p11DaoConfig.getIdentityScope().clear();
        p2p1DaoConfig.getIdentityScope().clear();
        p2p2DaoConfig.getIdentityScope().clear();
        p2p3DaoConfig.getIdentityScope().clear();
        p2p4DaoConfig.getIdentityScope().clear();
        p2p5DaoConfig.getIdentityScope().clear();
        p2p6DaoConfig.getIdentityScope().clear();
        p2p7DaoConfig.getIdentityScope().clear();
        p2p8DaoConfig.getIdentityScope().clear();
        p2p9DaoConfig.getIdentityScope().clear();
        p3p1DaoConfig.getIdentityScope().clear();
        p3p2DaoConfig.getIdentityScope().clear();
        p3p3DaoConfig.getIdentityScope().clear();
        p3p4DaoConfig.getIdentityScope().clear();
        p3p5DaoConfig.getIdentityScope().clear();
        p3p6DaoConfig.getIdentityScope().clear();
        p4p1DaoConfig.getIdentityScope().clear();
        p4p2DaoConfig.getIdentityScope().clear();
        p4p3DaoConfig.getIdentityScope().clear();
        p4p4DaoConfig.getIdentityScope().clear();
        p4p5DaoConfig.getIdentityScope().clear();
        p4p6DaoConfig.getIdentityScope().clear();
        p4p7DaoConfig.getIdentityScope().clear();
        p4p8DaoConfig.getIdentityScope().clear();
        p4p9DaoConfig.getIdentityScope().clear();
        p5p1DaoConfig.getIdentityScope().clear();
        p5p2DaoConfig.getIdentityScope().clear();
        p5p3DaoConfig.getIdentityScope().clear();
        p5p4DaoConfig.getIdentityScope().clear();
        p5p5DaoConfig.getIdentityScope().clear();
        p5p6DaoConfig.getIdentityScope().clear();
        p5p7DaoConfig.getIdentityScope().clear();
        p5p8DaoConfig.getIdentityScope().clear();
        p5p9DaoConfig.getIdentityScope().clear();
        p5p10DaoConfig.getIdentityScope().clear();
        p5p11DaoConfig.getIdentityScope().clear();
        p5p12DaoConfig.getIdentityScope().clear();
        p5p13DaoConfig.getIdentityScope().clear();
        p5p14DaoConfig.getIdentityScope().clear();
        p5p15DaoConfig.getIdentityScope().clear();
        p5p16DaoConfig.getIdentityScope().clear();
        p5p17DaoConfig.getIdentityScope().clear();
        p5p18DaoConfig.getIdentityScope().clear();
        p5p19DaoConfig.getIdentityScope().clear();
        p6p1DaoConfig.getIdentityScope().clear();
        p6p2DaoConfig.getIdentityScope().clear();
        p6p3DaoConfig.getIdentityScope().clear();
        p6p4DaoConfig.getIdentityScope().clear();
        p6p5DaoConfig.getIdentityScope().clear();
        p6p6DaoConfig.getIdentityScope().clear();
        p6p7DaoConfig.getIdentityScope().clear();
        p6p8DaoConfig.getIdentityScope().clear();
        p6p9DaoConfig.getIdentityScope().clear();
        p6p10DaoConfig.getIdentityScope().clear();
        p6p11DaoConfig.getIdentityScope().clear();
        p6p12DaoConfig.getIdentityScope().clear();
        p6p13DaoConfig.getIdentityScope().clear();
        p6p14DaoConfig.getIdentityScope().clear();
        p6p15DaoConfig.getIdentityScope().clear();
        p6p16DaoConfig.getIdentityScope().clear();
        p6p17DaoConfig.getIdentityScope().clear();
        p6p18DaoConfig.getIdentityScope().clear();
        p6p19DaoConfig.getIdentityScope().clear();
        p6p20DaoConfig.getIdentityScope().clear();
        p7p1DaoConfig.getIdentityScope().clear();
        p7p2DaoConfig.getIdentityScope().clear();
        p7p3DaoConfig.getIdentityScope().clear();
        p7p4DaoConfig.getIdentityScope().clear();
        p7p5DaoConfig.getIdentityScope().clear();
        p7p6DaoConfig.getIdentityScope().clear();
        p8p1DaoConfig.getIdentityScope().clear();
        p8p2DaoConfig.getIdentityScope().clear();
        p8p3DaoConfig.getIdentityScope().clear();
        p8p4DaoConfig.getIdentityScope().clear();
        p8p5DaoConfig.getIdentityScope().clear();
        p8p6DaoConfig.getIdentityScope().clear();
        p8p7DaoConfig.getIdentityScope().clear();
        p8p8DaoConfig.getIdentityScope().clear();
        p8p9DaoConfig.getIdentityScope().clear();
        p9p1DaoConfig.getIdentityScope().clear();
        p9p2DaoConfig.getIdentityScope().clear();
        p9p3DaoConfig.getIdentityScope().clear();
        p9p4DaoConfig.getIdentityScope().clear();
        p9p5DaoConfig.getIdentityScope().clear();
        p10p1DaoConfig.getIdentityScope().clear();
        p10p2DaoConfig.getIdentityScope().clear();
        p10p3DaoConfig.getIdentityScope().clear();
        p10p4DaoConfig.getIdentityScope().clear();
        p10p5DaoConfig.getIdentityScope().clear();
        p10p6DaoConfig.getIdentityScope().clear();
        g1p1DaoConfig.getIdentityScope().clear();
        g1p2DaoConfig.getIdentityScope().clear();
        g1p3DaoConfig.getIdentityScope().clear();
        g1p4DaoConfig.getIdentityScope().clear();
        g2p1DaoConfig.getIdentityScope().clear();
        g2p2DaoConfig.getIdentityScope().clear();
        g2p3DaoConfig.getIdentityScope().clear();
        g3p1DaoConfig.getIdentityScope().clear();
        g3p2DaoConfig.getIdentityScope().clear();
        g3p3DaoConfig.getIdentityScope().clear();
        g3p4DaoConfig.getIdentityScope().clear();
        g3p5DaoConfig.getIdentityScope().clear();
        g3p6DaoConfig.getIdentityScope().clear();
        g3p7DaoConfig.getIdentityScope().clear();
        g3p8DaoConfig.getIdentityScope().clear();
        g3p9DaoConfig.getIdentityScope().clear();
        tokensBDDaoConfig.getIdentityScope().clear();
        auditoresDaoConfig.getIdentityScope().clear();
        clientesDaoConfig.getIdentityScope().clear();
        fincasDaoConfig.getIdentityScope().clear();
    }

    public p1p1Dao getP1p1Dao() {
        return p1p1Dao;
    }

    public p1p2Dao getP1p2Dao() {
        return p1p2Dao;
    }

    public p1p3Dao getP1p3Dao() {
        return p1p3Dao;
    }

    public p1p4Dao getP1p4Dao() {
        return p1p4Dao;
    }

    public p1p5Dao getP1p5Dao() {
        return p1p5Dao;
    }

    public p1p6Dao getP1p6Dao() {
        return p1p6Dao;
    }

    public p1p7Dao getP1p7Dao() {
        return p1p7Dao;
    }

    public p1p8Dao getP1p8Dao() {
        return p1p8Dao;
    }

    public p1p9Dao getP1p9Dao() {
        return p1p9Dao;
    }

    public p1p10Dao getP1p10Dao() {
        return p1p10Dao;
    }

    public p1p11Dao getP1p11Dao() {
        return p1p11Dao;
    }

    public p2p1Dao getP2p1Dao() {
        return p2p1Dao;
    }

    public p2p2Dao getP2p2Dao() {
        return p2p2Dao;
    }

    public p2p3Dao getP2p3Dao() {
        return p2p3Dao;
    }

    public p2p4Dao getP2p4Dao() {
        return p2p4Dao;
    }

    public p2p5Dao getP2p5Dao() {
        return p2p5Dao;
    }

    public p2p6Dao getP2p6Dao() {
        return p2p6Dao;
    }

    public p2p7Dao getP2p7Dao() {
        return p2p7Dao;
    }

    public p2p8Dao getP2p8Dao() {
        return p2p8Dao;
    }

    public p2p9Dao getP2p9Dao() {
        return p2p9Dao;
    }

    public p3p1Dao getP3p1Dao() {
        return p3p1Dao;
    }

    public p3p2Dao getP3p2Dao() {
        return p3p2Dao;
    }

    public p3p3Dao getP3p3Dao() {
        return p3p3Dao;
    }

    public p3p4Dao getP3p4Dao() {
        return p3p4Dao;
    }

    public p3p5Dao getP3p5Dao() {
        return p3p5Dao;
    }

    public p3p6Dao getP3p6Dao() {
        return p3p6Dao;
    }

    public p4p1Dao getP4p1Dao() {
        return p4p1Dao;
    }

    public p4p2Dao getP4p2Dao() {
        return p4p2Dao;
    }

    public p4p3Dao getP4p3Dao() {
        return p4p3Dao;
    }

    public p4p4Dao getP4p4Dao() {
        return p4p4Dao;
    }

    public p4p5Dao getP4p5Dao() {
        return p4p5Dao;
    }

    public p4p6Dao getP4p6Dao() {
        return p4p6Dao;
    }

    public p4p7Dao getP4p7Dao() {
        return p4p7Dao;
    }

    public p4p8Dao getP4p8Dao() {
        return p4p8Dao;
    }

    public p4p9Dao getP4p9Dao() {
        return p4p9Dao;
    }

    public p5p1Dao getP5p1Dao() {
        return p5p1Dao;
    }

    public p5p2Dao getP5p2Dao() {
        return p5p2Dao;
    }

    public p5p3Dao getP5p3Dao() {
        return p5p3Dao;
    }

    public p5p4Dao getP5p4Dao() {
        return p5p4Dao;
    }

    public p5p5Dao getP5p5Dao() {
        return p5p5Dao;
    }

    public p5p6Dao getP5p6Dao() {
        return p5p6Dao;
    }

    public p5p7Dao getP5p7Dao() {
        return p5p7Dao;
    }

    public p5p8Dao getP5p8Dao() {
        return p5p8Dao;
    }

    public p5p9Dao getP5p9Dao() {
        return p5p9Dao;
    }

    public p5p10Dao getP5p10Dao() {
        return p5p10Dao;
    }

    public p5p11Dao getP5p11Dao() {
        return p5p11Dao;
    }

    public p5p12Dao getP5p12Dao() {
        return p5p12Dao;
    }

    public p5p13Dao getP5p13Dao() {
        return p5p13Dao;
    }

    public p5p14Dao getP5p14Dao() {
        return p5p14Dao;
    }

    public p5p15Dao getP5p15Dao() {
        return p5p15Dao;
    }

    public p5p16Dao getP5p16Dao() {
        return p5p16Dao;
    }

    public p5p17Dao getP5p17Dao() {
        return p5p17Dao;
    }

    public p5p18Dao getP5p18Dao() {
        return p5p18Dao;
    }

    public p5p19Dao getP5p19Dao() {
        return p5p19Dao;
    }

    public p6p1Dao getP6p1Dao() {
        return p6p1Dao;
    }

    public p6p2Dao getP6p2Dao() {
        return p6p2Dao;
    }

    public p6p3Dao getP6p3Dao() {
        return p6p3Dao;
    }

    public p6p4Dao getP6p4Dao() {
        return p6p4Dao;
    }

    public p6p5Dao getP6p5Dao() {
        return p6p5Dao;
    }

    public p6p6Dao getP6p6Dao() {
        return p6p6Dao;
    }

    public p6p7Dao getP6p7Dao() {
        return p6p7Dao;
    }

    public p6p8Dao getP6p8Dao() {
        return p6p8Dao;
    }

    public p6p9Dao getP6p9Dao() {
        return p6p9Dao;
    }

    public p6p10Dao getP6p10Dao() {
        return p6p10Dao;
    }

    public p6p11Dao getP6p11Dao() {
        return p6p11Dao;
    }

    public p6p12Dao getP6p12Dao() {
        return p6p12Dao;
    }

    public p6p13Dao getP6p13Dao() {
        return p6p13Dao;
    }

    public p6p14Dao getP6p14Dao() {
        return p6p14Dao;
    }

    public p6p15Dao getP6p15Dao() {
        return p6p15Dao;
    }

    public p6p16Dao getP6p16Dao() {
        return p6p16Dao;
    }

    public p6p17Dao getP6p17Dao() {
        return p6p17Dao;
    }

    public p6p18Dao getP6p18Dao() {
        return p6p18Dao;
    }

    public p6p19Dao getP6p19Dao() {
        return p6p19Dao;
    }

    public p6p20Dao getP6p20Dao() {
        return p6p20Dao;
    }

    public p7p1Dao getP7p1Dao() {
        return p7p1Dao;
    }

    public p7p2Dao getP7p2Dao() {
        return p7p2Dao;
    }

    public p7p3Dao getP7p3Dao() {
        return p7p3Dao;
    }

    public p7p4Dao getP7p4Dao() {
        return p7p4Dao;
    }

    public p7p5Dao getP7p5Dao() {
        return p7p5Dao;
    }

    public p7p6Dao getP7p6Dao() {
        return p7p6Dao;
    }

    public p8p1Dao getP8p1Dao() {
        return p8p1Dao;
    }

    public p8p2Dao getP8p2Dao() {
        return p8p2Dao;
    }

    public p8p3Dao getP8p3Dao() {
        return p8p3Dao;
    }

    public p8p4Dao getP8p4Dao() {
        return p8p4Dao;
    }

    public p8p5Dao getP8p5Dao() {
        return p8p5Dao;
    }

    public p8p6Dao getP8p6Dao() {
        return p8p6Dao;
    }

    public p8p7Dao getP8p7Dao() {
        return p8p7Dao;
    }

    public p8p8Dao getP8p8Dao() {
        return p8p8Dao;
    }

    public p8p9Dao getP8p9Dao() {
        return p8p9Dao;
    }

    public p9p1Dao getP9p1Dao() {
        return p9p1Dao;
    }

    public p9p2Dao getP9p2Dao() {
        return p9p2Dao;
    }

    public p9p3Dao getP9p3Dao() {
        return p9p3Dao;
    }

    public p9p4Dao getP9p4Dao() {
        return p9p4Dao;
    }

    public p9p5Dao getP9p5Dao() {
        return p9p5Dao;
    }

    public p10p1Dao getP10p1Dao() {
        return p10p1Dao;
    }

    public p10p2Dao getP10p2Dao() {
        return p10p2Dao;
    }

    public p10p3Dao getP10p3Dao() {
        return p10p3Dao;
    }

    public p10p4Dao getP10p4Dao() {
        return p10p4Dao;
    }

    public p10p5Dao getP10p5Dao() {
        return p10p5Dao;
    }

    public p10p6Dao getP10p6Dao() {
        return p10p6Dao;
    }

    public g1p1Dao getG1p1Dao() {
        return g1p1Dao;
    }

    public g1p2Dao getG1p2Dao() {
        return g1p2Dao;
    }

    public g1p3Dao getG1p3Dao() {
        return g1p3Dao;
    }

    public g1p4Dao getG1p4Dao() {
        return g1p4Dao;
    }

    public g2p1Dao getG2p1Dao() {
        return g2p1Dao;
    }

    public g2p2Dao getG2p2Dao() {
        return g2p2Dao;
    }

    public g2p3Dao getG2p3Dao() {
        return g2p3Dao;
    }

    public g3p1Dao getG3p1Dao() {
        return g3p1Dao;
    }

    public g3p2Dao getG3p2Dao() {
        return g3p2Dao;
    }

    public g3p3Dao getG3p3Dao() {
        return g3p3Dao;
    }

    public g3p4Dao getG3p4Dao() {
        return g3p4Dao;
    }

    public g3p5Dao getG3p5Dao() {
        return g3p5Dao;
    }

    public g3p6Dao getG3p6Dao() {
        return g3p6Dao;
    }

    public g3p7Dao getG3p7Dao() {
        return g3p7Dao;
    }

    public g3p8Dao getG3p8Dao() {
        return g3p8Dao;
    }

    public g3p9Dao getG3p9Dao() {
        return g3p9Dao;
    }

    public TokensBDDao getTokensBDDao() {
        return tokensBDDao;
    }

    public AuditoresDao getAuditoresDao() {
        return auditoresDao;
    }

    public ClientesDao getClientesDao() {
        return clientesDao;
    }

    public FincasDao getFincasDao() {
        return fincasDao;
    }

}
