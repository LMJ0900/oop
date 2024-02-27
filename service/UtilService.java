package service;

public interface UtilService {
    int createRandomInteger(int start, int gapBetweenStartAndEnd);
    double createRandomDouble(int start, int gapBetweenStartAndEnd);
    String createRandomName();
    String createRandomTitle();
    String createRandomContent();
    String createRandomCompany();

    String createRandomPno();

    String createRandomUserName();

    char createRandomInt(int i, int i1);
}
