package com.ssadeo.ui.activity.change_password;

import com.ssadeo.base.MvpView;

public interface ChangePasswordIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
