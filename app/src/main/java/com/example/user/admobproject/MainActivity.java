package com.example.user.admobproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bannerActivity(View view) {
        startActivity(new Intent(this,BannarAdActivity.class));
    }

    public void interstitialActivity(View view) {
        startActivity(new Intent(this,InterstitalActivity.class));
    }
}
