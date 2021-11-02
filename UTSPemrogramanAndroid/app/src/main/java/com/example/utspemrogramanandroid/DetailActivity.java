package com.example.utspemrogramanandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_FOOD = "extra_food";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Food> list = FoodsData.getListData(getApplicationContext());
        Food food = list.get(id);

        TextView name = (TextView) findViewById(R.id.detail_judul);
        TextView description = (TextView) findViewById(R.id.detail_deskripsi);
        TextView harga = (TextView) findViewById(R.id.detail_harga);
//        Food food = (Food) getIntent().getParcelableExtra(EXTRA_FOOD);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(food.getPhoto())).into((ImageView) findViewById(R.id.detail_photo));
        name.setText(food.getName());
        description.setText(food.getDetail());
        harga.setText("Rp." + food.getPrice());

    }
}