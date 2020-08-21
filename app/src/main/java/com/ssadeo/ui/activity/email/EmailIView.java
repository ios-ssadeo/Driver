package com.ssadeo.ui.activity.email;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.User;

public interface EmailIView extends MvpView {
    void onSuccess(User token);

    void onError(Throwable e);
}
