package com.gamblerindore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.design.gambler.Message;
import com.design.gambler.Snakebar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.error_toast).setOnClickListener(this);
        findViewById(R.id.info_toast).setOnClickListener(this);
        findViewById(R.id.warning_toast).setOnClickListener(this);
        findViewById(R.id.error_sb).setOnClickListener(this);
        findViewById(R.id.info_sb).setOnClickListener(this);
        findViewById(R.id.warning_sb).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.error_toast:
                new Message(this).error("this is a error message").show();
                break;
            case R.id.info_toast:
                new Message(this).information("this is a information message").show();
                break;
            case R.id.warning_toast:
                new Message(this).warning("this is a warning message").show();
                break;

            case R.id.error_sb:
                new Snakebar(this).error("this is a error message").show();
                break;
            case R.id.info_sb:
                new Snakebar(this).information("this is a information message").show();
                break;
            case R.id.warning_sb:
                new Snakebar(this).warning("this is a warning message").show();
                break;

        }

    }
}
