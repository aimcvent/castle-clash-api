package fr.aimcvent.castleclash.api.event.game;

import fr.aimcvent.castleclash.api.utils.Nycthemer;
import fr.aimcvent.kernel.api.event.Event;

public class SwitchNycthemerEvent implements Event {
    private final Nycthemer nycthemer;

    public SwitchNycthemerEvent(Nycthemer nycthemer) {
        this.nycthemer = nycthemer;
    }

    public Nycthemer nycthemer() {
        return this.nycthemer;
    }
}
