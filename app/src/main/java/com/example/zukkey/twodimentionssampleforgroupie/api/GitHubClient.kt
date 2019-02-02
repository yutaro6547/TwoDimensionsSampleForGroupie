package com.example.zukkey.twodimentionssampleforgroupie.api

import io.reactivex.Observable
import retrofit2.http.GET
import javax.inject.Inject

class GitHubClient @Inject constructor(
    private val service: GitHubService
) {

    fun getTargetUser(): Observable<List<GitHubUser>> {
        return service.getUsers()
    }

    interface GitHubService {
        @GET("users")
        fun getUsers(): Observable<List<GitHubUser>>
    }
}