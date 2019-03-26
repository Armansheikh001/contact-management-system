package com.example.contactmanagementapp.SQL_Lite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Cms.db";
    private static final String TABLE_NAME = "users";
    private static final String TABLE_NAME2 = "ermergency";
    private static final String TABLE_NAME3 = "employe";
    private static final String TABLE_NAME4 = "office_config";

    private static final String U_ID = "_id";
    private static final String U_NAME = "name";
    private static final String U_CATAGORY = "catagory";
    private static final String U_ADDRESS = "address";
    private static final String U_EMAIL = "email";
    private static final String U_DESCRIPTION = "dscription";
    private static final String U_PROFILEPIC = "pic";
    private static final String U_LOGO = "logo";
    private static final String PASS = "password";
    private static final String U_MOBILE = "phone";
    private static final int DB_VERSION = 2;
    private static final String USER_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + U_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + U_NAME + " VARCHAR(255), " + U_MOBILE + " VARCHAR(255) , " + PASS + " VARCHAR(25));";
    private static final String EMERGENCY_TABLE = "CREATE TABLE " + TABLE_NAME2 + "(" + U_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + U_CATAGORY + " VARCHAR(255), " + U_NAME + " VARCHAR(255), " + U_MOBILE + " VARCHAR(255) , " + U_ADDRESS + " VARCHAR(255));";
    private static final String EMPLOYE_TABLE = "CREATE TABLE " + TABLE_NAME3 + "(" + U_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + U_EMAIL + " VARCHAR(255), " + U_NAME + " VARCHAR(255), " + U_MOBILE + " VARCHAR(255) , " + U_DESCRIPTION + " VARCHAR(255) ," + U_PROFILEPIC + " VARCHAR(255));";
    private static final String SETTING_TABLE = "CREATE TABLE " + TABLE_NAME4 + "(" + U_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + U_LOGO + " VARCHAR(255), " + U_MOBILE + " VARCHAR(255) , " + U_EMAIL + " VARCHAR(255) ," + U_ADDRESS + " VARCHAR(255));";
    private Context context;

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;


    public MyDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {
            db.execSQL(USER_TABLE);
            db.execSQL(EMERGENCY_TABLE);
            db.execSQL(EMPLOYE_TABLE);
            db.execSQL(SETTING_TABLE);
            Toast.makeText(context, " OnCreate is Called ", Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            Toast.makeText(context, " Exception " + e, Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


        try {
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Toast.makeText(context, " onUpgrade is Called ", Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            Toast.makeText(context, " Exception " + e, Toast.LENGTH_LONG).show();

        }
    }
}
