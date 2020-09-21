package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class reported_main_ideas extends AppCompatActivity {
    TextView change_in_tenses_text,reporting_verb_text,adjective_text;
    LinearLayout  changes_in_adjectives,changes_in_reporting_verb,changes_in_auxiliary,changes_in_pronouns,changes_in_tenses;
    TextView expand1,expand2,expand3,expand4,expand5;
    Animation blink,from_side,fade_in,from_side2,from_side3,from_side4,from_side5,rotate_expand1,rotate_expand2;
    TableLayout changes_in_pronouns_table,changes_in_tenses_table,changes_in_auxiliary_table,changes_in_adjectives_table;
    int i=1,j=3,k=5,l=7,m=9;
    TableRow t1r1,t1r2,t1r3,t1r4,t1r5,t1r6,t1r7,t1r8,t1r9,t1r10;
    TextView t1r1ans,t1r2ans,t1r3ans,t1r4ans,t1r5ans,t1r6ans,t1r7ans,t1r8ans,t1r9ans,t1r10ans;
    TableRow t2r1,t2r2,t2r3,t2r4,t2r5,t2r6;
    TextView t2r1ans,t2r2ans,t2r3ans,t2r4ans,t2r5ans,t2r6ans;
    TableRow t3r1,t3r2,t3r3,t3r4,t3r5,t3r6,t3r7,t3r8,t3r9;
    TextView t3r1ans,t3r2ans,t3r3ans,t3r4ans,t3r5ans,t3r6ans,t3r7ans,t3r8ans,t3r9ans;
    TableRow t5r1,t5r2,t5r3,t5r4,t5r5,t5r6,t5r7,t5r8,t5r9,t5r10,t5r11,t5r12,t5r13;
    TextView t5r1ans,t5r2ans,t5r3ans,t5r4ans,t5r5ans,t5r6ans,t5r7ans,t5r8ans,t5r9ans,t5r10ans,t5r11ans,t5r12ans,t5r13ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reported_main_ideas);
        changes_in_pronouns=findViewById(R.id.changes_in_pronouns);
        expand1=findViewById(R.id.expand1);
        expand2=findViewById(R.id.expand2);
        expand3=findViewById(R.id.expand3);
        expand4=findViewById(R.id.expand4);
        expand5=findViewById(R.id.expand5);
        blink= AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.blink);
        rotate_expand1=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.rotate_expand_1);
        rotate_expand2=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.rotate_expand_2);
        from_side=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.from_side);
        from_side2=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.from_side2);
        from_side3=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.from_side3);
        from_side4=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.from_side4);
        from_side5=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.from_side5);
        fade_in=AnimationUtils.loadAnimation(reported_main_ideas.this,R.anim.fade_in);
        changes_in_pronouns.startAnimation(from_side);
        changes_in_pronouns_table=findViewById(R.id.changes_in_pronouns_table);
        changes_in_pronouns_table.setVisibility(View.GONE);
        changes_in_tenses=findViewById(R.id.changes_in_tenses);
        changes_in_tenses_table=findViewById(R.id.changes_in_tenses_table);
        change_in_tenses_text=findViewById(R.id.changes_in_tenses_text);
        changes_in_tenses.startAnimation(from_side2);
        change_in_tenses_text.setVisibility(View.GONE);
        changes_in_tenses_table.setVisibility(View.GONE);
        changes_in_auxiliary=findViewById(R.id.changes_in_auxiliary_text);
        changes_in_auxiliary_table=findViewById(R.id.changes_in_auxiliary_table);
        changes_in_auxiliary.startAnimation(from_side3);
        changes_in_auxiliary_table.setVisibility(View.GONE);
        changes_in_reporting_verb=findViewById(R.id.changes_in_reporting_verb);
        reporting_verb_text=findViewById(R.id.idea3_text);
        changes_in_reporting_verb.startAnimation(from_side4);
        reporting_verb_text.setVisibility(View.GONE);
        changes_in_adjectives=findViewById(R.id.changes_in_adjectives);
        adjective_text=findViewById(R.id.idea4_text);
        changes_in_adjectives_table=findViewById(R.id.report_idea_table4);
        changes_in_adjectives.startAnimation(from_side5);
        adjective_text.setVisibility(View.GONE);
        changes_in_adjectives_table.setVisibility(View.GONE);

        t1r1=findViewById(R.id.t1r1);
        t1r2=findViewById(R.id.t1r2);
        t1r3=findViewById(R.id.t1r3);
        t1r4=findViewById(R.id.t1r4);
        t1r5=findViewById(R.id.t1r5);
        t1r6=findViewById(R.id.t1r6);
        t1r7=findViewById(R.id.t1r7);
        t1r8=findViewById(R.id.t1r8);
        t1r9=findViewById(R.id.t1r9);
        t1r10=findViewById(R.id.t1r10);

        t2r1=findViewById(R.id.t2r1);
        t2r2=findViewById(R.id.t2r2);
        t2r3=findViewById(R.id.t2r3);
        t2r4=findViewById(R.id.t2r4);
        t2r5=findViewById(R.id.t2r5);
        t2r6=findViewById(R.id.t2r6);

        t3r1=findViewById(R.id.t3r1);
        t3r2=findViewById(R.id.t3r2);
        t3r3=findViewById(R.id.t3r3);
        t3r4=findViewById(R.id.t3r4);
        t3r5=findViewById(R.id.t3r5);
        t3r6=findViewById(R.id.t3r6);
        t3r7=findViewById(R.id.t3r7);
        t3r8=findViewById(R.id.t3r8);
        t3r9=findViewById(R.id.t3r9);


        t5r1=findViewById(R.id.t5r1);
        t5r2=findViewById(R.id.t5r2);
        t5r3=findViewById(R.id.t5r3);
        t5r4=findViewById(R.id.t5r4);
        t5r5=findViewById(R.id.t5r5);
        t5r6=findViewById(R.id.t5r6);
        t5r7=findViewById(R.id.t5r7);
        t5r8=findViewById(R.id.t5r8);
        t5r9=findViewById(R.id.t5r9);
        t5r10=findViewById(R.id.t5r10);
        t5r11=findViewById(R.id.t5r11);
        t5r12=findViewById(R.id.t5r12);
        t5r13=findViewById(R.id.t5r13);






        t1r1ans=findViewById(R.id.t1r1ans);
        t1r1ans.setVisibility(View.GONE);
        t1r2ans=findViewById(R.id.t1r2ans);
        t1r2ans.setVisibility(View.GONE);
        t1r3ans=findViewById(R.id.t1r3ans);
        t1r3ans.setVisibility(View.GONE);
        t1r4ans=findViewById(R.id.t1r4ans);
        t1r4ans.setVisibility(View.GONE);
        t1r5ans=findViewById(R.id.t1r5ans);
        t1r5ans.setVisibility(View.GONE);
        t1r6ans=findViewById(R.id.t1r6ans);
        t1r6ans.setVisibility(View.GONE);
        t1r7ans=findViewById(R.id.t1r7ans);
        t1r7ans.setVisibility(View.GONE);
        t1r8ans=findViewById(R.id.t1r8ans);
        t1r8ans.setVisibility(View.GONE);
        t1r9ans=findViewById(R.id.t1r9ans);
        t1r9ans.setVisibility(View.GONE);
        t1r10ans=findViewById(R.id.t1r10ans);
        t1r10ans.setVisibility(View.GONE);

        t2r1ans=findViewById(R.id.t2r1ans);
        t2r1ans.setVisibility(View.GONE);
        t2r2ans=findViewById(R.id.t2r2ans);
        t2r2ans.setVisibility(View.INVISIBLE);
        t2r3ans=findViewById(R.id.t2r3ans);
        t2r3ans.setVisibility(View.GONE);
        t2r4ans=findViewById(R.id.t2r4ans);
        t2r4ans.setVisibility(View.INVISIBLE);
        t2r5ans=findViewById(R.id.t2r5ans);
        t2r5ans.setVisibility(View.GONE);
        t2r6ans=findViewById(R.id.t2r6ans);
        t2r6ans.setVisibility(View.INVISIBLE);

        t3r1ans=findViewById(R.id.t3r1ans);
        t3r1ans.setVisibility(View.GONE);
        t3r2ans=findViewById(R.id.t3r2ans);
        t3r2ans.setVisibility(View.GONE);
        t3r3ans=findViewById(R.id.t3r3ans);
        t3r3ans.setVisibility(View.GONE);
        t3r4ans=findViewById(R.id.t3r4ans);
        t3r4ans.setVisibility(View.GONE);
        t3r5ans=findViewById(R.id.t3r5ans);
        t3r5ans.setVisibility(View.GONE);
        t3r6ans=findViewById(R.id.t3r6ans);
        t3r6ans.setVisibility(View.GONE);
        t3r7ans=findViewById(R.id.t3r7ans);
        t3r7ans.setVisibility(View.GONE);
        t3r8ans=findViewById(R.id.t3r8ans);
        t3r8ans.setVisibility(View.GONE);
        t3r9ans=findViewById(R.id.t3r9ans);
        t3r9ans.setVisibility(View.GONE);



        t5r1ans=findViewById(R.id.t5r1ans);
        t5r1ans.setVisibility(View.INVISIBLE);
        t5r2ans=findViewById(R.id.t5r2ans);
        t5r2ans.setVisibility(View.INVISIBLE);
        t5r3ans=findViewById(R.id.t5r3ans);
        t5r3ans.setVisibility(View.INVISIBLE);
        t5r4ans=findViewById(R.id.t5r4ans);
        t5r4ans.setVisibility(View.INVISIBLE);
        t5r5ans=findViewById(R.id.t5r5ans);
        t5r5ans.setVisibility(View.INVISIBLE);
        t5r6ans=findViewById(R.id.t5r6ans);
        t5r6ans.setVisibility(View.INVISIBLE);
        t5r7ans=findViewById(R.id.t5r7ans);
        t5r7ans.setVisibility(View.INVISIBLE);
        t5r8ans=findViewById(R.id.t5r8ans);
        t5r8ans.setVisibility(View.INVISIBLE);
        t5r9ans=findViewById(R.id.t5r9ans);
        t5r9ans.setVisibility(View.INVISIBLE);
        t5r10ans=findViewById(R.id.t5r10ans);
        t5r10ans.setVisibility(View.INVISIBLE);
        t5r11ans=findViewById(R.id.t5r11ans);
        t5r11ans.setVisibility(View.INVISIBLE);
        t5r12ans=findViewById(R.id.t5r12ans);
        t5r12ans.setVisibility(View.INVISIBLE);
        t5r13ans=findViewById(R.id.t5r13ans);
        t5r13ans.setVisibility(View.INVISIBLE);






        changes_in_pronouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i==1){
                    expand1.startAnimation(rotate_expand1);
                    expand1.setText("▲");
                changes_in_pronouns_table.setVisibility(View.VISIBLE);
                i=0;
                }else if(i==0){
                    expand1.startAnimation(rotate_expand2);
                    expand1.setText("▼");
                    changes_in_pronouns_table.setVisibility(View.GONE);
                    i=1;
                }
            }
        });
        changes_in_tenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (j==3){
                    expand2.startAnimation(rotate_expand1);
                    expand2.setText("▲");
                change_in_tenses_text.setVisibility(View.VISIBLE);
                changes_in_tenses_table.setVisibility(View.VISIBLE);
                j=2;
                }else if(j==2){
                    expand2.startAnimation(rotate_expand2);
                    expand2.setText("▼");
                    change_in_tenses_text.setVisibility(View.GONE);
                    changes_in_tenses_table.setVisibility(View.GONE);
                    j=3;
                }
            }
        });
        changes_in_auxiliary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(k==5){
                    expand3.startAnimation(rotate_expand1);
                    expand3.setText("▲");
                changes_in_auxiliary_table.setVisibility(View.VISIBLE);
                k=4;
                }else if(k==4){
                    expand3.startAnimation(rotate_expand2);
                    expand3.setText("▼");
                    changes_in_auxiliary_table.setVisibility(View.GONE);
                    k=5;
                }
            }
        });
        changes_in_reporting_verb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(l==7){
                    expand4.startAnimation(rotate_expand1);
                    expand4.setText("▲");
                reporting_verb_text.setVisibility(View.VISIBLE);
                l=6;
                }else if(l==6){
                    expand4.startAnimation(rotate_expand2);
                    expand4.setText("▼");
                    reporting_verb_text.setVisibility(View.GONE);
                    l=7;
                }
            }
        });
        changes_in_adjectives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m==9){
                    expand5.startAnimation(rotate_expand1);
                    expand5.setText("▲");
                adjective_text.setVisibility(View.VISIBLE);
                changes_in_adjectives_table.setVisibility(View.VISIBLE);
                m=8;
                }else if(m==8){
                    expand5.startAnimation(rotate_expand2);
                    expand5.setText("▼");
                    adjective_text.setVisibility(View.GONE);
                    changes_in_adjectives_table.setVisibility(View.GONE);
                    m=9;
                }
            }
        });


       t1r1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               t1r1ans.setVisibility(View.VISIBLE);
               t1r1ans.startAnimation(blink);
           }
       });
        t1r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r2ans.setVisibility(View.VISIBLE);
                t1r2ans.startAnimation(blink);
            }
        });
        t1r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r3ans.setVisibility(View.VISIBLE);
                t1r3ans.startAnimation(blink);
            }
        });
        t1r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r4ans.setVisibility(View.VISIBLE);
                t1r4ans.startAnimation(blink);
            }
        });
        t1r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r5ans.setVisibility(View.VISIBLE);
                t1r5ans.startAnimation(blink);
            }
        });
        t1r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r6ans.setVisibility(View.VISIBLE);
                t1r6ans.startAnimation(blink);
            }
        });
        t1r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r7ans.setVisibility(View.VISIBLE);
                t1r7ans.startAnimation(blink);
            }
        });
        t1r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r8ans.setVisibility(View.VISIBLE);
                t1r8ans.startAnimation(blink);
            }
        });
        t1r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r9ans.setVisibility(View.VISIBLE);
                t1r9ans.startAnimation(blink);
            }
        });
        t1r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1r10ans.setVisibility(View.VISIBLE);
                t1r10ans.startAnimation(blink);
            }
        });


        t2r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2r1ans.setVisibility(View.VISIBLE);
                t2r1ans.startAnimation(blink);
            }
        });
        t2r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2r2ans.setVisibility(View.VISIBLE);
                t2r2ans.startAnimation(blink);
            }
        });
        t2r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2r3ans.setVisibility(View.VISIBLE);
                t2r3ans.startAnimation(blink);
            }
        });
        t2r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2r4ans.setVisibility(View.VISIBLE);
                t2r4ans.startAnimation(blink);
            }
        });
        t2r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2r5ans.setVisibility(View.VISIBLE);
                t2r5ans.startAnimation(blink);
            }
        });
        t2r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2r6ans.setVisibility(View.VISIBLE);
                t2r6ans.startAnimation(blink);
            }
        });


        t3r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r1ans.setVisibility(View.VISIBLE);
                t3r1ans.startAnimation(blink);
            }
        });
        t3r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r2ans.setVisibility(View.VISIBLE);
                t3r2ans.startAnimation(blink);
            }
        });
        t3r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r3ans.setVisibility(View.VISIBLE);
                t3r3ans.startAnimation(blink);
            }
        });
        t3r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r4ans.setVisibility(View.VISIBLE);
                t3r4ans.startAnimation(blink);
            }
        });
        t3r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r5ans.setVisibility(View.VISIBLE);
                t3r5ans.startAnimation(blink);
            }
        });
        t3r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r6ans.setVisibility(View.VISIBLE);
                t3r6ans.startAnimation(blink);
            }
        });
        t3r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r7ans.setVisibility(View.VISIBLE);
                t3r7ans.startAnimation(blink);
            }
        });
        t3r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r8ans.setVisibility(View.VISIBLE);
                t3r8ans.startAnimation(blink);
            }
        });
        t3r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3r9ans.setVisibility(View.VISIBLE);
                t3r9ans.startAnimation(blink);
            }
        });





        t5r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r1ans.setVisibility(View.VISIBLE);
                t5r1ans.startAnimation(blink);
            }
        });
        t5r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r2ans.setVisibility(View.VISIBLE);
                t5r2ans.startAnimation(blink);
            }
        });
        t5r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r3ans.setVisibility(View.VISIBLE);
                t5r3ans.startAnimation(blink);
            }
        });
        t5r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r4ans.setVisibility(View.VISIBLE);
                t5r4ans.startAnimation(blink);
            }
        });
        t5r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r5ans.setVisibility(View.VISIBLE);
                t5r5ans.startAnimation(blink);
            }
        });
        t5r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r6ans.setVisibility(View.VISIBLE);
                t5r6ans.startAnimation(blink);
            }
        });
        t5r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r7ans.setVisibility(View.VISIBLE);
                t5r7ans.startAnimation(blink);
            }
        });
        t5r8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r8ans.setVisibility(View.VISIBLE);
                t5r8ans.startAnimation(blink);
            }
        });
        t5r9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r9ans.setVisibility(View.VISIBLE);
                t5r9ans.startAnimation(blink);
            }
        });
        t5r10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r10ans.setVisibility(View.VISIBLE);
                t5r10ans.startAnimation(blink);
            }
        });
        t5r11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r11ans.setVisibility(View.VISIBLE);
                t5r11ans.startAnimation(blink);
            }
        });
        t5r12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r12ans.setVisibility(View.VISIBLE);
                t5r12ans.startAnimation(blink);
            }
        });
        t5r13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5r13ans.setVisibility(View.VISIBLE);
                t5r13ans.startAnimation(blink);
            }
        });


    }
}