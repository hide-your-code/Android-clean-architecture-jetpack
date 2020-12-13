package com.androidlifelang.corepresentation.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<ViewBinding : ViewDataBinding, ViewModel : BaseViewModel> : AppCompatActivity() {

    lateinit var binding: ViewBinding

    abstract val viewModel: ViewModel

    @get:LayoutRes
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Binding
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
    }
}