package fr.aimcvent.castleclash.api.role.item;

import java.util.List;
import java.util.Optional;

public interface ItemModifiers {
    List<Class<? extends ItemModifier>> all();

    Optional<Class<? extends ItemModifier>> of(String identifier);

    void register(String identifier, Class<? extends ItemModifier> clazz);
}
