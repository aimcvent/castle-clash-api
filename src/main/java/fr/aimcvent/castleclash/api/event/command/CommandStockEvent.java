package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;


public class CommandStockEvent implements Event {
    private final Player player;

    private CommandResult result = CommandResult.EMPTY;

    public CommandStockEvent(Player player) {
        this.player = player;
    }

    public Player player() {
        return this.player;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
