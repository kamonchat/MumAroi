package npru.sangarun.kamonchat.mumaroi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by USER on 12/11/2558.
 */
public class MyOpenHelper extends SQLiteOpenHelper{


    //Explicit
    private static final String DATABASE_NAME = "aroi.db";
    private  static  final int DATABASE_VERSION = 1;
    private  static final String CREATE_RESTAURANT_TABLE = "create table restaurantTABLE (" +
            "_id integer primary key, " +
            "Type text, " +
            "Name text, " +
            "Image integer, " +
            "Detait text, " +
            "Potential text, " +
            "Lat double, " +
            "Lng double, " +
            "Remark text);";


    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    } // Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_RESTAURANT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} // Main Class
