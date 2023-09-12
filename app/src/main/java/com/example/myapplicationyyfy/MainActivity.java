package com.example.myapplicationyyfy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView image1;
    Button button,button1;
    Animation my_anim,my_anim1;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        image1=findViewById(R.id.image1);



        my_anim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim);
        my_anim1=AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim1);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                image1.startAnimation(my_anim);

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                image1.startAnimation(my_anim1);

            }
        });


    }
}