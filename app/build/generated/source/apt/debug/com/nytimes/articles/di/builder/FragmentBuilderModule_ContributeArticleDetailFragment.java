package com.nytimes.articles.di.builder;

import android.support.v4.app.Fragment;
import com.nytimes.articles.view.fragment.ArticleDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuilderModule_ContributeArticleDetailFragment.ArticleDetailFragmentSubcomponent.class
)
public abstract class FragmentBuilderModule_ContributeArticleDetailFragment {
  private FragmentBuilderModule_ContributeArticleDetailFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ArticleDetailFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ArticleDetailFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ArticleDetailFragmentSubcomponent
      extends AndroidInjector<ArticleDetailFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ArticleDetailFragment> {}
  }
}
