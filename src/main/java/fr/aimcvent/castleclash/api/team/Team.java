package fr.aimcvent.castleclash.api.team;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public interface Team {
    String identifier();

    String name();

    String prefix();

    String suffix();

    List<Player> players();

    boolean has(Player player);

    Location spawn();

    ItemStack item();

    Map<CommandSender, Translation> translations();
}