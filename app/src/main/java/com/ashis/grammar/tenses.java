package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;


public class tenses extends AppCompatActivity {

    CardView practise,simplepresent,presentcontinuous,presentperfect,presentperfectcontinuous,simplepast,pastcontinuous,pastperfect,pastperfectcontinuous,simplefuture,futurecontinuous,futureperfect,futureperfectcontinuous;
    Animation frombottom2;
    ScrollView tenses_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenses);
        tenses_menu=findViewById(R.id.tenses_menu);
        frombottom2= AnimationUtils.loadAnimation(tenses.this,R.anim.frombottom2);
        practise=findViewById(R.id.practiseworksheet);
        simplepresent=findViewById(R.id.simplepresent);
        presentcontinuous=findViewById(R.id.presentcontinuous);
        presentperfect=findViewById(R.id.presentperfect);
        presentperfectcontinuous=findViewById(R.id.presentperfectcontinuous);
        simplepast=findViewById(R.id.simplepast);
        pastcontinuous=findViewById(R.id.pastcontinuous);
        pastperfect=findViewById(R.id.pastperfect);
        pastperfectcontinuous=findViewById(R.id.pastperfectcontinuous);
        simplefuture=findViewById(R.id.simplefuture);
        futurecontinuous=findViewById(R.id.futurecontinuous);
        futureperfect=findViewById(R.id.futureperfect);
        futureperfectcontinuous=findViewById(R.id.futureperfectcontinuous);
        tenses_menu.startAnimation(frombottom2);
        practise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,worksheet.class));
            }
        });
        simplepresent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,simple_present.class));
            }
        });
        presentcontinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,present_continuous.class));
            }
        });
        presentperfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,present_perfect.class));
            }
        });
        presentperfectcontinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,present_perfect_continuous.class));
            }
        });
        simplepast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,simple_past.class));
            }
        });
        pastperfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,past_perfect.class));
            }
        });
        pastcontinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,past_continuous.class));
            }
        });
        pastperfectcontinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,past_perfect_continuous.class));
            }
        });
        simplefuture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,simple_future.class));
            }
        });
        futurecontinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,future_continuous.class));
            }
        });
        futureperfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,future_perfect.class));
            }
        });
        futureperfectcontinuous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tenses.this,future_perfect_continuous.class));
            }
        });




    }
}