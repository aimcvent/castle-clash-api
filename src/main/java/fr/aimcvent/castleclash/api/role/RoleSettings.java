package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.kernel.api.settings.NumericSetting;
import fr.aimcvent.kernel.api.settings.Setting;

import java.util.List;

public interface RoleSettings {
    List<Setting<?>> all();

    <T> Setting<T> of(String key);
    <T extends Number> NumericSetting<T> numericOf(String key);

    RoleSettings add(String key, Setting<?> setting);
}
