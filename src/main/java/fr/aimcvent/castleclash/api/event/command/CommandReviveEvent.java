package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;
import fr.aimcvent.kernel.api.injector.Injector;

@Injector
public class CommandReviveEvent implements Event {
    private final Player player;
    private final Player revive;

    private CommandResult result = CommandResult.EMPTY;

    public CommandReviveEvent(Player player, Player revive) {
        this.player = player;
        this.revive = revive;
    }

    public Player player() {
        return this.player;
    }

    public Player revive() {
        return this.revive;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
