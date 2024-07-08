package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import org.bukkit.Location;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDeathEvent extends PlayerEvent {
    private final EntityDamageEvent.DamageCause cause;
    private final Player killer;

    public PlayerDeathEvent(Player player, Location location, EntityDamageEvent.DamageCause cause) {
        this(player, null, location, cause);
    }

    public PlayerDeathEvent(Player player, Player killer, Location location, EntityDamageEvent.DamageCause cause) {
        super(player);
        this.killer = killer;
        this.cause = cause;
    }

    public Player killer() {
        return this.killer;
    }

    public EntityDamageEvent.DamageCause cause() {
        return this.cause;
    }
}
