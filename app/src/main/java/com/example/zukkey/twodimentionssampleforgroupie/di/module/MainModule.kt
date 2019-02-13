package com.example.zukkey.twodimentionssampleforgroupie.di.module

import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.FragmentActivity
import com.example.zukkey.twodimentionssampleforgroupie.api.GitHubClient
import com.example.zukkey.twodimentionssampleforgroupie.ui.main.MainViewModel
import com.example.zukkey.twodimentionssampleforgroupie.ui.main.MainViewModelFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class MainModule(
    private val activity: FragmentActivity
) {

    @Singleton
    @Provides
    fun provideMainViewModel(
        factory: MainViewModelFactory
    ) : MainViewModel {
        return ViewModelProviders.of(activity, factory).get(MainViewModel::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides fun provideGitHubService(retrofit: Retrofit) : GitHubClient.GitHubService {
        return retrofit.create(GitHubClient.GitHubService::class.java)
    }
}