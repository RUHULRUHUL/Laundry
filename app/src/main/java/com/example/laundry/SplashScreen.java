package com.example.laundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.bhargavms.dotloader.DotLoader;


public class SplashScreen extends AppCompatActivity {
    private DotLoader dotLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dotLoader=new DotLoader(this);

        dotLoader.postDelayed(new Runnable() {
            @Override
            public void run() {
                dotLoader.setNumberOfDots(4);
                Intent mainIntent = new Intent(SplashScreen.this,HomeActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);



        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this,HomeActivity.class);
               startActivity(mainIntent);
               finish();
            }
        }, 2000);
    }
}
