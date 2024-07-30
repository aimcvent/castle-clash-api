package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.*;
import fr.aimcvent.castleclash.api.role.handler.Handler;
import fr.aimcvent.castleclash.api.role.model.handler.HandlerModel;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleArmorModel;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleInventoryModel;
import fr.aimcvent.castleclash.api.role.model.spawn.SpawnModel;
import fr.aimcvent.castleclash.api.role.model.victory.VictoryModel;
import fr.aimcvent.castleclash.api.role.spawn.Spawn;
import fr.aimcvent.castleclash.api.utils.Countable;
import fr.aimcvent.castleclash.api.utils.Model;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.inventory.ItemStack;

public interface RoleModel extends Model<Role> {
    Service service();

    String name(Translation translation);

    String description(Translation translation);

    ItemStack icon();

    boolean solidarity();

    boolean solo();

    Countable count();

    RoleSettingsModel settings();

    RoleCollectionModel<HandlerModel, Handler<?>> handlers();

    RoleCollectionModel<VictoryModel, Victory> victories();

    RoleCollectionModel<SpawnModel, Spawn> spawns();

    RoleArmorModel armor();

    RoleInventoryModel inventory();
}
