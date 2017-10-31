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

    public dbControll() {

    }

    public dbControll(Context context){
        banco = new DataBase(context);
    }

    public String addAtleta(String nome, int rg, int cpf, String end, String email, String senha){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(DataBase.NOME, nome);
        valores.put(DataBase.EMAIL, email);
        valores.put(DataBase.END, end);
        valores.put(DataBase.SENHA, senha);
        valores.put(String.valueOf(DataBase.CPF), cpf);
        valores.put(String.valueOf(DataBase.RG), rg);

        resultado = db.insert("ATLETAS", null, valores);
        db.close();

        if (resultado == 1){
            return "Erro ao inserir";
        } else {
            return "Registro inserido";
        }

    }
}
