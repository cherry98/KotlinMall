package com.kotlin.base.dagger.component

import android.app.Activity
import android.content.Context
import androidx.lifecycle.Lifecycle
import com.kotlin.base.dagger.ActivityScope
import com.kotlin.base.dagger.module.ActivityModule
import com.kotlin.base.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun context(): Context
    fun activity(): Activity
}