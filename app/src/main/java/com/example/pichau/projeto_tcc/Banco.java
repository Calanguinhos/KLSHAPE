package com.example.pichau.projeto_tcc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pichau on 18/09/2017.
 */

public class Banco extends SQLiteOpenHelper

    {


        static final String Nome_Banco = "banco.dp";
        static final String ALUNO = "Usuarios";
        static final String ID = "_id";
        static final String NOME = "Nome";
        static final String IDADE = "Idade";
        static final String RG = "RG";
        static final String CPF = "CPF";
        static final String ENDERECO = "Endereco";
        static final String EMAIL = "Email";
        static final String SENHA = "SENHA";
        static final int VERSAO = 1;



    public Banco(Context context) {

        super(context, Nome_Banco, null, VERSAO);
    }

        @Override
        public void onCreate (SQLiteDatabase db){
        db.execSQL("create table Usuarios(_id integer primary key autoincrement, Nome text not null,Idade text not null, RG text not null, CPF text not null, Endereco text not null, Email text not null, Senha text not null);");

    }

        @Override
        public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS Usuarios");
        onCreate(db);
    }

    }