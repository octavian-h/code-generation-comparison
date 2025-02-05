package ro.hasna.tutorials.code_generation_comparison.domain;

import lombok.Builder;
import lombok.Value;
import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@Builder
@Value
public class LombokEntity {

    String name;
    @Builder.Default
    int age = Constants.DEFAULT_AGE;
}
