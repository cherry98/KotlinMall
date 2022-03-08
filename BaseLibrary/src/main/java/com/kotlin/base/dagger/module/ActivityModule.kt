package com.kotlin.base.dagger.module

import android.app.Activity
import com.kotlin.base.dagger.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(private val activity: Activity) {
    @Provides
    @ActivityScope
    fun providesActivity(): Activity {
        return activity
    }
}