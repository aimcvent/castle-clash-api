package fr.aimcvent.castleclash.api.player.statistics;

public interface RoleStatistics {
    String key(String identifier);

    long of(String identifier);

    void add(String identifier, long count);
}
