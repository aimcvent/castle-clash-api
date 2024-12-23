package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.HeadIcon;
import fr.aimcvent.castleclash.api.role.model.composition.RoleRandomCompositionModel;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleArmorModelBuilder;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleInventoryModelBuilder;
import fr.aimcvent.castleclash.api.role.model.message.MessageModelBuilder;

public interface RoleModelBuilder {
    RoleModelBuilder addName(String languageAlias, String name);

    RoleModelBuilder addDescription(String languageAlias, String description);

    RoleModelBuilder solidarity(boolean solidarity);

    RoleModelBuilder solo(boolean solo);

    RoleModelBuilder icon(HeadIcon icon);

    RoleInventoryModelBuilder inventory();

    RoleArmorModelBuilder armor();

    RoleModelBuilder addSpawnDescription(MessageModelBuilder messageModel);

    RoleModelBuilder addDenyReward(String reward);

    RoleModelBuilder composition(RoleRandomCompositionModel randomCompositionModel);

    RoleModel build();
}
