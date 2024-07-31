package fr.aimcvent.castleclash.api.event.objective;

import fr.aimcvent.castleclash.api.objective.Objective;
import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.Event;

public class PostBreakObjectiveEvent implements Event {
    private final Objective objective;
    private final Player player;

    public PostBreakObjectiveEvent(Objective objective, Player player) {
        this.objective = objective;
        this.player = player;
    }

    public Objective objective() {
        return this.objective;
    }

    public Player player() {
        return this.player;
    }
}
