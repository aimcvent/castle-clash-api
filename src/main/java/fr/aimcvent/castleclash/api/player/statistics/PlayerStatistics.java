package fr.aimcvent.castleclash.api.player.statistics;

import java.util.Optional;

public interface PlayerStatistics {
    SimpleStatistics classic();

    RankedStatistics ranked();

    Optional<GameStatistics> game();

    void set(GameStatistics gameStatistics);
}
