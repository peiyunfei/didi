package com.pyf.didi.activity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;

import com.pyf.didi.R;
import com.pyf.didi.base.BaseActivity;

/**
 * @author 裴云飞
 * @date 2018/6/26
 */
public class SplashActivity extends BaseActivity {

    private ImageView mIvLogo;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        mIvLogo = findViewById(R.id.iv_logo);
    }

    @Override
    protected void initData() {
        Drawable drawable = mIvLogo.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }

    @Override
    protected void initEvent() {

    }
}
