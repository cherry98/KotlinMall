package com.kotlin.user.dagger.module

import com.kotlin.user.service.IUserService
import com.kotlin.user.service.UserServiceImpl
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun provideUserService(userService: UserServiceImpl): IUserService {
        return userService
    }
}