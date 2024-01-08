package fr.aimcvent.castleclash.api;

import fr.aimcvent.castleclash.api.player.Players;
import fr.aimcvent.castleclash.api.team.Teams;
import fr.aimcvent.castleclash.api.utils.Informations;
import fr.aimcvent.castleclash.api.utils.Inventories;
import fr.aimcvent.castleclash.api.utils.Locations;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.WithSettings;

public interface CastleClashService extends Service, WithConfiguration, WithSettings {
    Players players();

    Teams teams();

    Locations locations();

    Informations informations();

    Inventories inventories();
}
