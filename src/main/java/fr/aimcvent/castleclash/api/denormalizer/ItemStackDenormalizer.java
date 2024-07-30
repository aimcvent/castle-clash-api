package fr.aimcvent.castleclash.api.denormalizer;

import fr.aimcvent.kernel.api.configuration.Denormalizer;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Map;

public class ItemStackDenormalizer implements Denormalizer<ItemStack, Object> {
    @Override
    public ItemStack denormalize(Object value) {
        if (value instanceof String) {
            return new ItemStack(Material.valueOf(value.toString().toUpperCase()));
        }
        final Map<String, Object> map = (Map<String, Object>) value;
        final ItemStack itemStack = new ItemStack(
            Material.valueOf(map.get("type").toString().toUpperCase()),
            ((Number) map.getOrDefault("amount", 1)).intValue(),
            ((Number) map.getOrDefault("data", 0)).shortValue()
        );

        final ItemMeta meta = itemStack.getItemMeta();

        if (map.containsKey("enchants")) {
            final List<Object> enchants = (List<Object>) map.get("enchants");
            for (Object enchant : enchants) {
                if (enchant instanceof String) {
                    meta.addEnchant(
                        Enchantment.getByName(enchant.toString().toUpperCase()),
                        1,
                        true
                    );
                    continue;
                }
                final Map<String, Object> enchantMap = (Map<String, Object>) enchant;
                meta.addEnchant(
                    Enchantment.getByName(enchantMap.get("type").toString().toUpperCase()),
                    ((Number) enchantMap.getOrDefault("level", 1)).intValue(),
                    true
                );
            }
        }

        if (map.containsKey("unbreakable")) {
            meta.spigot().setUnbreakable((boolean) map.get("unbreakable"));
        }


        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
