package com.ssadeo.ui.activity.past_detail;


import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {
    void onSuccess(HistoryDetail historyDetail);

    void onError(Throwable e);
}
