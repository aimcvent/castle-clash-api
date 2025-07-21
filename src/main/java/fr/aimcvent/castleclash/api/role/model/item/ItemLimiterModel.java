package fr.aimcvent.castleclash.api.role.model.item;

import fr.aimcvent.castleclash.api.role.Role;
import fr.aimcvent.castleclash.api.role.item.ItemLimiter;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.Settings;
import org.bukkit.Material;

public interface ItemLimiterModel {
    void add(Service service, Settings settings, Material material, int data, int count);

    ItemLimiter create(Role role);
}
