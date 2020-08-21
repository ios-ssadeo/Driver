package com.ssadeo.ui.fragment.offline;

import com.ssadeo.base.MvpView;

public interface OfflineIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
