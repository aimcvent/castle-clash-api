package fr.aimcvent.castleclash.api.chest;

import fr.aimcvent.castleclash.api.player.Player;
import org.bukkit.Location;

import java.util.List;
import java.util.Optional;

public interface Chests {
    List<Chest> all();

    Optional<Chest> of(Location location);

    int count();

    List<Reward> rewards();

    void register(Chest chest);

    void unregister(Chest chest);

    void register(Reward reward);

    void unregister(Reward reward);

    void open(Player player, Chest chest);
}
