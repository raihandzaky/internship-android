package com.example.veradebora.retrofitcoba.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.example.veradebora.retrofitcoba.Adapter.ExpandableListAdapter;
import com.example.veradebora.retrofitcoba.Object.DetailsOfVmObject;
import com.example.veradebora.retrofitcoba.Object.VmObject;
import com.example.veradebora.retrofitcoba.R;
import com.example.veradebora.retrofitcoba.api.JsonPlaceHolderApi;
import com.example.veradebora.retrofitcoba.api.UtilsApi;
import com.example.veradebora.retrofitcoba.response.ApiResponse.UserVmList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Expandable extends AppCompatActivity {

    private JsonPlaceHolderApi api;
    public Context mContext;
    public String UserId;
    private ExpandableListView expandableListView;
    private List<VmObject> listVmTitle;
    private HashMap<VmObject, List<DetailsOfVmObject>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable);

        mContext = this;
        expandableListView = (ExpandableListView) findViewById(R.id.expandable);
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



                    listVmTitle = new ArrayList<>();
                    listHashMap = new HashMap<>();
                    List<DetailsOfVmObject> detailsOfVmObjects = new ArrayList<>();

                    for (int i = 0; i < userVmList.getVm_data().size(); i++) {


                        //loop Listview RowTitle
                            VmObject vmObject = new VmObject(userVmList.getVm_data().get(i).getHostname(),
                                    userVmList.getVm_data().get(i).getStatus(), userVmList.getVm_data().get(i).getImage());
                        listVmTitle.add(vmObject);

                        //Loop Listview RowChildren
                        DetailsOfVmObject details = new DetailsOfVmObject(userVmList.getVm_data().get(i).getFlavor(),
                                userVmList.getVm_data().get(i).getIp_vm());
                        detailsOfVmObjects.add(details);

                        //loop hashmap
                        listHashMap.put(listVmTitle.get(i),detailsOfVmObjects);
                    }



                        LayoutInflater layoutInflater = getLayoutInflater();
                        ViewGroup header = (ViewGroup)layoutInflater.inflate(R.layout.listview_header,expandableListView,false);
                        expandableListView.addHeaderView(header);


                    ExpandableListAdapter adapter = new ExpandableListAdapter(mContext, listVmTitle,listHashMap,detailsOfVmObjects);
                    expandableListView.setAdapter(adapter);

                    expandableListView.setOnGroupClickListener((parent, v, groupPosition, id) -> false);

                        }
                });

    }
}
