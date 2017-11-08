package com.calangos.mainApp.dao.adapters;

import android.content.Context;

import com.calangos.mainApp.utils.$ObjectCRUD;
import com.calangos.mainApp.models.Instrutor;

/**
 * Created by rafael on 07/11/17.
 */

public class InstrutorCRUD extends Instrutor implements $ObjectCRUD {

    protected String TABLE_NAME = "INSTRUTORES";
    protected String NULL_COLUMN_HACK = null;
    private Context context;

    public InstrutorCRUD(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void createObject() {
        
    }

    @Override
    public void readObject() {
        
    }

    @Override
    public void updateObject() {
        
    }

    @Override
    public void deleteObject() {
        
    }
}
