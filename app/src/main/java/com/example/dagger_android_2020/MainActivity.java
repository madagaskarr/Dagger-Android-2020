package com.example.dagger_android_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;


// TODO: 9 - Extend by DaggerAppCompatActivity
// Every activity that is being used by Dagger as a client need to be extended by DaggerAppCompatActivity.
// Under the hood this will do whatever in the previous Dagger versions people do manually.
public class MainActivity extends DaggerAppCompatActivity {

    private ImageView myImageView;

    @Inject
    RequestManager glideInstance;

    @Inject
    Drawable logoDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.my_image_view);
        glideInstance.load(logoDrawable).into(myImageView);
    }
}
