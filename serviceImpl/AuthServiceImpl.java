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

    Map<String, MemberDto> users;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
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
    public MemberDto findUser(String username) {
        MemberDto user = new MemberBuilder().build();

        return user;
    }

    @Override
    public Map<String, MemberDto> getUserMap() {
        users.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String addUsers() {
        Map<String, MemberDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String userName = UtilServiceImpl.getInstance().createRandomUserName();
            map.put(userName,
                    new MemberBuilder()
                            .username(userName)
                            .pw("1")
                            .pwAgain("1")
                            .name(util.createRandomName())
                            .build());

        }
        users = map;
        return "더미값 추가";
    }
    public String count(){
        return users.size()+"";
    }
}
