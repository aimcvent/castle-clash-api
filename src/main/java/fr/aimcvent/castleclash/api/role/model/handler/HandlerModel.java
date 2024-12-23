package fr.aimcvent.castleclash.api.role.model.handler;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.handler.Handler;
import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.castleclash.api.utils.LoadSettingModel;

import java.util.ArrayList;
import java.util.List;

public interface HandlerModel extends LoadSettingModel<Handler<?>> {
    default List<Handler<?>> create(Player player, RoleModel roleModel) {
        return null;
    }
}
