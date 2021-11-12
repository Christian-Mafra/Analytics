
package com.example.analytics.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.example.analytics.R;
import com.example.analytics.activitys.VisualizacaoActivity;
import com.example.analytics.adapter.AdapterCartazHorizontal;
import com.example.analytics.adapter.AdapterCartazVertical;
import com.example.analytics.adapter.AdapterContinueEstudando;
import com.example.analytics.model.CartazHorizontalModel;
import com.example.analytics.model.CartazVerticalModel;
import com.example.analytics.model.ContinueEstudandoModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerConteudoFragment extends Fragment {
    private FloatingActionButton fabMais, fabConteudo, fabShortBook, fabDonwload;
    private Animation fabOpen, fabCloser, rotateFarward,rotateBackward;
    private RecyclerView recyclerNovidades, recyclerRecomendacao, recyclerContinue, recyclerCloretos;
    private  List<CartazVerticalModel> listacartazVerticalModels = new ArrayList<>();
    private List<CartazHorizontalModel> listcartazHorizontalModels = new ArrayList<>();
    private List<ContinueEstudandoModel> continueEstudando = new ArrayList<>();

    boolean isOpen = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_view_pager_conteudo, container, false);

        fabMais = view.findViewById(R.id.fabAddAnalise);
        fabConteudo = view.findViewById(R.id.fabConteudo);
        fabShortBook = view.findViewById(R.id.fabShortBook);
        fabDonwload = view.findViewById(R.id.fabDonwload);
        fabOpen = AnimationUtils.loadAnimation(getContext(),R.anim.fab_open);
        fabCloser = AnimationUtils.loadAnimation(getContext(),R.anim.fab_closer);
        rotateFarward = AnimationUtils.loadAnimation(getContext(),R.anim.rolate_forword);
        rotateBackward = AnimationUtils.loadAnimation(getContext(),R.anim.rolate_backword);

        fabMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFab();
            }
        });
        fabConteudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"conteudo",Toast.LENGTH_SHORT).show();
            }
        });
        fabShortBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),VisualizacaoActivity.class);
                startActivity(intent);
            }
        });

        fabDonwload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Donwload",Toast.LENGTH_SHORT).show();

            }
        });

        recyclerNovidades = view.findViewById(R.id.recyclerNovidades);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
         recyclerNovidades.setLayoutManager(layoutManager);
       // recyclerNovidades.setHasFixedSize(true);
        //Config Adapter
        preparaCartazVertical();
        AdapterCartazVertical adapterCartazVertical = new AdapterCartazVertical(listacartazVerticalModels);
        recyclerNovidades.setAdapter(adapterCartazVertical);



        recyclerRecomendacao = view.findViewById(R.id.recyclerRecomendacao);
        LinearLayoutManager layoutManagerC = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerRecomendacao.setLayoutManager(layoutManagerC);
        //recyclerContinue.setHasFixedSize(true);
        preparaCartazHorizontal();
        AdapterCartazHorizontal adapterCartazHorizontal = new AdapterCartazHorizontal(listcartazHorizontalModels);
        recyclerRecomendacao.setAdapter(adapterCartazHorizontal);



        recyclerContinue = view.findViewById(R.id.recyclerContinue);
        LinearLayoutManager layoutManagerA = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        recyclerContinue.setLayoutManager(layoutManagerA);
        //recyclerCloretos.setHasFixedSize(true);
        preparaContinueAssistindo();
        AdapterContinueEstudando adapterContinueEstudando = new AdapterContinueEstudando(continueEstudando);
        recyclerContinue.setAdapter(adapterContinueEstudando);

        return view;
    }

    //---------------------------------------------------------------------------------------------------------------------------------//

    /* void setOnClickListner() {
        listner = new AdapterNovidades.RecyclerViewClickListner() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getContext(), VisualizacaoActivity.class);
                //intent.putExtra("fragments",6);
                startActivity(intent);
            }
        };
    };
*/
    public void preparaCartazVertical(){
        CartazVerticalModel g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
        g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
        g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
        g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
        g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
        g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
        g = new CartazVerticalModel(R.drawable.glowing);
        this.listacartazVerticalModels.add(g);
    }

    public void preparaCartazHorizontal(){
        CartazHorizontalModel h = new CartazHorizontalModel(R.drawable.glowing);
        this.listcartazHorizontalModels.add(h);
        h = new CartazHorizontalModel(R.drawable.glowing);
        this.listcartazHorizontalModels.add(h);
        h = new CartazHorizontalModel(R.drawable.glowing);
        this.listcartazHorizontalModels.add(h);
        h = new CartazHorizontalModel(R.drawable.glowing);
        this.listcartazHorizontalModels.add(h);
        h = new CartazHorizontalModel(R.drawable.glowing);
        this.listcartazHorizontalModels.add(h);
    }

    public void preparaContinueAssistindo(){
        ContinueEstudandoModel h = new ContinueEstudandoModel(R.drawable.glowing);
        this.continueEstudando.add(h);
        h = new ContinueEstudandoModel(R.drawable.glowing);
        this.continueEstudando.add(h);
        h = new ContinueEstudandoModel(R.drawable.glowing);
        this.continueEstudando.add(h);
        h = new ContinueEstudandoModel(R.drawable.glowing);
        this.continueEstudando.add(h);
        h = new ContinueEstudandoModel(R.drawable.glowing);
        this.continueEstudando.add(h);
    }


    public void animateFab(){
        if(isOpen){
            fabMais.startAnimation(rotateFarward);
            fabConteudo.startAnimation(fabCloser);
            fabConteudo.setVisibility(View.INVISIBLE);
            fabShortBook.startAnimation(fabCloser);
            fabShortBook.setVisibility(View.INVISIBLE);
            fabDonwload.startAnimation(fabCloser);
            fabDonwload.setVisibility(View.INVISIBLE);
            isOpen = false;
        }else{
            fabMais.startAnimation(rotateBackward);
            fabDonwload.setVisibility(View.VISIBLE);
            fabDonwload.startAnimation(fabOpen);
            fabShortBook.setVisibility(View.VISIBLE);
            fabShortBook.startAnimation(fabOpen);
            fabConteudo.setVisibility(View.VISIBLE);
            fabConteudo.startAnimation(fabOpen);
            isOpen = true;
        }
    }

}
