package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionTag_worksheet extends AppCompatActivity {
    CardView tag_startquiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_tag_worksheet);
        tag_startquiz=findViewById(R.id.tag_startquiz);
        tag_startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(questionTag_worksheet.this,question_tag_quiz.class));
            }
        });

    }
}