package com.example.analytics.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.analytics.R;

public class TeoriaActivity extends AppCompatActivity {
    private CardView cardDiagramadetopo, cardCalculoSol, cardReacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teoria);



        cardDiagramadetopo = findViewById(R.id.cardDiagramadetopo);
        cardCalculoSol = findViewById(R.id.cardCalculoSol);
        cardReacoes = findViewById(R.id.cardReacoes);

        cardDiagramadetopo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FragmentsActivity.class);
                intent.putExtra("fragments",4);
                startActivity(intent);
            }
        });
        cardCalculoSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(getApplicationContext(), FragmentsActivity.class);
                //intent.putExtra("fragments",3);
                //startActivity(intent);
            }
        });
        cardReacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), FragmentsActivity.class);
                //intent.putExtra("fragments",2);
                //startActivity(intent);
            }
        });

    }
}