package com.example.analytics.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.analytics.R;
import com.example.analytics.activitys.FragmentsActivity;
import com.example.analytics.adapter.AdapterAnalises;
import com.example.analytics.adapter.AdapterExperimentos;
import com.example.analytics.model.ExperimentoModel;

import java.util.ArrayList;
import java.util.List;


public class ExperimentosFragment extends Fragment {
    private RecyclerView recyclerViewExperimentos;
    private List<ExperimentoModel> experimentoModelList = new ArrayList<>();
    private AdapterExperimentos.RecyclerViewClickListner listner;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_experimentos, container, false);

        recyclerViewExperimentos = view.findViewById(R.id.recyclerViewExperimentos);

        setOnClickListner();
        experimentoModelList.clear();
        this.preparaListaExperimentos();
        //Configurar adapter
        AdapterExperimentos adapterExperimentos = new AdapterExperimentos(experimentoModelList, listner);
        recyclerViewExperimentos.setAdapter(adapterExperimentos);
        //Configura RecyclerView;
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerViewExperimentos.setLayoutManager(layoutManager);
        recyclerViewExperimentos.setHasFixedSize(true);

        return view;
    }

    private void setOnClickListner() {
        listner = new AdapterExperimentos.RecyclerViewClickListner() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getContext(), FragmentsActivity.class);
                intent.putExtra("fragments",5);
                startActivity(intent);
            }
        };

    }


    private void preparaListaExperimentos() {
        ExperimentoModel g = new ExperimentoModel("Amostra desconhecida - 17", "27 de Out de 2021,", R.drawable.bill);
        experimentoModelList.add(g);
        g = new ExperimentoModel("Amostra desconhecida - 22","3 de Nov de 2021", R.drawable.flasks);
        experimentoModelList.add(g);
        g = new ExperimentoModel("Análise do solo","10 de Nov de 2021", 0);
        experimentoModelList.add(g);
        g = new ExperimentoModel("Metais desconhecidos","17 de Nov de 2021", R.drawable.aniong4);
        experimentoModelList.add(g);

    }
}