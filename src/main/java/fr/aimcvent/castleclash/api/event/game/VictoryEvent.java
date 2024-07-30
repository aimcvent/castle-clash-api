package fr.aimcvent.castleclash.api.event.game;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.team.Team;
import fr.aimcvent.kernel.api.event.Event;

import java.util.Optional;

public class VictoryEvent implements Event {
    private final Player player;
    private final Team team;

    public VictoryEvent(Player player, Team team) {
        this.player = player;
        this.team = team;
    }

    public Team team() {
        return this.team;
    }

    public Optional<Player> player() {
        return Optional.ofNullable(this.player);
    }
}
