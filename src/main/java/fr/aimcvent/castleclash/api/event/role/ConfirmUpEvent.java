package fr.aimcvent.castleclash.api.event.role;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.Event;

public class ConfirmUpEvent implements Event {
    private final Player player;
    private final Player up;

    public ConfirmUpEvent(Player player, Player up) {
        this.player = player;
        this.up = up;
    }

    public Player player() {
        return this.player;
    }

    public Player up() {
        return this.up;
    }
}