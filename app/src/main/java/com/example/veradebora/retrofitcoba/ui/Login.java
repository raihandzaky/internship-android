package com.example.veradebora.retrofitcoba.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.veradebora.retrofitcoba.R;
import com.example.veradebora.retrofitcoba.api.JsonPlaceHolderApi;
import com.example.veradebora.retrofitcoba.api.UtilsApi;
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserSaldo;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Login extends AppCompatActivity {
    public JsonPlaceHolderApi api;
    public Button btnLogin;
    public EditText etEmail, etPasswrod;
    public Context mContext;
    public String IdUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        api = UtilsApi.getAPIService();
        etEmail = (EditText) findViewById(R.id.editText);
        etPasswrod = (EditText) findViewById(R.id.editText2);
        btnLogin = (Button) findViewById(R.id.button);

    }

    public void login(View view) {
        requestLogin();
    }

    public void requestLogin() {
        api.LoginRequest(etEmail.getText().toString(), etPasswrod.getText().toString())
                .flatMap(loginResponse -> {
                    if(loginResponse.isResult()){
                        String UserName = loginResponse.getUser_data().getName().toString();
                        String Userid = loginResponse.getUser_data().getUser_id().toString();
                        String Uemail = loginResponse.getUser_data().getEmail().toString();
                        IdUser = Userid;
                        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("User_Name",UserName);
                        editor.putString("User_Email", Uemail);
                        editor.putString("User_id",Userid);
                        editor.apply();
                    }


                    return api.USER_SALDO_OBSERVABLE(IdUser);
            })
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
                            String  ubalance = userSaldo.getBil_data().getSaldo().toString();
                            Intent intent = new Intent(Login.this,AfterLogin.class);
                            Toast.makeText(mContext,"Login Success",Toast.LENGTH_SHORT).show();
                            intent.putExtra("ubalance", ubalance);
                            startActivity(intent);
                    }
                }
            });
    }
}