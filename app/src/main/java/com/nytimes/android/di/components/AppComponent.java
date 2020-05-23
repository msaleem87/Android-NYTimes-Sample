package com.nytimes.android.di.components;

import android.app.Application;

import com.nytimes.android.NYTimesApp;
import com.nytimes.android.di.builder.ActivityBuilderModule;
import com.nytimes.android.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;


/**
 * The main application component which initializes all the dependent modules
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
@Singleton
@Component(modules = {
        AppModule.class,
        AndroidInjectionModule.class,
        ActivityBuilderModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(NYTimesApp nyTimesApp);
}
