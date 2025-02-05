package ro.hasna.tutorials.code_generation_comparison.domain;

import org.immutables.value.Value;

import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@Value.Immutable
public abstract class ImmutableEntity {

    @Value.Parameter
    public abstract String getName();

    @Value.Parameter
    @Value.Default
    public int getAge() {
        return Constants.DEFAULT_AGE;
    }
}