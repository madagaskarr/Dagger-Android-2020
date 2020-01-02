package com.example.dagger_android_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.example.dagger_android_2020.ViewModelInjection.ViewModelProvidersFactory;
import com.example.dagger_android_2020.ViewModels.MainActivityViewModel;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;


// TODO: 9 - Extend by DaggerAppCompatActivity
// Every activity that is being used by Dagger as a client need to be extended by DaggerAppCompatActivity.
// Under the hood this will do whatever in the previous Dagger versions people do manually.
public class MainActivity extends DaggerAppCompatActivity {

    private ImageView myImageView;
    private MainActivityViewModel mainActivityViewModel;

    @Inject
    RequestManager glideInstance;

    @Inject
    Drawable logoDrawable;

    @Inject
    ViewModelProvidersFactory viewModelProvidersFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.my_image_view);
        glideInstance.load(logoDrawable).into(myImageView);
        mainActivityViewModel = ViewModelProviders.of(this, viewModelProvidersFactory).get(MainActivityViewModel.class);
    }
}
