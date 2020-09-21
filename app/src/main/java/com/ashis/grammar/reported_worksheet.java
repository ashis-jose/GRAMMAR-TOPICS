package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class reported_worksheet extends AppCompatActivity {
    CardView startquiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reported_worksheet);
        startquiz=findViewById(R.id.reported_startquiz);
        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(reported_worksheet.this,reported_quiz.class));
            }
        });

    }
}