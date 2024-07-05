package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.zone.Zone;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class PreExitZonePlayerEvent extends ZonePlayerEvent implements CancellableEvent {
    private boolean cancelled;

    public PreExitZonePlayerEvent(Player player, Zone zone) {
        super(player, zone);
    }

    @Override
    public boolean cancelled() {
        return this.cancelled;
    }

    @Override
    public void cancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
