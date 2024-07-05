package fr.aimcvent.castleclash.api.event.objective;

import fr.aimcvent.castleclash.api.event.player.PlayerEvent;
import fr.aimcvent.castleclash.api.objective.Objective;
import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class PlayerBreakObjectiveEvent extends PlayerEvent implements CancellableEvent {
    private final Objective objective;
    private boolean cancelled;

    public PlayerBreakObjectiveEvent(Player player, Objective objective) {
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
