package fr.aimcvent.castleclash.api.role.model;

import org.bukkit.Material;

public interface RoleModelBuilder {
    RoleModelBuilder addName(String languageAlias, String name);

    RoleModelBuilder addDescription(String languageAlias, String description);

    RoleModelBuilder solidarity(boolean solidarity);

    RoleModelBuilder icon(Material material);

    RoleModelBuilder icon(Material material, int data);

    RoleModel build();
}
