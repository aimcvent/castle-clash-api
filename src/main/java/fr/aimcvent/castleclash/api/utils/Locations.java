package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.kernel.api.configuration.Configuration;
import org.bukkit.Location;

import java.util.Map;

public interface Locations {

    Location spawn();

    Location parse(Configuration configuration, String path);

    Location parse(Map<String, Object> locationMap);
}
