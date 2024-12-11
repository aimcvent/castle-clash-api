package fr.aimcvent.castleclash.api.serializer;

import com.google.gson.JsonObject;
import fr.aimcvent.kernel.api.settings.Setting;

public interface SettingSerializers {

    boolean contains(Setting<?> setting);

    <T> SettingSerializers register(SettingSerializer<T> serializer);

    SettingSerialized create(String name);

    void load(SettingSerialized serialized);
}
