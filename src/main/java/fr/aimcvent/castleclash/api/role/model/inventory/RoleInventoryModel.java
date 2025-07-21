package fr.aimcvent.castleclash.api.role.model.inventory;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.inventory.ItemStack;

public interface RoleInventoryModel {
    ItemStack[] toArray(Translation translation);
}
