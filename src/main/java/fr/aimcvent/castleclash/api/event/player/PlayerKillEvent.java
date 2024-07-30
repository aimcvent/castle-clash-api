package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerKillEvent extends PlayerEvent {
    private final Player killed;
    public PlayerKillEvent(Player player, Player killed) {
        super(player);
        this.killed = killed;
    }

    public Player killed() {
        return this.killed;
    }
}
