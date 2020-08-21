package com.ssadeo.ui.bottomsheetdialog.cancel;

import com.ssadeo.base.MvpView;

public interface CancelDialogIView extends MvpView {

    void onSuccessCancel(Object object);
    void onError(Throwable e);
}
