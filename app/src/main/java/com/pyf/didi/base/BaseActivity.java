package com.pyf.didi.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author 裴云飞
 * @date 2018/6/26
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置竖屏锁定
        setContentView(setLayoutId());
        initView();
        initData();
        initEvent();
    }

    protected abstract int setLayoutId();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initEvent();
}
