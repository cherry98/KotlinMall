package com.kotlin.base.data.protocol

//out T或T的子类
class BaseResponse<out T>(val status: Int, val message: String, val data: T)