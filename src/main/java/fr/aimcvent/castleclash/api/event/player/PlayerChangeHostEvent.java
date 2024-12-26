package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerChangeHostEvent extends PlayerEvent {

    private final Player last;

    public PlayerChangeHostEvent(Player player, Player last) {
        super(player);
        this.last = last;
    }

    public Player last() {
        return this.last;
    }
}
