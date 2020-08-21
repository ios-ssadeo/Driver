package com.ssadeo.ui.activity.summary;


import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.Summary;

public interface SummaryIView extends MvpView {
    void onSuccess(Summary object);

    void onError(Throwable e);
}
