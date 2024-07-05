package fr.aimcvent.castleclash.api.zone;

import fr.aimcvent.castleclash.api.team.Team;
import fr.aimcvent.castleclash.api.utils.DistanceArrow;
import org.bukkit.Location;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Zones {

    List<Zone> all();

    List<Zone> of(Team team);

    Optional<Zone> of(Location location);

    DistanceArrow distanceOf(Team team, Location location);

    Zones register(String type, Class<? extends Zone> clazz);

    Zone register(String type, Map<String, Object> zoneConfiguration);
}
