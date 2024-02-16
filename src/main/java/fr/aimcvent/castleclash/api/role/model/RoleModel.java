package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.RoleSettings;
import fr.aimcvent.castleclash.api.utils.Countable;
import fr.aimcvent.castleclash.api.utils.Model;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.inventory.ItemStack;

public interface RoleModel extends Model {
    Service service();

    String name(Translation translation);

    String description(Translation translation);

    ItemStack icon();

    boolean solidarity();

    Countable count();

    RoleSettings settings();

    Handlers handlers();
}
