package com.example.irvinmarin.donaciones.main.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.irvinmarin.donaciones.R;
import com.example.irvinmarin.donaciones.main.adapters.PromesasAdapter;
import com.example.irvinmarin.donaciones.main.enitiesUI.PromesaUI;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.rv_listaPromesas)
    RecyclerView rvListaPromesas;
    @BindView(R.id.txtCantidadTotal)
    TextView txtCantidadTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle("Mis Promesas");
        setupDrawer();
        setupRvPromesas();

    }

    private void setupRvPromesas() {

        rvListaPromesas.setLayoutManager(new LinearLayoutManager(this));
        rvListaPromesas.setAdapter(new PromesasAdapter(populatePromesas()));
        txtCantidadTotal.setText("S/ " + totalPromesas);
    }

    double totalPromesas = 0;

    private List<PromesaUI> populatePromesas() {
        List<PromesaUI> promesaUIList = new ArrayList<>();

        promesaUIList.add(new PromesaUI(1, 2012215, "01/10/2012", "01/12/2012", "Finalizado", 1, 500.00));
        promesaUIList.add(new PromesaUI(2, 2012145, "01/10/2013", "01/12/2013", "Finalizado", 1, 600.00));
        promesaUIList.add(new PromesaUI(3, 2012155, "01/10/2014", "01/12/2014", "Finalizado", 1, 700.00));
        promesaUIList.add(new PromesaUI(4, 2012245, "01/10/2015", "01/12/2015", "Finalizado", 1, 800.00));
        promesaUIList.add(new PromesaUI(5, 2012295, "01/01/2018", "01/12/2018", "Pendiente", 2, 900.00));

        for (PromesaUI promesaUI : promesaUIList) {
            totalPromesas = totalPromesas + promesaUI.getTotalPromesa();
        }

        return promesaUIList;
    }

    private void setupDrawer() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
