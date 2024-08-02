package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.bukkit.api.translation.Translator;
import fr.aimcvent.kernel.api.settings.Setting;

public interface RoleSettingModelBuilder<T> {
    RoleSettingModelBuilder<T> name(String name);
    RoleSettingModelBuilder<T> name(Translator name);

    RoleSettingModelBuilder<T> description(String description);
    RoleSettingModelBuilder<T> description(Translator description);

    RoleSettingModelBuilder<T> setting(Setting<T> setting, Class<T> type);

    RoleSettingItemModelBuilder<T> item();

    RoleSettingModel<T> build();
}
