package fr.aimcvent.castleclash.api.role.spawn;

import org.bukkit.Location;

public interface Spawn {
    String identifier();

    Location teleport();
}
