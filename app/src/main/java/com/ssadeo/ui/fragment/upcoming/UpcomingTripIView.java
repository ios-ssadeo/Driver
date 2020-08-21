package com.ssadeo.ui.fragment.upcoming;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {
    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
