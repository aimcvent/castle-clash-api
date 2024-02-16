package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.handler.HandlerModel;

import java.util.List;

public interface Handlers {
    List<HandlerModel> models();

    Handlers add(HandlerModel handlerModel);
}
