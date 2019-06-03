package com.example.homescreen;

public class QuestionModel {

    private String QuestionString;
    private String QuestionString2;
    private String Answer;

    public QuestionModel(String questionString, String questionString2, String answer){
        QuestionString = questionString;
        QuestionString2 = questionString2;
        Answer = answer;
    }

    public String getQuestionString() {return QuestionString; }

    public void setQuestionString(String questionString) { QuestionString = questionString; }

    public String getQuestionString2() {return QuestionString2; }

    public String getAnswer() { return Answer; }

    public void setAnswer(String answer) { Answer = answer; }



}
