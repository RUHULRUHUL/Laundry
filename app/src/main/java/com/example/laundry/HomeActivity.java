package com.example.laundry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.laundry.fragment.CartfragmentFragment;
import com.example.laundry.fragment.HomefragmentFragment;
import com.example.laundry.fragment.MorefragmentFragment;
import com.example.laundry.fragment.OrderfragmentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView=findViewById(R.id.bottomnavid);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_id,new HomefragmentFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                if (item.getItemId()==R.id.homeid)
                {
                    fragment=new HomefragmentFragment();

                }
                else if (item.getItemId()==R.id.orderid)
                {
                    fragment=new OrderfragmentFragment();
                }
                else if (item.getItemId()==R.id.cartid)
                {
                    fragment=new CartfragmentFragment();
                }
                else if (item.getItemId()==R.id.settingsid)
                {
                    fragment=new MorefragmentFragment();
                }
                else {
                    Toast.makeText(HomeActivity.this, "you have no sellected", Toast.LENGTH_SHORT).show();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_id,fragment).commit();

                return false;
            }
        });


    }
}
