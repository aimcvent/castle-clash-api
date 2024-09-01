package fr.aimcvent.castleclash.api.player.bar;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.entity.Player;

public interface SectionBar {
    String of(Player player, Translation translation);
}
