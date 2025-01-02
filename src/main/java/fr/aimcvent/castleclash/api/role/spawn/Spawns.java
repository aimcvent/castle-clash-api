package fr.aimcvent.castleclash.api.role.spawn;

import fr.aimcvent.castleclash.api.role.RoleCollection;
import org.bukkit.Location;

public interface Spawns extends RoleCollection<Spawn> {

    Location teleport();
}
