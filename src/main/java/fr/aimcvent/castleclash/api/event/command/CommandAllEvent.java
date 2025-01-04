package fr.aimcvent.castleclash.api.event.command;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.utils.CommandResult;
import fr.aimcvent.kernel.api.event.Event;

public class CommandAllEvent implements Event {
    private final Player player;
    private final org.bukkit.entity.Player bukkitPlayer;

    private CommandResult result = CommandResult.EMPTY;

    public CommandAllEvent(Player player, org.bukkit.entity.Player bukkitPlayer) {
        this.player = player;
        this.bukkitPlayer = bukkitPlayer;
    }

    public Player player() {
        return this.player;
    }

    public org.bukkit.entity.Player bukkitPlayer() {
        return this.bukkitPlayer;
    }

    public CommandResult result() {
        return this.result;
    }

    public void result(CommandResult result) {
        this.result = result;
    }
}
