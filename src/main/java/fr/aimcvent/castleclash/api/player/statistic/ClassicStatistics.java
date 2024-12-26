package fr.aimcvent.castleclash.api.player.statistic;

public interface ClassicStatistics {
    Counter kills();

    Counter deaths();

    Counter gamePlayed();

    Assists assists();

    KDA kda();

    Counter obsidianBreak();
}
