package com.example.zukkey.twodimentionssampleforgroupie

import android.arch.lifecycle.AndroidViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    application: MainApp
): AndroidViewModel(application) {

    override fun onCleared() {
        super.onCleared()
    }
}