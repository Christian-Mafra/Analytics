package com.example.analytics.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.analytics.R;
import com.example.analytics.model.CartazVerticalModel;
import java.util.List;

public class AdapterCartazVertical extends RecyclerView.Adapter<AdapterCartazVertical.MyViewHolder> {
    private List<CartazVerticalModel> cartazVerticalModels;

    public AdapterCartazVertical(List<CartazVerticalModel> p) {
        this.cartazVerticalModels = p;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_cartaz_vertical,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        CartazVerticalModel cartazVerticalModela = cartazVerticalModels.get(position);
        holder.imageView.setImageResource(cartazVerticalModela.getImageViewCartazVertical());

    }

    @Override
    public int getItemCount() {
        return cartazVerticalModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;


        public MyViewHolder( View itemView) {
            super(itemView);
            imageView  = itemView.findViewById(R.id.imageViewCartazVertical);
        }
    }
}
