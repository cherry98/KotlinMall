package com.kotlin.user.service

import rx.Observable

interface IUserService {
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean>
}