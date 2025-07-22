package fr.aimcvent.castleclash.api.role.effect;

import org.bukkit.potion.PotionEffectType;

public interface Effect {
    String identifier();

    PotionEffectType type();

    int level();

    boolean permanent();
}
