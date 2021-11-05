package com.example.analytics.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.analytics.R;
import com.example.analytics.model.FluxogramaAnalisesModel;

import java.util.List;

public class AdapterAnalises extends RecyclerView.Adapter<AdapterAnalises.MyViewHolder> {
    private List<FluxogramaAnalisesModel> analisesModels;
    private RecyclerViewClickListner listner;

    public AdapterAnalises(List<FluxogramaAnalisesModel> analisesModels, RecyclerViewClickListner listner) {
        this.analisesModels = analisesModels;
        this.listner = listner;
    }

    @NonNull
    @Override
    public AdapterAnalises.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_analises,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAnalises.MyViewHolder holder, int position) {
        FluxogramaAnalisesModel analisesModel = analisesModels.get(position);
        holder.txtPasso.setText(analisesModel.getPasso());
        holder.txtProcedimentos.setText(analisesModel.getProcedimento());
        holder.aSwitch.setText(analisesModel.getaSwitch());

    }

    @Override
    public int getItemCount() {
        return analisesModels.size();
    }

    public interface RecyclerViewClickListner{
        void onClick(View v, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtPasso, txtProcedimentos;
        private ImageView imagemInfo;
        private Switch aSwitch ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPasso = itemView.findViewById(R.id.txtPasso);
            txtProcedimentos = itemView.findViewById(R.id.txtProcedimento);
            imagemInfo = itemView.findViewById(R.id.imageInfo);
            aSwitch = itemView.findViewById(R.id.switch2);
            itemView.setOnClickListener(this);


        }

        public void onClick(View view) {
            listner.onClick(view, getAdapterPosition());
        }
    }

}
