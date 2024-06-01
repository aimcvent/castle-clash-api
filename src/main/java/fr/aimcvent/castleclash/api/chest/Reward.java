package fr.aimcvent.castleclash.api.chest;

import fr.aimcvent.castleclash.api.player.Player;

public interface Reward {
    default int rate() {
        return 100;
    }

    void reward(Player player);
}
