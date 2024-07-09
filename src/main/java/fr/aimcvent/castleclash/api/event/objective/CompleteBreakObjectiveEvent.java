package fr.aimcvent.castleclash.api.event.objective;

import fr.aimcvent.castleclash.api.team.Team;
import fr.aimcvent.kernel.api.event.Event;

import java.util.Optional;

public class CompleteBreakObjectiveEvent implements Event {
    private final Team team;
    private final Team winner;

    public CompleteBreakObjectiveEvent(Team team, Team winner) {
        this.team = team;
        this.winner = winner;
    }

    public Optional<Team> team() {
        return Optional.ofNullable(this.team);
    }

    public Team winner() {
        return this.winner;
    }
}
