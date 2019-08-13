package com.miftahul.beasiswa.submision;


import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListCharacterAdapter.ItemClick {
    private RecyclerView rvHeroes;
    private ArrayList<Karakter> list = new ArrayList<>();
    ListCharacterAdapter KAdapter;
    ArrayList <Karakter> karakter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHeroes = findViewById(R.id.rv_hero);
        rvHeroes.setHasFixedSize(true);

        list.addAll(CharacterData.getListData());


        KAdapter = new ListCharacterAdapter(list,this,this);
        showRecycleList();


    }
    //nampilin list
    private void showRecycleList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        rvHeroes.setAdapter(KAdapter);
    }
    //intent
    public void onItemClicked(Karakter karakter){
        Intent intent= new Intent(MainActivity.this,DetailData.class);
        intent.putExtra("image",karakter.getPhoto());
        intent.putExtra("name",karakter.getName());
        intent.putExtra("isi",karakter.getFrom());
        startActivity(intent);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());

        return super.onOptionsItemSelected(item);
    }

    private void setMode(int Selectedmode) {
        switch (Selectedmode){
            case R.id.menu:
                Intent intent=new Intent(MainActivity.this,About.class);
                startActivity(intent);
                break;

        }
    }

}

