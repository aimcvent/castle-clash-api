package fr.aimcvent.castleclash.api.event.game;

import fr.aimcvent.kernel.api.event.Event;

public class UpdateTimeEvent implements Event {
    private final long time;

    public UpdateTimeEvent(long time) {
        this.time = time;
    }

    public long time() {
        return this.time;
    }
}
