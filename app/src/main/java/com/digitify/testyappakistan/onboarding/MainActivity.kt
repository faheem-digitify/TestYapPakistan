package com.digitify.testyappakistan.onboarding

import android.os.Bundle
import androidx.activity.viewModels
import com.digitify.testyappakistan.BR
import com.digitify.testyappakistan.R
import com.digitify.testyappakistan.databinding.ActivityMainBinding
import com.yap.core.base.BaseActivity
import com.yap.core.extensions.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, IMain.State, IMain.ViewModel>(), IMain.View {
    override fun getLayoutId(): Int = R.layout.activity_main
    override fun getBindingVariable(): Int = BR.viewModel
    override val viewModel: IMain.ViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("asdasdasd")
    }
}