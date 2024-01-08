package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.Event;

public abstract class PlayerEvent implements Event {
    private final Player player;

    protected PlayerEvent(Player player) {
        this.player = player;
    }

    public Player player() {
        return this.player;
    }
}
