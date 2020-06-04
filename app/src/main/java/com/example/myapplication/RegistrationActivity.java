package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.myapplication.R.layout.activity_register;

public class RegistrationActivity extends AppCompatActivity {
    @BindView(R.id.name) EditText nameET;
    @BindView(R.id.email)EditText emailET;
    @BindView(R.id.phone)EditText phoneET;
    @BindView(R.id.password)EditText passwordET;
    @BindView(R.id.enterBtn) Button enterBtn;

    @Override
    protected  void onCreate(@Nullable Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(activity_register);
    }
    enterBtn.setOnClickListener(new View.OnClickListener()){

    }
}
