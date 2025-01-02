package fr.aimcvent.castleclash.api.calculator;

public interface Calculators {
    <T extends Calculator<Y>, Y extends Result> T of(Class<T> clazz, Object... params);
}
