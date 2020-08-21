package com.ssadeo.ui.activity.sociallogin;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.Token;

public interface SocialLoginIView extends MvpView {
    void onSuccess(Token token);

    void onError(Throwable e);
}
