package fr.aimcvent.castleclash.api.player;

import java.util.Optional;
import java.util.UUID;

public interface Player {
    UUID id();

    String name();

    String displayName();

    Optional<org.bukkit.entity.Player> bukkit();

    fr.aimcvent.player.api.Player aimcvent();

    PlayerTeam team();
}
