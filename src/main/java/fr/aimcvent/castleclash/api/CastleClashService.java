package fr.aimcvent.castleclash.api;

import fr.aimcvent.castleclash.api.player.Players;
import fr.aimcvent.castleclash.api.utils.Informations;
import fr.aimcvent.castleclash.api.utils.Locations;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.WithSettings;

public interface CastleClashService extends Service, WithConfiguration, WithSettings {
    Players players();

    Locations locations();

    Informations informations();
}
