package com.calangos.mainApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.calangos.mainApp.models.Atleta;

/**
 * Created by rafael on 31/10/17.
 */

public class actMenuAtleta extends Activity {

    private ImageButton btnConsultaFicha, btnSolicitarFicha;
    private TextView txvNomeAluno, txvNomeInstrutor;
    private ListView lsvNotificacao;
    private Atleta atleta = new Atleta();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_atleta);

        txvNomeAluno = findViewById(R.id.textViewNomeAtleta);
        txvNomeInstrutor = findViewById(R.id.textViewNomeTreinador);

        btnConsultaFicha = findViewById(R.id.imageButtonConsutaFicha);
        btnSolicitarFicha = findViewById(R.id.imageButtonSolicitarFicha);

        btnConsultaFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(actMenuAtleta.this, actAtlFicha.class);
                startActivity(intent);
            }
        });

        btnSolicitarFicha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Solicitação enviada!", Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

}
