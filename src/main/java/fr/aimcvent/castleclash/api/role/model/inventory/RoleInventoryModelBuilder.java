package fr.aimcvent.castleclash.api.role.model.inventory;

import org.bukkit.inventory.ItemStack;

public interface RoleInventoryModelBuilder {

    RoleInventoryModelBuilder add(ItemStack itemStack);

    RoleInventoryModel build();
}
