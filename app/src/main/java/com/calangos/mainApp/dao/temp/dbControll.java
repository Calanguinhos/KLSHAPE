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

    public String addAtleta(String nome, int rg, int cpf, String end, String email, String senha){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        //valores.put(DataBase.ID, );
        valores.put(DataBase.ALU_NOME, nome);
        valores.put(DataBase.ALU_EMAIL, email);
        valores.put(DataBase.ALU_END, end);
        valores.put(DataBase.ALU_SENHA, senha);
        valores.put(String.valueOf(DataBase.ALU_CPF), cpf);
        valores.put(String.valueOf(DataBase.ALU_RG), rg);

        resultado = db.insert("ALUNOS", null, valores);
        db.close();

        if (resultado ==-1){
            return "Erro ao inserir";
        } else {
            return "Registro inserido";
        }

    }
}
