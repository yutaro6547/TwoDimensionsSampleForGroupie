package com.example.zukkey.twodimentionssampleforgroupie.di.component

import com.example.zukkey.twodimentionssampleforgroupie.di.module.ClientModule
import com.example.zukkey.twodimentionssampleforgroupie.di.module.MainModule
import com.example.zukkey.twodimentionssampleforgroupie.ui.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}