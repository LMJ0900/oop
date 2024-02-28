package service;

import model.MemberDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login();

    Map<String, MemberDto> getMemberMap();

    String addMembers();

    MemberDto findMember(String memberName);
    String count();
}