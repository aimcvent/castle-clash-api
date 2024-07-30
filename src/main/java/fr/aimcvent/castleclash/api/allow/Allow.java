package fr.aimcvent.castleclash.api.allow;

public interface Allow<T> {
    void add(T material);

    void remove(T material);

    boolean accept(T material);
}
