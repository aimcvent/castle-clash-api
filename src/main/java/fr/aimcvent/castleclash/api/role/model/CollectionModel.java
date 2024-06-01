package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.utils.Model;

import java.util.List;
import java.util.Map;

public interface CollectionModel<T extends Model<Y>, Y> {
    List<Class<? extends T>> models();

    T create(String identifier, Map<String, Object> parameters);

    void register(Class<? extends T> clazz);
}
