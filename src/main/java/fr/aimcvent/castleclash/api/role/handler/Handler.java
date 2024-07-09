package fr.aimcvent.castleclash.api.role.handler;

public interface Handler<T> {
    String identifier();

    Class<T> type();

    void handle(T handle);
}
