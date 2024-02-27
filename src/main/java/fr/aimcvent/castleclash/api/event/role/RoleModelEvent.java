package fr.aimcvent.castleclash.api.event.role;

import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.kernel.api.event.Event;

public abstract class RoleModelEvent implements Event {
    private final RoleModel model;

    protected RoleModelEvent(RoleModel model) {
        this.model = model;
    }

    public RoleModel model() {
        return this.model;
    }
}
