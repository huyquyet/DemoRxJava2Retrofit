package com.demo.retrofitrxjava.network;

import com.demo.retrofitrxjava.model.Android;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by nguyenhuyquyet on 7/27/17.
 */

public interface RequestInterface {
    @GET("android/jsonarray/")
    Observable<List<Android>> register();
}
