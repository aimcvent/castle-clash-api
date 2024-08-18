package fr.aimcvent.castleclash.api.role.effect;

import fr.aimcvent.castleclash.api.role.RoleCollection;

public interface Effects extends RoleCollection<Effect> {
    void apply();

    void lock(int second);

    void lock(int second, boolean full);
}
