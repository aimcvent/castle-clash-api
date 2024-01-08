package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.team.Team;
import fr.aimcvent.kernel.api.event.CancellableEvent;

public class PlayerJoinTeamEvent extends PlayerTeamEvent implements CancellableEvent {

    private boolean cancelled;

    public PlayerJoinTeamEvent(Player player, Team team) {
        super(player, team);
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
