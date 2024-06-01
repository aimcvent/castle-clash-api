package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.team.Team;

public class PlayerPostLeaveTeamEvent extends PlayerTeamEvent {
    public PlayerPostLeaveTeamEvent(Player player, Team team) {
        super(player, team);
    }
}
