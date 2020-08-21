package com.ssadeo.ui.fragment.incoming_request;

import com.ssadeo.base.MvpView;

public interface IncomingRequestIView extends MvpView {
    void onSuccessAccept(Object responseBody);
    void onSuccessCancel(Object object);
    void onError(Throwable e);
}
