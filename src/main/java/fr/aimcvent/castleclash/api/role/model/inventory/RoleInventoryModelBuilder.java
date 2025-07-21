package fr.aimcvent.castleclash.api.role.model.inventory;

import fr.aimcvent.castleclash.api.role.item.DisplayItem;

public interface RoleInventoryModelBuilder {

    RoleInventoryModelBuilder add(DisplayItem itemStack);

    RoleInventoryModel build();
}
