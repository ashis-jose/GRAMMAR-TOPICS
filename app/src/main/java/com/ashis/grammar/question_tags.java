package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class question_tags extends AppCompatActivity {
    CardView goldenrules,worksheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_tags);
        goldenrules=findViewById(R.id.golden_rules);
        goldenrules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(question_tags.this,golden_rules.class));
            }
        });
        worksheet=findViewById(R.id.question_tag_worksheet);
        worksheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(question_tags.this,questionTag_worksheet.class));
            }
        });
    }
}