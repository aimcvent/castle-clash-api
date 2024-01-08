package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerUnloadEvent extends PlayerEvent {
    public PlayerUnloadEvent(Player player) {
        super(player);
    }
}
