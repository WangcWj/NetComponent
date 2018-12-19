package cn.wang.network.builder.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.Map;

import cn.wang.network.builder.bean.SongBean;
import cn.wenet.networkcomponent.control.NetControl;
import cn.wenet.networkcomponent.exception.NetException;
import cn.wenet.networkcomponent.request.NetObjectCallBack;
import cn.wenet.networkcomponent.request.NetRequest;
import cn.wang.network.R;
import cn.wang.network.builder.api.ApiSong;
import cn.wang.network.builder.api.BaseAPI;
import io.reactivex.Observable;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment {

    public static FirstFragment newInstance() {
        Bundle args = new Bundle();
        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void pageLoadDataOnce() {
        NetControl.request(this)
                .baseUrl(BaseAPI.BASE_SINGING_URL)
                .addParams("name", "忆江南")
                .executeForObject(new NetObjectCallBack<SongBean>() {
                    @Override
                    public Observable<SongBean> getMethod(NetRequest request, Map<String, Object> params) {
                        return request.getApiService(ApiSong.class).getPoetry(params);
                    }

                    @Override
                    public void onSuccess(SongBean o) {
                       Log.e("WANG","FirstFragment.onSuccess."+o.toString() );
                    }

                    @Override
                    public void onError(NetException e) {

                    }
                });
    }

    @Override
    protected void initListener() {

    }
}
