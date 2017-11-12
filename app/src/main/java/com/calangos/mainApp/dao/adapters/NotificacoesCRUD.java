package com.calangos.mainApp.dao.adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.calangos.mainApp.dao.CRUD;
import com.calangos.mainApp.models.Instrutor;
import com.calangos.mainApp.utils.$ObjectCRUD;
import com.calangos.mainApp.models.Notificacoes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 07/11/17.
 */

public class NotificacoesCRUD extends Notificacoes implements $ObjectCRUD {

    protected String TABLE_NAME = "NOTIFICACOES";
    protected String NULL_COLUMN_HACK = null;
    private Context context;
    private List<Notificacoes> notificacoes;

    public NotificacoesCRUD(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void createObject() {

        ContentValues contentValues = new ContentValues();
        CRUD crud = new CRUD(this.context);

        contentValues.put("NOT_NOME", this.getNome());
        contentValues.put("NOT_TIPO", this.getTipo());
        contentValues.put("NOT_DESCRICAO", this.getDescricao());
        contentValues.put("ALUNOS_ID_ALUNOS", this.getAluno().getId());
        contentValues.put("INSTRUTORES_ID_INSTRUTORES", this.getInstrutor().getId());

        crud.insertSQL(this.TABLE_NAME, this.NULL_COLUMN_HACK, contentValues);

    }

    @Override
    public void readObject() {

        CRUD crud = new CRUD(this.context);
        notificacoes = new ArrayList<>();
        Cursor cursor;
        String[] colunas = new String[]{"_ID_NOTIFICACOES", "NOT_NOME", "NOT_TIPO", "NOT_DESCRICAO", "ALUNOS_ID_ALUNOS", "INSTRUTORES_ID_INSTRUTORES"};

        cursor = crud.selectSQL(this.TABLE_NAME, colunas, null, null, null, null, "INS_NOME ASC", null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {

                this.setId(cursor.getInt(0));
                this.setNome(cursor.getString(1));
                this.setTipo(cursor.getString(2));
                this.setDescricao(cursor.getString(3));
                this.aluno.setId(cursor.getInt(4));
                this.instrutor.setId(cursor.getInt(5));
                notificacoes.add(this);

            } while (cursor.moveToNext());
        }

    }

    @Override
    public void updateObject() {

        ContentValues contentValues = new ContentValues();
        CRUD crud = new CRUD(this.context);

        contentValues.put("NOT_NOME", this.getNome());
        contentValues.put("NOT_TIPO", this.getTipo());
        contentValues.put("NOT_DESCRICAO", this.getDescricao());
        contentValues.put("ALUNOS_ID_ALUNOS", this.getAluno().getId());
        contentValues.put("INSTRUTORES_ID_INSTRUTORES", this.getInstrutor().getId());

        crud.updateSQL(this.TABLE_NAME, contentValues, "_ID_NOTIFICACOES = ?", new String[]{"" + this.getId()});

    }

    @Override
    public void deleteObject() {

        CRUD crud = new CRUD(this.context);
        crud.deleteSQL(this.TABLE_NAME, "_ID_NOTIFICACOES = ?", new String[]{"" + getId()});

    }
}
