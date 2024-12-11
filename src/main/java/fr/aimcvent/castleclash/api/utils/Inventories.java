package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.entity.Player;

public interface Inventories {
    void openTeamMenu(Player player, Translation translation);

    void openSettingsMenu(Player player, Translation translation);

    void openGameSettingsMenu(Player player, Translation translation);

    void openTimeSettingsMenu(Player player, Translation translation);

    void openChestSettingsMenu(Player player, Translation translation);

    void openRoleSettingsMenu(Player player, Translation translation, boolean interactive);

    void openSettingsRoleMenu(Player player, Translation translation, RoleModel model, boolean interactive);
}
