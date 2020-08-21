package com.ssadeo.ui.activity.profile;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.User;

public interface ProfileIView extends MvpView {
    void onSuccess(User user);
    void onSuccessUser(User user);
    void onError(Throwable e);
}
