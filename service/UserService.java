package service;

import model.MemberDto;

import java.util.List;

public interface UserService {
    String join(MemberDto user);
    String login(MemberDto user);
    MemberDto detail(String username);

    void updatePassword(MemberDto user);
    String deleteUser(String username);
    List<MemberDto> getUserList();

    List<MemberDto> findUsersByName(String Name);
    List<MemberDto> findUsersByJob(String job);
    int countUsers();
}
