package com.ssadeo.ui.fragment.status_flow;

import com.ssadeo.base.MvpView;

public interface StatusFlowIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
