package com.example.utspemrogramanandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMenus;
    private ArrayList<Food> list = new ArrayList<>();
    private String title = "Menu List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvMenus = findViewById(R.id.rv_food);
        rvMenus.setHasFixedSize(true);

        list.addAll(FoodsData.getListData(getApplicationContext()));
        showRecyclerCardView();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_logout:
                title = "Logout";
                finish();
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerCardView(){
        rvMenus.setLayoutManager(new LinearLayoutManager(this));
        CardViewMenuAdapter cardViewMenuAdapter = new CardViewMenuAdapter(list);
        rvMenus.setAdapter(cardViewMenuAdapter);
    }
}