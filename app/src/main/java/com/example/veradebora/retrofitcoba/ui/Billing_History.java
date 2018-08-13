package com.example.veradebora.retrofitcoba.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.veradebora.retrofitcoba.Adapter.BillingHistoryAdapter;
import com.example.veradebora.retrofitcoba.Object.BillHistoObject;
import com.example.veradebora.retrofitcoba.R;
import com.example.veradebora.retrofitcoba.api.JsonPlaceHolderApi;
import com.example.veradebora.retrofitcoba.api.UtilsApi;
import com.example.veradebora.retrofitcoba.response.ApiResponse.BillingHistoryResponse;

import java.util.ArrayList;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class Billing_History extends AppCompatActivity {

    private JsonPlaceHolderApi api;
    Context mContext;
    public String UserId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_history);

        ListView listView = (ListView) findViewById(R.id.listviewHistory);
        mContext = this;
        api = UtilsApi.getAPIService();
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
        UserId = sharedPreferences.getString("User_id", "");

        api.BILLING_HISTORY_RESPONSE_OBSERVABLE(UserId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<BillingHistoryResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(BillingHistoryResponse billingHistoryResponse) {

                        ArrayList<BillHistoObject> billHistoObjects = new ArrayList<>();

                        for (int i = 0; i < billingHistoryResponse.getTrans_data().size(); i++){

                            BillHistoObject data = new BillHistoObject(
                                    billingHistoryResponse.getTrans_data().get(i).getHostname(),
                                    billingHistoryResponse.getTrans_data().get(i).getStatus(),
                                    billingHistoryResponse.getTrans_data().get(i).getPrice(),
                                    billingHistoryResponse.getTrans_data().get(i).getId_flavor(),
                                    billingHistoryResponse.getTrans_data().get(i).getAmount());
                            billHistoObjects.add(data);

                        }

                        LayoutInflater layoutInflater = getLayoutInflater();
                        ViewGroup header = (ViewGroup)layoutInflater.inflate(R.layout.history_header,listView,false);
                        listView.addHeaderView(header);

                        BillingHistoryAdapter adapter = new BillingHistoryAdapter(mContext,R.layout.history_row, billHistoObjects);
                        listView.setAdapter(adapter);


                    }
                });

    }
}
