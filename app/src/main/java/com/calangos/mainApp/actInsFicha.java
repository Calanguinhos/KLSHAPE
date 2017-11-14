package com.calangos.mainApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by rafael on 31/10/17.
 */

public class actInsFicha extends Activity {

    private Spinner spnrClasse, spnrTipo, spnrExercicio;
    private Button btnEnviar;
    private String[] arraySpinnerClasses;
    private String[] arraySpinnerTipo;
    private String[] arraySpinnerEcercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrutor_fichas);

        spnrClasse = findViewById(R.id.spinnerClasse);
        this.arraySpinnerClasses = new String[]{
                "Parte Superior", "Central", "Inferior"
        };
        ArrayAdapter<String> adapterClasses = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinnerClasses);
        spnrClasse.setAdapter(adapterClasses);

        spnrExercicio = findViewById(R.id.spinnerExercicio);
        this.arraySpinnerEcercicio = new String[]{
                "Supino com barra",
                "Supino inclinado com barra",
                "Supino declinado com barra",
                "Supino em máquina",
                "Supino com halteres ",
                "Supino inclinado com halteres",
                "Supino declinado com halteres",
                "Crucifixo/Abertura com halteres",
                "Crucifixo/Abertura inclinado com halteres",
                "Crucifixo/Abertura declinado com halteres ",
                "Crucifixo/Abertura deitado em polia baixa",
                "Crucifixo/Abertura em pé em polia baixa",
                "Crucifixo/Abertura em maquina",
                "Press militar com barra",
                "Press militar com halteres",
                "Remada vertical",
                "Elevações Frontais com barra",
                "Elevações frontais cm halter/ em pronação",
                "Elevações frontais com halter/ em semi-pronação",
                "Elevações Lateral com halteres",
                "Elevações Lateral na máquina",
                "Elevações Lateral na polia",
                "Voos (elevações posteriores) com halteres",
                "Voos em máquina",
                "Voos em polia alta",
                "Peso morto/Levantamento terra",
                "Puxada de dorsais em polia alta",
                "Puxada de dorsais em polia alta em supinação",
                "Remada com barra",
                "Remada com barra em supinação",
                "Remada em máquina “hammer”",
                "Remada em polia baixa",
                "Remada em polia baixa a 1 mão",
                "Remada com halter",
                "Remada em barra T",
                "Encolhimentos de ombro com halteres",
                "Encolhimentos de ombro com barra",
                "Encolhimentos de ombro atrás",
                "Curl/Rosca com barra",
                "Curl/rosca com halteres",
                "Curl de concentração (rosca concentrada)",
                "Curl/rosca Scoot com barra",
                "Curl /rosca Scoot com halter",
                "Curl/rosca Scoot em máquina",
                "Curl/Rosca em máquina",
                "Curl/Rosca em polia baixa",
                "Curl/Rosca bíceps em polia alta",
                "Fundos em barras paralelas",
                "Fundo em máquina",
                "Supino pega junta",
                "Extensões de tríceps deitado com barra",
                "Extensões de tríceps sentado com barra",
                "Extensões de tríceps sentado com halter",
                "Puxada de tríceps",
                "Puxada de tríceps em supinação",
                "Puxada de  tríceps om corda",
                "Kickback",
                "Kickback em polia",
                "Curl/Rosca com barra em pronação",
                "Cur/rosca com halter em semi-pronação (martelo)",
                "Flexão dos punhos em pronação",
                "Flexão dos punhos em supinação", "Flexão do quadril suspenso em barra fixa",
                "Flexão do quadril em banco plano",
                "Flexão do quadril em banco inclinado",
                "Flexão do quadril em banco inclinado com halter",
                "Abdominal com flexão do quadril",
                "Abdominal em banco inclinado",
                "Abdominal em polia alta",
                "Rotação do tronco com bastão",
                "Prancha",
                "Prancha Lateral",
                "Abdominal em roda",
                "Abdominal em roda (em pé)",
                "Bom dia ",
                "Hiperextensões",
                "Hiperextensões em banco inclinado",
                "Hiperextensões em máquina ",
                "Flutter kicks",
                "Super Homem",
                "Elevação alternada de segmentos",
                "Agachamento com barra",
                "Agachamento frontal",
                "Agachamento hack em máquina",
                "Prensa de pernas",
                "Afundo",
                "Afundo com barra",
                "Extensões de pernas", "Step-up",
                "Extensão do quadril/ Glúteos em máquina",
                "Extensão do quadril/ Glúteos em polia baixa",
                "Extensão do quadril/ Glúteos no solo",
                "Extensão do quadril/ Glúteos com os pés apoiados no chão",
                "Extensão do quadril/ Glúteos com pés apoiados em banco",
                "Máquina adutora",
                "Adutores em polia baixa",
                "Peso morto sumô/ levantamento terra sumo",
                "Máquina abdutora",
                "Abdução em polia baixa",
                "Abdução no chão",
                "Gêmeos/Panturrilha",
                "Elevações de gêmeos/ panturrilhas tipo burro",
                "Elevações de gêmeos/ panturrilhas em máquina",
                "Elevações de gêmeos/ panturrilhas sentado"

        };
        ArrayAdapter<String> adapterExercicios = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinnerEcercicio);
        spnrExercicio.setAdapter(adapterExercicios);

        spnrTipo = findViewById(R.id.spinnerTipo);
        this.arraySpinnerTipo = new String[]{
                "-- SUPERIOR --",
                "Peitoral", "Ombros", "Dorsais", "Bíceps", "Triceps", "Antebraço", "",
                "-- CENTRAL --",
                "Abdominais", "Lombares", "",
                "-- INFERIOR --",
                "Quadriceps", "Glúteos", "Adutores", "Abdutores"
        };
        ArrayAdapter<String> adapterTipos = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinnerTipo);
        spnrTipo.setAdapter(adapterTipos);

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
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
