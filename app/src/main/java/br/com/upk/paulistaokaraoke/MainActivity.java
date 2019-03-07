package br.com.upk.paulistaokaraoke;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        openFragment(HomeFragment.newInstance());
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                        Fragment homeFragment = HomeFragment.newInstance();
                        openFragment(homeFragment);
                    return true;
                case R.id.navigation_live:
                        Fragment liveFragment = LiveFragment.newInstance();
                        openFragment(liveFragment);
                    return true;
                case R.id.navigation_news:
                        Fragment newsFragment = NewsFragment.newInstance();
                        openFragment(newsFragment);
                    return true;
                case R.id.navigation_info:
                        Fragment infoFragment = InfoFragment.newInstance();
                        openFragment(infoFragment);
                    return true;
            }
            return false;
        }
    };

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}