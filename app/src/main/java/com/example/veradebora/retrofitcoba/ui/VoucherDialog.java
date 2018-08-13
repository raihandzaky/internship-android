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
 * Created by Vera Debora on 7/23/2018.
 */

public class VoucherDialog extends AppCompatDialogFragment {

    private EditText Voucher;
    private VoucherDialogListener voucherDialogListener;
    public String VoucherCode;
    boolean voucher = false;


    @Override
    public void onStart() {
        super.onStart();
        AlertDialog dialog = (AlertDialog)getDialog();
        if (dialog != null){
            Button positivebutton = (Button) dialog.getButton(Dialog.BUTTON_POSITIVE);
            positivebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Boolean closedialog = false;
                    if(Voucher.getText().toString().trim().length() == 0){
                        Toast.makeText(getActivity(),"Input Voucher Code",Toast.LENGTH_SHORT).show();
                    } else {
                        VoucherCode = Voucher.getText().toString();
                        voucher = true;
                        voucherDialogListener.inputText(VoucherCode, voucher);
                        closedialog = true;
                    }

                    if (closedialog){
                        Toast.makeText(getActivity(), "Voucher Will be checked", Toast.LENGTH_SHORT).show();
                        dismiss();
                    }
                }
            });
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.voucherdialog, null);

        builder.setView(view)
                .setTitle("Voucher Registration")
                .setCancelable(true)
                .setNegativeButton("Cancel", (dialog, which) -> {

                })
                .setPositiveButton("Verification Voucher", (dialog, which) -> {

                });

        Voucher = view.findViewById(R.id.Voucher);
        return builder.create();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            voucherDialogListener = (VoucherDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "Something is not Right man, The VoucherDialogListener!");
        }
    }

    public interface VoucherDialogListener {
        void inputText (String VoucherCode, boolean voucher);
    }
}
