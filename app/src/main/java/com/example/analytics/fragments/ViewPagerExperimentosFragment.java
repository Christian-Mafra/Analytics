package com.example.analytics.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import com.example.analytics.R;
import com.example.analytics.activitys.FragmentsActivity;
import com.example.analytics.adapter.AdapterFluxogramaAnalise;
import com.example.analytics.adapter.AdapterExperimentos;
import com.example.analytics.model.AnalisesModel;
import com.example.analytics.model.ExperimentoModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ViewPagerExperimentosFragment extends Fragment {
    private RecyclerView recyclerViewExperimentos;
    private List<ExperimentoModel> experimentoModelList = new ArrayList<>();
    private AdapterExperimentos.RecyclerViewClickListner listner;
    private CardView cardNovaAnalise;
    private FloatingActionButton fabAddAnalise;
    private Button buttonCancelar, buttonCriar;
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
    private Animation fabOpen, fabCloser, rotateFarward,rotateBackward;
    boolean isOpen = false;
    private EditText textTitulo;
    private CalendarView calendarView;

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


        fabAddAnalise = view.findViewById(R.id.fabAddAnalise);
        cardNovaAnalise = view.findViewById(R.id.cardNovaAnalise);

        fabOpen = AnimationUtils.loadAnimation(getContext(),R.anim.fab_open);
        fabCloser = AnimationUtils.loadAnimation(getContext(),R.anim.fab_closer);
        rotateFarward = AnimationUtils.loadAnimation(getContext(),R.anim.rolate_forword);
        rotateBackward = AnimationUtils.loadAnimation(getContext(),R.anim.rolate_backword);

        fabAddAnalise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
            }
        });


        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);
        textTitulo = view.findViewById(R.id.textTitulo);
        buttonCriar = view.findViewById(R.id.buttonCriar);
        buttonCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnalisesModel analisesModel = new AnalisesModel(textTitulo.getText().toString(),dataFormatada,R.drawable.bill);

            }
        });



















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
        AnalisesModel analisesModel = new AnalisesModel();
        ExperimentoModel g = new ExperimentoModel("Amostra desconhecida - 17", "27 de Out de 2021,", R.drawable.bill);
        experimentoModelList.add(g);
        g = new ExperimentoModel("Amostra desconhecida - 22","3 de Nov de 2021", R.drawable.flasks);
        experimentoModelList.add(g);
        g = new ExperimentoModel("Análise do solo","10 de Nov de 2021", 0);
        experimentoModelList.add(g);
        g = new ExperimentoModel("Metais desconhecidos","17 de Nov de 2021", R.drawable.aniong4);
        experimentoModelList.add(g);

    }

    public void animateFab(){
        if(isOpen){
            fabAddAnalise.startAnimation(rotateBackward);
            //cardNovaAnalise.startAnimation(fabCloser);
            cardNovaAnalise.setVisibility(View.GONE);
            isOpen = false;
        }else{
            fabAddAnalise.startAnimation(rotateFarward);
            cardNovaAnalise.setVisibility(View.VISIBLE);
            //cardNovaAnalise.startAnimation(fabOpen);
            isOpen = true;
        }
    }
}