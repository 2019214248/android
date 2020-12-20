package com.example.novas;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private  int isAnswer;
    public Question(int textResId,boolean answerTrue,int isanswer){
        mTextResId=textResId;
        mAnswerTrue=answerTrue;
        isAnswer=isanswer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
    public int getisAnswer(int isanswer){
        return isanswer;
    }
    public void setIsAnswer(int isanswer){
        isAnswer=isanswer;
    }
}
