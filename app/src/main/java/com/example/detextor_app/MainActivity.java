package com.example.detextor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Camera camera = Camera.open();
        SurfaceView preview = (SurfaceView) findViewById(R.id.SurfaceView01);;
        SurfaceHolder surfaceHolder;
        surfaceHolder = preview.getHolder();
        surfaceHolder.addCallback((SurfaceHolder.Callback) this);
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }
}