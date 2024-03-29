package serviceImpl;

import model.Member;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements service.AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, Member> members;
    List<Member> memberlist;



    private AuthServiceImpl() {

        this.members = new HashMap<>();
        this.memberlist = new ArrayList<>() {
        };
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");

        Member person = Member.builder()
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
    public Member findMember(String memberName) {
        Member member = Member.builder().build();

        return member;
    }

    @Override
    public Map<String, Member> getMemberMap() {
        members.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return members;
    }

    @Override
    public String addMembers() {
        Map<String, Member> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String memberName = UtilServiceImpl.getInstance().createRandomMemberName();
            map.put(memberName,
                    Member.builder()
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