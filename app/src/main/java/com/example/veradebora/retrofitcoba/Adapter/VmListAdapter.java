package com.example.veradebora.retrofitcoba.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.veradebora.retrofitcoba.Object.VmObject;
import com.example.veradebora.retrofitcoba.R;

import java.util.List;

/**
 * Created by Vera Debora on 8/2/2018.
 */

public class VmListAdapter extends ArrayAdapter<VmObject> {

    private Context mContext;
    public int mResource;
    List<VmObject> ArrayList;


    public VmListAdapter(@NonNull Context context, int resource, @NonNull List<VmObject> objects) {
        super(context, resource, objects);
        mContext =  context;
        mResource= resource;
        ArrayList = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String hostname = ArrayList.get(position).getHostName();
        String status = ArrayList.get(position).getStatus();
        String os = ArrayList.get(position).getOs();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvHostname = (TextView) convertView.findViewById(R.id.FirstText);
        TextView tvStatus = (TextView) convertView.findViewById(R.id.SecondText);
        TextView tvOs = (TextView) convertView.findViewById(R.id.ThirdText);

        tvHostname.setText(hostname);
        tvStatus.setText(status);
        tvOs.setText(os);

        return convertView;
    }
}
