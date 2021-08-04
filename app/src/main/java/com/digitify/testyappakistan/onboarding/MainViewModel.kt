package com.digitify.testyappakistan.onboarding

import com.yap.core.base.BaseViewModel

class MainViewModel : BaseViewModel<IMain.State>(), IMain.ViewModel {
    override val state: IMain.State = MainState()

}