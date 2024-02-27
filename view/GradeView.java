package view;

import builder.MemberBuilder;
import builder.SubjectBuilder;
import model.MemberDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {

        System.out.println("다음은 학생의 이름, 국어, 영어, 수학 점수를 입력하세요");
        System.out.println("평균값 :");

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        MemberDto Student = new MemberBuilder()
                .name(sc.next())
                .build();
        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        int totalScore = grade.getTotalScore(subjects);
        int average =  grade.findAverage(totalScore);

        System.out.printf(" =========== 성적표 ==========\n 국어" +
                        " Korean : %s \n" +
                        "English : %s \n" +
                        "Math %s \n " +
                        "Total : %s \n " +
                        "Average : %s",
                subjects.getKor(),
                subjects.getEnglish(),
                subjects.getMath(),
                totalScore,
                average);

    }
}
