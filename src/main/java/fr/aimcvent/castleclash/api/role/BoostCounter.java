package fr.aimcvent.castleclash.api.role;

public interface BoostCounter {
    int of();

    void add();

    boolean boosted();

    void boost();

    boolean active();

    boolean fullUsed();

    void update(boolean active, boolean fullUsed);
}
