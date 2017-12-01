package com.poc_android_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ActivityLifeCycle", "onCreate: ");

        if (null == savedInstanceState) {
            Log.d("CameraActivity", "onCreate: saveinsatnce null");
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, LifeCycleFragment.newInstance())
                    .commit();
        }
        else{

            Log.d("CameraActivity", "onCreate: saveinsatnce not null");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifeCycle", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifeCycle", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ActivityLifeCycle", "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifeCycle", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifeCycle", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifeCycle", "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d("ActivityLifeCycle", "onSaveInstanceState: ");
        super.onSaveInstanceState(outState);
    }
}
