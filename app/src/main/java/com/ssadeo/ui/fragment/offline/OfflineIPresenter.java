package com.ssadeo.ui.fragment.offline;

import com.ssadeo.base.MvpPresenter;

import java.util.HashMap;

public interface OfflineIPresenter<V extends OfflineIView> extends MvpPresenter<V> {
    void providerAvailable(HashMap<String, Object> obj);
}
