package com.example.analytics.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.analytics.R;
import com.example.analytics.model.CartazHorizontalModel;
import java.util.List;

public class AdapterCartazHorizontal extends RecyclerView.Adapter<AdapterCartazHorizontal.MyViewHolder> {
    List<CartazHorizontalModel> cartazHorizontal;

    public AdapterCartazHorizontal(List<CartazHorizontalModel> h) {
        this.cartazHorizontal = h;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_cartaz_horizontal,parent,false);
        return new AdapterCartazHorizontal.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CartazHorizontalModel horizontalModel = cartazHorizontal.get(position);
        holder.imageHorizontal.setImageResource(horizontalModel.getImageHorizontal());

    }

    @Override
    public int getItemCount() {
        return cartazHorizontal.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageHorizontal;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageHorizontal = itemView.findViewById(R.id.imageViewCartazHorizontal);
        }
    }
}
