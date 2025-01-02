package fr.aimcvent.castleclash.api.calculator;

public interface Calculator<T extends Result> {
    T calculate();
}
