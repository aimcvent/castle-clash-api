package fr.aimcvent.castleclash.api.role.model.inventory;

import org.bukkit.inventory.ItemStack;

public interface RoleArmorModel {
    ItemStack helmet();
    ItemStack chestplate();
    ItemStack leggings();
    ItemStack boots();
    ItemStack[] toArray();
}
