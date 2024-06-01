package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.castleclash.api.role.model.RoleModelBuilder;
import fr.aimcvent.kernel.api.service.Service;

import java.util.List;
import java.util.Optional;

public interface Roles {
    List<RoleModel> models();

    List<RoleModel> models(RoleType roleType);

    Optional<RoleModel> modelOf(String identifier);

    Optional<RoleModel> modelOf(Player player);

    int count();

    RoleModelBuilder builderOf(Service service, String identifier);

    Roles register(RoleModel roleModel);

    void apply(Player player, RoleModel model);

    void send(Player player);
}
