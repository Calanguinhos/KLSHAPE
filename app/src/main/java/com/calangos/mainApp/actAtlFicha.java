package com.calangos.mainApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by rafag on 14/11/2017.
 */

public class actAtlFicha extends Activity {

    private ListView lsvListaFichas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atleta_fichas);

        lsvListaFichas = findViewById(R.id.listViewFichas);
    }
}
