package serviceImpl;

import model.Member;
import service.MemberService;
import service.UtilService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
    private static MemberService instance = new MemberServiceImpl();

    Map<String, Member> members;

    private MemberServiceImpl() {
        this.members = new HashMap<>();
    }

    public static MemberService getInstance() {
        return instance;
    }


    @Override
    public String join(Member member) {
        members.put(member.getId(), member);
        return "회원가입성공";
    }

    @Override
    public String login(Member member) {
        String msg = "";
        Member memberDto = members.get(member.getId());
        if (memberDto==null){
            msg = "아이디가 틀렸습니다.";
        }else if (memberDto.getPw().equals(member.getPw())){
            msg = "로그인 성공";
        }else {
            msg = "비밀번호가 틀렸습니다.";
        }
        return msg;
    }

    @Override
    public Member detail(String memberName) {
        return null;
    }

    @Override
    public String updatePassword(String id, String updatePw) {
        String msg = "";
        Member memberDto = members.get(id);
        if (memberDto==null){
            msg = "아이디가 틀렸습니다.";
        }else {
            memberDto.setPw(updatePw);
            msg = "비밀번호 변경 완료";
        }
        return msg;

    }

    @Override
    public String deleteMember(String memberName) {
        members.remove(memberName);
        return null;
    }

    @Override
    public Map <String, Member> getMemberMap() {
        /*Map<String, MemberDto> members = memberController.getMemberMap();*/
        /*members.forEach((k,v)-> {
            System.out.printf("아이디 : %s, 회원정보: %s\n", k, v);
        });*/
        return members;
    }

    @Override
    public List<Member> findUsersByName(String Name) {
        return null;
    }

    @Override
    public List<Member> findUsersByJob(String job) {
        return null;
    }


    @Override
    public String countMembers() {return members.size()+"";
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
        return members.size()+" 개 더미값 추가";
    }
}