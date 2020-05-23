// Generated by Dagger (https://google.github.io/dagger).
package com.nytimes.android.di.module;

import com.nytimes.android.data.remote.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class AppModule_ProvideRetrofitFactory implements Factory<ApiService> {
  private final AppModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideRetrofitFactory(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public ApiService get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideRetrofitFactory create(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }

  public static ApiService proxyProvideRetrofit(AppModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
