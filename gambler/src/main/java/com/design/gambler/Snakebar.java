package com.design.gambler;

import android.app.Activity;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Snakebar {

    private final ImageView imageView;
    private final View snackView;
    private final TextView msgTV;
    private final Snackbar snackbar;
    private Activity mActivity;

    public Snakebar(Activity activity) {
        mActivity = activity;
        snackbar = Snackbar.make(activity.findViewById(android.R.id.content), "", Snackbar.LENGTH_LONG);
// Get the Snackbar's layout view
        Snackbar.SnackbarLayout layout = (Snackbar.SnackbarLayout) snackbar.getView();
// Hide the text
        TextView textView = (TextView) layout.findViewById(android.support.design.R.id.snackbar_text);
        textView.setVisibility(View.INVISIBLE);

// Inflate our custom view
        snackView = LayoutInflater.from(activity).inflate(R.layout.message, null);
// Configure the view
        imageView = (ImageView) snackView.findViewById(R.id.indicator_iv);

        msgTV = (TextView) snackView.findViewById(R.id.msg);
        msgTV.setTextColor(Color.WHITE);

//If the view is not covering the whole snackbar layout, add this line
        layout.setPadding(0, 0, 0, 0);

// Add the view to the Snackbar's layout
        layout.addView(snackView, 0);
// Show the Snackbar

    }


    public Snakebar error(String msg) {
        snackView.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.md_red_800));
        msg(R.drawable.ic_close_white_24dp, msg);


        return this;
    }

    private void msg(int i, String msg) {

        imageView.setImageResource(i);
        msgTV.setText(msg);
    }

    public Snakebar warning(String msg) {
        snackView.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.md_yellow_800));
        msg(R.drawable.ic_warning_white_24dp, msg);

        return this;
    }

    public Snakebar success(String msg) {
        snackView.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.md_green_800));

        msg(R.drawable.ic_check_white_24dp, msg);


        return this;
    }

    public Snakebar information(String msg) {
        snackView.setBackgroundColor(ContextCompat.getColor(mActivity, R.color.md_blue_800));

        msg(R.drawable.ic_info_outline_white_24dp, msg);


        return this;
    }

    /*public Snakebar action(String action, View.OnClickListener onClickListener) {
        snackbar.setAction(action, onClickListener);
        return this;
    }*/

    public Snakebar show() {
        snackbar.show();
        return this;
    }
}