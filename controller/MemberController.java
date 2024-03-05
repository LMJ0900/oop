package controller;

import model.Member;
import service.MemberService;
import serviceImpl.MemberServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class MemberController {
   MemberService memberService;



    public MemberController() {
        this.memberService = MemberServiceImpl.getInstance();

    }
    public Map<String, Member> getMemberMap() {
        return memberService.getMemberMap();
    }


    public String addMembers(){
        return  memberService.addMembers();
    }
    public String countMembers() {
        return memberService.countMembers();
    }
    public String join(Scanner sc){
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");
        return memberService.join(Member.builder()
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
        return memberService.login(Member.builder()
                .id(sc.next())
                .pw(sc.next())
                .build());
    }
    public Member detail(Scanner sc) {
        System.out.println();

        return memberService.detail(sc.next());
    }

    public String updatePassword(Scanner sc) {
        System.out.println("id와 바꿀 비밀번호를 입력해주세요");
        return memberService.updatePassword(sc.next(), sc.next());
    }

    public String deleteMember(Scanner sc) {

        return memberService.deleteMember(sc.next());
    }
}
