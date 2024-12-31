package fr.aimcvent.castleclash.api.player.statistics;

public interface SimpleStatistics extends Statistics {
    long gamePlayed();

    void addGamePlayed(long gamePlayed);

    long victories();

    void addVictories(long victories);

    long looses();

    void addLooses(long looses);

    double vl();

    TopStatistics top();
}
