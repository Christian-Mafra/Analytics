package com.example.analytics.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.model.ContinueEstudandoModel;

import java.util.List;

public class AdapterContinueEstudando extends RecyclerView.Adapter<AdapterContinueEstudando.MyViewHolder> {
    private List<ContinueEstudandoModel> continueEstudandoModel;

    public AdapterContinueEstudando(List<ContinueEstudandoModel> continueEstudandoModelList) {
        this.continueEstudandoModel = continueEstudandoModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_continue_estudando,parent,false);
        return new AdapterContinueEstudando.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ContinueEstudandoModel continueEstudando = continueEstudandoModel.get(position);
        holder.imageView.setImageResource(continueEstudando.getImageContinueEstudando());
    }

    @Override
    public int getItemCount() {
        return continueEstudandoModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewContinuemEstudando);
        }
    }
}
