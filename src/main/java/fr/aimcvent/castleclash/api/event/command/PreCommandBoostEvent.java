package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class PreCommandBoostEvent implements CancellableEvent {
    private final Player player;
    private final Player boost;

    private boolean cancelled;

    public PreCommandBoostEvent(Player player, Player boost) {
        this.player = player;
        this.boost = boost;
    }

    public Player player() {
        return this.player;
    }

    public Player boost() {
        return this.boost;
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
