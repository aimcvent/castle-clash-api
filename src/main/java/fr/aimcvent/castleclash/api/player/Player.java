package fr.aimcvent.castleclash.api.player;

import fr.aimcvent.castleclash.api.player.statistic.Statistics;
import fr.aimcvent.castleclash.api.role.Role;
import fr.aimcvent.castleclash.api.zone.Zone;

import java.util.Optional;
import java.util.UUID;

public interface Player {
    UUID id();

    String name();

    String displayName();

    Optional<org.bukkit.entity.Player> bukkit();

    fr.aimcvent.player.api.Player aimcvent();

    Team team();

    Optional<Role> role();

    Optional<Zone> zone();

    boolean death();

    boolean eliminate();

    void sendTitle(String title, String subtitle, int fadeIn, int appear, int fadeOut);

    Statistics statistics();
}
