package com.studentsi.studentsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginAdmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_adm);
    }

    public void abrirTelaCadastroAdm(View view){
        Intent intent = new Intent(LoginAdmActivity.this, CadastroAdmActivity.class);
        startActivity(intent);
    }

}
