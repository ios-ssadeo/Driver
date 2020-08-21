package com.ssadeo.ui.activity.password;

import com.ssadeo.base.MvpPresenter;

import java.util.HashMap;

public interface PasswordIPresenter<V extends PasswordIView> extends MvpPresenter<V> {
    void login(HashMap<String, Object> obj);
}
