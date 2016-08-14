package com.example.srima.acadgildintent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button android;
    Button front;
    Button ios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
    }

    public void addListenerOnButton() {
        final Context context=this;
        android = (Button) findViewById(R.id.button);
        android.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                Intent intent = new Intent(context, mentors.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerOnButton1() {
        final Context context=this;
        front = (Button) findViewById(R.id.button2);
        front.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, frontmentor.class);
                startActivity(intent);
            }
        });
    }
    public void addListenerOnButton2() {
        final Context context=this;
        ios = (Button) findViewById(R.id.button3);
        ios.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(context, iosmentor.class);
                startActivity(intent);
            }
        });
    }
}