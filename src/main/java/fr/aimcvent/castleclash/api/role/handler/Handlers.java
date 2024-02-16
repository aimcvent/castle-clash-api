package fr.aimcvent.castleclash.api.role.handler;

import fr.aimcvent.castleclash.api.exception.BuildHandlerModelException;
import fr.aimcvent.castleclash.api.exception.RegisterHandlerModelException;

import java.util.List;
import java.util.Map;

public interface Handlers {
    List<Class<? extends HandlerModel>> models();

    HandlerModel create(String identifier, Map<String, Object> parameters) throws BuildHandlerModelException;

    void register(Class<? extends HandlerModel> clazz) throws RegisterHandlerModelException;
}
