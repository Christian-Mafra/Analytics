package com.example.analytics.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.analytics.R;
import com.example.analytics.adapter.AdapterContinueEstudando;
import com.example.analytics.adapter.AdapterVisualizacaoConteudo;
import com.example.analytics.model.CartazVerticalModel;
import com.example.analytics.model.VisualizacaoConteudoModel;

import java.util.ArrayList;
import java.util.List;

public class VisualizacaoConteudosSemelhantesragment extends Fragment {
    private RecyclerView recyclerViewVisualizacaoConteudo;
    private List<VisualizacaoConteudoModel> visualizacaoConteudoModelList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_visualizacao_conteudos_semelhantesragment, container, false);

        recyclerViewVisualizacaoConteudo = view.findViewById(R.id.RecyclerViewVisualizacaoConteudo);


        RecyclerView.LayoutManager layoutManagerA = new GridLayoutManager(getContext(), 3);
        recyclerViewVisualizacaoConteudo.setLayoutManager(layoutManagerA);
        //recyclerCloretos.setHasFixedSize(true);
        preparaVisualizacaoConteudo();
        AdapterVisualizacaoConteudo adapterVisualizacaoConteudo = new AdapterVisualizacaoConteudo(visualizacaoConteudoModelList);
        recyclerViewVisualizacaoConteudo.setAdapter(adapterVisualizacaoConteudo);


        return view;
    }

    public void preparaVisualizacaoConteudo(){
        VisualizacaoConteudoModel g = new VisualizacaoConteudoModel(R.drawable.diagramadetopo);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.bill);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.drew);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.aniong2);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.flasks);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.girl);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.teamwork);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.aniong4);
        this.visualizacaoConteudoModelList.add(g);
        g = new VisualizacaoConteudoModel(R.drawable.image5);
        this.visualizacaoConteudoModelList.add(g);
    }
}