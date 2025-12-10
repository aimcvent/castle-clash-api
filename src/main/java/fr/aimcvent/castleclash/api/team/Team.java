package fr.aimcvent.castleclash.api.team;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.castleclash.api.utils.Color;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Team {
    String identifier();

    String name();

    String displayName();

    String prefix();

    List<Player> players();

    int size();

    boolean has(Player player);

    List<Location> spawns();

    ItemStack item();

    Map<CommandSender, Translation> translations();

    boolean withoutRole();

    Optional<RoleModel> role();

    short wool();

    Color color();
}
