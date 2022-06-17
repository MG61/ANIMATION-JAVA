package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.img);

    }

    public void btnRight(View view) {
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.flipout);
        imageView.startAnimation(rotate);
    }

    public void btnLeft(View view) {
        Animation _rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.flipin);
        imageView.startAnimation(_rotate);
    }

    public void btnoc(View view) {
        view = findViewById(R.id.img);
        Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate_center);
        view.startAnimation(a);
    }

    public void btnisc(View view) {
        view = findViewById(R.id.img);
        Animation a = AnimationUtils.loadAnimation(this, R.anim.fade);
        view.startAnimation(a);
    }
}