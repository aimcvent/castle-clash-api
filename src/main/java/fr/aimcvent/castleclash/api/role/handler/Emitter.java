package fr.aimcvent.castleclash.api.role.handler;

public interface Emitter {
    <T> void emit(T handle);
}
