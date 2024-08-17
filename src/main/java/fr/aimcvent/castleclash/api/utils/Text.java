package fr.aimcvent.castleclash.api.utils;

import java.util.List;

public interface Text {
    String droppable();

    List<String> explode(String text, int theoreticalSize);
}
