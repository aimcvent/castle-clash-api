package fr.aimcvent.castleclash.api.utils;

public interface LoadSettingModel<T> extends Model<T> {
    void loadSettingOf(String identifier);
}
