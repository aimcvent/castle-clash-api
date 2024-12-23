package fr.aimcvent.castleclash.api.teleport;

import org.bukkit.Location;

import java.util.List;
import java.util.Optional;

public interface Teleports {
    List<Teleport> all();

    Optional<Teleport> of(Location from);

    void register(Teleport teleport);
}
