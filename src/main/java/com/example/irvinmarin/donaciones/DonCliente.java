package com.example.irvinmarin.donaciones;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by kelvi on 22/02/2017.
 */

public class DonCliente extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(new FlowConfig.Builder(this).build());
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(DonCliente.this);
    }
}

