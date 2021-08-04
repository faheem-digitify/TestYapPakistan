package com.yap.yappk.onboarding

import com.yap.core.base.interfaces.IBase

interface IMain {
    interface View : IBase.View<ViewModel>
    interface ViewModel : IBase.ViewModel<State>
    interface State : IBase.State
}