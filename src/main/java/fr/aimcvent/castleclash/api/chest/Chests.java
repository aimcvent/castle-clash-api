package fr.aimcvent.castleclash.api.chest;

import fr.aimcvent.castleclash.api.player.Player;

import java.util.List;

public interface Chests {
    List<Chest> all();

    int count();

    List<Reward> rewards();

    void register(Chest chest);

    void unregister(Chest chest);

    void register(Reward reward);

    void unregister(Reward reward);

    void open(Player player, Chest chest);
}
