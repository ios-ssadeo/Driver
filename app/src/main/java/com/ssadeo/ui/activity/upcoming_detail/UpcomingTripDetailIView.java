package com.ssadeo.ui.activity.upcoming_detail;


import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.HistoryDetail;

public interface UpcomingTripDetailIView extends MvpView {
    void onSuccess(HistoryDetail historyDetail);

    void onError(Throwable e);
}
