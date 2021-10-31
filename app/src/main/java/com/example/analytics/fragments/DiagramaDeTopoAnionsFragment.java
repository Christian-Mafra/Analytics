package com.example.analytics.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.analytics.R;
import com.example.analytics.activitys.FragmentsActivity;


public class DiagramaDeTopoAnionsFragment extends Fragment {
    private ImageButton imageButton;


    public DiagramaDeTopoAnionsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_diagrama_de_topo_anions, container, false);

        imageButton = view.findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentsActivity fragmentsActivity = new FragmentsActivity();
                fragmentsActivity.finish();
            }
        });

        return view;
    }
}