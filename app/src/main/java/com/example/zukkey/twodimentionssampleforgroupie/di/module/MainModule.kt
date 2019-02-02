package com.example.zukkey.twodimentionssampleforgroupie.di.module

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.example.zukkey.twodimentionssampleforgroupie.ui.main.MainViewModel
import com.example.zukkey.twodimentionssampleforgroupie.ui.main.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MainModule(
    private val activity: FragmentActivity
) {

    @Provides
    fun provideMainViewModel(
        factory: MainViewModelFactory
    ) : MainViewModel {
        return ViewModelProviders.of(activity, factory).get(MainViewModel::class.java)
    }
}