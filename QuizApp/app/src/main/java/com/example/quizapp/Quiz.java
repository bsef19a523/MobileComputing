package com.example.quizapp;

public class Quiz {
    public String ques, opt1, opt2, opt3, opt4, correct;
    public Quiz()
    {}
    public Quiz(String ques, String opt1, String opt2, String opt3, String opt4, String correct)
    {
        this.ques = ques;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.correct = correct;
    }

    public boolean CorrectAns(String u_opt)
    {
        if(u_opt.equals(this.correct))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getQues()
    {
        return this.ques;
    }

    public String getOPT1()
    {
        return this.opt1;
    }
    public String getOPT2()
    {
        return this.opt2;
    }
    public String getOPT3()
    {
        return this.opt3;
    }
    public String getOPT4()
    {
        return this.opt4;
    }

    public String getAns()
    {
        return this.correct;
    }


}
