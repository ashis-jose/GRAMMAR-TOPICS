package com.ashis.grammar;

import android.provider.BaseColumns;

public final class report_QuizContract {
    private report_QuizContract(){}
    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME="report_quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_ANSWER = "answer";
    }
}
