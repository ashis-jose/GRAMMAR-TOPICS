package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;

public class reported_speech extends AppCompatActivity {

    CardView main_ideas,reporting_questions,reporting_imperatives,reporting_exclamatory,tips_reported,practice_worksheet;
    Animation frombottom2;
    ScrollView reported_speech_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reported_speech);
        frombottom2= AnimationUtils.loadAnimation(reported_speech.this, R.anim.frombottom2);
        main_ideas=findViewById(R.id.main_ideas);
        reporting_questions=findViewById(R.id.reporting_questions);
        reporting_imperatives=findViewById(R.id.reporting_imperatives);
        reporting_exclamatory=findViewById(R.id.reporting_exclamatory_sentences);
        practice_worksheet=findViewById(R.id.reported_worksheet);
        tips_reported=findViewById(R.id.tips_reported);
        reported_speech_menu=findViewById(R.id.reported_speech_menu);
        reported_speech_menu.startAnimation(frombottom2);
        main_ideas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_speech.this,reported_main_ideas.class));
            }
        });
        reporting_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_speech.this, reporting_questions.class));
            }
        });
        reporting_imperatives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_speech.this, reporting_imperatives.class));
            }
        });
        reporting_exclamatory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_speech.this, reporting_exclamatory.class));
            }
        });
        tips_reported.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_speech.this,reported_speech_tips.class));
            }
        });
        practice_worksheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_speech.this,reported_worksheet.class));
            }
        });


    }
}