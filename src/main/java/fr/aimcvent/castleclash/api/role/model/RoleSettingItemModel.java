package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.kernel.api.settings.Setting;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;
import java.util.function.Function;

public interface RoleSettingItemModel<T> {
    ItemStack icon();

    Function<T, String> format();

    Consumer<Setting<T>> left();

    Consumer<Setting<T>> right();
}
