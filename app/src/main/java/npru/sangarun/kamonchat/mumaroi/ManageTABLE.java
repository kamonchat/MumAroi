package npru.sangarun.kamonchat.mumaroi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by USER on 12/11/2558.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public ManageTABLE(Context context) {

        //Create & Connected Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    }   // Constructor
}   // Main Class
