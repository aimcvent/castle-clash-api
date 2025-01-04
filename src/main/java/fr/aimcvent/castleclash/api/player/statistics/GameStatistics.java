package fr.aimcvent.castleclash.api.player.statistics;

public interface GameStatistics extends Statistics {
    boolean victory();

    void setVictory(boolean victory);
}
