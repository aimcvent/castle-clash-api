package fr.aimcvent.castleclash.api.allow;

import org.bukkit.Material;

public interface AllowList {
    Allow<Material> placeable();

    Allow<Material> droppable();
}
