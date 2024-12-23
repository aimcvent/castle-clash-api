package fr.aimcvent.castleclash.api.teleport;

import fr.aimcvent.castleclash.api.player.Player;
import org.bukkit.Location;

public interface Teleport {
    String identifier();

    Location from();

    Location to();

    boolean use(Player player);
}
