package fr.aimcvent.castleclash.api.chest;

import org.bukkit.Location;

public interface Chest {
    Location location();

    void spawn();

    void destroy();
}
