package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;

public class CommandMentorEvent implements Event {
    private final Player player;
    private final Player mentor;

    private CommandResult result = CommandResult.EMPTY;

    public CommandMentorEvent(Player player, Player mentor) {
        this.player = player;
        this.mentor = mentor;
    }

    public Player player() {
        return this.player;
    }

    public Player mentor() {
        return this.mentor;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
