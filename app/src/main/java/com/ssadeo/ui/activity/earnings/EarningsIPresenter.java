package com.ssadeo.ui.activity.earnings;


import com.ssadeo.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {
    void getEarnings();
}
