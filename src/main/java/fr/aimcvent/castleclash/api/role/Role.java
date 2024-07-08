package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.spawn.Spawns;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;

public interface Role {
    Service service();

    String identifier();

    Player player();

    String name(Translation translation);

    String description(Translation translation);

    boolean solidarity();

    boolean solo();

    Spawns spawns();

    RoleSettings settings();
}
