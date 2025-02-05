package ro.hasna.tutorials.code_generation_comparison.domain;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueEntity {

    public static Builder builder() {
        return new AutoValue_AutoValueEntity.Builder();
    }

    public abstract String getName();

    public abstract int getAge();

    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder setName(String value);

        public abstract Builder setAge(int value);

        public abstract AutoValueEntity build();
    }
}
