package com.ssadeo.ui.activity.otp;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.MyOTP;

public interface OTPIView extends MvpView {
    void onSuccess(MyOTP otp);

    void onError(Throwable e);
}
