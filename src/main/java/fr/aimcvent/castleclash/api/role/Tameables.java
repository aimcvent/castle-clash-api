package fr.aimcvent.castleclash.api.role;

import org.bukkit.entity.Entity;

import java.util.List;

public interface Tameables {
    List<Entity> all();

    boolean contains(Entity entity);

    void add(Entity entity);

    void remove(Entity entity);

    void clear();
}
