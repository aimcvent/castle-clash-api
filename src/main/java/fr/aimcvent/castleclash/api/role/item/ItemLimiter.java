package fr.aimcvent.castleclash.api.role.item;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ItemLimiter {
    void add(Player player, ItemStack itemStack);
}
