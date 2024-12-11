package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;

public class CommandUnmaskEvent implements Event {
    private final Player player;
    private final Player unmask;

    private CommandResult result = CommandResult.EMPTY;

    public CommandUnmaskEvent(Player player, Player unmask) {
        this.player = player;
        this.unmask = unmask;
    }

    public Player player() {
        return this.player;
    }

    public Player unmask() {
        return this.unmask;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
