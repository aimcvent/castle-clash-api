package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerSpawnEvent extends PlayerEvent {
    public PlayerSpawnEvent(Player player) {
        super(player);
    }
}
