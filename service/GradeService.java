package service;

import model.SubjectDto;

public interface GradeService {
    int getTotalScore(SubjectDto subjects);

    int findAverage(int totalScore);
}
