package fr.aimcvent.castleclash.api.role.handler;

import fr.aimcvent.castleclash.api.role.RoleCollection;

public interface Handlers extends RoleCollection<Handler<?>> {
    void handle(Object handle);
}
