package com.example.homescreen;


public class QuestionLibrary {

    private String mQuestions [] = {
            "",
            "I like to work from a computer",
            "I like solving problems",
            "I have great interest in the economy",
            "I enjoy planning how to spend my money",
            "I have great interest in architecture",
            "I am good with precise calculations",
            "I like taking care of people",
            "I have interest in a medical study",
            "I want to help people who are struggling socially",
            "I can empathize with others well",
            "I like teaching people new things",
            "I like working with young people",
            "I am interested in logistics",
            "I am interested to see how ports work",
            ""
    };


    private String mChoices [][] = {
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"},
            {"Weak", "Mediocre", "Reasonable", "Strong"}
    };



    private String mCorrectAnswers[] = {"", "", "", "", "", "","", "", "", "", "", "","", "", "", "", "", ""};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}