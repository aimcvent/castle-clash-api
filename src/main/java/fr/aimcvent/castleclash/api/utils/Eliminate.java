package fr.aimcvent.castleclash.api.utils;

public enum Eliminate {
    NO_ELIMINATE(false),
    NO_ELIMINATE_BY_HANDLER(false),

    ELIMINATE(true),
    ELIMINATE_BY_HANDLER(true);

    private final boolean eliminate;

    Eliminate(boolean eliminate) {
        this.eliminate = eliminate;
    }

    public boolean is() {
        return this.eliminate;
    }
}
