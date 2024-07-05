package fr.aimcvent.castleclash.api.denormalizer;

import fr.aimcvent.castleclash.api.utils.Nycthemer;
import fr.aimcvent.kernel.api.configuration.Denormalizer;

public class NycthemerDenormalizer implements Denormalizer<Nycthemer, String> {
    @Override
    public Nycthemer denormalize(String value) {
        return Nycthemer.valueOf(value.toUpperCase());
    }
}
