package us.xingkong.starlive.base;

import rx.subscriptions.CompositeSubscription;

/**
 * Created by SeaLynn0 on 2018/3/26.
 */

public class BasePresenterImpl implements BasePresenter {
    protected CompositeSubscription mSubscriptions;

    @Override
    public void subscribe() {
        if (mSubscriptions == null) {
            mSubscriptions = new CompositeSubscription();
        }
    }

    @Override
    public void unsubscribe() {
        if (mSubscriptions != null && mSubscriptions.hasSubscriptions()) {
            mSubscriptions.unsubscribe();
            mSubscriptions.clear();
        }
    }

    public interface onFinishListener{
        void onFinish();
    }
}
