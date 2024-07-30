package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.model.inventory.RoleArmorModelBuilder;
import fr.aimcvent.castleclash.api.role.model.inventory.RoleInventoryModelBuilder;
import org.bukkit.Material;

public interface RoleModelBuilder {
    RoleModelBuilder addName(String languageAlias, String name);

    RoleModelBuilder addDescription(String languageAlias, String description);

    RoleModelBuilder solidarity(boolean solidarity);

    RoleModelBuilder solo(boolean solo);

    RoleModelBuilder icon(Material material);

    RoleModelBuilder icon(Material material, int data);

    RoleInventoryModelBuilder inventory();

    RoleArmorModelBuilder armor();

    RoleModel build();
}
