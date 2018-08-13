package com.example.veradebora.retrofitcoba.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.veradebora.retrofitcoba.R;

/**
 * Created by Vera Debora on 7/13/2018.
 */

public class TopUpDialog extends AppCompatDialogFragment {

    private EditText Amount,BankName,NoRek;
    private TopUpDialogListener topUpDialogListener;
    public String NamaBank;
    public int Nominal, RekNum, Uid;


    @Override
    public void onStart() {
        super.onStart();
        AlertDialog alertDialog = (AlertDialog)getDialog();
        if (alertDialog != null){
            Button positiveButton = (Button) alertDialog.getButton(Dialog.BUTTON_POSITIVE);
            positiveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean closedialog = false;
                    if (isNotEmpty(Amount) && isNotEmpty(BankName) && isNotEmpty(NoRek)) {
                        Nominal = Integer.parseInt(Amount.getText().toString());
                        NamaBank = BankName.getText().toString();
                        RekNum = Integer.parseInt(NoRek.getText().toString());
                        topUpDialogListener.applyTexts(Nominal, NamaBank, RekNum);
                        closedialog = true;
                    }
                    else {
                        Toast.makeText(getActivity(),"All Field Must Be Filled!",Toast.LENGTH_SHORT).show();
                    }

                    if (closedialog){
                        Toast.makeText(getActivity(), "Top Up Has Been Requested!", Toast.LENGTH_SHORT).show();
                        dismiss();
                    }
                }
            });
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


//        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("SharedPref", Context.MODE_PRIVATE);
//        Uname = sharedPreferences.getString("User_Name","");
//        Uid = Integer.parseInt(sharedPreferences.getString("User_id",""));
//        sharedPreferences.getString("User_id","");
//        Uemail = sharedPreferences.getString("User_Email","");

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.topupdialog, null);

        builder.setView(view)
                .setTitle("TopUp Request")
                .setCancelable(true)
                .setNegativeButton("Cancel", (dialogInterface, i) -> {

                })
                .setPositiveButton("Ok", (dialogInterface, i) -> {

                });

        Amount = view.findViewById(R.id.amount);
//        Amount.setError("Cant be empty");
        BankName = view.findViewById(R.id.BankName);
//        BankName.setError("Cant be Empty");
        NoRek = view.findViewById(R.id.NoRek);
//        NoRek.setError("Cant Be Empty");
        return builder.create();
    }

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);

        try {
            topUpDialogListener = (TopUpDialogListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() +
                    "Must implement TopUpDialogListener");
        }
    }

    public interface TopUpDialogListener{
        void applyTexts(int Nominal, String NamaBank, int RekNum);

    }

//    public void TopUpReq(){
//        api.TOP_UP_REQUEST_OBSERVABLE(Nominal, Uid, NamaBank, Uemail, Uname, RekNum)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Observer<TopUpRequest>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Toast.makeText(getActivity(), "ERROR!", Toast.LENGTH_SHORT).show();
//                    }
//
//                    @Override
//                    public void onNext(TopUpRequest topUpRequest) {
//                        if(topUpRequest.isResult()){
//                            Toast.makeText(getActivity(),"Your Request Has Been Sent to The Admin", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }
    private boolean isNotEmpty(EditText etText) {
    return etText.getText().toString().trim().length() > 0;
        }

}
