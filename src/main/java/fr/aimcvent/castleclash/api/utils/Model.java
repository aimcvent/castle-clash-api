package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.player.Player;

public interface Model<T> {
    String identifier();

    T create(Player player);
}
