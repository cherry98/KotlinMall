package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.service.UserServiceImpl
import com.kotlin.user.ui.view.IRegisterView
import javax.inject.Inject

class RegisterPresenter @Inject constructor() : BasePresenter<IRegisterView>() {
    @Inject
    lateinit var userServiceImpl: UserServiceImpl
    fun register(mobile: String, pwd: String, verifyCode: String) {
        userServiceImpl.register(mobile, pwd, verifyCode)
            .execute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    baseView.onRegisterResult(t);
                }

                override fun onError(e: Throwable) {
                    baseView.onRegisterResult(false)
                }
            })
    }
}