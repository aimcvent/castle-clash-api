package fr.aimcvent.castleclash.api.competition;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.castleclash.api.team.Team;

import java.util.List;
import java.util.Optional;

public interface Competition {
    boolean active();

    List<Player> of(RoleModel roleModel);

    List<Player> of(Team team, RoleModel roleModel);

    Optional<RoleModel> of(Player player);

    boolean select(Player player, RoleModel roleModel);

    void unselect(Player player);

    void clear();
}
