package com.ssadeo.ui.activity.reset_password;

import com.ssadeo.base.MvpView;

public interface ResetIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
