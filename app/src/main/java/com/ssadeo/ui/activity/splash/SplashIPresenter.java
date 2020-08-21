package com.ssadeo.ui.activity.splash;

import com.ssadeo.base.MvpPresenter;

public interface SplashIPresenter<V extends SplashIView> extends MvpPresenter<V> {
    void handlerCall();
}
