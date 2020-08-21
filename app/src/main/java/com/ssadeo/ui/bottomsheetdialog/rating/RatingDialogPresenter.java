package com.ssadeo.ui.bottomsheetdialog.rating;

import com.ssadeo.base.BasePresenter;
import com.ssadeo.data.network.APIClient;
import com.ssadeo.data.network.model.Rating;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RatingDialogPresenter<V extends RatingDialogIView> extends BasePresenter<V> implements RatingDialogIPresenter<V> {

    @Override
    public void rate(HashMap<String, Object> obj, Integer id) {
        Observable modelObservable = APIClient.getAPIClient().ratingRequest(obj, id);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((Rating) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));

    }
}
