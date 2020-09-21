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
    private static final int DATABASE_VERSION =4;
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
        tag_Question q31=new tag_Question("We cannot do it, ………….?","Can we?");
        addQuestion(q31);
        tag_Question q32=new tag_Question("These books will not satisfy my purpose, …….?","Will they?");
        addQuestion(q32);
        tag_Question q33=new tag_Question("Few people knew the answer, ………….?","Did they?");
        addQuestion(q33);
        tag_Question q34=new tag_Question("A few people knew the answer, ………….?","Didn’t they?");
        addQuestion(q34);
        tag_Question q35=new tag_Question("The dog will attack him, ………….? ","Won’t it?");
        addQuestion(q35);
        tag_Question q36=new tag_Question("It is very cold today, ………….?","Isn’t it?");
        addQuestion(q36);
        tag_Question q37=new tag_Question("You can help me, ………….?","Can’t you?");
        addQuestion(q37);
        tag_Question q38=new tag_Question("Sugar tastes sweet, ………….?","Doesn’t it?");
        addQuestion(q38);
        tag_Question q39=new tag_Question("Your work cannot satisfy me, ………….?","Can it?");
        addQuestion(q39);
        tag_Question q40=new tag_Question("I could satisfy my parents, ………….?","Couldn’t I?");
        addQuestion(q40);
        tag_Question q41=new tag_Question("He used to wake up late, ………….?","Didn’t he?");
        addQuestion(q41);
        tag_Question q42=new tag_Question("Let us not go out today, ………….?","Shall we?");
        addQuestion(q42);
        tag_Question q43=new tag_Question("Let us do the home work, ………….?","Shall we?");
        addQuestion(q43);
        tag_Question q44=new tag_Question("The people could finish the work in time, ….?","Couldn’t they?");
        addQuestion(q44);
        tag_Question q45=new tag_Question("Nijith reads well, ………….?","Doesn’t he?");
        addQuestion(q45);
        tag_Question q46=new tag_Question("I am older than you, ………….?","Aren’t I?");
        addQuestion(q46);
        tag_Question q47=new tag_Question("You need not come with me, ………….?","Do you?");
        addQuestion(q47);
        tag_Question q48=new tag_Question("Rome was not built in a day, ………….?","Was it?");
        addQuestion(q48);
        tag_Question q49=new tag_Question("I was very sick, ………….?","Wasn’t I?");
        addQuestion(q49);
        tag_Question q50=new tag_Question("I need some money, ………….?","Don’t I?");
        addQuestion(q50);
        tag_Question q51=new tag_Question("Stop that noise, ………….?","Will you?");
        addQuestion(q51);
        tag_Question q52=new tag_Question("Please pass me the book, ………….?","Will you?");
        addQuestion(q52);
        tag_Question q53=new tag_Question("Don’t be late for the class, ………….?","Will you?");
        addQuestion(q53);
        tag_Question q54=new tag_Question("Read aloud, ………….?","Will you?");
        addQuestion(q54);
        tag_Question q55=new tag_Question("Get out of the room, ………….?","Can’t you?");
        addQuestion(q55);
        tag_Question q56=new tag_Question("It may rain today, ………….?","Mayn’t it?");
        addQuestion(q56);
        tag_Question q57=new tag_Question("That pen may be available in the store, …….?","Mayn’t it?");
        addQuestion(q57);
        tag_Question q58=new tag_Question("Our team will win the match, ………….?","Won’t they?");
        addQuestion(q58);
        tag_Question q59=new tag_Question("Children must obey their parents, ………….?","Mustn’t they?");
        addQuestion(q59);
        tag_Question q60=new tag_Question("They might not have finished the work, …….?","Might they?");
        addQuestion(q60);
        tag_Question q61=new tag_Question("They dare to disobey us, …….?","Don’t they?");
        addQuestion(q61);
        tag_Question q62=new tag_Question("A few people came for the meeting, …….?","Didn’t they?");
        addQuestion(q62);
        tag_Question q63=new tag_Question("Little progress has been made, ……….?","Has it?");
        addQuestion(q63);
        tag_Question q64=new tag_Question("A little progress has been made, ……….?","Hasn’t it?");
        addQuestion(q64);
        tag_Question q65=new tag_Question("John finds little time to study at home, …….?","Does he?");
        addQuestion(q65);
        tag_Question q66=new tag_Question("He has little money with him, ………….?","Has he?");
        addQuestion(q66);
        tag_Question q67=new tag_Question("You and I saw it, ………….?","Didn’t we?");
        addQuestion(q67);
        tag_Question q68=new tag_Question("Sefin and Senin are brothers, ……….?","Aren’t they?");
        addQuestion(q68);
        tag_Question q69=new tag_Question("None of you solved the problem, ……….?","Did you?");
        addQuestion(q69);
        tag_Question q70=new tag_Question("No one is ready to go, ……….?","Are they?");
        addQuestion(q70);
        tag_Question q71=new tag_Question("Let me go now, ……….?","Will you?");
        addQuestion(q71);
        tag_Question q72=new tag_Question("Let us go for a walk, ……….?","Shall we?");
        addQuestion(q72);
        tag_Question q73=new tag_Question("Let us not do it, ……. ?","Shall we?");
        addQuestion(q73);
        tag_Question q74=new tag_Question("One cannot be too careful, ……….?","Can one?");
        addQuestion(q74);
        tag_Question q75=new tag_Question("We seldom see them nowadays, ……….?","Do we?");
        addQuestion(q75);
        tag_Question q76=new tag_Question("There is little water in the river, ……….?","Is there?");
        addQuestion(q76);
        tag_Question q77=new tag_Question("Use your common sense, ……….?","Can’t you?");
        addQuestion(q77);
        tag_Question q78=new tag_Question("Use your dictionary, ……….?","Will you?");
        addQuestion(q78);
        tag_Question q79=new tag_Question("Everybody cannot succeed, ……….?","Can they?");
        addQuestion(q79);
        tag_Question q80=new tag_Question("None of the workmen arrived in time, ……….?","Did they?");
        addQuestion(q80);



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
