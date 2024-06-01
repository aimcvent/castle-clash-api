package fr.aimcvent.castleclash.api.team;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.model.RoleModel;

import java.util.List;
import java.util.Optional;

public interface Teams {
    List<Team> all();

    List<Team> allWithoutRole();

    Optional<Team> of(String name);

    Optional<Team> of(RoleModel roleModel);

    Team spectator();

    int count();

    int countWithoutRole();

    void register(Team team);

    boolean join(Team team, Player player);

    boolean leave(Player player);
}
