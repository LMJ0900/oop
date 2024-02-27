package service;

import model.MemberDto;

public interface KaupService {
    String createBmi(MemberDto user);
    String createBodyMass(String bmi);




}