package fr.aimcvent.castleclash.api.role;

import java.util.List;

public interface RoleCollection<T> {
    List<T> all();

    void add(T item);

    void remove(T item);
}
