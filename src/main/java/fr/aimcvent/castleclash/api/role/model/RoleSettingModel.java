package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.kernel.api.settings.Setting;
import fr.aimcvent.kernel.api.translation.Translation;

public interface RoleSettingModel<T> {
    String name(Translation translation);

    String description(Translation translation);

    RoleSettingItemModel<T> item();

    Class<?> type();

    <V extends Setting<T>> V setting();
}
