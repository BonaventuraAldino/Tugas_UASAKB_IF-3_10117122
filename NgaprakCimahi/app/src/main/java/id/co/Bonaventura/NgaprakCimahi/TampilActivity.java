package id.co.Bonaventura.NgaprakCimahi;

import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

/**
 * * Tanggal Pengerjaan : Selasa 11 Agustus 2020
 * * Nama  : Bonaventura Aldino Senda Seni
 * * NIM   : 10117122
 * * Kelas : IF-3
 */

public class TampilActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Home_Fragment home_fragment;
    private TampilFragment wisata_fragment;

    private TampilFragment masjid, gereja, curug, gigle, tk, tamanalun, tamangajah, gunungbohong,
            nuart, pandiga,stasiun;


    private Button bDirection;
    private LatLng dir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Fragment
        wisata_fragment = new TampilFragment(R.layout.fragment_wisata);


        //Wisata
        masjid = new TampilFragment(R.layout.masjid);
        gereja = new TampilFragment(R.layout.gereja);
        curug= new TampilFragment(R.layout.curug);
        gigle = new TampilFragment(R.layout.gigle);
        tk = new TampilFragment(R.layout.tk);
        tamanalun = new TampilFragment(R.layout.tamanalun);
        tamangajah = new TampilFragment(R.layout.tamangajah);
        gunungbohong = new TampilFragment(R.layout.gunungbohong);
        nuart = new TampilFragment(R.layout.nuart);
        pandiga = new TampilFragment(R.layout.pandiga);
        stasiun = new TampilFragment(R.layout.stasiun);



        home_fragment = new Home_Fragment(this);
        pushFragment(home_fragment);

        bDirection = findViewById(R.id.direction);
        bDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dir != null){
                    Intent i = new Intent("android.intent.action.MAPS");
                    i.putExtra("Lat", dir.latitude);
                    i.putExtra("Lon", dir.longitude);
                    startActivity(i);
                }else{
                    Toast.makeText(TampilActivity.this, "Coming soon!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        bDirection.setVisibility(View.GONE);

        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_home:
                pushFragment(home_fragment);
                break;
            case R.id.nav_wisata:
                pushFragment(wisata_fragment);
                break;


            //Tentang
            case R.id.nav_tentang_aplikasi:
                final Dialog dialog = new Dialog(this, R.style.dialog_notitle);
                dialog.setContentView(R.layout.tentang_aplikasi);
                dialog.show();
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //Wisata Fragment
    public void wisata(View v) {
        switch (v.getId()) {
            case R.id.wisata1:

                pushFragment(masjid);
                dir = new LatLng(-6.872691, 107.541785);
                break;
            case R.id.wisata2:
                pushFragment(gereja);
                dir = new LatLng(-6.890495, 107.536428);
                break;
            case R.id.wisata3:
                pushFragment(curug);
                dir = new LatLng(-6.799283, 107.577370);
                break;
            case R.id.wisata4:
                pushFragment(gigle);
                dir = new LatLng(-6.876739, 107.545734);
                break;
            case R.id.wisata5:
                pushFragment(tk);
                dir = new LatLng(-6.888003, 107.536966);
                break;
            case R.id.wisata6:
                pushFragment(tamanalun);
                dir = new LatLng(-6.873197, 107.542264);
                break;
            case R.id.wisata7:
                pushFragment(tamangajah);
                dir = new LatLng(-6.887261, 107.538388);
                break;
            case R.id.wisata8:
                pushFragment(gunungbohong);
                dir = new LatLng(-6.880197, 107.526343);
                break;
            case R.id.wisata9:
                pushFragment(nuart);
                dir = new LatLng(-6.877516, 107.572396);
                break;
            case R.id.wisata10:
                pushFragment(pandiga);
                dir = new LatLng(-6.875704, 107.555490);
                break;
            case R.id.wisata11:
                pushFragment(stasiun);
                dir = new LatLng(-6.885234, 107.536407);
                break;

        }
        bDirection.setVisibility(View.VISIBLE);
    }




    protected void pushFragment(Fragment fragment) {
        if (fragment == null)
            return;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            if (ft != null) {
                ft.replace(R.id.rootLayout, fragment);
                ft.commit();
            }
        }
    }
}
