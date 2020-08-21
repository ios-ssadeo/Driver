package com.ssadeo.ui.activity.otp;

import com.ssadeo.base.MvpPresenter;


public interface OTPIPresenter<V extends OTPIView> extends MvpPresenter<V> {
    void sendOTP(Object obj);
    void sendVoiceOTP(Object obj);
}
