package com.example.zukkey.twodimentionssampleforgroupie.api

import retrofit2.Call
import retrofit2.http.GET
import javax.inject.Inject

class GitHubClient @Inject constructor(
    private val service: GitHubService
) {

    fun getTargetUser(): Call<List<GitHubUser>> {
        return service.getUsers()
    }

    interface GitHubService {
        @GET("users")
        fun getUsers(): Call<List<GitHubUser>>
    }
}