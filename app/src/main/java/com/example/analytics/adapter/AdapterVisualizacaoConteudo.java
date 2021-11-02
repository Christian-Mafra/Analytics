package com.example.analytics.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.model.VisualizacaoConteudoModel;

import java.util.List;

public class AdapterVisualizacaoConteudo extends RecyclerView.Adapter<AdapterVisualizacaoConteudo.MyViewHolder> {
    List<VisualizacaoConteudoModel> visualizacaoConteudo;

    public AdapterVisualizacaoConteudo(List<VisualizacaoConteudoModel> ListavisualizacaoConteudo) {
        this.visualizacaoConteudo = ListavisualizacaoConteudo;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.visualizacao_conteudo,parent,false);
        return new AdapterVisualizacaoConteudo.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        VisualizacaoConteudoModel visualizacaoConteudoModel = visualizacaoConteudo.get(position);
        holder.imagensCartazesVisualizacao.setImageResource(visualizacaoConteudoModel.getImage());
    }

    @Override
    public int getItemCount() {
        return this.visualizacaoConteudo.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagensCartazesVisualizacao;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imagensCartazesVisualizacao = itemView.findViewById(R.id.imageView25);
        }

    }
}
