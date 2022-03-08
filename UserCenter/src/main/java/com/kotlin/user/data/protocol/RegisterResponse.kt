package com.kotlin.user.data.protocol

data class RegisterResponse(val mobile: String, val pwd: String, val verifyCode: String)