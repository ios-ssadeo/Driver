package com.ssadeo.ui.activity.document;

import com.ssadeo.base.MvpView;
import com.ssadeo.ui.adapter.DocumentAdapter;

public interface DocumentIView extends MvpView {
    void onSuccess(DocumentAdapter adapter);
}
