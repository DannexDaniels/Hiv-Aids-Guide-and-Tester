package com.dannextech.apps.hivaidsguideandtester;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        ImageView myImageView= (ImageView) findViewById(R.id.imageView);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        final TextView textView = (TextView) findViewById(R.id.textView);

        progressBar.setVisibility(View.INVISIBLE);
        textView.setVisibility(View.INVISIBLE);

        //Adding a fade in effect to the image view
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        myImageView.startAnimation(myFadeInAnimation); //Set animation to your ImageView

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
            }
        }, 9000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),NavigationDrawer.class);
                startActivity(intent);
            }
        }, 12000);
    }
}
