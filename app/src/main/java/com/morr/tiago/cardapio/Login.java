package com.morr.tiago.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usuario = findViewById(R.id.usuario);
        final EditText senha = findViewById(R.id.senha);
        final Button entrar = findViewById(R.id.entrar);

        entrar.setOnClickListener(new View.OnClickListener() {

            public void onClick (View v){
                String usu = usuario.getText().toString();
                String sen = senha.getText().toString();
                if (usu.equals("admin") && sen.equals("123")) {
                    startActivity(new Intent(Login.this, MenuOpcoes.class));
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválida", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
