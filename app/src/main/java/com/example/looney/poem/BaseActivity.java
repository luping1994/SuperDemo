package com.example.looney.poem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.looney.poem.utils.StatusBarCompat;

/**
 * Created by Looney on 2016/8/9.
 */
public abstract  class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        //设置布局内容
        setContentView(getLayoutId());
        //初始化黄油刀控件绑定框架
//        ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
        //初始化ToolBar
        initToolBar();
        //适配4.4系统的StatusBar
        StatusBarCompat.compat(this);
    }

    @Override
    protected void onDestroy()
    {

        super.onDestroy();
//        ButterKnife.unbind(this);
    }

    public abstract int getLayoutId();

    public abstract void initViews(Bundle savedInstanceState);

    public abstract void initToolBar();
}
