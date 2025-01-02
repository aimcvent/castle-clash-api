package fr.aimcvent.castleclash.api;

import fr.aimcvent.castleclash.api.allow.AllowList;
import fr.aimcvent.castleclash.api.calculator.Calculators;
import fr.aimcvent.castleclash.api.chest.Chests;
import fr.aimcvent.castleclash.api.competition.Competition;
import fr.aimcvent.castleclash.api.hotbar.Hotbar;
import fr.aimcvent.castleclash.api.objective.Objectives;
import fr.aimcvent.castleclash.api.player.Players;
import fr.aimcvent.castleclash.api.role.Roles;
import fr.aimcvent.castleclash.api.role.handler.Handler;
import fr.aimcvent.castleclash.api.role.model.VictoryCollectionModel;
import fr.aimcvent.castleclash.api.role.spawn.Spawn;
import fr.aimcvent.castleclash.api.role.model.handler.HandlerModel;
import fr.aimcvent.castleclash.api.role.model.CollectionModel;
import fr.aimcvent.castleclash.api.role.model.spawn.SpawnModel;
import fr.aimcvent.castleclash.api.serializer.SettingSerializers;
import fr.aimcvent.castleclash.api.team.Teams;
import fr.aimcvent.castleclash.api.teleport.Teleports;
import fr.aimcvent.castleclash.api.utils.*;
import fr.aimcvent.castleclash.api.zone.Zones;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.WithSettings;

import java.util.Random;

public interface CastleClashService extends Service, WithConfiguration, WithSettings {
    String version();

    Players players();

    Teams teams();

    World world();

    Informations informations();

    Inventories inventories();

    Roles roles();

    Text text();

    CollectionModel<HandlerModel, Handler<?>> handlers();

    VictoryCollectionModel victories();

    CollectionModel<SpawnModel, Spawn> spawns();

    Objectives objectives();

    Chests chests();

    Zones zones();

    AllowList allow();

    SettingSerializers serializers();

    Competition competition();

    Teleports teleports();

    Random random();

    Hotbar hotbar();

    Calculators calculators();

    Statistics statistics();
}
