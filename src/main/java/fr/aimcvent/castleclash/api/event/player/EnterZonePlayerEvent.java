package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.zone.Zone;

public class EnterZonePlayerEvent extends ZonePlayerEvent {
    private boolean broadcast = true;

    public EnterZonePlayerEvent(Player player, Zone zone) {
        super(player, zone);
    }

    public boolean broadcast() {
        return this.broadcast;
    }

    public void broadcast(boolean broadcast) {
        this.broadcast = broadcast;
    }
}
