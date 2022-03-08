package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.IBaseView

open class BasePresenter<T : IBaseView> {
    lateinit var baseView: T
}