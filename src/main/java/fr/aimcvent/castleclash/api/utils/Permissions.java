package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.player.api.rank.Permission;

public enum Permissions implements Permission {
    COMMAND_BROADCAST("command.broadcast"),
    COMMAND_DEBUG("command.debug"),
    COMMAND_HOST("command.host"),
    COMMAND_SETTINGS("command.settings", true),
    COMMAND_START("command.start", true),
    COMMAND_MANAGE_TEAM("command.manage.team", true),

    INVENTORY_MANAGE_ELO("inventory.manage.elo"),
    INVENTORY_TEAM_JOIN_SPECTATOR("inventory.team.join.spectator", true),

    UNKNOWN("unknown");

    private final String permission;
    private final boolean host;

    Permissions(String permission) {
        this(permission, false);
    }

    Permissions(String permission, boolean host) {
        this.permission = "castle-clash." + permission;
        this.host = host;
    }

    public boolean host() {
        return this.host;
    }

    @Override
    public String of() {
        return this.permission;
    }

    public static Permissions of(String permission) {
        for (Permissions permissions : Permissions.values()) {
            if (permissions.permission.equalsIgnoreCase(permission)) {
                return permissions;
            }
        }
        return Permissions.UNKNOWN;
    }
}
