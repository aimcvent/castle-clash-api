package fr.aimcvent.castleclash.api.role.model;

import fr.aimcvent.kernel.api.settings.Setting;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;
import java.util.function.Function;

public interface RoleSettingItemModelBuilder<T> {
    RoleSettingItemModelBuilder<T> icon(ItemStack itemStack);

    RoleSettingItemModelBuilder<T> format(Function<T, String> function);

    RoleSettingItemModelBuilder<T> left(Consumer<Setting<T>> consumer);

    RoleSettingItemModelBuilder<T> right(Consumer<Setting<T>> consumer);

    RoleSettingModelBuilder<T> close();
}
