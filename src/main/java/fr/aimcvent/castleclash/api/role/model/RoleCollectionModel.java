package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.castleclash.api.player.Player;
import fr.aimcvent.castleclash.api.role.RoleCollection;
import fr.aimcvent.castleclash.api.utils.Model;

import java.util.List;

public interface RoleCollectionModel<T extends Model<Y>, Y> {
    List<T> models();

    RoleCollectionModel<T, Y> add(T model);

    void fill(Player player, RoleCollection<Y> collection);
}
