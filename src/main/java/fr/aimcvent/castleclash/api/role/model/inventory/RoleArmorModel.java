package fr.aimcvent.castleclash.api.role.model.inventory;

import fr.aimcvent.castleclash.api.role.item.DisplayItem;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.inventory.ItemStack;

public interface RoleArmorModel {
    DisplayItem helmet();
    DisplayItem chestplate();
    DisplayItem leggings();
    DisplayItem boots();
    ItemStack[] toArray(Translation translation);
}
