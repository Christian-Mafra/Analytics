package com.example.analytics.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.analytics.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonLogin, buttonCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login_ou_cadastro);

        getWindow().setNavigationBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema_escuro));
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.cor_tema));


        buttonLogin = findViewById(R.id.buttonLogin);
        buttonCadastro = findViewById(R.id.buttonCadastro);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FragmentsActivity.class);
                intent.putExtra("fragments",3);
                startActivity(intent);
            }
        });
        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FragmentsActivity.class);
                intent.putExtra("fragments",2);
                startActivity(intent);
            }
        });


    }


}
