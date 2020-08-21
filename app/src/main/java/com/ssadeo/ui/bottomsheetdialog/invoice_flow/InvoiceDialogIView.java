package com.ssadeo.ui.bottomsheetdialog.invoice_flow;

import com.ssadeo.base.MvpView;

public interface InvoiceDialogIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
