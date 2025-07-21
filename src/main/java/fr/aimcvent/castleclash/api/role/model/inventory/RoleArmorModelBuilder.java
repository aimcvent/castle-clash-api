package fr.aimcvent.castleclash.api.role.model.inventory;

import fr.aimcvent.castleclash.api.role.item.DisplayItem;

public interface RoleArmorModelBuilder {

    RoleArmorModelBuilder helmet(DisplayItem helmet);

    RoleArmorModelBuilder chestplate(DisplayItem chestplate);

    RoleArmorModelBuilder leggings(DisplayItem leggings);

    RoleArmorModelBuilder boots(DisplayItem boots);

    RoleArmorModel build();
}
