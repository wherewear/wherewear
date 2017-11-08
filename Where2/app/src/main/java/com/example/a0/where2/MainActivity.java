package com.example.a0.where2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.skp.Tmap.TMapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //선언
        RelativeLayout relativeLayout=new RelativeLayout(this);
        TMapView tMapView=new TMapView(this);

        //키값
        tMapView.setSKPMapApiKey("5c4d5cd3-917f-3c85-985a-5ed8869d72f3");
        tMapView.setCompassMode(true);
        tMapView.setIconVisibility(true);
        tMapView.setZoomLevel(20);
        tMapView.setMapType(TMapView.MAPTYPE_STANDARD);
        tMapView.setLanguage(TMapView.LANGUAGE_KOREAN);
        tMapView.setTrackingMode(true);
        tMapView.setSightVisible(true);
        relativeLayout.addView(tMapView);
        setContentView(relativeLayout);
    }
}
