package com.sunflower.mvp.mvp.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.sunflower.mvp.mvp.R;

import java.util.Random;

/**
 * Author   ： cxw
 * Date     ： 2018/10/29 17:05
 * Explain  :  请在此输入文件说明
 */
public class LoginActivity extends Activity implements ILoginView, View.OnClickListener {

    private Button btnLogin;
    private ProgressBar pbLoading;

    private ILoginPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        pbLoading = findViewById(R.id.pb);

        btnLogin.setOnClickListener(this);
        pbLoading.setVisibility(View.GONE);
        mPresenter = new LoginPresenter(this);

        initData();
    }

    private void initData() {
        Params
    }

    @Override
    public void showProgress(boolean flag) {
        if (flag) {
            pbLoading.setVisibility(View.VISIBLE);
            btnLogin.setText("正在登录...");
        }else{
            pbLoading.setVisibility(View.GONE);
        }
    }

    @Override
    public void showLoginView() {
        pbLoading.setVisibility(View.GONE);
        btnLogin.setText("登录成功");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                mPresenter.loginToServer("", "");
                break;
        }
    }
}
