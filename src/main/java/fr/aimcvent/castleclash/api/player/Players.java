package fr.aimcvent.castleclash.api.player;

import fr.aimcvent.castleclash.api.role.Role;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;

import java.util.List;
import java.util.Map;

public interface Players {
    List<Player> all();

    int count();

    List<Player> allCanPlay();

    int countCanPlay();

    Player of(HumanEntity player);

    Map<CommandSender, Translation> translations();

    Map<CommandSender, Translation> translations(List<Player> players);

    void reset(org.bukkit.entity.Player player);

    void reset(org.bukkit.entity.Player player, Role role, boolean fullInventory);

    void fullReset(org.bukkit.entity.Player player, Location location, GameMode gameMode);
}
