package controller;

import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class MemberController {

    private  Map<String, MemberDto> users;

    public MemberController() {
        this.users = new HashMap<>();
    }

    public String addUsers(){
        AuthService auth = AuthServiceImpl.getInstance();
        auth.addUsers();
        return  "";
    }

    public void findUser(String username){
            System.out.println(users.get(username).toString());
    }
}
