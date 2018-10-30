package com.sunflower.mvp.mvp.login;

/**
 * Author   ： cxw
 * Date     ： 2018/10/29 15:29
 * Explain  :  请在此输入文件说明
 */
public interface ILoginPresenter {

    void loginToServer(String name, String password);

    void loginSucceed();
}
