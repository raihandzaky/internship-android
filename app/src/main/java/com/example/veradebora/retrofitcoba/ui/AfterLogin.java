package com.example.veradebora.retrofitcoba.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.veradebora.retrofitcoba.R;
import com.example.veradebora.retrofitcoba.api.JsonPlaceHolderApi;
import com.example.veradebora.retrofitcoba.api.UtilsApi;
import com.example.veradebora.retrofitcoba.response.ApiResponse.TopUpRequest;
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserSaldo;
import com.example.veradebora.retrofitcoba.response.ApiResponse.VoucherResponse;

import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class AfterLogin extends AppCompatActivity implements TopUpDialog.TopUpDialogListener , VoucherDialog.VoucherDialogListener{

    public TextView tv1,tv2,tv3;
    public JsonPlaceHolderApi api;
    public int norek;
    public int amount;
    Context mContext;
    public String username;
    public String Uemail;
    public String uBalance;
    public String bankname;
    public String UserId;
    public String KodeVoucher;
    public String uBalance2;
    public int IdUser;
    public boolean Voucher = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        api = UtilsApi.getAPIService();
        mContext = this;

//        GetVmListUser();

        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
        username = sharedPreferences.getString("User_Name", "");
        Uemail = sharedPreferences.getString("User_Email","");
        uBalance = getIntent().getExtras().getString("ubalance");
        UserId = sharedPreferences.getString("User_id", "");
        IdUser = Integer.parseInt(UserId);


        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);
        tv3 = (TextView) findViewById(R.id.textView5);

        tv1.setText(username);
        tv2.setText(uBalance);

    }

    @Override
    public void applyTexts(int Nominal, String NamaBank, int RekNum) {
        amount = Nominal;
        bankname = NamaBank;
        norek = RekNum;
        if (bankname != null){
            api.TOP_UP_REQUEST_OBSERVABLE(amount, IdUser, bankname, Uemail, username, norek)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe(new Observer<TopUpRequest>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Toast.makeText(mContext, "ERROR!", Toast.LENGTH_SHORT).show();
//                            amount = Integer.parseInt(null);
                            bankname = null;
//                            norek = Integer.parseInt(null);
                        }

                        @Override
                        public void onNext(TopUpRequest topUpRequest) {
                            if(topUpRequest.isResult()){
//                                amount = Integer.parseInt(null);
                                bankname = null;
//                                norek = Integer.parseInt(null);
                            }
                        }
                    });
        }
    }


    @Override
    public void inputText(String VoucherCode, boolean voucher) {
        KodeVoucher = VoucherCode;
        Voucher = voucher;
        if (Voucher == true){
            api.VOUCHER_RESPONSE_OBSERVABLE(KodeVoucher, IdUser)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe(new Observer<VoucherResponse>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Toast.makeText(mContext,"Wrong Voucher Code!", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onNext(VoucherResponse voucherResponse) {
                            if (voucherResponse.isResult()){
                                Toast.makeText(mContext,"Voucher Code Accepted!",Toast.LENGTH_SHORT).show();
                                Voucher = false;
                                saldo();
                            }
                        }
                    });
        }
    }



 public void saldo(){
     api.USER_SALDO_OBSERVABLE(UserId)
             .observeOn(AndroidSchedulers.mainThread())
             .subscribeOn(Schedulers.io())
             .subscribe(new Subscriber<UserSaldo>() {
                 @Override
                 public void onCompleted() {

                 }

                 @Override
                 public void onError(Throwable e) {
                     Toast.makeText(mContext,"Something went wrong man!",Toast.LENGTH_LONG).show();
                 }

                 @Override
                 public void onNext(UserSaldo userSaldo) {
                     if (userSaldo.isResult()) {
                        uBalance = userSaldo.getBil_data().getSaldo().toString();
                        tv2.setText(uBalance);

                     }
                 }
             });
 }




    public void topup(View view) {
        TopUpDialog();

    }

    public void TopUpDialog(){
        TopUpDialog topUpDialog = new TopUpDialog();
        topUpDialog.show(getSupportFragmentManager(),"TopUp Dialog");
    }





    public void Voucher(View view) {
      VoucherDialog();
    }

    public void VoucherDialog(){
        VoucherDialog voucherDialog = new VoucherDialog();
        voucherDialog.show(getSupportFragmentManager(),"Top Up Dialog");
    }

    public void VmCobaList(View view) {
        Intent intent = new Intent(this,CobaList.class);
        startActivity(intent);
    }


    public void History(View view) {
        Intent intent = new Intent(this,Billing_History.class);
        startActivity(intent);
    }

}
