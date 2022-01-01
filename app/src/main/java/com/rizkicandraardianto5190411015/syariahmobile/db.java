package com.rizkicandraardianto5190411015.syariahmobile;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class db extends SQLiteOpenHelper {
    public db(Context context) {
        super(context, "Userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userdetails(nohp TEXT primary key, pin TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists Userdetails");
    }

    public boolean login(String nohp, String pin){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from Userdetails where nohp=? and pin=?", new String[]{nohp, pin});
        if (cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }
}
