package ro.hasna.tutorials.code_generation_comparison.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.hasna.tutorials.code_generation_comparison.domain.ImmutableImmutableEntity;
import ro.hasna.tutorials.code_generation_comparison.domain.ImmutableImmutableSecondEntity;
import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@RestController
@RequestMapping("/v1/immutable")
public class ImmutableController {

    @GetMapping("/test-of")
    public String getTestOf() {
        return "Test Immutable of: " + ImmutableImmutableEntity.of(Constants.NAME, Constants.AGE);
    }

    @GetMapping("/test-builder")
    public String getTestBuilder() {
        ImmutableImmutableEntity entity = ImmutableImmutableEntity.builder()
                .name(Constants.NAME)
                .age(Constants.AGE)
                .build();
        return "Test Immutable builder: " + entity;
    }

    @GetMapping("/test-default")
    public String getTestDefault() {
        ImmutableImmutableEntity entity = ImmutableImmutableEntity.builder()
                .name(Constants.NAME)
                .build();
        return "Test Immutable default: " + entity;
    }

    @GetMapping("/test-mask")
    public String getTestMask() {
        ImmutableImmutableSecondEntity entity = ImmutableImmutableSecondEntity.builder()
                .name(Constants.NAME)
                .secret(Constants.SECRET)
                .build();
        return "Test Immutable mask: " + entity + " and the secret value is: " + entity.secret();
    }
}
