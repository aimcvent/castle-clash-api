package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;
import fr.aimcvent.kernel.api.injector.Injector;

@Injector
public class CommandUpEvent implements Event {
    private final Player player;
    private final Player up;

    private CommandResult result = CommandResult.EMPTY;

    public CommandUpEvent(Player player, Player up) {
        this.player = player;
        this.up = up;
    }

    public Player player() {
        return this.player;
    }

    public Player up() {
        return this.up;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
