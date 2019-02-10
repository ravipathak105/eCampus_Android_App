package com.myecampus.ravi.project_e_campus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ravi on 9/20/2018.
 */

public class SqlliteDatabase extends SQLiteOpenHelper {

        public static  final String DBName="myDb";
        public static  final int DBVersion=1;
        public SqlliteDatabase(Context context) {
            super(context, DBName, null, DBVersion);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String studentSection="Create TABLE Student(userId VARCHAR , password VARCHAR ,name VARCHAR )";
            db.execSQL(studentSection);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }


