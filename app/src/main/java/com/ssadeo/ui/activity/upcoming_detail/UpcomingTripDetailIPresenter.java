package com.ssadeo.ui.activity.upcoming_detail;


import com.ssadeo.base.MvpPresenter;

public interface UpcomingTripDetailIPresenter<V extends UpcomingTripDetailIView> extends MvpPresenter<V> {
    void getUpcomingDetail(Object request_id);
}
