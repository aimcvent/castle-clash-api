package fr.aimcvent.castleclash.api.role.handler;

import fr.aimcvent.castleclash.api.utils.Model;
import fr.aimcvent.kernel.api.settings.Setting;

import java.util.Map;

public interface HandlerModel extends Model {
    Map<String, Setting<?>> loadSettingOf(String identifier);
}
