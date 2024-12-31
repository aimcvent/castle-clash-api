package fr.aimcvent.castleclash.api.player.statistics;

import fr.aimcvent.castleclash.api.calculator.Result;

import java.util.Optional;

public interface GameRankedStatistics extends GameStatistics {
    Optional<Result> eloResult();
}
