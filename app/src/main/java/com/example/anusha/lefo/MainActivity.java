package com.example.anusha.lefo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LEAD(View view) {

        Intent in = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(in);
    }

    public void FOLLOW(View view) {
        Intent in = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(in);
    }
}
