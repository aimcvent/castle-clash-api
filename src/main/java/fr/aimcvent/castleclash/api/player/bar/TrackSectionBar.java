package fr.aimcvent.castleclash.api.player.bar;

import fr.aimcvent.castleclash.api.player.Player;

public interface TrackSectionBar extends SectionBar {
    void add(Player player);

    void remove(Player player);

    void next();
}
