package com.ssadeo.ui.fragment.past;


import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.HistoryList;

import java.util.List;

public interface PastTripIView extends MvpView {
    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
