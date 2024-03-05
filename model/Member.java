package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Member {
    private String id;
    private String pw;
    private String pwAgain;
    private String name;
    private int personId;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;

@Builder(builderMethodName = "builder")
    public Member(String id, String pw, String pwAgain, String name, int personId, int phoneNumber, String address, String job, double height, double weight) {
        this.id = id;
        this.pw = pw;
        this.pwAgain = pwAgain;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPw(String updatePw) {
    this.pw = updatePw;
    }
}