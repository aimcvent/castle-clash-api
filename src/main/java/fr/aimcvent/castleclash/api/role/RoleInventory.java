package fr.aimcvent.castleclash.api.role;

import org.bukkit.inventory.ItemStack;

public interface RoleInventory {
    void update();

    void apply();

    void replace(ItemStack itemStack);
}
