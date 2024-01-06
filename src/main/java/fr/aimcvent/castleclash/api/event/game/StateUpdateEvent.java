package fr.aimcvent.castleclash.api.event.game;

import fr.aimcvent.castleclash.api.utils.State;
import fr.aimcvent.kernel.api.event.Event;

public class StateUpdateEvent implements Event {
    private final State state;

    public StateUpdateEvent(State state) {
        this.state = state;
    }

    public State state() {
        return this.state;
    }
}
