package com.bapidas.news.di.module.inject;

import com.bapidas.news.di.scope.ActivityScope;
import com.bapidas.news.ui.main.MainActivity;
import com.bapidas.news.ui.main.MainActivityModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_ContributeMainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBuilderModule_ContributeMainActivity {
  private ActivityBuilderModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = MainActivityModule.class)
  @ActivityScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
