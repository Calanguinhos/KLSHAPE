package com.calangos.mainApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.calangos.mainApp.dao.adapters.AtletaCRUD;
import com.calangos.mainApp.models.Atleta;

/**
 * Created by rafael on 31/10/17.
 */

public class actMenuAtleta extends Activity {

    private ImageButton btnConsultaFicha;
    private TextView txvNomeAluno, txvNomeInstrutor;
    private Atleta atleta = new Atleta();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_atleta);

        txvNomeAluno = findViewById(R.id.textViewNomeAtleta);
        txvNomeInstrutor = findViewById(R.id.textViewNomeTreinador);

        btnConsultaFicha = findViewById(R.id.imageButtonConsutaFicha);

        txvNomeAluno.setText(atleta.getNome());
        btnConsultaFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "SEM FICHA CADASTRADA", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

}
