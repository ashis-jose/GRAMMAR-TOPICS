package com.ashis.grammar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ashis.grammar.tag_QuizContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class tag_QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="tag_quiz.db";
    private static final int DATABASE_VERSION =3;
    private SQLiteDatabase db;

    public tag_QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db=db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                tag_QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                tag_QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                tag_QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                tag_QuizContract.QuestionsTable.COLUMN_ANSWER + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + tag_QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        tag_Question q1=new tag_Question("Rifa is not here, ………….?","Is she?");
        addQuestion(q1);
        tag_Question q2=new tag_Question("Shahni is in the class, ………….?","Isn’t she?");
        addQuestion(q2);
        tag_Question q3=new tag_Question("Vivek works too much, ………….?","Doesn’t he?");
        addQuestion(q3);
        tag_Question q4=new tag_Question("You should not smoke, ………….?","Should you?");
        addQuestion(q4);
        tag_Question q5=new tag_Question("He has finished, ………….?","Hasn’t he?");
        addQuestion(q5);
        tag_Question q6=new tag_Question("Arjun has not finished the work, ………….?","Has he?");
        addQuestion(q6);
        tag_Question q7=new tag_Question("She sang well, ………….?","Didn’t she?");
        addQuestion(q7);
        tag_Question q8=new tag_Question("Arathi did not sing well, ………….?","Did she?");
        addQuestion(q8);
        tag_Question q9=new tag_Question("He has not been to England, ………….?","Has he?");
        addQuestion(q9);
        tag_Question q10=new tag_Question("They are learning English, ………….?","Aren’t they?");
        addQuestion(q10);
        tag_Question q11=new tag_Question("I didn’t hurt you, ………….?","Did I?");
        addQuestion(q11);
        tag_Question q12=new tag_Question("I hurt you, ………….?","Do I? / Didn’t I?");
        addQuestion(q12);
        tag_Question q13=new tag_Question("I am a little late, ………….?","Aren’t I?");
        addQuestion(q13);
        tag_Question q14=new tag_Question("I am not late, ………….?","I am not late, ………….?");
        addQuestion(q14);
        tag_Question q15=new tag_Question("Last we used to study, ………….?","Didn’t we?");
        addQuestion(q15);
        tag_Question q16=new tag_Question("Your son got married, ………….?","Didn’t he?");
        addQuestion(q16);
        tag_Question q17=new tag_Question("We must not abuse others, ………….?","Must we?");
        addQuestion(q17);
        tag_Question q18=new tag_Question("We must be helpful to others, ………….?","Mustn’t we?");
        addQuestion(q18);
        tag_Question q19=new tag_Question("They haven’t completed their work, ………….?","Have they?");
        addQuestion(q19);
        tag_Question q20=new tag_Question("You will attend the party, ………….?","Won’t you?");
        addQuestion(q20);
        tag_Question q21=new tag_Question("It is going to rain, ………….?","Isn’t it?");
        addQuestion(q21);
        tag_Question q22=new tag_Question("Don’t waste your money, ………….?","Will you?");
        addQuestion(q22);
        tag_Question q23=new tag_Question("His parents are abroad, ………….?","Aren’t they?");
        addQuestion(q23);
        tag_Question q24=new tag_Question("Today the road is crowded, ………….?","Isn’t it?");
        addQuestion(q24);
        tag_Question q25=new tag_Question("This book is mine, ………….?","Isn’t it?");
        addQuestion(q25);
        tag_Question q26=new tag_Question("These books are mine, ………….?","Aren’t they?");
        addQuestion(q26);
        tag_Question q27=new tag_Question("This book belongs to me, ………….?","Doesn’t it?");
        addQuestion(q27);
        tag_Question q28=new tag_Question("They come here occasionally, ………….?","Don’t they?");
        addQuestion(q28);
        tag_Question q29=new tag_Question("Everyone was silent, ………….?","Weren’t they?");
        addQuestion(q29);
        tag_Question q30=new tag_Question("None of us kept quiet, ………….?","Did we?");
        addQuestion(q30);


    }
    private void addQuestion(tag_Question question){
        ContentValues cv = new ContentValues();
        cv.put(tag_QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(tag_QuizContract.QuestionsTable.COLUMN_ANSWER, question.getAnswer());
        db.insert(tag_QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }

    public List<tag_Question> getAllQuestions(){
        List<tag_Question> questionList = new ArrayList<>();
        db=getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + tag_QuizContract.QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                tag_Question question = new tag_Question();
                question.setQuestion(c.getString(c.getColumnIndex(tag_QuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setAnswer(c.getString(c.getColumnIndex(tag_QuizContract.QuestionsTable.COLUMN_ANSWER)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;

    }


}
