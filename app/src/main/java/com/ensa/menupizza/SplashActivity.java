package com.ensa.menupizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image=findViewById(R.id.imageView);
        TranslateAnimation vibrationAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, -0.05f, Animation.RELATIVE_TO_SELF, 0.05f,
                Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f
        );


        vibrationAnimation.setDuration(100);
        vibrationAnimation.setRepeatCount(Animation.INFINITE);
        vibrationAnimation.setRepeatMode(Animation.REVERSE);

        image.startAnimation(vibrationAnimation);

        Thread t=new Thread(){
            @Override
            public void run(){
                try{
                sleep(2000);
                    Intent intent=new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();


                }catch(Exception e){
                    e.printStackTrace();
                }
            }

        };
        t.start();
    }
}