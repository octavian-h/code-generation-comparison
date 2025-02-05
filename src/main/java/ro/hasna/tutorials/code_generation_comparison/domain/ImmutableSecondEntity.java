package ro.hasna.tutorials.code_generation_comparison.domain;

import org.immutables.value.Value;

@Value.Style(redactedMask = "***")
@Value.Immutable
public interface ImmutableSecondEntity {

    String name();

    @Value.Redacted
    String secret();
}
