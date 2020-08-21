package com.ssadeo.ui.fragment.past;


import com.ssadeo.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {
    void getHistory();
}
