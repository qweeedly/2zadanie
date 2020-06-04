package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    public  final static FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    public final static int LOGIN_REQUEST_CODE = 8392;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
