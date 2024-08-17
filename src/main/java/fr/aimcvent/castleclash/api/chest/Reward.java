package fr.aimcvent.castleclash.api.chest;

import fr.aimcvent.castleclash.api.player.Player;

public interface Reward {

    String identifier();

    default int rate() {
        return 100;
    }

    default boolean canApply(Player player) {
        return !player.death() && player.role()
            .filter(role -> !role.hasDenyReward(this.identifier()))
            .orElse(null) != null;
    }

    void reward(Player player);
}
