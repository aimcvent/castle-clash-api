package fr.aimcvent.castleclash.api.player.statistics;

public interface TopStatistics {
    long kills();

    void setKills(long kills);

    long assists();

    void setAssists(long assists);

    long deaths();

    void setDeaths(long deaths);

    double damageDealt();

    void setDamageDealt(double damageDealt);

    double damageTaken();

    void setDamageTaken(double damageTaken);
}
