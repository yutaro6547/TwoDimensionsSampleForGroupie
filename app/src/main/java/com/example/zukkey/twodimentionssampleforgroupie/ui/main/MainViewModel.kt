package com.example.zukkey.twodimentionssampleforgroupie.ui.main

import androidx.lifecycle.AndroidViewModel
import com.example.zukkey.twodimentionssampleforgroupie.MainApp
import javax.inject.Inject

class MainViewModel @Inject constructor(
    application: MainApp
): AndroidViewModel(application) {

    override fun onCleared() {
        super.onCleared()
    }
}