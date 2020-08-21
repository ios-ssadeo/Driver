package com.ssadeo.ui.fragment.upcoming;


import com.ssadeo.base.MvpPresenter;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {
    void getUpcoming();
}
