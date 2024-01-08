package fr.aimcvent.castleclash.api.player;

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

    Player of(HumanEntity player);

    Map<CommandSender, Translation> translations();

    Map<CommandSender, Translation> translations(List<Player> players);

    void reset(org.bukkit.entity.Player player);

    void fullReset(org.bukkit.entity.Player player, Location location, GameMode gameMode);
}
