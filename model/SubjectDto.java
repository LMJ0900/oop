package model;

public class SubjectDto {
    private int id;
    private String name;
    private int kor;
    private int english;
    private int math;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", english=" + english +
                ", math=" + math +
                ", score=" + score +
                '}';
    }

    public SubjectDto(String name, int kor, int english, int math, int score) {
        this.name = name;
        this.kor = kor;
        this.english = english;
        this.math = math;
        this.score = score;
    }
}