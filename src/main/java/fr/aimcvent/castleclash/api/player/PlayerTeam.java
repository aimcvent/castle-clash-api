package fr.aimcvent.castleclash.api.player;

import fr.aimcvent.castleclash.api.team.Team;

import java.util.Optional;

public interface PlayerTeam {
    Optional<Team> of();

    org.bukkit.scoreboard.Team bukkit();
}
