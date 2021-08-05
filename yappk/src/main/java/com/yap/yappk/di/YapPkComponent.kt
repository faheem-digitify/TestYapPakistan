package com.yap.yappk.di

import android.content.Context
import com.yap.yappk.onboarding.YapPkMainActivity
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [PkModuleDependencies::class])
interface YapPkComponent {

  fun inject(activity: YapPkMainActivity)

  @Component.Builder
  interface Builder {
    fun context(@BindsInstance context: Context): Builder
    fun appDependencies(pkModuleDependencies: PkModuleDependencies): Builder
    fun build(): YapPkComponent
  }
}