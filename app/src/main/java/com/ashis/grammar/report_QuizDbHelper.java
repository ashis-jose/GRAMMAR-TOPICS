package com.ashis.grammar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ashis.grammar.report_QuizContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class report_QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="reported_quiz.db";
    private static final int DATABASE_VERSION =3;
    private SQLiteDatabase db;

    public report_QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db=db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                report_QuizContract.QuestionsTable.TABLE_NAME + " ( " +
                report_QuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                report_QuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                report_QuizContract.QuestionsTable.COLUMN_ANSWER + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + report_QuizContract.QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        report_Question q1=new report_Question("The teacher said to me, “What are you doing?”","The teacher asked me what I was doing.");
        addQuestion(q1);
        report_Question q2=new report_Question("Naina asked me, “Why didn’t you help my friend?”","Naina asked me why I had not helped her friend.");
        addQuestion(q2);
        report_Question q3=new report_Question("“When will your examinations begin?” father asked his daughter.","Father asked his daughter when her examinations would begin.");
        addQuestion(q3);
        report_Question q4=new report_Question("The teacher asked, “Who are absent today?”","The teacher wanted to know who were absent that day.");
        addQuestion(q4);
        report_Question q5=new report_Question("“Whose answer have you copied Ravi?”, the teacher asked.","The teacher interrogated Ravi whose answer he had copied.");
        addQuestion(q5);
        report_Question q6=new report_Question("“How far is the railway station from here?”, the old man enquired.","The old man enquired how far the railway station was from there.");
        addQuestion(q6);
        report_Question q7=new report_Question("“Where can I buy that book?”, Lamya said.","Lamya wanted to know where she could buy that book.");
        addQuestion(q7);
        report_Question q8=new report_Question("“Where does he keep his money?”, they asked her.","They inquired her where he kept his money.");
        addQuestion(q8);
        report_Question q9=new report_Question("“Why didn’t you invite me?”, Anju asked her friend.","Anju asked her friend why she had not invited her.");
        addQuestion(q9);
        report_Question q10=new report_Question("“Are you a clever boy?”, Mishal asked me.","Mishal asked me if I was a clever boy.");
        addQuestion(q10);
        report_Question q11=new report_Question("“Were you present yesterday?”, asked Najiya.","Najiya asked whether I had been present the day before.");
        addQuestion(q11);
        report_Question q12=new report_Question("“Have you ever been to Delhi?”, Rishal asked me.","Rishal asked me if I had ever been to Delhi.");
        addQuestion(q12);
        report_Question q13=new report_Question("“Did you collect the letters?”, the officer asked me.","The officer asked me if I had collected the letters.");
        addQuestion(q13);
        report_Question q14=new report_Question("“Has your father gone to the office?”, I asked the boy.","I asked the boy if his father had gone to the office.");
        addQuestion(q14);
        report_Question q15=new report_Question("“May I go home?”, the girl asked the teacher.","The girl asked the teacher if she might go home.");
        addQuestion(q15);
        report_Question q16=new report_Question("“Will you solve this problem?”, Hiba asked Rinsha.","Hiba asked Rinsha if she would solve that problem.");
        addQuestion(q16);
        report_Question q17=new report_Question("She asked him, “Can you swim?”.","She asked him whether he could swim.");
        addQuestion(q17);
        report_Question q18=new report_Question("I said, “Riyas, Shall we go to the park?”.","I asked Riyas if we should go to the park.");
        addQuestion(q18);
        report_Question q19=new report_Question("“Can’t you do this by yourself?”, the maths teacher asked.","The maths teacher asked me if I could do that by myself.");
        addQuestion(q19);
        report_Question q20=new report_Question("The teacher said, “Open your book and do it now”.","The teacher told us to open our book and to do it then.");
        addQuestion(q20);
        report_Question q21=new report_Question("The teacher said, “Silna, go to the office and get a map of India”.","The teacher told Silna to go to the office and to get a map of India.");
        addQuestion(q21);
        report_Question q22=new report_Question("“Don’t spend all your money on food and clothes.” the father advised his son.","The father advised his son not to spend all his money on food and clothes.");
        addQuestion(q22);
        report_Question q23=new report_Question("“Write soon; don’t waste your time.”, the examiner told the children.","The examiner warned the children to write soon and not to waste their time.");
        addQuestion(q23);
        report_Question q24=new report_Question("She asked me, “Please give me a glass of water.”","She requested me to give her a glass of water.");
        addQuestion(q24);
        report_Question q25=new report_Question("“Help me out of this difficulty”, he said to his brother.","He begged his brother to help him out of that difficulty.");
        addQuestion(q25);
        report_Question q26=new report_Question("Midhun said, “Oh!, I am a genius.”","Midhun exclaimed that he was a genius.");
        addQuestion(q26);
        report_Question q27=new report_Question("“Oh! what a handsome man I am!”, said the actor.","The actor exclaimed that he was very handsome man.");
        addQuestion(q27);
        report_Question q28=new report_Question("“What a beautiful garden!” Rishijith said.","Rishijith exclaimed that the garden was very beautiful.");
        addQuestion(q28);
        report_Question q29=new report_Question("“What a splendid building!”, the tourist said when he saw the Taj.","The tourist exclaimed that it was a very splendid building, when he saw the Taj.");
        addQuestion(q29);
        report_Question q30=new report_Question("Anagha said, “How happy we are here!”.","Anagha exclaimed that they were very happy there.");
        addQuestion(q30);
        report_Question q31=new report_Question("“Oh! it is a serious mistake.”, said Nijith.","Nijith mourned that it was a very serious mistake.");
        addQuestion(q31);
        report_Question q32=new report_Question("The teacher said, “I have never seen such a lazy boy as you are.”","The teacher stated that she had never seen such a lazy boy as I was.");
        addQuestion(q32);
        report_Question q33=new report_Question("She said, “I don’t like your hair style.”","She suggested that she did not like my hair style.");
        addQuestion(q33);
        report_Question q34=new report_Question("“I shall show you how to do the problem.”, said Hiba.","Hiba promised that she would show her how to do the problem.");
        addQuestion(q34);
        report_Question q35=new report_Question("“I have come to take the book.”, Janeesha said.","Janeesha said that she had come to take the book.");
        addQuestion(q35);
        report_Question q36=new report_Question("“We needn’t tell him about it.”, Arshed said to Irshad.","Arshed said to Irshad that they needn’t tell him about it.");
        addQuestion(q36);
        report_Question q37=new report_Question("“I will take you to the cinema.”, the father said to the boy.","The father promised the boy that he would take him to the cinema.");
        addQuestion(q37);
        report_Question q38=new report_Question("Jenna reminded me, “Niya may be waiting for us.”","Jenna reminded me that Najiya might be waiting for us.");
        addQuestion(q38);
        report_Question q39=new report_Question("“I am a student and I have been in this school for three years”, Munshida said.","Munshida declared that she was a student and had been in that school for three years.");
        addQuestion(q39);
        report_Question q40=new report_Question("Headmaster said , “If you come late again, I will punish you.”","Headmaster warned him that if he came late again, he would punish him.");
        addQuestion(q40);
        report_Question q41=new report_Question("“I saw them outside the class”, the class leader said.","The class leader complained that he had seen them outside the class.");
        addQuestion(q41);
        report_Question q42=new report_Question("“Alfin has been doing his work”, said Sefin.","Sefin said that Alfin had been doing his work.");
        addQuestion(q42);
        report_Question q43=new report_Question("“ I was late for the class yesterday”, said Siniya.","Siniya said that she was/had been late for the class the previous day.");
        addQuestion(q43);
        report_Question q44=new report_Question("“ I had done the work”, Nasreen said.","Nasreen claimed that she had done the work.");
        addQuestion(q44);
        report_Question q45=new report_Question("“ I can get A plus”, Afna said.","Afna stated that she could get A plus.");
        addQuestion(q45);
        report_Question q46=new report_Question("“ He must do his duty”, Rishwan said.","Rishwan reminded that he must/had to do his duty.");
        addQuestion(q46);
        report_Question q47=new report_Question("“Let’s go to the school”, Riza suggested.","Riza suggested that they should go to the school.");
        addQuestion(q47);
        report_Question q48=new report_Question("“He needn’t come with us”, Nisam said.","Nisam insisted that he needn’t go with them.");
        addQuestion(q48);
        report_Question q49=new report_Question("“Masoorie is a hill station”, Abhinaya said.","Abhinaya said that Masoorie is a hill station.");
        addQuestion(q49);
        report_Question q50=new report_Question("“If I practised speaking, I would learn English well,” Said Arifa.","Arifa said that if she practised speaking, she would learn English well.");
        addQuestion(q50);

    }
    private void addQuestion(report_Question question){
        ContentValues cv = new ContentValues();
        cv.put(report_QuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(report_QuizContract.QuestionsTable.COLUMN_ANSWER, question.getAnswer());
        db.insert(report_QuizContract.QuestionsTable.TABLE_NAME, null, cv);
    }

    public List<report_Question> getAllQuestions(){
        List<report_Question> questionList = new ArrayList<>();
        db=getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + report_QuizContract.QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                report_Question question = new report_Question();
                question.setQuestion(c.getString(c.getColumnIndex(report_QuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setAnswer(c.getString(c.getColumnIndex(report_QuizContract.QuestionsTable.COLUMN_ANSWER)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;

    }


}
