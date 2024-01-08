package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerLoadEvent extends PlayerEvent {
    public PlayerLoadEvent(Player player) {
        super(player);
    }
}
