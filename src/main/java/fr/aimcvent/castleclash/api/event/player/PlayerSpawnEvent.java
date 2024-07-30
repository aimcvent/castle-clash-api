package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;

public class PlayerSpawnEvent extends PlayerEvent {
    private final SpawnReason reason;

    public PlayerSpawnEvent(Player player, SpawnReason reason) {
        super(player);
        this.reason = reason;
    }

    public SpawnReason reason() {
        return this.reason;
    }

    public enum SpawnReason {
        SPAWN,
        RESPAWN;
    }
}
