package com.ssadeo.ui.activity.help;

import com.ssadeo.base.MvpView;
import com.ssadeo.data.network.model.Help;

public interface HelpIView extends MvpView {
    void onSuccess(Help object);

    void onError(Throwable e);
}
