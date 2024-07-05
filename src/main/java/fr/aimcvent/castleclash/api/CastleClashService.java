package fr.aimcvent.castleclash.api;

import fr.aimcvent.castleclash.api.chest.Chests;
import fr.aimcvent.castleclash.api.objective.Objectives;
import fr.aimcvent.castleclash.api.player.Players;
import fr.aimcvent.castleclash.api.role.Handler;
import fr.aimcvent.castleclash.api.role.Roles;
import fr.aimcvent.castleclash.api.role.spawn.Spawn;
import fr.aimcvent.castleclash.api.role.Victory;
import fr.aimcvent.castleclash.api.role.model.handler.HandlerModel;
import fr.aimcvent.castleclash.api.role.model.CollectionModel;
import fr.aimcvent.castleclash.api.role.model.spawn.SpawnModel;
import fr.aimcvent.castleclash.api.role.model.victory.VictoryModel;
import fr.aimcvent.castleclash.api.team.Teams;
import fr.aimcvent.castleclash.api.utils.*;
import fr.aimcvent.castleclash.api.zone.Zones;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.WithSettings;

public interface CastleClashService extends Service, WithConfiguration, WithSettings {
    Players players();

    Teams teams();

    Locations locations();

    Informations informations();

    Inventories inventories();

    Roles roles();

    Text text();

    CollectionModel<HandlerModel, Handler> handlers();

    CollectionModel<VictoryModel, Victory> victories();

    CollectionModel<SpawnModel, Spawn> spawns();

    Objectives objectives();

    Chests chests();

    Zones zones();

    MaterialAllowed materialAllowed();
}
