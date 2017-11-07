package com.calangos.mainApp.dao.temp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by rafael on 31/10/17.
 */

public class dbControll {

    private SQLiteDatabase db;
    private DataBase banco;

    public dbControll(Context context){

        banco = new DataBase(context);

    }

    public String addAtleta(String nome, long rg, long cpf, String end, String email, String senha){

        String result = "";
        String sql;
        sql = "INSERT INTO ALUNOS (ALU_NOME, ALU_RG, ALU_CPF, ALU_ENDERECO, ALU_EMAIL_, ALU_SENHA) VALUES" +
        "(?,?,?,?,?,?);";
        db.execSQL(sql,new String[]{nome, String.valueOf(rg), String.valueOf(cpf),end,email,senha});
        db.close();
        return result;
    }
}
