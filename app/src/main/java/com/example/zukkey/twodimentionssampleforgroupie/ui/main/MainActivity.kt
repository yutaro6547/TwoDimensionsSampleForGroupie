package com.example.zukkey.twodimentionssampleforgroupie.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zukkey.twodimentionssampleforgroupie.MainApp
import com.example.zukkey.twodimentionssampleforgroupie.R
import com.example.zukkey.twodimentionssampleforgroupie.databinding.ActivityMainBinding
import com.example.zukkey.twodimentionssampleforgroupie.di.module.MainModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var viewModel: MainViewModel

  private val binding by lazy {
    ActivityMainBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)
    val component = (application as MainApp).component
    component.plus(MainModule(this)).inject(this)
    binding.vm = viewModel
  }
}
