package fr.aimcvent.castleclash.api.objective;

import fr.aimcvent.castleclash.api.team.Team;
import org.bukkit.Location;

import java.util.List;
import java.util.Optional;

public interface Objectives {
    List<Objective> all();

    List<Objective> all(Team team);

    List<Objective> all(int identifier);

    Optional<Objective> of(Location location);

    int maxPerTeam();

    void place(Objective objective);

    void broke(Objective objective);
}
