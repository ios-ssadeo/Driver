package com.ssadeo.ui.activity.regsiter;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.MyOTP;
import com.ssadeo.data.network.model.SettingsResponse;
import com.ssadeo.data.network.model.User;

public interface RegisterIView extends MvpView {
    void onSuccess(User user);

    void onSuccess(MyOTP otp);

    void onError(Throwable e);

    void onSuccess(SettingsResponse response);
}
