package com.yap.yappk.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.yap.core.base.BaseActivity
import com.yap.core.extensions.toast
import com.yap.yappk.BR
import com.yap.yappk.R
import com.yap.yappk.databinding.YapPkActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
//class YapPkMainActivity : BaseActivity<YapPkActivityMainBinding, IMain.State, IMain.ViewModel>(),
//    IMain.View {
//    override fun getLayoutId(): Int = R.layout.yap_pk_activity_main
//    override fun getBindingVariable(): Int = BR.viewModel
//    override val viewModel: IMain.ViewModel by viewModels<MainViewModel>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        toast("asdasdasd")
//    }
//}

class YapPkMainActivity : AppCompatActivity() {
    private lateinit var binding: YapPkActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = YapPkActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}