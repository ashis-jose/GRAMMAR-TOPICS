package com.ashis.grammar;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

public class quiz extends AppCompatActivity {
    private TextView textViewQuestion;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView cancel_text;
    private TextView finalScore;
    private EditText answera;
    private EditText answerb;
    private EditText answerc;
    private EditText answerd;
    private Button buttonConfirmNext;
    private Button finishbutton;
    private Button backDialogbutton;
    private ColorStateList ColorDefaultET;
    private int max_score;
    String answer1,answer2,answer3,answer4;


    private List<Question> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private Question currentQuestion;


    private int score;
    private boolean answered;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        textViewQuestion = findViewById(R.id.text_view_question);
        textViewScore = findViewById(R.id.text_view_score);
        textViewQuestionCount = findViewById(R.id.text_view_question_count);
        answera=findViewById(R.id.answera);
        answerb=findViewById(R.id.answerb);
        answerc=findViewById(R.id.answerc);
        answerd=findViewById(R.id.answerd);
        buttonConfirmNext=findViewById(R.id.button_confirm_next);







        QuizDbHelper dbHelper=new QuizDbHelper(this);
        questionList=dbHelper.getAllQuestions();
        questionCountTotal=questionList.size();
        max_score=4*questionCountTotal;
        textViewScore.setText("score: " + "0" + "/" + max_score);
        Collections.shuffle(questionList);
        showNextQuestion();

        buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answered){
                    if ( answera.getText().toString().trim().equals("") || answerb.getText().toString().trim().equals("") || answerc.getText().toString().trim().equals("") || answerc.getText().toString().trim().equals("") ){
                        Toast.makeText(quiz.this, "Please Write all answers", Toast.LENGTH_SHORT).show();
                    } else {
                        checkAnswer();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });

    }
    private void showNextQuestion(){


        answera.setTextColor(Color.BLACK);
        answerb.setTextColor(Color.BLACK);
        answerc.setTextColor(Color.BLACK);
        answerd.setTextColor(Color.BLACK);


        answera.getText().clear();
        answerb.getText().clear();
        answerc.getText().clear();
        answerd.getText().clear();
        answera.setBackgroundColor(Color.TRANSPARENT);
        answerb.setBackgroundColor(Color.TRANSPARENT);
        answerc.setBackgroundColor(Color.TRANSPARENT);
        answerd.setBackgroundColor(Color.TRANSPARENT);
        answera.requestFocus();

        if (questionCounter < questionCountTotal){
            currentQuestion = questionList.get(questionCounter);
            textViewQuestion.setText(currentQuestion.getQuestion());

            questionCounter++;
            textViewQuestionCount.setText("Question: "+ questionCounter + "/"+ questionCountTotal);
            answered=false;
            buttonConfirmNext.setText("Confirm");
        }else {
            final Dialog dialog=new Dialog(this);
            dialog.setContentView(R.layout.dialog);
            dialog.show();
            finalScore=dialog.findViewById(R.id.final_score);
            finalScore.setText(score + "/"+ max_score);
            finishbutton=dialog.findViewById(R.id.finish_button);
            finishbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    finishQuiz();
                }
            });

        }
    }
    private void checkAnswer(){
        answered=true;

        answer1=answera.getText().toString();
        answer2=answerb.getText().toString();
        answer3=answerc.getText().toString();
        answer4=answerd.getText().toString();
        if (answer1.equals(currentQuestion.getAnswer1())){
          answera.setBackgroundColor(Color.GREEN);
            score++;
        }else{
            answera.setBackgroundColor(Color.RED);
            answera.setText("Correct Ans: "+ currentQuestion.getAnswer1());
            answera.setTextColor(Color.WHITE);
        }
        if (answer2.equals(currentQuestion.getAnswer2())){
            answerb.setBackgroundColor(Color.GREEN);
            score++;
        }else{
            answerb.setBackgroundColor(Color.RED);
            answerb.setText("Correct Ans: "+ currentQuestion.getAnswer2());
            answerb.setTextColor(Color.WHITE);
        }
        if (answer3.equals(currentQuestion.getAnswer3())){
            answerc.setBackgroundColor(Color.GREEN);

            score++;
        }else{
            answerc.setBackgroundColor(Color.RED);
            answerc.setText("Correct Ans: "+ currentQuestion.getAnswer3());
            answerc.setTextColor(Color.WHITE);
        }
        if (answer4.equals(currentQuestion.getAnswer4())){
            answerd.setBackgroundColor(Color.GREEN);
            score++;
        }else{
            answerd.setBackgroundColor(Color.RED);
            answerd.setText("Correct Ans: "+ currentQuestion.getAnswer4());
            answerd.setTextColor(Color.WHITE);
        }





        textViewScore.setText("score: " + score + "/" + max_score);
        showSolution();
    }
    private void showSolution(){
        if (questionCounter<questionCountTotal){
            buttonConfirmNext.setText("Next");
            }else{
            buttonConfirmNext.setText("Finish");
        }
    }
    private void finishQuiz(){

        finish();

    }

    @Override
    public void onBackPressed() {

        final Dialog backDialog=new Dialog(this);
        backDialog.setContentView(R.layout.backdialog);
        backDialog.show();
        cancel_text=backDialog.findViewById(R.id.cancel_text);
        backDialogbutton=backDialog.findViewById(R.id.back_dialog_button);
        backDialogbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backDialog.dismiss();
                finishQuiz();
            }
        });
        cancel_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backDialog.cancel();
            }
        });
    }



}