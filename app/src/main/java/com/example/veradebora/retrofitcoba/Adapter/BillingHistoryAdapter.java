package com.example.veradebora.retrofitcoba.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.veradebora.retrofitcoba.Object.BillHistoObject;
import com.example.veradebora.retrofitcoba.R;

import java.util.List;

/**
 * Created by Vera Debora on 8/8/2018.
 */

public class BillingHistoryAdapter extends ArrayAdapter<BillHistoObject> {

  private Context mContext;
  public  int mResoucre;
  List<BillHistoObject> ArrayList;

  public BillingHistoryAdapter(@NonNull Context context, int resource, @NonNull List<BillHistoObject> objects) {
    super(context, resource, objects);
    mContext = context;
    mResoucre= resource;
    ArrayList= objects;
  }

  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    String Hostname = ArrayList.get(position).getHostname();
    String Status = ArrayList.get(position).getStatus();
    String Flavor = ArrayList.get(position).getFlavor();
    String Price = ArrayList.get(position).getPricePerHour();
    String Total = ArrayList.get(position).getTotal();

    LayoutInflater layoutInflater = LayoutInflater.from(mContext);
    convertView = layoutInflater.inflate(mResoucre,parent,false);

    TextView hostname = (TextView)convertView.findViewById(R.id.HostName);
    TextView status = (TextView)convertView.findViewById(R.id.Status);
    TextView flavor = (TextView)convertView.findViewById(R.id.Size);
    TextView price = (TextView)convertView.findViewById(R.id.Price);
    TextView total = (TextView)convertView.findViewById(R.id.Total);

    hostname.setText(Hostname);
    status.setText(Status);
    flavor.setText(Flavor);
    price.setText("Rp. " + Price);
    total.setText(Total);

    return convertView;

  }
}
