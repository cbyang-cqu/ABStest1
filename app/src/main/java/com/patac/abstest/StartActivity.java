package com.patac.abstest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);  //onCreate 是启动界面入口
        Timer timer=new Timer();      //界面跳转
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(StartActivity.this,MainActivity1.class));
                finish();
            }
        };timer.schedule(timerTask,2000); //设置计时任务2s后跳转

}
}
