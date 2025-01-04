package fr.aimcvent.castleclash.api.utils;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TopBoard {

    List<Top> all();

    Optional<Top> of(int index);

    void fill(Map<Integer, Top> topMap);

    interface Top {
        String name();

        long value();
    }
}
