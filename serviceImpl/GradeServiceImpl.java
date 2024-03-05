package serviceImpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return  instance;
    }
    @Override
    public int getTotalScore(Subject subjects) {
        int kor = subjects.getKorean();
        int english = subjects.getEnglish();
        int math = subjects.getMath();
        int score = 0;
        score = kor + english + math;

        return score;

    }


    @Override
    public double findAverage(int totalScore) {
        int av = (totalScore)/3;
        return av;
    }
}