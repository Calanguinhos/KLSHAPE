package com.calangos.mainApp.dao.adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.calangos.mainApp.dao.CRUD;
import com.calangos.mainApp.models.Atleta;
import com.calangos.mainApp.utils.$ObjectCRUD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 07/11/17.
 */

public class AtletaCRUD extends Atleta implements $ObjectCRUD {

    protected String TABLE_NAME = "ALUNOS";
    protected String NULL_COLUMN_HACK = null;
    private Context context;
    private List<Atleta> atletas;


    public AtletaCRUD(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void createObject() {
        ContentValues contentValues = new ContentValues();
        CRUD crud = new CRUD(this.context);

        contentValues.put("ALU_NOME", this.getNome());
        contentValues.put("ALU_EMAIL", this.getEmail());
        contentValues.put("ALU_SENHA", this.getSenha());
        contentValues.put("ALU_ENDERECO", this.getEndereco());
        contentValues.put("ALU_CPF", this.getCpf());
        contentValues.put("ALU_RG", this.getRg());

        crud.insertSQL(this.TABLE_NAME, this.NULL_COLUMN_HACK, contentValues);

    }


    @Override
    public void readObject() {
        CRUD crud = new CRUD(this.context);
        atletas = new ArrayList<>();
        Cursor cursor;
        String[] colunas = new String[]{"_ID_ALUNOS", "ALU_NOME", "ALU_EMAIL", "ALU_SENHA", "ALU_ENDERECO", "ALU_CPF", "ALU_RG"};

        cursor = crud.selectSQL(this.TABLE_NAME, colunas, null, null, null, null, "ALU_NOME ASC", null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {

                this.setId(cursor.getInt(0));
                this.setNome(cursor.getString(1));
                this.setEmail(cursor.getString(2));
                this.setSenha(cursor.getString(3));
                this.setEndereco(cursor.getString(4));
                this.setCpf(cursor.getLong(5));
                this.setRg(cursor.getLong(6));
                atletas.add(this);

            } while (cursor.moveToNext());
        }
    }

    @Override
    public void updateObject() {
        ContentValues contentValues = new ContentValues();
        CRUD crud = new CRUD(this.context);

        contentValues.put("ALU_NOME", this.getNome());
        contentValues.put("ALU_EMAIL", this.getEmail());
        contentValues.put("ALU_SENHA", this.getSenha());
        contentValues.put("ALU_ENDERECO", this.getEndereco());
        contentValues.put("ALU_CPF", this.getCpf());
        contentValues.put("ALU_RG", this.getRg());

        crud.updateSQL(this.TABLE_NAME, contentValues, "_ID_ALUNO = ?", new String[]{"" + this.getId()});

    }

    @Override
    public void deleteObject() {

        CRUD crud = new CRUD(this.context);
        crud.deleteSQL(this.TABLE_NAME, "_ID_ALUNO = ?", new String[]{"" + getId()});

    }

}
