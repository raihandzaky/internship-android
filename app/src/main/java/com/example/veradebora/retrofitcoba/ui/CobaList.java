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
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserVmList;

import java.util.ArrayList;
import java.util.HashMap;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CobaList extends AppCompatActivity {

    private ArrayList<HashMap> list;
    public JsonPlaceHolderApi api;
    Context mContext;
    public String UserId;
    public int IdUser;
    public TextView tvwey;
    private boolean sudahWoi = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_list);

        api = UtilsApi.getAPIService();

        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
        UserId = sharedPreferences.getString("User_id", "");
        IdUser = Integer.parseInt(UserId);

        tvwey = (TextView) findViewById(R.id.listlah);

        api.USER_VM_LIST(UserId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<UserVmList>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(mContext, "Something Went Wrong!", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(UserVmList userVmLists) {
                        StringBuilder temp = new StringBuilder();

                        for (int i = 0; i < userVmLists.getVm_data().size(); i++) {
                            temp.append(userVmLists.getVm_data().get(i).toString()
                                    .replace("75a86ebb-ed04-4f13-a9d5-daa5cd8acec2","Debian 8 x64")
                                    .replace("665ee283-f781-4f39-b145-ceae23bcf8b1","CentOS 7 x64")
                                    .replace("eef9d93d-c05c-45de-85c4-05561d9b959b","Ubuntu 16.04.2 x64")
                                    .replace("Status = 1", "Status = Waiting For Approval")
                                    .replace("Status = 2","Status = Running")
                                    .replace("Status = 4", "Status = Deleted"));
//                            .replace("1","Waiting for approval")
//                            .replace("2","Running")
//                            .replace("5","Stopped"));

                        }

                        tvwey.append(temp.toString());
                    }
                });

    }

    public void COBALISTVIEW(View view) {
        Intent intent = new Intent(this,CobaListView.class);
        startActivity(intent);
    }

    public void ASELOLE(View view) {
        Intent intent = new Intent(this,Expandable.class);
        startActivity(intent);
    }

//    private void populateList() {
//
//    }
}
