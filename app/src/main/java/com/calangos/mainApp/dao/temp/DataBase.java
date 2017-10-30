package com.calangos.mainApp.dao.temp;

/**
 * Created by Pichau on 30/10/2017.
 */
import android.content.Context;
import android.database.sqlite.*;


public class DataBase extends SQLiteOpenHelper{
    public DataBase(Context context) {
        super(context,"KLShape", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptSQL.getCreateAlunos());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
