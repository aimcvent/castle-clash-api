package fr.aimcvent.castleclash.api.role;

import java.util.List;

public interface RoleSettings {
    List<RoleSetting<?>> all();

    <T> T of(String key, T def);
    <T> void set(String key, T value);
}
