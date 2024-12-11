package fr.aimcvent.castleclash.api.serializer;

import fr.aimcvent.kernel.api.settings.Setting;

public interface SettingSerializer<T> {
    Setting<T> setting();

    String serialize();

    void deserialize(String value);
}
