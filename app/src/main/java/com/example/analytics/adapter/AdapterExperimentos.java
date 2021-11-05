package com.example.analytics.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.model.ExperimentoModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class AdapterExperimentos extends RecyclerView.Adapter<AdapterExperimentos.MyViewHolder> {
    private List<ExperimentoModel> experimentoModelList;
    private RecyclerViewClickListner listner;

    public AdapterExperimentos(List<ExperimentoModel> experimentoModelList, RecyclerViewClickListner listner) {
        this.experimentoModelList = experimentoModelList;
        this.listner = listner;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_experimentos,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ExperimentoModel experimentoModel = experimentoModelList.get(position);
        holder.txtTitulo.setText(experimentoModel.getTitulo());
        holder.txtData.setText(experimentoModel.getData());
        if(experimentoModel.getImgPhoto()==0){
            holder.imgPhoto.setVisibility(View.GONE);
        }else{
            holder.imgPhoto.setImageResource(experimentoModel.getImgPhoto());
        }
        /*holder.imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
    }

    @Override
    public int getItemCount() {
        return experimentoModelList.size();
    }

    public interface RecyclerViewClickListner{ void onClick(View v, int position); }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitulo, txtData;
        private ImageView imgPhoto;
        //private ImageButton imgMenu;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtData = itemView.findViewById(R.id.txtData);
            imgPhoto = itemView.findViewById(R.id.imgPhoto);
            itemView.setOnClickListener(this::onClick);
            //imgMenu = itemView.findViewById(R.id.imgMenu);
        }
        public void onClick(View view) {
            listner.onClick(view, getAdapterPosition());
        }
    }
}
