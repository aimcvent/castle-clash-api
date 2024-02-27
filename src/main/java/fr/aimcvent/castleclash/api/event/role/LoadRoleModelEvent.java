package fr.aimcvent.castleclash.api.event.role;

import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.Settings;

public class LoadRoleModelEvent extends RoleModelEvent {
    private final Service service;
    private final Settings settings;

    public LoadRoleModelEvent(Service service, Settings settings, RoleModel model) {
        super(model);
        this.service = service;
        this.settings = settings;
    }

    public Service service() {
        return this.service;
    }

    public Settings settings() {
        return this.settings;
    }
}
