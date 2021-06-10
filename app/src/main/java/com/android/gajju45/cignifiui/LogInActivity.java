package com.android.gajju45.cignifiui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void RegisterActivityclick(View view) {

        Intent intent = new Intent(LogInActivity.this, Register_Activity.class);
        startActivity(intent);
    }
}