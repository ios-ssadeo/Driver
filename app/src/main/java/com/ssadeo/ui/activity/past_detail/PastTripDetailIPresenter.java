package com.ssadeo.ui.activity.past_detail;


import com.ssadeo.base.MvpPresenter;

public interface PastTripDetailIPresenter<V extends PastTripDetailIView> extends MvpPresenter<V> {
    void getPastTripDetail(Object request_id);
}
