// Generated by Dagger (https://google.github.io/dagger).
package com.nytimes.android.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

public final class AppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  public AppModule_ProvideOkHttpClientFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideOkHttpClientFactory create(AppModule module) {
    return new AppModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient proxyProvideOkHttpClient(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
