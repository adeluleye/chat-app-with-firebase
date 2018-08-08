package com.spantom.chatapp;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

public class Util {

    public static void showErrorDialog(Context context, String message) {

        new AlertDialog.Builder(context)
                .setTitle("Ooops!")
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public static void toastMessage(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }
}
