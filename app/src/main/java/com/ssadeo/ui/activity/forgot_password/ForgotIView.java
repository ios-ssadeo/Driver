package com.ssadeo.ui.activity.forgot_password;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {
    void onSuccess(ForgotResponse forgotResponse);
    void onError(Throwable e);
}
