package com.example.utspemrogramanandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMenuAdapter extends RecyclerView.Adapter<CardViewMenuAdapter.CardViewViewHolder> {
    private Context context;

    private ArrayList<Food> listFood;

     CardViewMenuAdapter(ArrayList<Food> list) {
        this.listFood = list;
     }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_menu, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
                holder.tvName.setText(food.getName());
                holder.tvPrice.setText("Rp." + food.getPrice());
                holder.tvDetail.setText(food.getDetail());
    }


    @Override
    public int getItemCount() {
        return listFood.size();
    }

    static class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvPrice, tvDetail;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }
}
