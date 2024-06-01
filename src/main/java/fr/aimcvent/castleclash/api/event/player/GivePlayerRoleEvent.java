package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.Role;

public class GivePlayerRoleEvent extends PlayerEvent {
    private final Role role;

    public GivePlayerRoleEvent(Player player, Role role) {
        super(player);
        this.role = role;
    }

    public Role role() {
        return this.role;
    }
}
