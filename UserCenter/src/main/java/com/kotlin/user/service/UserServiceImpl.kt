package com.kotlin.user.service

import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.repository.RegisterRepository
import rx.Observable
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : IUserService {
    //需要在此处调接口 repo层访问数据接口逻辑
    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {
        val registerRepository = RegisterRepository()
        return registerRepository.register(mobile, pwd, verifyCode)
            .flatMap { t ->
                if (t.status != 0) {
                    Observable.error(BaseException(t.status, t.message))
                } else {
                    Observable.just(true)
                }
            }

    }
}