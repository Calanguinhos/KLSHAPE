package com.calangos.mainApp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.calangos.mainApp.utils.$QueryCRUD;

/**
 * Created by rafael on 07/11/17.
 */

public class CRUD implements $QueryCRUD {

    private SQLiteDatabase db;
    private DB auxDb;

    public CRUD(Context context) {
        auxDb = new DB(context);
        this.db = auxDb.getWritableDatabase();
    }

    @Override
    public void insertSQL(String table, String nullColumnHack, ContentValues contentValues) {
        db.insert(table, nullColumnHack, contentValues);
    }

    @Override
    public void updateSQL(String table, ContentValues contentValues, String where, String[] whereArgs) {
        db.update(table, contentValues, where, whereArgs);
    }

    @Override
    public void deleteSQL(String table, String whereClause, String[] whereArgs) {
        db.delete(table, whereClause, whereArgs);
    }

    @Override
    public Cursor selectSQL(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {
        Cursor cursor = db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy, limit);
        return cursor;
    }
}
