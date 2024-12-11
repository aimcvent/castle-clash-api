package fr.aimcvent.castleclash.api.event.role;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.Event;

public class ConfirmBoostEvent implements Event {
    private final Player player;
    private final Player boost;

    public ConfirmBoostEvent(Player player, Player boost) {
        this.player = player;
        this.boost = boost;
    }

    public Player player() {
        return this.player;
    }

    public Player boost() {
        return this.boost;
    }
}