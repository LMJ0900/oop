package builder;

import model.SubjectDto;

import javax.swing.*;

public class SubjectBuilder {
    private String name;
    private int korean;
    private int english;
    private int math;

    private int score;

    public  SubjectBuilder name(String name){
        this.name = name;
        return this;
    }
    public SubjectBuilder korean(int korean){
        this.korean = korean;
        return this;
    }
    public SubjectBuilder english(int english){
        this.english = english;
        return this;
    }
    public SubjectBuilder math(int math){
        this.math = math;
        return this;
    }
    public SubjectBuilder score(int score){
        this.score = score;
        return this;
    }
    public SubjectDto build(){
        return new SubjectDto(name,korean, english, math, score);
    }

}
