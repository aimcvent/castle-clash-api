package fr.aimcvent.castleclash.api.player.bar;

import org.bukkit.entity.Player;

import java.util.List;

public interface ActionBar {

    List<SectionBar> sections();

    boolean has(Class<? extends SectionBar> clazz);

    <T extends SectionBar> T of(Class<T> clazz);

    <T extends SectionBar> void register(Class<T> type, T section);

    void update(Player player);
}
