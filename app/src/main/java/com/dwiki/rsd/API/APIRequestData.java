package com.dwiki.rsd.API;

import com.dwiki.rsd.Model.ModelResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("retrive.php")
    Call<ModelResponse> ardRetrive();
}
