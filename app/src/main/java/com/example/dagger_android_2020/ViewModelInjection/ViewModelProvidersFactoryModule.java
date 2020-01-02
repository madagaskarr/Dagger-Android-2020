package com.example.dagger_android_2020.ViewModelInjection;

import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelProvidersFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelProvider(ViewModelProvidersFactory viewModelProvidersFactory);

}
