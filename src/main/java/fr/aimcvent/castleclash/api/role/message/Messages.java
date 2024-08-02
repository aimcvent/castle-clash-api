package fr.aimcvent.castleclash.api.role.message;

import fr.aimcvent.castleclash.api.role.model.message.MessageModelBuilder;

public interface Messages {

    MessageModelBuilder builder(String type);

    void register(String type, Class<? extends Message> clazz);
}
