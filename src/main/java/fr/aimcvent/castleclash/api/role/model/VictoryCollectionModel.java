package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.role.model.victory.VictoryModel;
import fr.aimcvent.castleclash.api.role.victory.Victory;

public interface VictoryCollectionModel extends CollectionModel<VictoryModel, Victory> {
    void verify();
}
