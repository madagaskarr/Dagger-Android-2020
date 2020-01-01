package com.example.dagger_android_2020.Modules;


import com.example.dagger_android_2020.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

// TODO: 7 - Create ActivityBuildersModule
// MARK: In Dagger we cant randomly inject dependencies into activities or fragments.
// For that we need to somehow mark an activity or fragment that Dagger knows that they
// are our clients. Think about Dagger as a service and views as clients. In order to
// inject into activities or fragments we need to make our module abstract. This is the
// first module we created and and it's job is to mark activities or fragments as clients.
// After creating a new module we need to include it in component.
@Module
public abstract class ActivityBuildersModule {

    // Then create an abstract method with ContributesAndroidInjector annotation and
    // return the activity that we want to mark as our service client. In previous
    // Dagger versions this was harder and you need to do more steps but with the new
    // Dagger version you just need to use thi right annotation.
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
