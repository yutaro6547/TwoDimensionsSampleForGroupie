package com.example.zukkey.twodimentionssampleforgroupie.di.module

import com.example.zukkey.twodimentionssampleforgroupie.api.GitHubClient
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ClientModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides fun provideGitHubService(retrofit: Retrofit) : GitHubClient.GitHubService {
        return retrofit.create(GitHubClient.GitHubService::class.java)
    }
}