package com.example.zukkey.twodimentionssampleforgroupie.di.component

import com.example.zukkey.twodimentionssampleforgroupie.MainApp
import com.example.zukkey.twodimentionssampleforgroupie.di.module.AppModule
import com.example.zukkey.twodimentionssampleforgroupie.di.module.ClientModule
import com.example.zukkey.twodimentionssampleforgroupie.di.module.MainModule
import dagger.Component

@Component(modules = [AppModule::class, ClientModule::class])
interface AppComponent {
  fun inject(application: MainApp)
  fun plus(module: MainModule): MainComponent
}
