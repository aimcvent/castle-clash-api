package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.castleclash.api.role.model.RoleSettingModel;
import fr.aimcvent.castleclash.api.role.model.RoleSettingModelBuilder;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.settings.NumericSetting;
import fr.aimcvent.kernel.api.settings.Setting;

import java.util.List;

public interface RoleSettings {
    List<RoleSettingModel<?>> all();

    <T> Setting<T> of(String key);

    <T extends Number> NumericSetting<T> numericOf(String key);

    RoleSettings add(String key, RoleSettingModel<?> setting);

    <T> RoleSettingModelBuilder<T> builderOf(Service service);
}
