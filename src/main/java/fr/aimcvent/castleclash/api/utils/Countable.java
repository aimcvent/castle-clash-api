package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.kernel.api.settings.Setting;

public interface Countable {
    Setting<Integer> current();

    Setting<Integer> min();
}
