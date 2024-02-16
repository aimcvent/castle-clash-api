package fr.aimcvent.castleclash.api.role;

import fr.aimcvent.kernel.api.settings.Setting;
import fr.aimcvent.kernel.api.settings.Settings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum RoleSettingKey {
    MAX_GOLDEN_APPLE("golden.apple.max", 5, Integer.class),
    HEALTH("health", 20, Integer.class),
    STRENGTH("strength", 0.3d, Double.class);

    private final String key;
    private final Object def;
    private final boolean forAllRole;
    private final Class<? extends Number> numericalType;

    RoleSettingKey(String key, Object def) {
        this(key, def, true, null);
    }

    RoleSettingKey(String key, Object def, Class<? extends Number> numericalType) {
        this(key, def, true, numericalType);
    }

    RoleSettingKey(String key, Object def, boolean forAllRole, Class<? extends Number> numericalType) {
        this.key = key;
        this.def = def;
        this.forAllRole = forAllRole;
        this.numericalType = numericalType;
    }

    public String key() {
        return this.key;
    }

    public String keyOf(String identifier) {
        return identifier + '.' + this.key;
    }

    public static Map<String, Setting<?>> loadOf(Settings settings, String identifier) {
        final Map<String, Setting<?>> settingMap = new HashMap<>();

        for (RoleSettingKey key : RoleSettingKey.values()) {
            if (key.forAllRole) {
                if (key.numericalType != null) {
                    if (key.numericalType.equals(Byte.class)) {
                        settingMap.put(
                            key.key,
                            settings.numericOf(
                                key.keyOf(identifier),
                                (Byte) key.def,
                                Byte.class
                            )
                        );
                    } else if (key.numericalType.equals(Short.class)) {
                        settingMap.put(
                            key.key,
                            settings.numericOf(
                                key.keyOf(identifier),
                                (Short) key.def,
                                Short.class
                            )
                        );
                    } else if (key.numericalType.equals(Integer.class)) {
                        settingMap.put(
                            key.key,
                            settings.numericOf(
                                key.keyOf(identifier),
                                (Integer) key.def,
                                Integer.class
                            )
                        );
                    } else if (key.numericalType.equals(Long.class)) {
                        settingMap.put(
                            key.key,
                            settings.numericOf(
                                key.keyOf(identifier),
                                (Long) key.def,
                                Long.class
                            )
                        );
                    } else if (key.numericalType.equals(Float.class)) {
                        settingMap.put(
                            key.key,
                            settings.numericOf(
                                key.keyOf(identifier),
                                (Float) key.def,
                                Float.class
                            )
                        );
                    } else if (key.numericalType.equals(Double.class)) {
                        settingMap.put(
                            key.key,
                            settings.numericOf(
                                key.keyOf(identifier),
                                (Double) key.def,
                                Double.class
                            )
                        );
                    }
                    continue;
                }

                settingMap.put(key.key, settings.of(key.keyOf(identifier), key.def));
            }
        }
        return settingMap;
    }
}
