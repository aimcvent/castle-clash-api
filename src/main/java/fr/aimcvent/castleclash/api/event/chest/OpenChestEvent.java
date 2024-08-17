package fr.aimcvent.castleclash.api.event.chest;

import fr.aimcvent.castleclash.api.chest.Chest;
import fr.aimcvent.castleclash.api.chest.Reward;
import fr.aimcvent.castleclash.api.event.player.PlayerEvent;
import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class OpenChestEvent extends PlayerEvent implements CancellableEvent {
    private final Chest chest;

    private Reward reward;
    private boolean cancelled;

    public OpenChestEvent(Player player, Chest chest, Reward reward) {
        super(player);
        this.chest = chest;
        this.reward = reward;
    }

    public Chest chest() {
        return this.chest;
    }

    public Reward reward() {
        return this.reward;
    }

    public void reward(Reward reward) {
        this.reward = reward;
    }

    @Override
    public boolean cancelled() {
        return this.cancelled;
    }

    @Override
    public void cancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
