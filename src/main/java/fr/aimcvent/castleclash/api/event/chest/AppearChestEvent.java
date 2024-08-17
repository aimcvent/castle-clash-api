package fr.aimcvent.castleclash.api.event.chest;

import fr.aimcvent.castleclash.api.chest.Chest;
import fr.aimcvent.kernel.api.event.Event;

import java.util.ArrayList;
import java.util.List;

public class AppearChestEvent implements Event {
    private final List<Chest> chests = new ArrayList<>();

    public AppearChestEvent(List<Chest> chests) {
        this.chests.addAll(chests);
    }

    public List<Chest> chests() {
        return new ArrayList<>(this.chests);
    }
}
