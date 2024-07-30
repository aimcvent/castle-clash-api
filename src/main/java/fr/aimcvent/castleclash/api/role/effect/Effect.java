package fr.aimcvent.castleclash.api.role.effect;

import org.bukkit.potion.PotionEffectType;

public interface Effect {
    PotionEffectType type();

    int level();

    boolean permanent();
}
