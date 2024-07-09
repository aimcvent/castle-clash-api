package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.Eliminate;
import fr.aimcvent.kernel.api.event.CancellableEvent;
import org.bukkit.Location;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Optional;

public class PlayerDeathEvent extends PlayerEvent implements CancellableEvent {
    private final EntityDamageEvent.DamageCause cause;
    private final Player killer;

    private boolean cancelled;

    private Eliminate eliminate;

    public PlayerDeathEvent(
        Player player,
        Location location,
        EntityDamageEvent.DamageCause cause,
        Eliminate eliminate
    ) {
        this(player, null, location, cause, eliminate);
    }

    public PlayerDeathEvent(
        Player player,
        Player killer,
        Location location,
        EntityDamageEvent.DamageCause cause,
        Eliminate eliminate
    ) {
        super(player);
        this.killer = killer;
        this.cause = cause;
        this.eliminate = eliminate;
    }

    public Optional<Player> killer() {
        return Optional.ofNullable(this.killer);
    }

    public EntityDamageEvent.DamageCause cause() {
        return this.cause;
    }

    @Override
    public boolean cancelled() {
        return this.cancelled;
    }

    @Override
    public void cancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Eliminate eliminate() {
        return this.eliminate;
    }

    public void eliminate(Eliminate eliminate) {
        this.eliminate = eliminate;
    }
}
