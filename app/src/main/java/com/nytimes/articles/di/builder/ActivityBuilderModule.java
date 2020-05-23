package com.nytimes.articles.di.builder;

import com.nytimes.articles.view.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * The module which provides the android injection service to Activities.
 * <p>
 * Author: Mohammad Saleem
 * Created: 23/05/2020
 * Modified: 23/05/2020
 */
@Module
public abstract class ActivityBuilderModule {

    @SuppressWarnings("unused")
    @ContributesAndroidInjector(modules = FragmentBuilderModule.class)
    abstract MainActivity mainActivity();


}
