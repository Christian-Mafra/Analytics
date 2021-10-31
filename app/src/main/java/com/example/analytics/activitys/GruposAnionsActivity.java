package com.example.analytics.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.adapter.AdapterGruposAnions;
import com.example.analytics.adapter.AdapterGruposCations;
import com.example.analytics.model.GruposAnions;
import com.example.analytics.model.GruposCations;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class GruposAnionsActivity extends AppCompatActivity {
    /*private RecyclerView recyclerViewGruposAnions;
    private List<GruposAnions> gruposAnions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos_anions);

        View decorview = getWindow().getDecorView();
        int ui = decorview.SYSTEM_UI_FLAG_FULLSCREEN;// | decorview.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorview.setSystemUiVisibility(ui);

        recyclerViewGruposAnions = findViewById(R.id.recyclerGruposAnions);

        //Configurar adapter
        this.preparaGruposAnions();
        AdapterGruposAnions adapterGruposAnions = new AdapterGruposAnions(gruposAnions);
        recyclerViewGruposAnions.setAdapter(adapterGruposAnions);
        //recyclerViewGruposAnions.setAdapter();

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),1);
        recyclerViewGruposAnions.setLayoutManager(layoutManager);
        recyclerViewGruposAnions.setHasFixedSize(true);
    }

    public void preparaGruposAnions(){
        GruposAnions g = new GruposAnions("Fluxograma de análise","", R.drawable.fluxograma);
        this.gruposAnions.add(g);

        g = new GruposAnions("Determinação do pH","Zona de predominância das espécies", R.drawable.phmetro);
        this.gruposAnions.add(g);

        g = new GruposAnions("Transferência de elétrons","Rg  Rf  Ox", R.drawable.aniong6);
        this.gruposAnions.add(g);

        g = new GruposAnions("Precipitação com Ca","Ânions do grupo volátil", R.drawable.aniong4);
        this.gruposAnions.add(g);

        g = new GruposAnions("Precipitação com Ag","", R.drawable.image3);
        this.gruposAnions.add(g);

        g = new GruposAnions("Fluxograma de separação","", R.drawable.aniong5);
        this.gruposAnions.add(g);

    }*/
}