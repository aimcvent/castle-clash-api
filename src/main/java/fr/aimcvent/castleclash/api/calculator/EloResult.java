package fr.aimcvent.castleclash.api.calculator;

public interface EloResult extends Result {
    double averageTeam();
    double averageOpponents();
    double winRate();

    double bonusObjectives();
    double bonusKDA();
    double bonusDDT();
    double bonusTeam();

    double developmentFactorBase();
    double developmentFactorReal();
    double performanceFactor();

    double resultDevelopmentFactor();
    double resultPerformanceFactor();

    double earnings();
}
