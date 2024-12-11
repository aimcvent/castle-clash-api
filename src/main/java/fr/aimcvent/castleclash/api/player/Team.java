package fr.aimcvent.castleclash.api.player;

import java.util.Optional;

public interface Team {
    Optional<fr.aimcvent.castleclash.api.team.Team> of();

    org.bukkit.scoreboard.Team bukkit();

    void applyElo();
}
