package com.yap.yappk.onboarding

import android.os.Bundle
import androidx.activity.viewModels
import com.yap.core.base.BaseActivity
import com.yap.core.extensions.toast
import com.yap.yappk.BR
import com.yap.yappk.R
import com.yap.yappk.databinding.YapPkActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class YapPkMainActivity : BaseActivity<YapPkActivityMainBinding, IMain.State, IMain.ViewModel>(),
    IMain.View {
    override fun getLayoutId(): Int = R.layout.yap_pk_activity_main
    override fun getBindingVariable(): Int = BR.viewModel
    override val viewModel: IMain.ViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toast("asdasdasd")
    }
}