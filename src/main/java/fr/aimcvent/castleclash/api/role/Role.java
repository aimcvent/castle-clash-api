package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.effect.Effects;
import fr.aimcvent.castleclash.api.role.handler.Handlers;
import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.castleclash.api.role.spawn.Spawns;
import fr.aimcvent.castleclash.api.role.victory.Victories;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;
import fr.aimcvent.kernel.api.translation.Translator;

public interface Role {
    Service service();

    RoleModel model();

    String identifier();

    Player player();

    Translator name();

    String name(Translation translation);

    Translator description();

    String description(Translation translation);

    boolean solidarity();

    boolean solo();

    Spawns spawns();

    Handlers handlers();

    RoleSettings settings();

    RoleInventory inventory();

    Effects effects();

    Victories victories();
}
