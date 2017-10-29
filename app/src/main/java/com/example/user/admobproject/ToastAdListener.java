package com.example.user.admobproject;

import android.content.Context;

import com.google.android.gms.ads.AdListener;

/**
 * Created by user on 10/29/17.
 */

public class ToastAdListener extends AdListener {

    private Context context;

    public ToastAdListener(Context context) {
        this.context = context;
    }

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
}
