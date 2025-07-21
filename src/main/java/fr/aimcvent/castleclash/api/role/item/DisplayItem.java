package fr.aimcvent.castleclash.api.role.item;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.inventory.ItemStack;

public interface DisplayItem {
    ItemStack toItemStack(Translation translation);
}
