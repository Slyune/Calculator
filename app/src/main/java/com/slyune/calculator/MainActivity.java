package com.slyune.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText input;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inist();
    }

    private void inist() {
        findViewById(R.id.btnNum0).setOnClickListener(this);
        findViewById(R.id.btnNum1).setOnClickListener(this);
        findViewById(R.id.btnNum2).setOnClickListener(this);
        findViewById(R.id.btnNum3).setOnClickListener(this);
        findViewById(R.id.btnNum4).setOnClickListener(this);
        findViewById(R.id.btnNum5).setOnClickListener(this);
        findViewById(R.id.btnNum6).setOnClickListener(this);
        findViewById(R.id.btnNum7).setOnClickListener(this);
        findViewById(R.id.btnNum8).setOnClickListener(this);
        findViewById(R.id.btnNum9).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnNum0:

                break;
        }
    }

}
