package com.example.dagger_android_2020;





import com.example.dagger_android_2020.Components.DaggerBaseApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


// TODO: 1 - Create an Application class and extend with DaggerApplication
// MARK: The whole idea behind Dagger is that you show Dagger how to create dependencies in configuration
// files and later inject that dependencies in whatever class you need. Dagger is more about clean code
// structuring. Every Dagger application will have BaseApplication which will return BaseApplicationComponent
// with Dagger prefix. Components are the classes that include references to the classes where we need
// to configure our dependencies. That classes called Modules. Inside a module you need to show Dagger
// how to instantiate a dependency.
public class BaseApplication extends DaggerApplication {

    // TODO: 2 - Implement a delegate method of DaggerApplication
    // MARK: The following delegate method is responsible for returning BaseApplicationComponent. But
    // first we need to create that Component and then build the project and Dagger will create that
    // component with Dagger prefix.
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        // TODO: 6 - Return a DaggerBaseApplicationComponent
        // After finishing the Component setup we need to build the project and return
        // BaseApplicationComponent with Dagger prefix. This is the final step for initial
        // Dagger Android setup. Now we have an Application level component and next is
        // to create Modules for the component.
        return DaggerBaseApplicationComponent.builder().bindInstance(this).build();
    }
}
