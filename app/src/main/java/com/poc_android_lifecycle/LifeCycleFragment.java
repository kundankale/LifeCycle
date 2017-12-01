package com.poc_android_lifecycle;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xcaluser on 1/12/17.
 */

public class LifeCycleFragment extends Fragment {


    public static LifeCycleFragment newInstance() {
        Log.d("LifeCycleFragment", "newInstance: ");
        return new LifeCycleFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("LifeCycleFragment", "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d("LifeCycleFragment", "onCreateView: ");
        return inflater.inflate(R.layout.fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Log.d("LifeCycleFragment", "onViewCreated: ");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        Log.d("LifeCycleFragment", "onViewStateRestored: ");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onPause() {
        Log.d("LifeCycleFragment", "onPause: ");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.d("LifeCycleFragment", "onResume: ");
        super.onResume();
    }

    @Override
    public void onStop() {
        Log.d("LifeCycleFragment", "onStop: ");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.d("LifeCycleFragment", "onDestroy: ");
        super.onDestroy();
    }
}
