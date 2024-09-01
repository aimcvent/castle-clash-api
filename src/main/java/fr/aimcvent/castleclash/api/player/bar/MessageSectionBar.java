package fr.aimcvent.castleclash.api.player.bar;

import fr.aimcvent.bukkit.api.translation.Translator;

public interface MessageSectionBar extends SectionBar {
    void add(Translator message);

    void add(Translator message, long time);
}
