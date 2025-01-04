package fr.aimcvent.castleclash.api.player.assists;

import fr.aimcvent.castleclash.api.player.Player;

public interface Assist {
    Player player();

    double damage();

    long lastDamageAt();

    boolean valid();
}
