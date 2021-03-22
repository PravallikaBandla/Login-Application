package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
method();
    }
    public void method()
    {
        Toast.makeText(getApplicationContext(),"pravallika", Toast.LENGTH_SHORT).show();

    }
}