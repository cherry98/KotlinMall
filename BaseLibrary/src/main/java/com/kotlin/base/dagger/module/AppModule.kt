package com.kotlin.base.dagger.module

import android.content.Context
import com.kotlin.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: BaseApplication) {

    @Singleton //单例 全局的context
    @Provides
    fun providesContext(): Context {
        return this.context
    }
}