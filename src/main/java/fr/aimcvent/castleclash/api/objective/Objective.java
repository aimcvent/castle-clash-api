package fr.aimcvent.castleclash.api.objective;

import fr.aimcvent.castleclash.api.team.Team;
import org.bukkit.Location;

public interface Objective {
    int identifier();

    Team team();

    String teamName();

    Location location();

    boolean broke();

    boolean placed();

    long destroyedAt();
}
