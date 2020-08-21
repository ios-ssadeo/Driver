package com.ssadeo.ui.activity.help;


import com.ssadeo.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {
    void getHelp();
}
