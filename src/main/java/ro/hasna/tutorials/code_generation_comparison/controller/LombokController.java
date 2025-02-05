package ro.hasna.tutorials.code_generation_comparison.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ro.hasna.tutorials.code_generation_comparison.domain.LombokEntity;
import ro.hasna.tutorials.code_generation_comparison.domain.LombokSecondEntity;
import ro.hasna.tutorials.code_generation_comparison.util.Constants;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/lombok")
public class LombokController {

    @Value("${params.message}")
    private final String textMessage;

    @GetMapping("/test-param")
    public String getTestParam() {
        return "Test Lombok param: " + textMessage;
    }

    @GetMapping("/test-builder")
    public String getTestBuilder() {
        LombokEntity entity = LombokEntity.builder()
                .name(Constants.NAME)
                .age(Constants.AGE)
                .build();
        return "Test Lombok builder: " + entity;
    }

    @GetMapping("/test-default")
    public String getTestDefault() {
        LombokEntity entity = LombokEntity.builder()
                .name(Constants.NAME)
                .build();
        return "Test Lombok default: " + entity;
    }

    @GetMapping("/test-hide")
    public String getTestHide() {
        LombokSecondEntity entity = LombokSecondEntity.of(Constants.NAME, Constants.AGE);
        log.info("hidden value: {}", entity.getAge());
        return "Test Lombok hide: " + entity;
    }
}
