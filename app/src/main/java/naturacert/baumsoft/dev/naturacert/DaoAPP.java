package naturacert.baumsoft.dev.naturacert;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by imac on 7/29/15.
 */
public class DaoAPP extends Application {

    public static DaoSession daoSession;

    @Override
    public void onCreate(){
        super.onCreate();

        try{
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(getApplicationContext(), "app-db", null);
            SQLiteDatabase db = helper.getWritableDatabase();
            DaoMaster daoMaster = new DaoMaster(db);
            daoSession = daoMaster.newSession();
        } catch (Exception e){
            Log.d("Exeption", e.toString());
        }


    }

}
