package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.RoleSettings;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.NumericSetting;
import fr.aimcvent.kernel.api.settings.Setting;

import java.util.List;

public interface RoleSettingsModel {
    List<RoleSettingModel<?>> all();

    boolean has(String key);

    <T> Setting<T> of(String key);

    <T extends Number> NumericSetting<T> numericOf(String key);

    RoleSettingsModel add(String key, RoleSettingModel<?> setting);

    <T> RoleSettingModelBuilder<T> builderOf(Service service);

    RoleSettings create();
}
