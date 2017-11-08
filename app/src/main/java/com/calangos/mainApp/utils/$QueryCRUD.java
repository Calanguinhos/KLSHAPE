package com.calangos.mainApp.utils;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by rafael on 07/11/17.
 */

public interface $QueryCRUD {

    void insertSQL(String table, String nullColumnHack, ContentValues contentValues);

    void updateSQL(String table, ContentValues contentValues, String where, String[] whereArgs);

    void deleteSQL(String table, String whereClause, String[] whereArgs);

    Cursor selectSQL(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit);

}
