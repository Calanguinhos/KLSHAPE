package com.example.pichau.projeto_tcc;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CRUD {
    SQLiteDatabase db;
    Banco Banco;

    public CRUD(Context context){
        Banco = new Banco(context);
    }

    public String inserir(String nome, String rg, String cpf, String endereco, String email, String senha ){
        ContentValues valores;
        long resultado;
        db=Banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(Banco.NOME, nome);
        valores.put(Banco.RG,rg);
        valores.put(Banco.CPF,cpf);
        valores.put(Banco.ENDERECO,endereco);
        valores.put(Banco.EMAIL,email);
        valores.put(Banco.SENHA,senha);


        resultado = db.insert(Banco.ALUNO, null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro. Verifique se todos os campos estão preenchidos.";
        else
            return "Usuário cadastrado com sucesso.";
    }



}
