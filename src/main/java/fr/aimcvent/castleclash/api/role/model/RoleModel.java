package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.*;
import fr.aimcvent.castleclash.api.role.effect.Effect;
import fr.aimcvent.castleclash.api.role.handler.Handler;
import fr.aimcvent.castleclash.api.role.model.effect.EffectModel;
import fr.aimcvent.castleclash.api.role.model.handler.HandlerModel;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleArmorModel;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleInventoryModel;
import fr.aimcvent.castleclash.api.role.model.spawn.SpawnModel;
import fr.aimcvent.castleclash.api.role.model.victory.VictoryModel;
import fr.aimcvent.castleclash.api.role.spawn.Spawn;
import fr.aimcvent.castleclash.api.role.victory.Victory;
import fr.aimcvent.castleclash.api.utils.Countable;
import fr.aimcvent.castleclash.api.utils.Model;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;
import fr.aimcvent.kernel.api.translation.Translator;

public interface RoleModel extends Model<Role> {
    Service service();

    Translator name();

    String name(Translation translation);

    Translator description();

    String description(Translation translation);

    HeadIcon icon();

    boolean solidarity();

    boolean solo();

    Countable count();

    RoleSettingsModel settings();

    RoleCollectionModel<HandlerModel, Handler<?>> handlers();

    RoleCollectionModel<VictoryModel, Victory> victories();

    RoleCollectionModel<SpawnModel, Spawn> spawns();

    RoleCollectionModel<EffectModel, Effect> effects();

    RoleArmorModel armor();

    RoleInventoryModel inventory();
}
