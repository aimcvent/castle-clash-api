package fr.aimcvent.castleclash.api.player;

public interface Assist {
    Player player();

    int damage();

    int life();

    long lastDamageAt();

    boolean valid();
}
