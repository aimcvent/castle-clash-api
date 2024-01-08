package fr.aimcvent.castleclash.api.team;

import fr.aimcvent.castleclash.api.player.Player;

import java.util.List;

public interface Teams {
    List<Team> all();

    Team spectator();

    Team traitor();

    int count();

    void register(Team team);

    boolean join(Team team, Player player);

    boolean leave(Player player);
}
