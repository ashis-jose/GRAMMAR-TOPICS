package com.ashis.grammar;

import android.provider.BaseColumns;

public final class QuizContract {
    private QuizContract(){}
    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME ="quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_ANSWER1 = "answer1";
        public static final String COLUMN_ANSWER2 = "answer2";
        public static final String COLUMN_ANSWER3 = "answer3";
        public static final String COLUMN_ANSWER4 = "answer4";
    }


}
