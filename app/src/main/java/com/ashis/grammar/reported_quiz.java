package com.ashis.grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class reported_quiz extends AppCompatActivity {
    private TextView textViewQuestion;
    private TextView textViewQuestionCount;
    private TextView answer;
    private TextView answer_below;
    private Button show_answer;
    private List<report_Question> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private report_Question currentQuestion;
    private boolean answered;
    private Button backDialogbutton,finishbutton;
    private TextView cancel_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reported_quiz);
        textViewQuestion=findViewById(R.id.text_view_question);
        textViewQuestionCount=findViewById(R.id.text_view_question_count);
        answer=findViewById(R.id.answer);
        answer_below=findViewById(R.id.answer_below);
        show_answer=findViewById(R.id.button_show_answer);
        report_QuizDbHelper dbHelper1=new report_QuizDbHelper(this);
        questionList=dbHelper1.getAllQuestions();

        questionCountTotal=questionList.size();
        showNextQuestion();
        show_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!answered){
                    showAnswer();
                }else {
                    showNextQuestion();
                }
            }
        });


    }
    private void showNextQuestion(){
        answer.setVisibility(View.GONE);
        answer_below.setVisibility(View.GONE);
        if (questionCounter < questionCountTotal){
            currentQuestion=questionList.get(questionCounter);
            textViewQuestion.setText(currentQuestion.getQuestion());
            questionCounter++;
            textViewQuestionCount.setText("Question: "+ questionCounter + "/"+ questionCountTotal);
            answered=false;
            show_answer.setText("SHOW ANSWER");
        }else{
            final Dialog dialog=new Dialog(this);
            dialog.setContentView(R.layout.dialog1);
            dialog.show();
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
    private void showAnswer(){
        answered=true;
        answer.setVisibility(View.VISIBLE);
        answer_below.setVisibility(View.VISIBLE);
        answer.setText(currentQuestion.getAnswer());
        if (questionCounter<questionCountTotal){
            show_answer.setText("Next Question");
        }else{
            show_answer.setText("FINISH");
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