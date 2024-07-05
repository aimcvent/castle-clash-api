package fr.aimcvent.castleclash.api.utils;

import org.bukkit.Material;

public interface MaterialAllowed {

    void deny(Material material);

    boolean accept(Material material);
}
