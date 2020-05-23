package com.nytimes.android.di.builder;

import androidx.fragment.app.Fragment;
import com.nytimes.android.view.fragment.ArticleListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuilderModule_ContributeArticleListFragment.ArticleListFragmentSubcomponent.class
)
public abstract class FragmentBuilderModule_ContributeArticleListFragment {
  private FragmentBuilderModule_ContributeArticleListFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ArticleListFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ArticleListFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ArticleListFragmentSubcomponent extends AndroidInjector<ArticleListFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ArticleListFragment> {}
  }
}
