package com.example.quranapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class RecyclerSearchActivity extends AppCompatActivity {

    EditText searchText;
    RecyclerView surahNameRecycleView;
    ArrayList<SurahModel> surahModelArrayList;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    Intent intent;
    ActionBarDrawerToggle toggle;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_search);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_search:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;


                    case R.id.urdu_translation1:
                        intent = new Intent(RecyclerSearchActivity.this,TranslationActivity.class);
                        intent.putExtra("Language","urdu");
                        intent.putExtra("Version","Fateh Muhammad Jalandhri");
                        startActivity(intent);
                        break;
                    case R.id.urdu_translation2:
                        intent = new Intent(RecyclerSearchActivity.this,TranslationActivity.class);
                        intent.putExtra("Language","urdu") ;
                        intent.putExtra("Version","Mehmood ul Hassan");
                        startActivity(intent);
                        break;

                    case R.id.english_translation1:
                        intent = new Intent(RecyclerSearchActivity.this,TranslationActivity.class);
                        intent.putExtra("Language","english");
                        intent.putExtra("Version","Dr Mohsin Khan");
                        startActivity(intent);
                        break;
                    case R.id.english_translation2:
                        intent = new Intent(RecyclerSearchActivity.this,TranslationActivity.class);
                        intent.putExtra("Language","english");
                        intent.putExtra("Version","Mufti Taqi Usmani");
                        startActivity(intent);
                        break;

                }

                return true;
            }
        });
        DBHelper dbHelper = new DBHelper(RecyclerSearchActivity.this);
        searchText = findViewById(R.id.searchText);
        surahNameRecycleView = findViewById(R.id.surahNameRecyclerView);
        searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                surahModelArrayList = dbHelper.getAllSurahs(searchText.getText().toString());
                adapter = new ayahRecyclerAdapter(surahModelArrayList);
                layoutManager = new LinearLayoutManager(RecyclerSearchActivity.this,LinearLayoutManager.VERTICAL,false);
                surahNameRecycleView.setLayoutManager(layoutManager);
                surahNameRecycleView.setAdapter(adapter);

//                surahNameRecycleView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                        Intent intent = new Intent(SearchActivity.this,SurahActivity.class);
//                        intent.putExtra("SurahName",surahModelArrayList.get(i).getSurahNameEnglish());
//                        startActivity(intent);
//                    }
//                });
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

    }

    public void itemOnClick(View view) {
        TextView surahname = view.findViewById(R.id.surahNamesTextView);
        Log.d("=======", "itemOnClick: "+surahname.getText().toString());
    }
}