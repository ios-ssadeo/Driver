package com.ssadeo.ui.activity.document;

import com.ssadeo.base.MvpPresenter;

import java.util.List;

import okhttp3.MultipartBody;

public interface DocumentIPresenter<V extends DocumentIView> extends MvpPresenter<V> {
    void documents();
    void documents(List<MultipartBody.Part> documents);
}
