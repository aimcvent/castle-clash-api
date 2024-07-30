package fr.aimcvent.castleclash.api.role.victory;

import fr.aimcvent.castleclash.api.role.RoleCollection;

public interface Victories extends RoleCollection<Victory> {
    boolean complete();
}
