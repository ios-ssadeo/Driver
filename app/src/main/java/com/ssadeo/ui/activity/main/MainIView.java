package com.ssadeo.ui.activity.main;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.OTPResponse;
import com.ssadeo.data.network.model.SettingsResponse;
import com.ssadeo.data.network.model.TripResponse;
import com.ssadeo.data.network.model.User;

public interface MainIView extends MvpView {
    void onSuccess(User user);
    void onSuccessLogout(Object object);
    void onSuccess(TripResponse tripResponse);
    void onSuccessProviderAvailable(Object object);
    void onSuccessFCM(Object object);
    void onSuccessLocationUpdate(TripResponse tripResponse);

    void onSuccessServerLocationUpdate(Object object);
    void onSuccessInstant(OTPResponse object);

    void onSuccessInstantNow(Object object);
    void onSuccess(SettingsResponse response);

}
