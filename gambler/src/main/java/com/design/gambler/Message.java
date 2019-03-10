package com.design.gambler;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatImageView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Message {

    private Toast toast;
    private Context context;
    private View view;


    public Message(Context context) {
        this.context = context;
        this.toast = new Toast(context);
        this.view = LayoutInflater.from(context).inflate(R.layout.message, null);

    }



    public Message error(String msg) {
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.md_red_800));
        msg(R.drawable.ic_close_white_24dp, msg);


        return this;
    }

    private void msg(int i, String msg) {
        TextView textView = view.findViewById(R.id.msg);
        AppCompatImageView imageView = view.findViewById(R.id.indicator_iv);
        imageView.setImageResource(i);
        textView.setText(msg);
    }

    public Message warning(String msg) {
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.md_yellow_800));
        msg(R.drawable.ic_warning_white_24dp, msg);

        return this;
    }

    public Message success(String msg) {
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.md_green_800));

        msg(R.drawable.ic_check_white_24dp, msg);


        return this;
    }

    public Message information(String msg) {
        view.setBackgroundColor(ContextCompat.getColor(context, R.color.md_blue_800));

        msg(R.drawable.ic_info_outline_white_24dp, msg);


        return this;
    }

    public Message show() {

        toast.setView(view);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 200);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

        return this;
    }
}
