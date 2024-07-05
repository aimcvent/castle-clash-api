package fr.aimcvent.castleclash.api.event.objective;

import fr.aimcvent.castleclash.api.objective.Objective;
import fr.aimcvent.kernel.api.event.Event;

public class PostBreakObjectiveEvent implements Event {
    private final Objective objective;

    public PostBreakObjectiveEvent(Objective objective) {
        this.objective = objective;
    }

    public Objective objective() {
        return this.objective;
    }
}
