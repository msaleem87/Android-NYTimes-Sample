// Generated by Dagger (https://google.github.io/dagger).
package com.nytimes.articles.view.fragment;

import android.arch.lifecycle.ViewModelProvider;
import com.nytimes.articles.view.base.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ArticleListFragment_MembersInjector
    implements MembersInjector<ArticleListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ArticleListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ArticleListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ArticleListFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ArticleListFragment instance) {
    BaseFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }
}
