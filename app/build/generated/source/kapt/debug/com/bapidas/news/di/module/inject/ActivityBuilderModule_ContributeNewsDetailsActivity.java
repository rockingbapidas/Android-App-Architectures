package com.bapidas.news.di.module.inject;

import com.bapidas.news.di.scope.ActivityScope;
import com.bapidas.news.ui.main.news.detail.NewsDetailActivityModule;
import com.bapidas.news.ui.main.news.detail.NewsDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeNewsDetailsActivity.NewsDetailsActivitySubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeNewsDetailsActivity {
  private ActivityBuilderModule_ContributeNewsDetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(NewsDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NewsDetailsActivitySubcomponent.Factory builder);

  @Subcomponent(modules = NewsDetailActivityModule.class)
  @ActivityScope
  public interface NewsDetailsActivitySubcomponent extends AndroidInjector<NewsDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NewsDetailsActivity> {}
  }
}
