package com.calangos.mainApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.calangos.mainApp.dao.webServiceClient;

public class Login extends AppCompatActivity {

    protected EditText edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton btnLogin = (ImageButton)findViewById(R.id.btnLogin);
        edtEmail = (EditText)findViewById(R.id.edtEmail);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                webServiceClient web = new webServiceClient();
                edtEmail.setText("foda-se");
            }
        });

    }


}
