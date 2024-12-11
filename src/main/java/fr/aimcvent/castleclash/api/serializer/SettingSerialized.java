package fr.aimcvent.castleclash.api.serializer;

import com.google.gson.JsonObject;

public interface SettingSerialized {
    String name();

    JsonObject json();
}
