package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.player.Player;

import java.util.List;

public interface Model<T> {
    String identifier();

    List<T> create(Player player);
}
