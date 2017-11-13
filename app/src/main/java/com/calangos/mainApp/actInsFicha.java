package com.calangos.mainApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by rafael on 31/10/17.
 */

public class actInsFicha extends Activity {

    private Spinner spnrClasse, spnrTipo, spnrExercicio;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrutor_fichas);

        spnrClasse = findViewById(R.id.spinnerClasse);
        spnrExercicio = findViewById(R.id.spinnerExercicio);
        spnrTipo = findViewById(R.id.spinnerTipo);

        btnEnviar = findViewById(R.id.buttonEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnEnciarClick();
            }
        });

    }

    private void btnEnciarClick() {

        //TODO tem esse auqi tbm

        Toast.makeText(getApplicationContext(), "Enviado!", Toast.LENGTH_SHORT).show();
        finish();

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
