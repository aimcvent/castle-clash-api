package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.objective.Objective;
import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class PlayerBreakObjectifEvent extends PlayerEvent implements CancellableEvent {
    private final Objective objective;
    private boolean cancelled;

    public PlayerBreakObjectifEvent(Player player, Objective objective) {
        super(player);
        this.objective = objective;
    }

    public Objective objective() {
        return this.objective;
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
