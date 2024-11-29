package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.event.game.VictoryEvent;

import java.util.Optional;

public interface Informations {
    State state();

    boolean damage();

    long time();

    Nycthemer nycthemer();

    Optional<VictoryEvent> victory();

    TopBoard killers();

    TopBoard assists();

    TopBoard obsidians();

    boolean deathMatch();
}
