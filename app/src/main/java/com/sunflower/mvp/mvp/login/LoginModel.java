package com.sunflower.mvp.mvp.login;


import android.os.Handler;

/**
 * Author   ： cxw
 * Date     ： 2018/10/29 16:00
 * Explain  :  请在此输入文件说明
 */
public class LoginModel implements ILoginModel {

    private ILoginPresenter mPresenter;
    private Handler mHandler = new Handler();

    public LoginModel(ILoginPresenter mPresenter) {
        this.mPresenter = mPresenter;
    }


    @Override
    public void login(String name, String password) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
              mPresenter.loginSucceed();
            }
        },2000);
    }
}
