package com.example.dagger_android_2020.Modules;

import androidx.lifecycle.ViewModel;

import com.example.dagger_android_2020.ViewModelInjection.ViewModelKey;
import com.example.dagger_android_2020.ViewModels.MainActivityViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainActivityViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel.class)
    public abstract ViewModel bindMainActivityViewModel(MainActivityViewModel mainActivityViewModel);
}
