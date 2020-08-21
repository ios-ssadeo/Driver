package com.ssadeo.ui.bottomsheetdialog.rating;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {
    void onSuccess(Rating rating);
    void onError(Throwable e);
}
