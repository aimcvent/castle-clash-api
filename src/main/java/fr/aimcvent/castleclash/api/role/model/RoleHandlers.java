package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.handler.HandlerModel;

import java.util.List;

public interface RoleHandlers {
    List<HandlerModel> models();

    RoleHandlers add(HandlerModel handlerModel);
}
