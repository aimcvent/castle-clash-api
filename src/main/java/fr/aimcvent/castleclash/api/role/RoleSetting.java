package fr.aimcvent.castleclash.api.role;

public interface RoleSetting<T> {
    T of();

    void set(T value);
}
