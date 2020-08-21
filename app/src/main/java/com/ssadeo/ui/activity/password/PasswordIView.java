package com.ssadeo.ui.activity.password;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.User;

public interface PasswordIView extends MvpView {
    void onSuccess(User object);

    void onError(Throwable e);
}
