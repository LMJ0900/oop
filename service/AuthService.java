package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login();

    Map<String, Member> getMemberMap();

    String addMembers();

    Member findMember(String memberName);
    String count();
}