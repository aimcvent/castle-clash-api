package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.kernel.api.settings.Setting;

public interface RoleSettingModelBuilder<T> {
    RoleSettingModelBuilder<T> name(String name);

    RoleSettingModelBuilder<T> description(String description);

    RoleSettingModelBuilder<T> setting(Setting<T> setting, Class<T> type);

    RoleSettingItemModelBuilder<T> item();

    RoleSettingModel build();
}
