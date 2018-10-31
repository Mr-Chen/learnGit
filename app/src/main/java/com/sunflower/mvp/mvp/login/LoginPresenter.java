package com.sunflower.mvp.mvp.login;

/**
 * Author   ： cxw
 * Date     ： 2018/10/29 16:05
 * Explain  :  请在此输入文件说明
 */
public class LoginPresenter implements ILoginPresenter {

    private ILoginModel loginModel;
    private ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModel(this);

    }

    @Override
    public void loginToServer(String name, String password) {
        loginView.showProgress(true);
        loginModel.login(name,password);
    }

    @Override
    public void loginSucceed() {
        loginView.showProgress(false);
        loginView.showLoginView();
    }
}
