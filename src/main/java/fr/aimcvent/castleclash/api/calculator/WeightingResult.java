package fr.aimcvent.castleclash.api.calculator;

import fr.aimcvent.castleclash.api.player.Player;

import java.util.Optional;

public interface WeightingResult extends Result {
    Optional<Player> player();
}
