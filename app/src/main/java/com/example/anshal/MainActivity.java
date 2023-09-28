package com.example.anshal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void receiveNow(View view)
    {
        Toast.makeText(MainActivity.this,
                "Message Receive Successfully", Toast.LENGTH_LONG).show();
    } public void sendNow(View view)
    {
        Toast.makeText(MainActivity.this,
                "Message Send Successfully", Toast.LENGTH_LONG).show();
    } public void deleteNow(View view)
    {
        Toast.makeText(MainActivity.this,
                "Message Delete Successfully", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}