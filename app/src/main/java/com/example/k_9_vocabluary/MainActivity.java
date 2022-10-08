package com.example.k_9_vocabluary;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.k_9_vocabluary.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private ActivityMainBinding binding;
    private ListView list;
    private String[] menu_array;
    private ArrayAdapter<String> array_adapt;
    private DrawerLayout drawer;
    private Toolbar toolbar;
    private int category_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.menu_training);
        setSupportActionBar(toolbar);



        list = findViewById(R.id.List_menu);
        menu_array = getResources().getStringArray(R.array.training_menu);
        array_adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<String>(Arrays.asList(menu_array)));
        list.setAdapter(array_adapt);

        category_index = 1;

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, Content_Activity.class);
                intent.putExtra("category", category_index);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       DrawerLayout drawer = findViewById(R.id.drawer_layout);
       if (drawer.isDrawerOpen(GravityCompat.START))
       {
           drawer.closeDrawer(GravityCompat.START);
       } else {
           super.onBackPressed();
       }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem ) {
        int id = menuitem.getItemId();
        if(id == R.id.nav_training)
        {
            menu_array = getResources().getStringArray(R.array.training_menu);
            array_adapt.clear();
            array_adapt.addAll(menu_array);
            array_adapt.notifyDataSetChanged();
            toolbar.setTitle(R.string.menu_training);
            category_index = 1;
        }
        else if (id == R.id.nav_poroda)
        {
            menu_array = getResources().getStringArray(R.array.breeds_menu);
            array_adapt.clear();
            array_adapt.addAll(menu_array);
            array_adapt.notifyDataSetChanged();
            toolbar.setTitle(R.string.menu_poroda);
            category_index = 2;
        }
        else if(id == R.id.nav_wash)
        {
            menu_array = getResources().getStringArray(R.array.wash_menu);
            array_adapt.clear();
            array_adapt.addAll(menu_array);
            array_adapt.notifyDataSetChanged();
            toolbar.setTitle(R.string.menu_wash);
            category_index = 3;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}