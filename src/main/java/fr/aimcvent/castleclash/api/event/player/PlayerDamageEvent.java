package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDamageEvent extends PlayerEvent {
    private final EntityDamageEvent origin;

    public PlayerDamageEvent(Player player, EntityDamageEvent origin) {
        super(player);
        this.origin = origin;
    }

    public EntityDamageEvent origin() {
        return this.origin;
    }
}
