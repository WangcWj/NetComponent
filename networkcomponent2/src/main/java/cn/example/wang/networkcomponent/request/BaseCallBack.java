package cn.example.wang.networkcomponent.request;

import cn.example.wang.networkcomponent.exception.NetException;

/**
 * Created to :
 *
 * @author WANG
 * @date 2018/12/18
 */

public interface BaseCallBack<T> {

    void onSuccess(T t);

    void onError(NetException e);
}
