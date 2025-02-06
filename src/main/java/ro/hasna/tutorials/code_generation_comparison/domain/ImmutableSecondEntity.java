package ro.hasna.tutorials.code_generation_comparison.domain;

import org.immutables.value.Value;

import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@Value.Style(redactedMask = Constants.MASK_PATTERN)
@Value.Immutable
public interface ImmutableSecondEntity {

    String name();

    @Value.Redacted
    String secret();
}
