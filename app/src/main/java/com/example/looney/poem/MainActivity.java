package com.example.looney.poem;

import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.looney.poem.fragment.HomeFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private NavigationView mNavigationView;
    private FrameLayout content;
    private DrawerLayout drawerLayout;
    private HomeFragment homeFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         drawerLayout = (DrawerLayout) findViewById(R.id.dl);
        mNavigationView = (NavigationView) findViewById(R.id.id_nv_menu);
//        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        content= (FrameLayout) findViewById(R.id.content);
//        setSupportActionBar(toolbar);
//        final ActionBar actionBar = getSupportActionBar();
//
//        if (actionBar != null) {
//            actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }
        initViews();
    }


    private void initViews() {
        initNavigationView();
        initFragment();
    }

    private void initNavigationView() {

        mNavigationView.setNavigationItemSelectedListener(this);
//        View headView = View.inflate(this,R.layout.header_just_username,null);
//        mNavigationView.addHeaderView(headView);
    }

    private void initFragment() {
        homeFragment = new HomeFragment();
        Fragment[] mFragments = {
                homeFragment
        };
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_messages:
                Snackbar.make(content,"nave_message is clicked",Snackbar.LENGTH_SHORT).show();
                drawerLayout.closeDrawers();
                getSupportFragmentManager().beginTransaction().replace(R.id.content, homeFragment).commit();
                break;

        }
        return true;
    }
}
