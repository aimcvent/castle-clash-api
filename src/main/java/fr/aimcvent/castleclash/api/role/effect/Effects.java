package fr.aimcvent.castleclash.api.role.effect;

import fr.aimcvent.castleclash.api.role.RoleCollection;
import org.bukkit.potion.PotionEffectType;

public interface Effects extends RoleCollection<Effect> {
    void apply();

    boolean has(PotionEffectType type);

    void lock(int second);

    void lock(int second, boolean full);
}
