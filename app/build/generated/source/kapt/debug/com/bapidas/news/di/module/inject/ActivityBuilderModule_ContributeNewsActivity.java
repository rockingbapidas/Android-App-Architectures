package com.bapidas.news.di.module.inject;

import com.bapidas.news.di.scope.ActivityScope;
import com.bapidas.news.ui.main.news.listing.NewsActivity;
import com.bapidas.news.ui.main.news.listing.NewsActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_ContributeNewsActivity.NewsActivitySubcomponent.class)
public abstract class ActivityBuilderModule_ContributeNewsActivity {
  private ActivityBuilderModule_ContributeNewsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(NewsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NewsActivitySubcomponent.Factory builder);

  @Subcomponent(modules = NewsActivityModule.class)
  @ActivityScope
  public interface NewsActivitySubcomponent extends AndroidInjector<NewsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NewsActivity> {}
  }
}
