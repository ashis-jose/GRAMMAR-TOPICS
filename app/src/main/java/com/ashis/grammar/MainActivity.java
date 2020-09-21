package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView bgapp,cloverimg,logo,home_bg;
    LinearLayout splashtext,hometext;
    Animation frombottom,fade_in,frombottom1,rotate,zoom_in,fade_in1;

    ScrollView menus;
    CardView tenses,reported_speech,question_tags;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question_tags=findViewById(R.id.question_tags);
        zoom_in=AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        frombottom= AnimationUtils.loadAnimation(this,R.anim.frombottom);
        frombottom1=AnimationUtils.loadAnimation(this,R.anim.frombottom1);
        fade_in=AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fade_in1=AnimationUtils.loadAnimation(this,R.anim.fade_in1);
        rotate=AnimationUtils.loadAnimation(this,R.anim.rotate_clockwise);
        bgapp=findViewById(R.id.bgapp);
        logo=findViewById(R.id.logo);
        home_bg=findViewById(R.id.home_bg);
        cloverimg=findViewById(R.id.cloverimg);
        splashtext=findViewById(R.id.splashtext);
        hometext=findViewById(R.id.hometext);
        menus=findViewById(R.id.menus);
        bgapp.animate().translationY(-1600).setDuration(800).setStartDelay(2500);
        cloverimg.animate().alpha(0).setDuration(800).setStartDelay(2400);
        splashtext.startAnimation(fade_in);
        logo.startAnimation(zoom_in);
        splashtext.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(2000);
        hometext.startAnimation(frombottom);
        menus.startAnimation(frombottom1);
        home_bg.startAnimation(fade_in1);
        tenses=findViewById(R.id.tenses);
        reported_speech=findViewById(R.id.reported_speech);
        tenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,tenses.class));
            }
        });
        reported_speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, reported_speech.class));
            }
        });
        question_tags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, question_tags.class));
            }
        });





    }
}