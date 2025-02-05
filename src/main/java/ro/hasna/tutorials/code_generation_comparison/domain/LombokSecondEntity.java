package ro.hasna.tutorials.code_generation_comparison.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor(staticName = "of")
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class LombokSecondEntity {

    private String name;
    @ToString.Exclude
    private int age;
}
