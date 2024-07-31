package fr.aimcvent.castleclash.api.player.statistic;

import fr.aimcvent.castleclash.api.player.Player;

public interface Assist {
    Player player();

    int damage();

    int life();

    long lastDamageAt();

    boolean valid();
}
