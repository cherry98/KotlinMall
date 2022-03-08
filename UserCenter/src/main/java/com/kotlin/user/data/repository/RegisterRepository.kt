package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResponse
import com.kotlin.user.data.api.IUserApi
import com.kotlin.user.data.protocol.RegisterResponse
import rx.Observable

class RegisterRepository {
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResponse<String>> {
        return RetrofitFactory.instance.create(IUserApi::class.java)
            .register(RegisterResponse(mobile, pwd, verifyCode))
    }
}