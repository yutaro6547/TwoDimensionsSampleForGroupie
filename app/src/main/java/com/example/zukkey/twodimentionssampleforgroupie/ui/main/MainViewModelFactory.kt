package com.example.zukkey.twodimentionssampleforgroupie.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.zukkey.twodimentionssampleforgroupie.MainApp
import com.example.zukkey.twodimentionssampleforgroupie.api.GitHubClient
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(
    private val application: MainApp,
    private val gitHubClient: GitHubClient
) : ViewModelProvider.Factory {
  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    return MainViewModel(
        application = application,
        gitHubClient = gitHubClient
    ) as T
  }
}
