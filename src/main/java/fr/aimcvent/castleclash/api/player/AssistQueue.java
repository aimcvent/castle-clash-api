package fr.aimcvent.castleclash.api.player;

import java.util.List;
import java.util.Optional;

public interface AssistQueue {
    List<Assist> all();

    Optional<Assist> of(Player player);

    void add(Player player, int damage, int life);

    void remove(Player player);

    void clear();
}
