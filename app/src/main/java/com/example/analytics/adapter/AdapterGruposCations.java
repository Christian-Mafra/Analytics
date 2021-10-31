package com.example.analytics.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.activitys.FragmentsActivity;
import com.example.analytics.activitys.PrincipalActivity;
import com.example.analytics.fragments.Novo_experimento_fragment;
import com.example.analytics.model.GruposCations;

import java.util.List;

public class AdapterGruposCations extends RecyclerView.Adapter<AdapterGruposCations.MyViewHolder>{
    private List<GruposCations> gruposCations;
    private RecyclerViewClickListner listner;

    public AdapterGruposCations(List<GruposCations> gruposCations, RecyclerViewClickListner listner) {
        this.gruposCations = gruposCations;
        this.listner = listner;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grupos_cations_adapter,parent,false);

        return new MyViewHolder(itemLista);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        GruposCations grupoCation = gruposCations.get(position);
        holder.cations.setText(grupoCation.getCations());
        holder.imagem.setImageResource(grupoCation.getImagem());
    }

    @Override
    public int getItemCount() { return 5;}

    public interface RecyclerViewClickListner{
        void onClick(View v, int position);
    }

     class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView cations;
        private ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cations = itemView.findViewById(R.id.txtAnions);
            imagem = itemView.findViewById(R.id.imageGruposAnions);
            itemView.setOnClickListener(this);

        }

         @Override public void onClick(View view) {
            listner.onClick(view, getAdapterPosition());
         }
     }

}

