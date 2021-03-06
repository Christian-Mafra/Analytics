package com.example.analytics.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.analytics.R;
import com.example.analytics.activitys.FragmentsActivity;
import com.example.analytics.adapter.AdapterFluxogramaAnalise;
import com.example.analytics.model.FluxogramaAnalisesModel;
import com.example.analytics.model.GruposCations;

import java.util.ArrayList;
import java.util.List;


public class FluxogramaAnaliseFragment extends Fragment {
    private RecyclerView recyclerAnalise;
    private List<FluxogramaAnalisesModel> analisesModelList = new ArrayList<>();
    private AdapterFluxogramaAnalise.RecyclerViewClickListner listner;
    private Button buttonVoltar, buttonsAvancar;
    private int contaEtapa = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fluxograma_analise, container, false);

        recyclerAnalise = view.findViewById(R.id.recyclerAnalise);
        //Configurar adapter
        setOnClickListner();
        this.preparaFluxo();
        AdapterFluxogramaAnalise adapterAnalises = new AdapterFluxogramaAnalise(analisesModelList, listner);
        recyclerAnalise.setAdapter(adapterAnalises);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerAnalise.setLayoutManager(layoutManager);
        recyclerAnalise.setHasFixedSize(true);


        return view;
    }

    private void setOnClickListner() {
        listner = new AdapterFluxogramaAnalise.RecyclerViewClickListner() {
            @Override
            public void onClick(View v, int position) {

            }
        };
    }

    public void preparaFluxo(){
        FluxogramaAnalisesModel g = new FluxogramaAnalisesModel
                ("Passo 1: Adi????o de HCl"
                         ,"Adicione gota a gota de HCl dilu??do at?? completar a precipita????o. Centrifugue e separe o sobrenadante do precipitado."
                         , "Houve a forma????o de um precipitado branco"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.cloretoprata);
        this.analisesModelList.add(g);

        g = new FluxogramaAnalisesModel
                ("Passo 2: Solubiliza????o do chumbo"
                        ,"Adiciona gotas de cromato de pot??ssio"
                        ,"Houve a forma????o de um precipitado amarelo?"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.cromatodechumbo);
        this.analisesModelList.add(g);

        g = new FluxogramaAnalisesModel
                ("Passo 3: Identifica????o do chumbo"
                        ,"Adiciona gotas de cromato de pot??ssio"
                        ,"Houve a forma????o de um precipitado amarelo?"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.flasks);
        this.analisesModelList.add(g);

        g = new FluxogramaAnalisesModel
                ("Passo 4: Solubiliza????o do chumbo"
                        ,"Adiciona gotas de cromato de pot??ssio"
                        ,"Houve a forma????o de um precipitado amarelo?"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.diagramadetopo);
        this.analisesModelList.add(g);

        g = new FluxogramaAnalisesModel
                ("Passo 5: Identifica????o do chumbo"
                        ,"Adiciona gotas de cromato de pot??ssio"
                        ,"Houve a forma????o de um precipitado amarelo?"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.drew);
        this.analisesModelList.add(g);
        
        g = new FluxogramaAnalisesModel
                ("Passo 6: Solubiliza????o do chumbo"
                        ,"Adiciona gotas de cromato de pot??ssio"
                        ,"Houve a forma????o de um precipitado amarelo?"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.national);
        this.analisesModelList.add(g);

        g = new FluxogramaAnalisesModel
                ("Passo 7: Identifica????o do chumbo"
                        ,"Adiciona gotas de cromato de pot??ssio"
                        ,"Houve a forma????o de um precipitado amarelo?"
                        , "N??o houve rea????o aparente"
                        ,null,R.drawable.aniong5);
        this.analisesModelList.add(g);


    }

}