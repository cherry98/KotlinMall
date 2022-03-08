package com.kotlin.base.common

import android.app.Application
import com.kotlin.base.dagger.component.DaggerActivityComponent
import com.kotlin.base.dagger.component.DaggerAppComponent
import com.kotlin.base.dagger.module.AppModule

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        injection()
    }

    private fun injection() {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}