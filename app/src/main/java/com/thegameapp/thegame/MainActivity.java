package com.thegameapp.thegame;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private ActionBar mActionBar;
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_news:
                    mActionBar.setTitle("Wiadomości");
                    return true;
                case R.id.navigation_matches:
                    mActionBar.setTitle("Mecze");
                    return true;
                case R.id.navigation_standings:
                    mActionBar.setTitle("Tabele");
                    return true;
                case R.id.navigation_teams_lineups:
                    mActionBar.setTitle("Składy");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mActionBar = getSupportActionBar();
        assert mActionBar != null;
        mActionBar.setTitle("Wiadmości");

    }


}
