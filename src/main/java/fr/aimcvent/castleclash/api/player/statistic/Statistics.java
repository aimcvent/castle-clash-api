package fr.aimcvent.castleclash.api.player.statistic;

public interface Statistics {
    Counter kills();

    Counter deaths();

    Counter gamePlayed();

    Assists assists();

    KDA kda();

    Elo elo();

    Counter obsidianBreak();
}
