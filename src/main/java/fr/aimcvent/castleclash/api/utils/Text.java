package fr.aimcvent.castleclash.api.utils;

import java.util.List;

public interface Text {
    String droppable();

    String noLimit();

    List<String> explode(String text, int theoreticalSize);
}
