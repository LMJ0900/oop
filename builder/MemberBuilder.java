package builder;

import model.MemberDto;

import java.sql.ConnectionBuilder;

public class MemberBuilder {
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
    private String username;




    public MemberBuilder id(String id){
        this.id = id;
        return this;
    }
    public MemberBuilder pw(String pw){
        this.pw = pw;
        return this;
    }

    public MemberBuilder pwAgain(String pwAgain){
        this.pwAgain = pwAgain;
        return this;
    }

    public MemberBuilder name(String name){
        this.name = name;
        return this;
    }

    public MemberBuilder personId(int personId){
        this.personId = personId;
        return this;
    }

    public MemberBuilder phoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MemberBuilder address(String address){
        this.address = address;
        return this;
    }

    public MemberBuilder job(String job){
        this.job = job;
        return this;
    }

    public MemberBuilder height(double height){
        this.height = height;
        return this;
    }

    public MemberBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public MemberDto build(){
        return new MemberDto(id, pw, pwAgain, name, personId, phoneNumber, address, job, height, weight);
    }

    public MemberBuilder username(String username) {
        this.username = username;
        return this;
    }

}
