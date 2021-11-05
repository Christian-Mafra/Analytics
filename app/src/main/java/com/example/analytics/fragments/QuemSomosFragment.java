package com.example.analytics.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.analytics.R;
import com.example.analytics.adapter.AdapterQuemSomos;

public class QuemSomosFragment extends Fragment {
    private RecyclerView recyclerViewQuemSomos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quem_somos, container, false);

        recyclerViewQuemSomos = view.findViewById(R.id.recyclerViewQuemSomos);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerViewQuemSomos.setLayoutManager(layoutManager);

        AdapterQuemSomos adapter = new AdapterQuemSomos();
        recyclerViewQuemSomos.setAdapter(adapter);
        recyclerViewQuemSomos.setHasFixedSize(true);



        return view;
    }
}
