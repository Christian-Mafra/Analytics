package com.example.analytics.fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.analytics.R;
import com.example.analytics.adapter.AdapterQuemSomos;
import com.example.analytics.model.QuemSomosModel;
import com.google.firebase.database.collection.LLRBNode;

import java.util.ArrayList;
import java.util.List;

public class QuemSomosFragment extends Fragment {
    private RecyclerView recyclerViewQuemSomos;
    private List<QuemSomosModel> quemSomosModels = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quem_somos, container, false);

        recyclerViewQuemSomos = view.findViewById(R.id.recyclerViewQuemSomos);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerViewQuemSomos.setLayoutManager(layoutManager);
        preparaQuemSomos();
        AdapterQuemSomos adapter = new AdapterQuemSomos(quemSomosModels);
        recyclerViewQuemSomos.setAdapter(adapter);
        recyclerViewQuemSomos.setHasFixedSize(true);



        return view;
    }


    private CardView cardAluno;
    private void preparaQuemSomos() {
        QuemSomosModel g = new QuemSomosModel
                (R.drawable.fotochris
                ,"Christian Mafra"
                ,". Técnico em química"
                ,". Desenvolvedor"
                ,". Produtor de conteúdo"
                ,R.color.cor_tema);
        quemSomosModels.add(g);
        g = new QuemSomosModel(R.drawable.iconcientist
                ,"Luiz Bernardo"
                ,". Técnico em química"
                ,". Produtor de conteúdo"
                ,""
                ,R.color.cor_tema);
        quemSomosModels.add(g);
        g = new QuemSomosModel(R.drawable.eduardocoelho
                ,"Eduardo Coelho"
                ,". Professor Orientador"
                ,""
                ,"",
                R.color.dourado);
        quemSomosModels.add(g);

    }
}
