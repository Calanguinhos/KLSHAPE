package com.calangos.mainApp.dao.cruds;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.calangos.mainApp.dao.CRUD;
import com.calangos.mainApp.utils.$ObjectCRUD;
import com.calangos.mainApp.models.Treinamento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 07/11/17.
 */

public class TreinamentoCRUD extends Treinamento implements $ObjectCRUD {

    protected String TABLE_NAME = "TREINAMENTOS";
    protected String NULL_COLUMN_HACK = null;
    private Context context;
    private List<Treinamento> treinamentos;

    public TreinamentoCRUD(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void createObject() {

        ContentValues contentValues = new ContentValues();
        CRUD crud = new CRUD(this.context);

        contentValues.put("NOTIFICACOES_ALUNOS_ID_ALUNOS", this.getAtleta());
        contentValues.put("NOTIFICACOES_INSTRUTORES_ID_INSTRUTORES", this.getIntrutor());
        contentValues.put("NOTIFICACOES_ID_NOTIFICACOES", this.getNotificacoes());
        contentValues.put("EXERCICIOS_ID_EXERCICIO", this.getExercicio().toString()); //TODO arrumar essa parada aqui

        crud.insertSQL(this.TABLE_NAME, this.NULL_COLUMN_HACK, contentValues);
        
    }

    @Override
    public void readObject() {

        CRUD crud = new CRUD(this.context);
        treinamentos = new ArrayList<>();
        List<Integer> exercicios = new ArrayList<>();
        Cursor cursor;
        String[] colunas = new String[]{"NOTIFICACOES_ALUNOS_ID_ALUNOS", "NOTIFICACOES_INSTRUTORES_ID_INSTRUTORES", "NOTIFICACOES_ID_NOTIFICACOES", "EXERCICIOS_ID_EXERCICIO"};

        cursor = crud.selectSQL(this.TABLE_NAME, colunas, null, null, null, null, "INS_NOME ASC", null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {

                this.setAtleta(cursor.getInt(0));
                this.setIntrutor(cursor.getInt(1));
                this.setNotificacoes(cursor.getInt(2));
                exercicios.add(cursor.getInt(3));
                this.setExercicio(exercicios); //TODO arrumar essa bagaça aqui tbm
                treinamentos.add(this);

            } while (cursor.moveToNext());
        }

    }

    @Override
    public void updateObject() {

        ContentValues contentValues = new ContentValues();
        CRUD crud = new CRUD(this.context);

        contentValues.put("NOTIFICACOES_ALUNOS_ID_ALUNOS", this.getAtleta());
        contentValues.put("NOTIFICACOES_INSTRUTORES_ID_INSTRUTORES", this.getIntrutor());
        contentValues.put("NOTIFICACOES_ID_NOTIFICACOES", this.getNotificacoes());
        contentValues.put("EXERCICIOS_ID_EXERCICIO", this.getExercicio().toString()); //TODO arrumar essa parada aqui

        crud.updateSQL(this.TABLE_NAME, contentValues, "NOTIFICACOES_ALUNOS_ID_ALUNOS = ?", new String[]{"" + this.getAtleta()});

    }

    @Override
    public void deleteObject() {

        CRUD crud = new CRUD(this.context);
        crud.deleteSQL(this.TABLE_NAME, "NOTIFICACOES_ALUNOS_ID_ALUNOS = ?", new String[]{"" + getAtleta()});

    }
}
