package com.ashis.grammar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ashis.grammar.QuizContract.*;



import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="tensesquiz.db";
    private static final int DATABASE_VERSION =7;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db=db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER1 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER2 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER4 + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }
     private void fillQuestionsTable(){
        Question q1 = new Question("This book …………(take) by Alfin yesterday from the library. His brother………..(read) it now. He ……….(return) it tomorrow. He …………..(borrow ) books from the library for the last few years.", "was taken","is reading","will return","has been borrowing");
        addQuestion(q1);
        Question q2 = new Question("Devika …………. (join) this school in 2018. She ……… (study) in Std. X now. She ………… (study) in the same school for 3 years. By the end of next March, she …………(complete) the course.","joined","is studying","has been studying","will have completed");
        addQuestion(q2);
         Question q3 = new Question("My phone ………….(stop) working again. Something……..(be) wrong with it. It ……………(purchase) long ago. I……..(get) it repaired tomorrow.","has stopped","is","had been purchased","will get");
         addQuestion(q3);
         Question q4 = new Question("It……….(be) 10 a.m. now. We………….(reach) here at 9 a.m. We………(sit) here since then. The team Leader…………(promise) to come here by 9 a.m. to work at a project.","is","reached","have been sitting","had promised");
         addQuestion(q4);
         Question q5 = new Question("Today I……….(reach) the school a little late. My friend Riyas ………….(wait) for me there. He ………….(say) that he …………(wait) for me for half an hour.","reached","was waiting","said","had been waiting");
         addQuestion(q5);
         Question q6 = new Question("The bridge………..(be) under repair. It…………(construct) forty years ago. A plan …… (prepare) now by P.W.D. for constructing a new bridge. They …………….(start ) the work soon. ","is","was constructed","is being prepared","will start");
         addQuestion(q6);
         Question q7 = new Question("The newspaper boy usually …………(bring) the papers in the morning before 7 a.m. He …………… (disbribute) newspapers since 2013. Yesterday he…………..(come) late. When asked he said that the van carrying the bundles ………..(arrive) late.","brings","has been distributing","came","had arrived");
         addQuestion(q7);
         Question q8 = new Question("My friend has no house of his own and he ………(want) to build one. Last month he ………….(buy) a small plot. The construction of the house …………..(not start) yet. He ……………(begin) the work next month.","wants","bought","has not been started","will begin");
         addQuestion(q8);
         Question q9 = new Question("The mechanic ……………(repair) my car since morning. It ………..(be) 2 p.m. now. He …………(finish) the work just now. He said that he …………(send) the bill for the repairing charges after two days.","has been repairing","is","has finished","would send");
         addQuestion(q9);
         Question q10 = new Question("Our examination ………..(begin) next week. I already ………….(revise) the lessons once. I ………..(fail) in maths last time. This time I ………….(pass) in all the subjects.","will begin","have revised","failed","will pass");
         addQuestion(q10);
         Question q11 = new Question("Our headmaster ………..(retire) from service next year. He …………(work) in our school since 1990. He …………(be) very sincere in his work. So he …………(get) an award last year.","will retire","has been working","is","got");
         addQuestion(q11);
         Question q12 = new Question("My father ………..(be) an engineer. He …………..(go) to Japan last year. Since then he …………(work) there in a company. By the end of next year he …………(finish) his service.","is","went","has been working","will have finished");
         addQuestion(q12);
         Question q13 = new Question("Yesterday the maths lesson ………….(teach) by Miss Sangeetha. Now she ………..(ask) questions to test how far the students have understood. As she ……….(not satisfy) with the answers the lesson ……….(repeat) tomorrow.","was taught","is asking","is not satisfied","will be repeated");
         addQuestion(q13);
         Question q14 = new Question("My friend ……..(lie) in hospital for two weeks. We………(visit) him yesterday. He ………… (recover) completely. Most probably he………..(come) to school next week.","has been lying","visited","has recovered","will come");
         addQuestion(q14);
         Question q15 = new Question("My brother ……….. (apply) for jobs ever since he passed his examination in 2017. Last month he ……….(appear) for an interview. He ……… (wait) for the result. If selected he ………. (join) duty next month.","has been applying","appeared","has been waiting","will join");
         addQuestion(q15);
         Question q16 = new Question("My friend ………… (leave) home a year ago. He………..(not call) me since then. He must ………….(forget) about me. I would have written to him if I ……….. (know) his address.","left","has not called","have forgotten","had known");
         addQuestion(q16);
         Question q17 = new Question("I ……….. (borrow) a book from my friend Senin yesterday. I ……….. (read) it now. The book ……… (return) on next Tuesday. He ………… (promise) to give me another book then.","borrowed","am reading","will be returned","has promised");
         addQuestion(q17);
         Question q18 = new Question("Sefin who ………. (leave) for England two years ago…………. (study) there for a course since then. He………….. (finish) it by the end of next year and ………. (return) to India.","left","has been studying","will have finished","will return");
         addQuestion(q18);
         Question q19 = new Question("Shifana ……….. (study) for MCA now. The course ……… (begin) last month. It ………. (come) to an end after three years. By the time she finishes this course, programming ………. (master) by her quite well.","is studying","was begun","will come","will have been mastered");
         addQuestion(q19);
         Question q20 = new Question("Two days ago Linta ………….. (ask) me to prepare a speech for her. It ………….. (write) now. By the time she …………….. (come) tomorrow, it ………. (finish).","asked","is being written","will come","will have been finished");
         addQuestion(q20);
         Question q21 = new Question("My brother …………. (stay) in my house for 3 years. Now his own house ……… (build). It ………… (expect) that the building ………… (complete) within one year.","has been staying","is being built","is expected","will be completed");
         addQuestion(q21);
         Question q22 = new Question("Najiya usually ………….. (read) one book a month. One book…….. (read) at present. Eleven books ………. (read) by her already. By the end of February twelve books ………. (read) by her totally.","reads","is being read","have been read","will have been read");
         addQuestion(q22);
         Question q23 = new Question("I first ……….. (meet) him ten years ago. Then he ………. (run) a business. Recently he ……….. (decide) to wind up his business. Now he ………… (plan) to start a new one.","met","was running","has decided","plans");
         addQuestion(q23);
         Question q24 = new Question("Yesterday they ………… (go) home only after they …………. (finish) their work. But today they just ……….. (decide) that they …………… (not work) after 5 o’ clock.","went","had finished","have decided","will not work");
         addQuestion(q24);
         Question q25 = new Question("It …………… (be) 11 am now and it ………….. (rain) since this morning. Soon the roads ………… (flood). It would not have been so bad if the rain …….. (stop) an hour ago.","is","has been raining","will be flooded","had stopped");
         addQuestion(q25);
     }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_ANSWER1, question.getAnswer1());
        cv.put(QuestionsTable.COLUMN_ANSWER2, question.getAnswer2());
        cv.put(QuestionsTable.COLUMN_ANSWER3, question.getAnswer3());
        cv.put(QuestionsTable.COLUMN_ANSWER4, question.getAnswer4());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }
    public List<Question> getAllQuestions(){
        List<Question> questionList = new ArrayList<>();
        db=getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setAnswer1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER1)));
                question.setAnswer2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER2)));
                question.setAnswer3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER3)));
                question.setAnswer4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER4)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;

    }
}
