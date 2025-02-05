package ro.hasna.tutorials.code_generation_comparison.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.hasna.tutorials.code_generation_comparison.domain.AutoValueEntity;
import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@RestController
@RequestMapping("/v1/auto-value")
public class AutoValueController {

    @GetMapping("/test-builder")
    public String getTestBuilder() {
        AutoValueEntity entity = AutoValueEntity.builder()
                .setName(Constants.NAME)
                .setAge(Constants.AGE)
                .build();
        return "Test AutoValue builder: " + entity;
    }
}
