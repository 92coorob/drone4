package com.example.robert.drone4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "UserManager.db";
    private static final String TABLE_USER = "user";
    private static final String COLUMN_USER_ID = "user_ID";
    private static final String COLUMN_USER_NAME = "user_name";
    private static final String COLUMN_USER_SURNAME = "user_Surname";
    private static final String COLUMN_USER_ADRESS1 = "user_Address1";
    private static final String COLUMN_USER_ADRESS2 = "user_Address2";
    private static final String COLUMN_USER_POSTCODE = "user_postcode";
    private static final String COLUMN_USER_DATE_OF_BIRTH = "user_date_of_birth";
    private static final String COLUMN_USER_USERNAME = "user_username";
    private static final String COLUMN_USER_PASSWORD = "user_password";

    private String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "(" + COLUMN_USER_ID +
            "INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_USER_NAME + "TEXT," + COLUMN_USER_SURNAME
            + "TEXT" + COLUMN_USER_ADRESS1 + "TEXT" + COLUMN_USER_ADRESS2 + "TEXT" + COLUMN_USER_POSTCODE
            + "TEXT" + COLUMN_USER_DATE_OF_BIRTH + "TEXT" + COLUMN_USER_USERNAME + "TEXT" +
            COLUMN_USER_PASSWORD + "TEXT" + ")";

    private String DROP_USER_TABLE = "DROP TABLE IF EXISTS  " + TABLE_USER;


    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(DROP_USER_TABLE);
        onCreate(db);

    }

    public void addUser(User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USER_NAME, user.getName());
        values.put(COLUMN_USER_SURNAME, user.getSurname());
        values.put(COLUMN_USER_ADRESS1, user.getAddress1());
        values.put(COLUMN_USER_ADRESS2, user.getAddress2());
        values.put(COLUMN_USER_POSTCODE, user.getPostCode());
        values.put(COLUMN_USER_DATE_OF_BIRTH, user.getDateofBirth());
        values.put(COLUMN_USER_USERNAME, user.getUserName());
        values.put(COLUMN_USER_PASSWORD, user.getPassword());

        db.insert(TABLE_USER, null, values);
        db.close();
    }

    public boolean checkUser(String username){
        String[] columns = {
                COLUMN_USER_ID
        };
        SQLiteDatabase db = this.getWritableDatabase();
        String selection = COLUMN_USER_USERNAME + " = ?";
        String[] selectionArgs =  { username };

        Cursor cursor = db.query(TABLE_USER,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null,
                null);
        int curserCount = cursor.getCount();
        cursor.close();
        db.close();

        if (curserCount > 0 ){
            return true;
        }

        return false;
    }
}

