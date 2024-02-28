package service;

import model.MemberDto;

import java.util.List;
import java.util.Map;

public interface MemberService {
    String join(MemberDto member);
    String login(MemberDto member);
    MemberDto detail(String memberName);

    void updatePassword(MemberDto member);

    String deleteMember(String memberName);

    Map<String, MemberDto> getMemberMap();

    List<MemberDto> findUsersByName(String Name);
    List<MemberDto> findUsersByJob(String job);

    int countMembers();

    String addMembers();
}
