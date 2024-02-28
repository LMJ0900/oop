package serviceImpl;

import builder.MemberBuilder;
import model.MemberDto;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements service.AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, MemberDto> members;

    private AuthServiceImpl() {
        this.members = new HashMap<>();
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");

        MemberDto person = new MemberBuilder()
                .id(sc.next(sc.next()))
                .pw(sc.next(sc.next()))
                .pwAgain(sc.next())
                .name(sc.next())
                .personId(sc.nextInt())
                .phoneNumber(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .build();
        return null;
    }

    @Override
    public String login() {
        return null;
    }


    @Override
    public MemberDto findMember(String memberName) {
        MemberDto member = new MemberBuilder().build();

        return member;
    }

    @Override
    public Map<String, MemberDto> getMemberMap() {
        members.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return members;
    }

    @Override
    public String addMembers() {
        Map<String, MemberDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String memberName = UtilServiceImpl.getInstance().createRandomMemberName();
            map.put(memberName,
                    new MemberBuilder()
                            .id(memberName)
                            .pw("1")
                            .pwAgain("1")
                            .name(util.createRandomName())
                            .build());

        }
        members = map;
        return "더미값 추가";
    }


    public String count(){
        return members.size()+"";
    }
}
