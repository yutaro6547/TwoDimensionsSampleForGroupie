package com.example.zukkey.twodimentionssampleforgroupie.ui.main

import android.arch.lifecycle.AndroidViewModel
import com.example.zukkey.twodimentionssampleforgroupie.MainApp
import com.example.zukkey.twodimentionssampleforgroupie.api.GitHubClient
import com.example.zukkey.twodimentionssampleforgroupie.api.GitHubUser
import io.reactivex.Observable
import javax.inject.Inject

class MainViewModel @Inject constructor(
    application: MainApp,
    private val gitHubClient: GitHubClient
) : AndroidViewModel(application) {

  override fun onCleared() {
    super.onCleared()
  }

  fun getGitHubUser(): Observable<List<GitHubUser>> {
    return gitHubClient.getTargetUser()
  }
}
