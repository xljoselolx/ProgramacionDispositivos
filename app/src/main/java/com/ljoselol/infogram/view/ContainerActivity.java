package com.ljoselol.infogram.view;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ljoselol.infogram.R;
import com.ljoselol.infogram.view.fragment.HomeFragment;
import com.ljoselol.infogram.view.fragment.ProfileFragment;
import com.ljoselol.infogram.view.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment=null;
                        switch (item.getItemId()){
                            case R.id.search:
                                selectedFragment = new SearchFragment();
                                break;

                            case R.id.home:
                                selectedFragment = new HomeFragment();
                                break;

                            case R.id.profile:
                                selectedFragment = new ProfileFragment();
                                break;

                        }

                        assert selectedFragment != null;
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container_frame, selectedFragment)
                                .commit();


                        return true;
                    }
                }
        );
    }
}