package com.example.zukkey.twodimentionssampleforgroupie.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.zukkey.twodimentionssampleforgroupie.MainApp
import com.example.zukkey.twodimentionssampleforgroupie.R
import com.example.zukkey.twodimentionssampleforgroupie.databinding.ActivityMainBinding
import com.example.zukkey.twodimentionssampleforgroupie.di.module.MainModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModel: MainViewModel

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val component = (this.application as MainApp).component
        component.plus(MainModule(this)).inject(this)
        binding.vm = viewModel
    }
}
