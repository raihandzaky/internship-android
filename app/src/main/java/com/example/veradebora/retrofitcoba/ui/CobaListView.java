package com.example.veradebora.retrofitcoba.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.veradebora.retrofitcoba.Adapter.VmListAdapter;
import com.example.veradebora.retrofitcoba.Object.VmObject;
import com.example.veradebora.retrofitcoba.R;
import com.example.veradebora.retrofitcoba.api.JsonPlaceHolderApi;
import com.example.veradebora.retrofitcoba.api.UtilsApi;
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserVmList;

import java.util.ArrayList;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CobaListView extends AppCompatActivity {

    private JsonPlaceHolderApi api;
    Context mContext;
    public String UserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_list_view);

        mContext = this;

        ListView listView = (ListView) findViewById(R.id.listview);

        api = UtilsApi.getAPIService();

        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
        UserId = sharedPreferences.getString("User_id", "");

        api.USER_VM_LIST(UserId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<UserVmList>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(UserVmList userVmList) {

                        ArrayList<VmObject> listVm = new ArrayList<>();


//                        StringBuilder temp = new StringBuilder();
                        for (int i = 0; i < userVmList.getVm_data().size(); i++) {

                            VmObject vmObject = new VmObject(userVmList.getVm_data().get(i).getHostname(),
                                    userVmList.getVm_data().get(i).getStatus(), userVmList.getVm_data().get(i).getImage());
                            listVm.add(vmObject);

////                            temp.append(userVmList.getVm_data().get(i).getHostname());
//                            VmObject vmObject = new VmObject()
                        }
//                            VmListAdapter adapter = new VmListAdapter(mContext, R.layout.listview_row, listVm);
//                            listView.setAdapter(adapter);

                        LayoutInflater layoutInflater = getLayoutInflater();
                        ViewGroup header = (ViewGroup)layoutInflater.inflate(R.layout.listview_header,listView,false);
                        listView.addHeaderView(header);

                        VmListAdapter adapter = new VmListAdapter(mContext,R.layout.listview_row, listVm);
                        listView.setAdapter(adapter);


                    }
                });



    }
}
