package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerAssistEvent extends PlayerEvent {
    private final Player assisted;
    public PlayerAssistEvent(Player player, Player assisted) {
        super(player);
        this.assisted = assisted;
    }

    public Player assisted() {
        return this.assisted;
    }
}
