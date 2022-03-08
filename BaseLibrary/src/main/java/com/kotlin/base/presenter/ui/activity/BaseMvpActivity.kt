package com.kotlin.base.presenter.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.IBaseView
import javax.inject.Inject

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), IBaseView {
    @Inject
    lateinit var mPresenter: T
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }
}