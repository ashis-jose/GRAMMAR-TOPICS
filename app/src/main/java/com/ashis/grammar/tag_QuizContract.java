package com.ashis.grammar;

import android.provider.BaseColumns;

public final class tag_QuizContract {
    private tag_QuizContract(){}
    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME="tag_quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_ANSWER = "answer";
    }

}
