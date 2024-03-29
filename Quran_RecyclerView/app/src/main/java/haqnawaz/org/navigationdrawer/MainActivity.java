package haqnawaz.org.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ListView surahNamesView;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    Intent intent;
    ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        DBHelper dbHelper =
                new DBHelper(MainActivity.this);
        dbHelper.hello();
        dbHelper.addStudent();
        Log.d("=====",
                "onCreate Ayah No "+dbHelper.ayah());

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_search:
                        intent = new Intent(MainActivity.this, SearchActivity.class);
                        startActivity(intent);
                        break;


                    case R.id.nav_urdu:
                        intent = new Intent(MainActivity.this,TranslationActivity.class);
                        intent.putExtra("Language","urdu");
                        startActivity(intent);
                        break;

                    case R.id.nav_english:
                        intent = new Intent(MainActivity.this,TranslationActivity.class);
                        intent.putExtra("Language","english");
                        startActivity(intent);
                        break;


                }

                return true;
            }
        });

        surahNamesView = findViewById(R.id.surahNamesView);
        QDH obj = new QDH();
        String[] surahNames=obj.englishSurahNames;

        int[] ssp = obj.SSP;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,surahNames);
        surahNamesView.setAdapter(arrayAdapter);
        surahNamesView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("======", "onItemClick: "+ssp.length+" length");
                int startIndex = ssp[i];
                int endIndex;
                if(i+1>=ssp.length)
                    endIndex = 6349;
                else
                    endIndex = ssp[i+1];

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("startIndex",startIndex);
                intent.putExtra("endIndex",endIndex);
                startActivity(intent);

            }
        });


    }
}