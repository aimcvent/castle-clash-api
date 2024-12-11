package fr.aimcvent.castleclash.api.player;

import fr.aimcvent.castleclash.api.serializer.SettingSerialized;

import java.util.List;
import java.util.Optional;

public interface SettingSerializers {
    List<SettingSerialized> all();

    Optional<SettingSerialized> of(String name);

    void add(SettingSerialized serialized);

    void remove(SettingSerialized serialized);
}
