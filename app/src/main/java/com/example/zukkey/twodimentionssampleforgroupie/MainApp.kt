package com.example.zukkey.twodimentionssampleforgroupie

import android.app.Application
import com.example.zukkey.twodimentionssampleforgroupie.di.component.AppComponent
import com.example.zukkey.twodimentionssampleforgroupie.di.component.DaggerAppComponent
import com.example.zukkey.twodimentionssampleforgroupie.di.module.AppModule

class MainApp: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        component.inject(this)
    }

}