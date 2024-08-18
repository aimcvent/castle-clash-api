package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;
import fr.aimcvent.kernel.api.injector.Injector;

@Injector
public class CommandSnifEvent implements Event {
    private final Player player;
    private final Player snif;

    private CommandResult result = CommandResult.EMPTY;

    public CommandSnifEvent(Player player, Player snif) {
        this.player = player;
        this.snif = snif;
    }

    public Player player() {
        return this.player;
    }

    public Player snif() {
        return this.snif;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
