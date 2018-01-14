package com.littledinostudio.geoquiz;

/**
 * Created by micha on 01/03/2018 for GeoQuiz
 */

public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResID, boolean answerTrue){
        mTextResID = textResID;
        mAnswerTrue = answerTrue;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
