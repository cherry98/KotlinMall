package com.kotlin.user.ui.view

import com.kotlin.base.presenter.view.IBaseView

interface IRegisterView : IBaseView {
    fun onRegisterResult(result: Boolean)
}