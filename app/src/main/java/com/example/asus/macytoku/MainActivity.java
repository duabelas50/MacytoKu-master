package com.example.asus.macytoku;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.os.Bundle;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener jadwal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            jadwal(v);
        }
    };

    public void jadwal(View v) {
        Intent intent = new Intent(MainActivity.this, Jadwal.class);
        startActivity(intent);
    }

    View.OnClickListener infor = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            infor(v);
        }
    };

    public void infor(View v) {
        Intent intent = new Intent(MainActivity.this, Info.class);
        startActivity(intent);
    }

    View.OnClickListener rute = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            rute(v);
        }
    };

    public void rute(View v) {
        Intent intent = new Intent(MainActivity.this, Rute.class);
        startActivity(intent);
    }

    View.OnClickListener testi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            testi(v);
        }
    };

    public void testi(View v) {
        Intent intent = new Intent(MainActivity.this, Testi.class);
        startActivity(intent);
    }

    View.OnClickListener foto = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            foto(v);
        }
    };

    public void foto(View v) {
        Intent intent = new Intent(MainActivity.this, Foto.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.navigation_settings){
            Intent intent = new Intent(this, Settings.class);
            this.startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
