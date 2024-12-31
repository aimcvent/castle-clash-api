package fr.aimcvent.castleclash.api.player.statistics;

public interface Statistics {
    long kills();

    void addKills(long kills);

    long assists();

    void addAssists(long assists);

    long deaths();

    void addDeaths(long deaths);

    double kda();

    double damageDealt();

    void addDamageDealt(double damageDealt);

    double damageTaken();

    void addDamageTaken(double damageTaken);

    double ddt();

    long objectiveBreaks();

    void addObjectiveBreaks(long objectiveBreaks);
}
