package fr.aimcvent.castleclash.api.role;

public interface BoostCounter {
    int of();

    void add();

    boolean boosted();

    void boost();
}
