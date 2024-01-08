package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.team.Team;

public abstract class PlayerTeamEvent extends PlayerEvent {

    private final Team team;

    protected PlayerTeamEvent(Player player, Team team) {
        super(player);
        this.team = team;
    }

    public Team team() {
        return this.team;
    }
}
