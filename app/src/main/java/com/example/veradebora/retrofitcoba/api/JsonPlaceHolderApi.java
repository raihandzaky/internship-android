package com.example.veradebora.retrofitcoba.api;

import com.example.veradebora.retrofitcoba.response.ApiResponse.BillingHistoryResponse;
import com.example.veradebora.retrofitcoba.response.ApiResponse.LoginResponse;
import com.example.veradebora.retrofitcoba.response.ApiResponse.TopUpRequest;
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserSaldo;
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserVmList;
import com.example.veradebora.retrofitcoba.response.ApiResponse.VoucherResponse;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Vera Debora on 7/5/2018.
 */

public interface JsonPlaceHolderApi {

    //login EndPoint
    @FormUrlEncoded
    @POST("apiUser/loginAdmin")
    Observable<LoginResponse> LoginRequest(@Field("email") String email,
                                           @Field("password") String password);

    //RequestTopUp EndPoint
    @FormUrlEncoded
    @POST("apiBilling/topUp")
    Observable<TopUpRequest> TOP_UP_REQUEST_OBSERVABLE (@Field("amount") int amount,
                                                        @Field("id_user") int id_user,
                                                        @Field("name_bank_account") String name_bank_account,
                                                        @Field("email") String email,
                                                        @Field("name") String name,
                                                        @Field("no_rekening") int no_rekening);

    //VoucherTopUp EndPoint
    @FormUrlEncoded
    @POST("apiVoucher/useVoucher")
    Observable<VoucherResponse> VOUCHER_RESPONSE_OBSERVABLE (@Field("code") String code,
                                                             @Field("id_user") int id_user);

    //GetUserSaldo EndPoint
    @GET("apiUsersSaldo/usersSaldo")
    Observable<UserSaldo> USER_SALDO_OBSERVABLE (@Query("id_user") String Id);

    //GetUserVM EndPoint
    @GET("apiUserManageVm/vm")
    Observable<UserVmList> USER_VM_LIST (@Query("id_user") String Id);


    //Billing Histroy EndPoint
    @GET("apiTransaction/transaction")
    Observable<BillingHistoryResponse> BILLING_HISTORY_RESPONSE_OBSERVABLE (@Query("id_user") String Id);


}
