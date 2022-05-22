package com.example.quizapp;

import java.util.ArrayList;

public class QuizAL {
    public ArrayList<Quiz> QuizAL;
    {
        QuizAL = new ArrayList<Quiz>();
    }

    public void sync()
    {
        Quiz q1 = new Quiz("Who invented Java Programming?", "Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling");
        QuizAL.add(q1);
        Quiz q2 = new Quiz("Which component is used to compile, debug and execute the java programs?", "JRE", "JIT", "JDK", "JVM", "JDK");
        QuizAL.add(q2);
        Quiz q3 = new Quiz("Which one of the following is not a Java feature?", "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible", "Use of pointers");
        QuizAL.add(q3);
        Quiz q4 = new Quiz("Which of these cannot be used for a variable name in Java?", "identifier & keyword", "identifier", "keyword", "None", "keyword");
        QuizAL.add(q4);
        Quiz q5 = new Quiz("What is the extension of java code files?", ".js", " .txt", ".class", ".java", ".java");
        QuizAL.add(q5);

    }

    public Quiz getQuiz(int num)
    {
        return QuizAL.get(num);

    }



}
