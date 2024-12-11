package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;


public class CommandBoostEvent implements Event {
    private final Player player;
    private final Player boost;

    private CommandResult result = CommandResult.EMPTY;

    public CommandBoostEvent(Player player, Player boost) {
        this.player = player;
        this.boost = boost;
    }

    public Player player() {
        return this.player;
    }

    public Player boost() {
        return this.boost;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
