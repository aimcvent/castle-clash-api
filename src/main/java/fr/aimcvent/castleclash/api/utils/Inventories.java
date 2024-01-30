package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.entity.Player;

public interface Inventories {
    void openTeamMenu(Player player, Translation translation);
    void openSettingsMenu(Player player, Translation translation);

    void openGameSettingsMenu(Player player, Translation translation);

    void openRoleSettingsMenu(Player player, Translation translation);
}
