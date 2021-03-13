package com.fanxiaoyudemo.myapplication.UserInterface;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.R;

import java.util.Timer;
import java.util.TimerTask;

public class CoverActivity extends AppCompatActivity {

    private static final long DELAY = 1000;
    private TimerTask task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
        final Intent localIntent=new Intent(this,LoginActivity.class);//你要转向的Activity
        Timer timer = new Timer();
        TimerTask tast = new TimerTask() {
            @Override
            public void run(){
                startActivity(localIntent);//执行
            }
        };
        timer.schedule(tast,DELAY);//10秒后
    }
}
