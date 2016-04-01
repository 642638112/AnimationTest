package com.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void menu(View v){
        Intent i=new Intent(this,MenuActivity.class);
        startActivity(i);
    }
    public void timerAnim(View v){
        Intent i=new Intent(this,TimerActivity.class);
        startActivity(i);
    }
    public void pushDownMenu(View v){
        Intent i=new Intent(this,DropTestActivity.class);
        startActivity(i);
    }


}
