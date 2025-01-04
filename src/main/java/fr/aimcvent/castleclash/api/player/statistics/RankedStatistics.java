package fr.aimcvent.castleclash.api.player.statistics;

public interface RankedStatistics extends SimpleStatistics {
    double elo();

    void addElo(double elo);
}
