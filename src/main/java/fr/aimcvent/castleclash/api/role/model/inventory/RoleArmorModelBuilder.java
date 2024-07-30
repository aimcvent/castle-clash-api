package fr.aimcvent.castleclash.api.role.model.inventory;

import org.bukkit.inventory.ItemStack;

public interface RoleArmorModelBuilder {

    RoleArmorModelBuilder helmet(ItemStack helmet);

    RoleArmorModelBuilder chestplate(ItemStack chestplate);

    RoleArmorModelBuilder leggings(ItemStack leggings);

    RoleArmorModelBuilder boots(ItemStack boots);

    RoleArmorModel build();
}
