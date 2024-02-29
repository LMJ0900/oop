package serviceImpl;

import model.SubjectDto;
import service.GradeService;

public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return  instance;
    }
    @Override
    public int getTotalScore(SubjectDto subjects) {
        int kor = subjects.getKor();
        int english = subjects.getEnglish();
        int math = subjects.getMath();
        int score = 0;
        score = kor + english + math;

        return score;

    }


    @Override
    public int findAverage(int totalScore) {
        int av = (totalScore)/3;
        return av;
    }
}