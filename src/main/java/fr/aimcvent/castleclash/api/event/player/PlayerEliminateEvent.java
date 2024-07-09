package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Optional;

public class PlayerEliminateEvent extends PlayerEvent {

    private final Player killer;
    private final EntityDamageEvent.DamageCause cause;

    public PlayerEliminateEvent(Player player, EntityDamageEvent.DamageCause cause) {
        this(player, null, cause);
    }

    public PlayerEliminateEvent(Player player, Player killer, EntityDamageEvent.DamageCause cause) {
        super(player);
        this.killer = killer;
        this.cause = cause;
    }

    public Optional<Player> killer() {
        return Optional.ofNullable(this.killer);
    }

    public EntityDamageEvent.DamageCause cause() {
        return this.cause;
    }
}
