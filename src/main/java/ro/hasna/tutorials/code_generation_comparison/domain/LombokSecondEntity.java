package ro.hasna.tutorials.code_generation_comparison.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LombokSecondEntity {

    private String name;
    private String secret;

    @ToString.Include(name = "secret")
    private String maskSecret() {
        return Constants.MASK_PATTERN;
    }
}
