package fr.aimcvent.castleclash.api.role.model.message;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.message.Message;

public interface MessageModel {
    Message create(Player player);
}
