package com.morr.tiago.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuOpcoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opcoes);

        Button bebidas = findViewById(R.id.bebidas);
        bebidas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MenuOpcoes.this, Bebidas.class));
            }
        });

        Button comidas = findViewById(R.id.comidas);
        comidas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MenuOpcoes.this, Comidas.class));
            }
        });

        Button aperitivos = findViewById(R.id.aperitivos);
        aperitivos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MenuOpcoes.this, Aperitivos.class));
            }
        });

        Button sobremesa = findViewById(R.id.sobremesa);
        sobremesa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(MenuOpcoes.this, Sobremesas.class));
            }
        });

    }
}
