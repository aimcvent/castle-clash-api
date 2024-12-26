package fr.aimcvent.castleclash.api.hotbar;

import org.bukkit.entity.Player;

public interface Hotbar {
    void clear();

    void update(Player player);
}
