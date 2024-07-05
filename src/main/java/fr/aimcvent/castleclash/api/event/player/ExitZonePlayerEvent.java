package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.zone.Zone;

public class ExitZonePlayerEvent extends ZonePlayerEvent {
    public ExitZonePlayerEvent(Player player, Zone zone) {
        super(player, zone);
    }
}
