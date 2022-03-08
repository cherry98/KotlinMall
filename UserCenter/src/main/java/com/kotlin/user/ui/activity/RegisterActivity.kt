package com.kotlin.user.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.dagger.component.DaggerUserComponent
import com.kotlin.user.presenter.RegisterPresenter
import com.kotlin.user.ui.view.IRegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), IRegisterView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        mPresenter = RegisterPresenter() //不需要实例化  因为RegisterPresenter使用inject标记使用注解
        DaggerUserComponent.builder().build().inject(this)
        mPresenter.baseView = this
        mButtonRegister.setOnClickListener {
            mPresenter.register(mMobileEdt.text.toString(), mPwdEdt.text.toString(), mVerifyCodeEdt.text.toString())
        }
    }

    override fun onRegisterResult(result: Boolean) {
        if (result) {
            toast("注册成功")
        } else {
            toast("注册失败")
        }
    }
}