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

    Player of(HumanEntity player);

    Map<CommandSender, Translation> translations();

    void reset(org.bukkit.entity.Player player);

    void fullReset(org.bukkit.entity.Player player, Location location, GameMode gameMode);
}
