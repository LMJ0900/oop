package controller;

import builder.MemberBuilder;
import model.MemberDto;
import service.MemberService;
import serviceImpl.MemberServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class MemberController {
   MemberService memberService;



    public MemberController() {
        this.memberService = MemberServiceImpl.getInstance();

    }
    public Map<String, MemberDto> getMemberMap() {
        return memberService.getMemberMap();
    }


    public String addMembers(){
        return  memberService.addMembers();
    }
    public int countMembers() {
        return memberService.countMembers();
    }
    public String join(Scanner sc){
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");
        return memberService.join(new MemberBuilder()
                .id(sc.next())
                .pw(sc.next())
                .pwAgain(sc.next())
                .name(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build());


    }

    public String login(Scanner sc){
        System.out.println("ID와 비밀번호를 입력해주세요");
        return memberService.login(new MemberBuilder()
                .id(sc.next())
                .pw(sc.next())
                .build());
    }
}
