package fr.aimcvent.castleclash.api.event.role;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.Role;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class RevealRoleEvent implements CancellableEvent {
    private final Player player;
    private final Role role;

    private boolean cancelled;

    public RevealRoleEvent(Player player, Role role) {
        this.player = player;
        this.role = role;
    }

    public Player player() {
        return this.player;
    }

    public Role role() {
        return this.role;
    }

    @Override
    public boolean cancelled() {
        return this.cancelled;
    }

    @Override
    public void cancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
