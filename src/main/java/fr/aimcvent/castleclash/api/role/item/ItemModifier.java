package fr.aimcvent.castleclash.api.role.item;

import org.bukkit.inventory.ItemStack;

public interface ItemModifier {
    ItemStack modify(ItemStack itemStack);
}
