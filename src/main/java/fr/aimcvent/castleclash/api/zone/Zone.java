package fr.aimcvent.castleclash.api.zone;

import fr.aimcvent.castleclash.api.team.Team;
import fr.aimcvent.castleclash.api.utils.DistanceArrow;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.Location;
import org.bukkit.Material;

import java.util.Optional;

public interface Zone {

    Optional<Team> team();

    String name(Translation translation);

    String displayName(Translation translation);

    Location center();

    boolean in(Location location);

    DistanceArrow distanceOf(Location location);

    boolean allowed(Material material);

    boolean water();

    boolean lava();

    boolean spreading();
}
