package com.example.makecorrectchoice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.ToIntBiFunction;

public class MainActivity extends AppCompatActivity {
    CountDownTimer countDownTimer;
    Random random = new Random();
    Timer timer;
    TimerTask timerTask;
    Button start_button;
    Button lt_button;
    Button rt_button;
    Button lb_button;
    Button rb_button;

    boolean IsMenuMode = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timerTask = new TimerTask() { //
            @Override
            public void run() {

            }
        };

        start_button = findViewById(R.id.start_button);
        lt_button = findViewById(R.id.lt_button);
        rt_button = findViewById(R.id.rt_button);
        lb_button = findViewById(R.id.lb_button);
        rb_button = findViewById(R.id.rb_button);
        Timer timer = new Timer();

//        start_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                countDownTimer = new CountDownTimer() {
//                    @Override
//                    public void onTick(long millisUntilFinished) {
//
//                    }
//
//                    @Override
//                    public void onFinish() {
//
//                    }
//                }
//            }
//        });

        timer.schedule(timerTask, 0, 1500);
    }

    public void onGameButtClick(View view) {

    }
}