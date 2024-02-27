package serviceImpl;

import model.MemberDto;
import service.KaupService;

import java.awt.desktop.AboutEvent;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){}

    public static KaupService getInstance (){
        return instance;
    }

    @Override
    public String createBmi(MemberDto user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi =0.0;
        bmi = (weight/(height*height)*10000);

        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double bmiDouble = Double.parseDouble(bmi);
        String result ="";
        if(bmiDouble<18.5){
            result = "저체중";
        }else if(18.5<=bmiDouble && bmiDouble<=23){
            result = "정상";
        }else if(23<bmiDouble && bmiDouble<25){
            result="과체중";
        }else {
            result="비만";
        }
        return result;
    }
}