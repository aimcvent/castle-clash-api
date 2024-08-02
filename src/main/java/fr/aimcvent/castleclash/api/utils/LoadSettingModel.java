package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.role.model.RoleModel;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.Settings;

public interface LoadSettingModel<T> extends Model<T> {
    Object parameterOf(String key);

    void loadSettingOf(Service service, RoleModel roleModel, Settings settings);
}
