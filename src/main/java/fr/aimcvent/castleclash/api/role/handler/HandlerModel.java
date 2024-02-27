package fr.aimcvent.castleclash.api.role.handler;

import fr.aimcvent.castleclash.api.role.model.RoleSettingModel;
import fr.aimcvent.castleclash.api.utils.Model;
import fr.aimcvent.kernel.api.settings.Setting;

import java.util.Map;

public interface HandlerModel extends Model {
    void loadSettingOf(String identifier);
}
