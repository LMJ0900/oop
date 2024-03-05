package view;

import model.Member;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {

    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        Member person = Member.builder()
                .height(util.createRandomDouble(100,200))
                .weight(util.createRandomDouble(50,100))
                .build();
        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi =kaup.createBmi(person);

        String bodymass = kaup.createBodyMass(bmi);

        System.out.printf(" ------bmi계산기------\n" +
                        "키 : %.1f \n" +
                        "몸무게 : %.1f \n"+
                        "bmi : %.2s \n" +
                        "체질량 : %s\n" +
                        "------------",
                person.getHeight(),person.getWeight(),bmi,bodymass);

    }
}