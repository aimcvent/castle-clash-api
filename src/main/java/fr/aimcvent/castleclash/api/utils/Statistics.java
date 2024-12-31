package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.player.Player;

public interface Statistics {
    void load(Player player);

    void update(Player player);

    void persist(Player player);
}
