// Generated by Dagger (https://google.github.io/dagger).
package com.nytimes.android.di.module;

import android.app.Application;
import com.nytimes.android.data.local.ArticleDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideArticleDatabaseFactory implements Factory<ArticleDatabase> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideArticleDatabaseFactory(
      AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public ArticleDatabase get() {
    return Preconditions.checkNotNull(
        module.provideArticleDatabase(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideArticleDatabaseFactory create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvideArticleDatabaseFactory(module, applicationProvider);
  }

  public static ArticleDatabase proxyProvideArticleDatabase(
      AppModule instance, Application application) {
    return Preconditions.checkNotNull(
        instance.provideArticleDatabase(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
