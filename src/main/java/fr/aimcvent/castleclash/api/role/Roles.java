package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.castleclash.api.role.model.RoleModelBuilder;
import fr.aimcvent.kernel.api.service.Service;

import java.util.List;

public interface Roles {
    List<RoleModel> models();

    int count();

    RoleModelBuilder builderOf(Service service, String identifier);

    Roles register(RoleModel roleModel);
}
