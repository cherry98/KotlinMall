package com.kotlin.user.dagger.component

import com.kotlin.user.dagger.module.UserModule
import com.kotlin.user.ui.activity.RegisterActivity
import dagger.Component

@Component(modules = [UserModule::class])
interface UserComponent {
    fun inject(activity: RegisterActivity)
}