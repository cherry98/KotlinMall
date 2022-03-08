package com.kotlin.user.data.api

import com.kotlin.base.data.protocol.BaseResponse
import com.kotlin.user.data.protocol.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

interface IUserApi {
    @POST("userCenter/register")
    fun register(@Body response: RegisterResponse): Observable<BaseResponse<String>>
}