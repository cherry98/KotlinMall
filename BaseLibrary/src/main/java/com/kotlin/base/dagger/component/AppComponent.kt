package com.kotlin.base.dagger.component

import android.content.Context
import com.kotlin.base.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun context(): Context
}