package com.dam.jessicahv.appexamen;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar ;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import androidx.versionedparcelable.VersionedParcelable;

public class MainActivity extends AppCompatActivity implements WelcomeFragment.OnFragmentInteractionListener, PlatosFragment.OnFragmentInteractionListener, HacerReservarFragment.OnFragmentInteractionListener, VerReservasFragment.OnFragmentInteractionListener {
    Fragment welcomeFragment;
    RecyclerView recyclerView;
    ArrayList<Platos> listaPlatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        welcomeFragment = new WelcomeFragment();


        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, welcomeFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment fragment;

        switch (item.getItemId()){
            case R.id.platos:
                fragment = new PlatosFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
                break;
            case R.id.hacerReserva:
                fragment = new HacerReservarFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
                break;
            case R.id.verReserva:
                fragment = new VerReservasFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
                break;
        }
        return super .onOptionsItemSelected(item);
    }
}
