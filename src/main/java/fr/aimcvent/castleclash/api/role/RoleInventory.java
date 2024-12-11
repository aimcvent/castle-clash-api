package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.castleclash.api.role.item.ItemAdder;
import fr.aimcvent.castleclash.api.role.item.ItemModifier;
import org.bukkit.inventory.ItemStack;

public interface RoleInventory {
    void update();

    void apply(boolean full);

    void replace(ItemStack itemStack);

    void add(ItemAdder adder);

    void add(ItemModifier modifier);
}
