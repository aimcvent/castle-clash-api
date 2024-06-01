package fr.aimcvent.castleclash.api.event.player;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.team.Team;

public class PlayerPostJoinTeamEvent extends PlayerTeamEvent {
    public PlayerPostJoinTeamEvent(Player player, Team team) {
        super(player, team);
    }
}
