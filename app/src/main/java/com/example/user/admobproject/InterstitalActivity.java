package com.example.user.admobproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitalActivity extends AppCompatActivity {

    private Button btnShow,btnLoad;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstital);
        btnShow = findViewById(R.id.btnShowInterstitialAd);
        btnLoad = findViewById(R.id.btnLoadInterstitialAd);

        btnShow.setEnabled(false);
    }

    public void loadInterstitial(View view) {

        mInterstitialAd = new InterstitialAd(getApplicationContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.setAdListener(new ToastAdListener(getApplicationContext()){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        btnShow.setEnabled(true);

    }

    public void showInterstitial(View view) {
        if(mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        }else {
            btnShow.setEnabled(false);
            btnShow.setText("Interstitial ad not ready");
        }
    }
}
