package com.example.veradebora.retrofitcoba.api;

/**
 * Created by Vera Debora on 7/6/2018.
 */

public class UtilsApi {
    public static final String BASE_URL_API = "https://ddscloud.id:8443/";

    // Mendeklarasikan Interface BaseApiService
    public static JsonPlaceHolderApi getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(JsonPlaceHolderApi.class);
    }
}
