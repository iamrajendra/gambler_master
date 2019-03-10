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
        findViewById(R.id.buttonPanel).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        new Message(this).success("Working").show();
    }
}
