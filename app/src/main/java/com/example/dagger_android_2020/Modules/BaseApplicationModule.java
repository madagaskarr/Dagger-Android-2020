package com.example.dagger_android_2020.Modules;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dagger_android_2020.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

// TODO: 10 - Create BaseApplicationModule for Application level dependencies
// MARK: BaseApplicationModule is the class where we need to provide all the dependencies that are
// going to be used during the entire application.
@Module
public class BaseApplicationModule {

    // TODO: 11 - Add RequestOptions for using Glide
    // The @Provide annotation is one of the most often Dagger annotations. It used for adding a
    // dependency into object graph. So object graph is where all the objects are. @Singleton
    // annotation is just a label for scoping. It will look to see which component is the owner
    // of this annotation and will have the same lifetime.
    @Singleton
    @Provides
    static RequestOptions provideRequestOptions() {
        return new RequestOptions()
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.error_logo);
    }

    // TODO: 12 - Add RequestManager for using Glide
    // The @Provide annotation is one of the most often Dagger annotations. It used for adding a
    // dependency into object graph. So object graph is where all the objects are. We pass Application
    // and RequestOptions objects and because we already added that classes into object graph Dagger
    // will find them and inject into constructor of RequestManager. Singleton annotation is just a
    // label for scoping. It will look to see which component is the owner of this annotation and will
    // have the same lifetime.
    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }

    // TODO: 13 - Add Drawable for using Glide
    // The @Provide annotation is one of the most often Dagger annotations. It used for adding a
    // dependency into object graph. So object graph is where all the objects are. We pass Application
    // object and because we already added that classes into object graph Dagger will find them and
    // inject into constructor of Drawable. Singleton annotation is just a label for scoping. It will
    // look to see which component is the owner of this annotation and will have the same lifetime.
    @Singleton
    @Provides
    static Drawable provideLogoDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.android_logo);
    }
}
