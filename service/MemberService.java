package service;

import model.Member;

import java.util.List;
import java.util.Map;

public interface MemberService {
    String join(Member member);
    String login(Member member);
    Member detail(String memberName);

    String updatePassword(String memberName, String updatePw);

    String deleteMember(String memberName);

    Map<String, Member> getMemberMap();

    List<?> findUsersByName(String Name);
    List<Member> findUsersByJob(String job);

    String countMembers();

    String addMembers();
}
