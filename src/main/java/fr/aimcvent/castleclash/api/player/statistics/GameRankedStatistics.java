package fr.aimcvent.castleclash.api.player.statistics;

import fr.aimcvent.castleclash.api.calculator.EloResult;

import java.util.Optional;

public interface GameRankedStatistics extends GameStatistics {
    Optional<EloResult> eloResult();
}
