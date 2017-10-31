package com.calangos.mainApp.dao.temp;

/**
 * Created by Pichau on 30/10/2017.
 */
import android.content.Context;
import android.database.sqlite.*;


public class DataBase extends SQLiteOpenHelper{
    
    static final String NOME_BANCO = "KLShape.db";
    static final String TABELA  = "";
    static final int VERSAO = 1;
    
    static final String NOME = "";
    static final String END = "";
    static final int ID = 0;
    static final int CPF = 0;
    static final int RG = 0;
    static final String EMAIL = "";
    static final String SENHA = "";
    
    public DataBase(Context context) {
        
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptSQL.getCreateDATABASE());
        db.execSQL(ScriptSQL.getCreateALUNOS());
        db.execSQL(ScriptSQL.getCreateEXERCICIOS());
        db.execSQL(ScriptSQL.getCreateINSTRUTORES());
        db.execSQL(ScriptSQL.getCreateNOTIFICACOES());
        db.execSQL(ScriptSQL.getCreateTREINAMENTOS());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
    
}
