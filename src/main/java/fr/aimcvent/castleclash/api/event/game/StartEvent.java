package fr.aimcvent.castleclash.api.event.game;

import fr.aimcvent.kernel.api.event.CancellableEvent;

public class StartEvent implements CancellableEvent {
    private boolean cancelled;

    @Override
    public boolean cancelled() {
        return this.cancelled;
    }

    @Override
    public void cancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
