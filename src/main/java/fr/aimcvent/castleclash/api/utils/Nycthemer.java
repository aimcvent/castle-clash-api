package fr.aimcvent.castleclash.api.utils;

public enum Nycthemer {
    DAY(6000),
    NIGHT(18000);

    private final long time;

    Nycthemer(long time) {
        this.time = time;
    }

    public long time() {
        return this.time;
    }
}
