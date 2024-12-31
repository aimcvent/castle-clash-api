package fr.aimcvent.castleclash.api.player.assists;

import fr.aimcvent.castleclash.api.player.Player;

import java.util.List;
import java.util.Optional;

public interface Assists {
    List<Assist> all();

    Optional<Assist> of(Player player);

    void add(Assist assist);

    void remove(Player player);

    void clear();
}
