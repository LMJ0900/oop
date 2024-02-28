package controller;

import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController  {

    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");

        return auth.join(sc);
    }

    public String login() {
        return auth.login();
    }

    public String addMembers() {
        auth.addMembers();
        return "";
    }

    public MemberDto findUser(Scanner sc) {
        System.out.println("검색할 id 입력 : ");
        return auth.findMember(sc.next());
    }
    public Map<String, MemberDto> getMemberMap(){
        return auth.getMemberMap();
    }

    public String count() {
        System.out.println("회원수 :" +auth.count()+" 명");
         return auth.count();
    }
}
