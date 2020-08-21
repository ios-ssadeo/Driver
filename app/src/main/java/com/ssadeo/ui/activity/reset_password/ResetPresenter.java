package com.ssadeo.ui.activity.reset_password;

import com.ssadeo.base.BasePresenter;
import com.ssadeo.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ResetPresenter<V extends ResetIView> extends BasePresenter<V> implements ResetIPresenter<V> {
    @Override
    public void reset(HashMap<String, Object> obj) {
        Observable modelObservable = APIClient.getAPIClient().resetPassword(obj);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess(trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
