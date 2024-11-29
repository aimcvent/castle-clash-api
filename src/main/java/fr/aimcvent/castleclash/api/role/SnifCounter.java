package fr.aimcvent.castleclash.api.role;

public interface SnifCounter {
    int of();

    int success();

    void add(boolean success);
}
