package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Subject {
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;
    private int score;


@Builder(builderMethodName = "builder")
    public Subject(String name, int korean, int english, int math, int score) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.score = score;
    }
}