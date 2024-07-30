package fr.aimcvent.castleclash.api.utils;

import fr.aimcvent.castleclash.api.player.Player;

public interface Kills {
    int of();

    int assists();

    void add();

    void addAssist();

    boolean hasAssistHistory(Player player);

    void addAssistHistory(Player target, int damage, int remainingLife);

    void reloadAssistHistory();

    void removeAssistHistory(Player target);
}
