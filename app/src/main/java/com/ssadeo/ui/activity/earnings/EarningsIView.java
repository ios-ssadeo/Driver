package com.ssadeo.ui.activity.earnings;


import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {
    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
