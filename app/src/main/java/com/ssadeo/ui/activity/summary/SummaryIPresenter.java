package com.ssadeo.ui.activity.summary;


import com.ssadeo.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {
    void getSummary();
}
