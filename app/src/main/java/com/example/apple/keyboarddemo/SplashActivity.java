package com.example.apple.keyboarddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.apple.keyboarddemo.focus.SoftFocusActivity;
import com.example.apple.keyboarddemo.keyboard_num.KeyBoardNumberActivity;
import com.example.apple.keyboarddemo.shelter_aty.ShelterActivity;
import com.example.apple.keyboarddemo.top_dismiss.TopDismissFirstActivity;
import com.example.apple.keyboarddemo.top_dismiss.TopDismissSecondActivity;
import com.example.apple.keyboarddemo.top_dismiss.TopDismissThirdActivity;
import com.example.apple.keyboarddemo.topic.TopicActivity;

/**
 * @author crazyZhangxl on 2018-10-25 9:51:12.
 * Describe: 软键盘入口活动
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findViewById(R.id.btnNum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, KeyBoardNumberActivity.class));
            }
        });

        findViewById(R.id.btnTopic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, TopicActivity.class));
            }
        });

        findViewById(R.id.btnShelter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, ShelterActivity.class));
            }
        });

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this,RegisterActivity.class));
            }
        });

        findViewById(R.id.btnChat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this,SessionActivity.class));
            }
        });

        findViewById(R.id.btnRg2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this,Register2Activity.class));
            }
        });

        findViewById(R.id.btnTopMiss1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, TopDismissFirstActivity.class));
            }
        });

        findViewById(R.id.btnTopMiss2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, TopDismissSecondActivity.class));
            }
        });
        findViewById(R.id.btnTopMiss3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, TopDismissThirdActivity.class));
            }
        });

        findViewById(R.id.focus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, SoftFocusActivity.class));
            }
        });
    }
}
