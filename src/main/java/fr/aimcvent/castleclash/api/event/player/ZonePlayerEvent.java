package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.zone.Zone;

public abstract class ZonePlayerEvent extends PlayerEvent {
    private final Zone zone;

    protected ZonePlayerEvent(Player player, Zone zone) {
        super(player);
        this.zone = zone;
    }

    public Zone zone() {
        return this.zone;
    }
}
