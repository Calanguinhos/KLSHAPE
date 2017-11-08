package com.calangos.mainApp.dao.temp;

/**
 * Created by Pichau on 30/10/2017.
 */
import android.content.Context;
import android.database.sqlite.*;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;


public class DataBase extends SQLiteOpenHelper{
    
    static final String NOME_BANCO = "KLShape.sqlite";
    static final String TABELA  = "";
    static final int VERSAO = 1;
    private SQLiteDatabase sqLiteDatabase;
    
    static final String ALU_NOME = "Alu_nome";
    static final String ALU_END = "Alu_endereco";
    static final String ALU_CPF = "Alu_cpf";
    static final String ALU_RG = "Alu_rg";
    static final String ALU_EMAIL = "Alu_email";
    static final String ALU_SENHA = "Alu_senha";
    
    public DataBase(Context context) {
        
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db = openOrCreateDatabase(NOME_BANCO, null);
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